package com.example.colecaodegibis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.colecaodegibis.controllers.GibiControllerVetor;
import com.example.colecaodegibis.entities.Gibi;
import com.example.colecaodegibis.interfaces.IGibiController;

public class ActivityVisualizar extends AppCompatActivity {

    private ListView listViewGibis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar);

        IGibiController gibiController = GibiControllerVetor.getInstance();

        listViewGibis = findViewById(R.id.listViewGibis);
        ArrayAdapter<Gibi> arrayAdapterGibis = new ArrayAdapter<Gibi>(this,
                android.R.layout.simple_list_item_1,
                gibiController.read());
        listViewGibis.setAdapter(arrayAdapterGibis);

        listViewGibis.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), CadastroGibiActivity.class);
                intent.putExtra("i", i);
                startActivity(intent);
            }
        });
    }

    public void adicionarGibi(View view){
        Intent intent = new Intent(this, CadastroGibiActivity.class);
        startActivity(intent);
    }
}