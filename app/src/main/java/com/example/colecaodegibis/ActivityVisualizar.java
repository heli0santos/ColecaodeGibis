package com.example.colecaodegibis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.colecaodegibis.entities.Gibi;

public class ActivityVisualizar extends AppCompatActivity {

    private ListView listViewGibis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar);

        listViewGibis = findViewById(R.id.listViewGibis);
        ArrayAdapter<Gibi> = new ArrayAdapter<>()
        listViewGibis.setAdapter();

    }
}