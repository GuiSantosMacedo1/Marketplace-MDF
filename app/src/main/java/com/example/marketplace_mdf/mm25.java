package com.example.marketplace_mdf;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.marketplace_mdf.pagamento.FormaPagamento;

public class mm25 extends NetworkConnection {
    private BroadcastReceiver networkReceiver;

    @Override
    protected void onNetworkChanged(boolean isConnected) {
        if (isConnected) {

        } else {

            Intent intent = new Intent(mm25.this, NetworkConnection.class);
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
        EdgeToEdge.enable(this);
        setContentView(R.layout.mm25);

        CardView cardVerde = findViewById(R.id.card25mm_verde);
        CardView cardBranco = findViewById(R.id.card25mm_branco);
        CardView cardCinza = findViewById(R.id.card25mm_cinza);
        CardView cardMadeira = findViewById(R.id.card25mm_madeira);
        CardView cardVermelho = findViewById(R.id.card25mm_vermelho);
        CardView cardPreto = findViewById(R.id.card25mm_preto);

        cardVerde.setOnClickListener(v -> redirecionarParaPagamento());
        cardBranco.setOnClickListener(v -> redirecionarParaPagamento());
        cardCinza.setOnClickListener(v -> redirecionarParaPagamento());
        cardMadeira.setOnClickListener(v -> redirecionarParaPagamento());
        cardVermelho.setOnClickListener(v -> redirecionarParaPagamento());
        cardPreto.setOnClickListener(v -> redirecionarParaPagamento());

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void redirecionarParaPagamento() {

        Intent intent = new Intent(mm25.this, FormaPagamento.class);
        startActivity(intent);
    }
}
