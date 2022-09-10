package com.example.colecaodegibis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNomeRevista;
    EditText etTituloRevista;
    EditText etNumeroRevista;
    EditText etEditoraRevista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNomeRevista = findViewById(R.id.editTextRevista);
        etTituloRevista = findViewById(R.id.editTextTitulo);
        etNumeroRevista = findViewById(R.id.editTextNumero);
        etEditoraRevista = findViewById(R.id.editTextEditora);
    }

    public void visualizar(View view){
        Intent intent = new Intent(this, ActivityVisualizar.class);
        intent.putExtra("nome", etNomeRevista.getText().toString());
        intent.putExtra("titulo", etTituloRevista.getText().toString());
        intent.putExtra("numero", etNumeroRevista.getText().toString());
        intent.putExtra("editora", etEditoraRevista.getText().toString());
        Toast.makeText(this, "Revista enviada.", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}