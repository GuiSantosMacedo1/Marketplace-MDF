package com.example.marketplace_mdf.pagamento;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.marketplace_mdf.NetworkConnection;
import com.example.marketplace_mdf.R;

public class Pix extends NetworkConnection {
    private BroadcastReceiver networkReceiver;

    @Override
    protected void onNetworkChanged(boolean isConnected) {
        if (isConnected) {
            // Comportamento quando há conexão
        } else {
            // Navega para a tela de conexão ausente
            Intent intent = new Intent(Pix.this, NetworkConnection.class);
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
        setContentView(R.layout.activity_pix);

        Button buttonConfirmarPagamento = findViewById(R.id.buttonConfirmarPagamentoPix);

        buttonConfirmarPagamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Pix.this, "Pagamento com Pix confirmado!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
