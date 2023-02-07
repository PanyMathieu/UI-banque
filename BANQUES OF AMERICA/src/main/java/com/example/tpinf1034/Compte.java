package com.example.tpinf1034;

import java.util.ArrayList;

/**
 * KWEPET PANY MATHIEU FLORENT
 * MARIAMA DIALLO
 * FATIMATA DIALLO
 * NONONSI CHARLES

 */
public class Compte {


     String nom;
    public ArrayList<user> comptes;

    private String numero;
String epargnes;
String soldes;




    public Compte(String numero, String nom,String soldes,String epargnes) {
        this.numero = numero;
        this.soldes= soldes;
        this.epargnes= epargnes;
        this.nom=  nom ;

    }
    public String getNom(){return nom;}
    public String getSoldes(){return  soldes;}
    public String getEpargnes(){return  epargnes;}

    public String toString() {return numero ;



    }



    }

