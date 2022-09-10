package com.example.colecaodegibis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityVisualizar extends AppCompatActivity {

    TextView tvNomeRevista;
    TextView tvTituloRevista;
    TextView tvNumeroRevista;
    TextView tvEditoraRevista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar);

        tvNomeRevista = findViewById(R.id.textViewNomeRevista);
        tvTituloRevista = findViewById(R.id.textViewTituloRevista);
        tvNumeroRevista = findViewById(R.id.textViewNumeroRevista);
        tvEditoraRevista = findViewById(R.id.textViewEditoraRevista);

        Intent intent = getIntent();

        tvNomeRevista.setText(intent.getStringExtra("nome"));
        tvTituloRevista.setText(intent.getStringExtra("titulo"));
        tvNumeroRevista.setText(intent.getStringExtra("numero"));
        tvEditoraRevista.setText(intent.getStringExtra("editora"));

    }
}