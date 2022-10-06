package com.example.colecaodegibis.interfaces;

import android.database.Cursor;

import com.example.colecaodegibis.entities.Gibi;

import java.util.List;

public interface IGibiController {
    void create(Gibi gibi);
    List<Gibi> read();
    Gibi read(long i);
    Gibi update(long i, Gibi gibi);
    void delete(long i);
    Cursor getCursor();
}
