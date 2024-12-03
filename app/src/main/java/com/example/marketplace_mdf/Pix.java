package com.example.marketplace_mdf;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Pix extends AppCompatActivity {

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
