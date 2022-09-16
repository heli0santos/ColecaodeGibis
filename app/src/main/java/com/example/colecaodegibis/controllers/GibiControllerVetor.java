package com.example.colecaodegibis.controllers;

import com.example.colecaodegibis.entities.Gibi;
import com.example.colecaodegibis.interfaces.IGibiController;

import java.util.ArrayList;
import java.util.List;

public class GibiControllerVetor implements IGibiController {

    private static GibiControllerVetor instance;

    private List<Gibi> gibis = new ArrayList<Gibi>();

    private GibiControllerVetor(){

    }

    public GibiControllerVetor getInstance(){
        if (instance == null)
            instance = new GibiControllerVetor();
        return instance;
    }

    @Override
    public void create(Gibi gibi) {
        gibis.add(gibi);
    }

    @Override
    public List<Gibi> read() {
        return gibis;
    }

    @Override
    public Gibi update(long i, Gibi gibi) {
        return gibis.set((int) i, gibi);
    }

    @Override
    public void delete(long i) {
        gibis.remove((int) i);
    }
}
