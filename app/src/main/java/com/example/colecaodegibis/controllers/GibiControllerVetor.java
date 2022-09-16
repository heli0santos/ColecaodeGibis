package com.example.colecaodegibis.controllers;

import com.example.colecaodegibis.entities.Gibi;
import com.example.colecaodegibis.interfaces.IGibiController;

import java.util.ArrayList;
import java.util.List;

public class GibiControllerVetor implements IGibiController {

    private List<Gibi> gibis = new ArrayList<Gibi>();

    @Override
    public void create(Gibi gibi) {

    }

    @Override
    public List<Gibi> read() {
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
