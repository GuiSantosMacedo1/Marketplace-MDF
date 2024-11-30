package com.example.marketplace_mdf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class catalogoComponent extends AppCompatActivity {

    private View card6mm;
    private View card12mm;
    private View card15mm;
    private View card18mm;
    private View card21mm;
    private View card25mm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.catalogo);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        card6mm();
        card12mm();
        card15mm();
        card18mm();
        card21mm();
        card25mm();
        card6mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(catalogoComponent.this, mm6.class);
                startActivity(intent);
            }
        });
        card12mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(catalogoComponent.this, mm12.class);
                startActivity(intent);
            }
        });
        card15mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(catalogoComponent.this, mm15.class);
                startActivity(intent);
            }
        });
        card18mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(catalogoComponent.this, mm18.class);
                startActivity(intent);
            }
        });
        card21mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(catalogoComponent.this, mm21.class);
                startActivity(intent);
            }
        });
        card25mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(catalogoComponent.this, mm25.class);
                startActivity(intent);
            }
        });
    }
        private void card6mm(){
            card6mm = findViewById(R.id.card6mm);
        }
    private void card12mm(){
        card12mm = findViewById(R.id.card12mm);
    }
    private void card15mm(){
        card15mm = findViewById(R.id.card15mm);
    }
    private void card18mm(){
        card18mm = findViewById(R.id.card18mm);
    }
    private void card21mm(){
        card21mm = findViewById(R.id.card21mm);
    }
    private void card25mm(){
        card25mm = findViewById(R.id.card25mm);
    }
}