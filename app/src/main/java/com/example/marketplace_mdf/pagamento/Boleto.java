package com.example.marketplace_mdf.pagamento;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.marketplace_mdf.R;

public class Boleto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boleto);

        Button buttonConfirmarPagamento = findViewById(R.id.buttonConfirmarPagamentoBoleto);

        buttonConfirmarPagamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Boleto.this, "Pagamento com Boleto confirmado!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
