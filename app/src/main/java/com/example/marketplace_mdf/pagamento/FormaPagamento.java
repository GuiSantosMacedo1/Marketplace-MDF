package com.example.marketplace_mdf.pagamento;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.marketplace_mdf.R;

public class FormaPagamento extends AppCompatActivity {

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