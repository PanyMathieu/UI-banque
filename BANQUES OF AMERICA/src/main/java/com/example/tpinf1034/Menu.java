package com.example.tpinf1034;

/**
 * KWEPET PANY MATHIEU FLORENT
 * MARIAMA DIALLO
 * FATIMATA DIALLO
 * NONONSI CHARLES

 */
public enum Menu {



    GESTION ("Gestion-comptes.fxml"),
    CONVERSION ("conversion.fxml"),
  FORMULAIRE("gestionformulaire.fxml"),
    CREATION("creationCompte.fxml");

    // Référence au nom du fichier
    private String fichierFxml;

    /**
     * Crée un nouveau type de layout pouvant être affichée
     * @param fichierFxml le fichier FXML contenant l'affichage;
     */
    Menu(String fichierFxml) {
        this.fichierFxml = fichierFxml;
    }

    /**
     * Accès au nom du fichier FXML associé à la constante.
     * @return le nom du fichier FXML de la constante.
     */
    public String getFichierFxml() {
        return fichierFxml;
    }
}
