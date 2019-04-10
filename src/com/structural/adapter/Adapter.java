package com.structural.adapter;

public class Adapter extends RomanianTranslate implements Dictionary {
    @Override
    public void monday() {
        luni();
    }

    @Override
    public void tuesday() {
        marti();
    }

    @Override
    public void wednesday() {
        miercuri();
    }

    @Override
    public void thursday() {
        joi();
    }

    @Override
    public void friday() {
        vineri();
    }
}
