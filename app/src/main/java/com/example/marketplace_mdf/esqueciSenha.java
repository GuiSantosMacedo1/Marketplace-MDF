package com.example.marketplace_mdf;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class esqueciSenha extends NetworkConnection {

    private View text_tela_login;

    private BroadcastReceiver networkReceiver;

    @Override
    protected void onNetworkChanged(boolean isConnected) {
        if (isConnected) {
            // Comportamento quando há conexão
        } else {
            // Navega para a tela de conexão ausente
            Intent intent = new Intent(esqueciSenha.this, NetworkConnection.class);
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
        setContentView(R.layout.esquecisenha);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        loginComponent();
        text_tela_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(esqueciSenha.this, formLogin.class);
                startActivity(intent);
            }
        });
    }
    private void loginComponent(){
        text_tela_login = findViewById(R.id.text_redefinir);
    }
}