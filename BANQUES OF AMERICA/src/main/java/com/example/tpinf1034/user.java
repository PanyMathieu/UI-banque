package com.example.tpinf1034;

import java.util.ArrayList;
/**
 * KWEPET PANY MATHIEU FLORENT
 * MARIAMA DIALLO
 * FATIMATA DIALLO
 * NONONSI CHARLES

 */

public class user {


    private String nom;
    private String soldes;
    private String epargnes;


    public user(String nom,  String soldes, String epargnes,ArrayList<user> compte)
    {
        this.nom = nom;
        this.epargnes = epargnes;
        this.soldes = soldes;
    }

    @Override
    public String toString() {
        return nom;
    }

}
