package com.example.colecaodegibis.controllers;

import android.content.Context;

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
        return null;
    }

    @Override
    public Gibi read(long i) {
        return null;
    }

    @Override
    public Gibi update(long i, Gibi gibi) {
        return null;
    }

    @Override
    public void delete(long i) {

    }
}