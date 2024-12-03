package com.example.marketplace_mdf.pagamento;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.marketplace_mdf.NetworkConnection;
import com.example.marketplace_mdf.R;

public class CartaoCredito extends NetworkConnection {
    private BroadcastReceiver networkReceiver;
    private EditText editTextNomeTitular, editTextNumeroCartao, editTextValidade, editTextCvv;

    @Override
    protected void onNetworkChanged(boolean isConnected) {
        if (isConnected) {
            // Comportamento quando há conexão
        } else {
            // Navega para a tela de conexão ausente
            Intent intent = new Intent(CartaoCredito.this, NetworkConnection.class);
            startActivity(intent);
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (networkReceiver != null) {
            unregisterReceiver(networkReceiver);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartao);

        editTextNomeTitular = findViewById(R.id.editTextNomeTitular);
        editTextNumeroCartao = findViewById(R.id.editTextNumeroCartao);
        editTextValidade = findViewById(R.id.editTextValidade);
        editTextCvv = findViewById(R.id.editTextCvv);

        Button buttonFinalizar = findViewById(R.id.buttonFinalizarCartao);

        buttonFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomeTitular = editTextNomeTitular.getText().toString();
                if (nomeTitular.isEmpty()) {
                    Toast.makeText(CartaoCredito.this, "Nome do titular é obrigatório!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(CartaoCredito.this, "Pagamento com Cartão finalizado!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
