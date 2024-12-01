package com.example.marketplace_mdf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class formLogin extends AppCompatActivity {

    private TextView text_tela_cadastro;
    private TextView text_tela_esqueci_senha;
    private TextView text_tela_catalogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.formlogin);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        IniciarComponentes();
        esqueciSenhaComponentes();
        catalogoComponent();

        text_tela_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(formLogin.this, formCadastro.class);
                startActivity(intent);
            }
        });

        text_tela_esqueci_senha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(formLogin.this, esqueciSenha.class);
                startActivity(intent);
            }
        });

        text_tela_catalogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(formLogin.this, catalogoComponent.class);
                startActivity(intent);
            }
        });
    }

    private void IniciarComponentes(){
    text_tela_cadastro = findViewById(R.id.textTelaCadastro);
    }

    private void esqueciSenhaComponentes(){
        text_tela_esqueci_senha = findViewById(R.id.textTelaEsqueciSenha);
    }

    private void catalogoComponent(){
        text_tela_catalogo = findViewById(R.id.login);
    }
}