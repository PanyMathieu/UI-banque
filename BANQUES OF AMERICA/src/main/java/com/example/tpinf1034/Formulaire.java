package com.example.tpinf1034;

import java.util.ArrayList;
import java.util.Calendar;
/**
 * KWEPET PANY MATHIEU FLORENT
 * MARIAMA DIALLO
 * FATIMATA DIALLO
 * NONONSI CHARLES

 */
public class Formulaire {

        private String nom;

        private String prenom;
        private String  lieudenaissance;
        private  String numeroTelephone;
        private  String adresseCourriel;
        private  String ville;
        private String province;
        private String typedassurance;


        public Formulaire(String s) {

            this.nom = nom;
            this.prenom = prenom;
            this.lieudenaissance= lieudenaissance;
            this.adresseCourriel = adresseCourriel;
            this.ville = ville;
            this.numeroTelephone = numeroTelephone;
            this.province= province;
            this.typedassurance = typedassurance;
        }


    @Override
        public String toString() {
            return nom;
        }

    }

