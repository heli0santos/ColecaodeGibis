package com.example.colecaodegibis.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.colecaodegibis.entities.Gibi;

public class GibiDAO {

    private SQLiteDatabase db;

    public GibiDAO(){}

    public GibiDAO(Context context){
        GibiBD gibiBD = new GibiBD(context, "gibibd", null, 1);
        db = gibiBD.getWritableDatabase();
    }

    public void createTable(SQLiteDatabase db){
        String sql = "CREATE TABLE Gibi(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nome TEXT, " +
                "titulo TEXT, " +
                "numero TEXT, " +
                "editora TEXT) ";
        db.execSQL(sql);
    }

    public void create(Gibi gibi){
        ContentValues contentValues = new ContentValues();
        contentValues.put("nome", gibi.getNome());
        contentValues.put("titulo", gibi.getTitulo());
        contentValues.put("numero", gibi.getNumero());
        contentValues.put("editora", gibi.getEditora());
        db.insert("Gibi", null, contentValues);
    }
}
