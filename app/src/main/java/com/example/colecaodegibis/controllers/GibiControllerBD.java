package com.example.colecaodegibis.controllers;

import android.content.Context;
import android.database.Cursor;

import com.example.colecaodegibis.database.GibiDAO;
import com.example.colecaodegibis.entities.Gibi;
import com.example.colecaodegibis.interfaces.IGibiController;

import java.util.List;

public class GibiControllerBD implements IGibiController {

    private GibiDAO gibiDAO;

    public GibiControllerBD(Context context){
        gibiDAO = new GibiDAO(context);
    }

    @Override
    public void create(Gibi gibi) {
        gibiDAO.create(gibi);
    }

    @Override
    public List<Gibi> read() {
        return gibiDAO.read();
    }

    @Override
    public Gibi read(long i) {
        return gibiDAO.read(i);
    }

    @Override
    public Gibi update(long i, Gibi gibi) {
        return null;
    }

    @Override
    public void delete(long i) {

    }

    @Override
    public Cursor getCursor() {
        return gibiDAO.getCursor();
    }
}
