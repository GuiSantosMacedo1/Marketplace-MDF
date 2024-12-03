package com.example.marketplace_mdf.pagamento;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.marketplace_mdf.NetworkConnection;
import com.example.marketplace_mdf.R;

public class FormaPagamento extends NetworkConnection {
    private BroadcastReceiver networkReceiver;

    @Override
    protected void onNetworkChanged(boolean isConnected) {
        if (isConnected) {
            // Comportamento quando há conexão
        } else {
            // Navega para a tela de conexão ausente
            Intent intent = new Intent(FormaPagamento.this, NetworkConnection.class);
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
        setContentView(R.layout.activity_formapagamento);

        Button buttonBoleto = findViewById(R.id.buttonBoleto);
        Button buttonCartao = findViewById(R.id.buttonCartao);
        Button buttonPix = findViewById(R.id.buttonPix);

        buttonBoleto.setOnClickListener(v -> {
            Intent intent = new Intent(FormaPagamento.this, Boleto.class);
            startActivity(intent);
        });

        buttonCartao.setOnClickListener(v -> {
            Intent intent = new Intent(FormaPagamento.this, CartaoCredito.class);
            startActivity(intent);
        });

        buttonPix.setOnClickListener(v -> {
            Intent intent = new Intent(FormaPagamento.this, Pix.class);
            startActivity(intent);
        });
    }
}