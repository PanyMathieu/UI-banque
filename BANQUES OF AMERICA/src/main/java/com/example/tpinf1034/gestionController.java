package com.example.tpinf1034;

import javafx.beans.value.ChangeListener;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * KWEPET PANY MATHIEU FLORENT
 * MARIAMA DIALLO
 * FATIMATA DIALLO
 * NONONSI CHARLES

 */
public class gestionController {

    /**
         * Liste des comptes dans le système.
         */

        ArrayList<Compte> users;




        /**
         * Affichage de la liste des compte.
         */
        @FXML
        private ListView<Compte> listeCompte;


        @FXML
        private TextField numero;
    @FXML
    private TextField nom;
    @FXML
    private TextField soldes;
    @FXML
    private TextField epargnes;

    public List<Compte> comptes;

    /**
         * Crée un nouveau contrôleur de gestion des comptes.
         */

        public gestionController() {
            comptes = Utils.comptes;
            users=new ArrayList<>();
            genererDonnees();
        }


        private void genererDonnees() {

            ArrayList<user> users1 = new ArrayList<user>();
            comptes.add(new Compte("Math2323","Kwepet Mathieu","10022320$","232876"));
            ArrayList<user> users2 = new ArrayList<user>();
            comptes.add(new Compte("Charles1342", "Nononsi Charles","5023500$","10490$"));
            ArrayList<user> users3 = new ArrayList<user>();
            comptes.add(new Compte("Fatim2321", "Fatima Diallo","1302300$","50000$" ));
            ArrayList<user> users4 = new ArrayList<user>();
            comptes.add(new Compte("Mariam343", "Mariama Diallo","5501100$","14356$"));
            ArrayList<user> users5 = new ArrayList<user>();
            comptes.add(new Compte("Alain94330"," Alain Gires","1202900$","10356$"));
            ArrayList<user> users6 = new ArrayList<user>();
            comptes.add(new Compte("Joachim23434","Pany Joachim","9243009$","8900$"));

        }

        /**
         * Initialise les données de l'interface après création des objets JavaFX.
         */
        public void initialize() {

            listeCompte.getItems().addAll(comptes);
            listeCompte.getItems().addAll(users);



            // Observateur sur la liste
            listeCompte.getSelectionModel().selectedItemProperty().addListener((ChangeListener<Compte>)
                    (observable, oldValue, newValue) -> afficherCompte(newValue));



        }


        private void afficherCompte(Compte comptes) {
            // Affichage des champs
            numero.setText(comptes.toString());
            nom.setText(comptes.getNom());
            soldes.setText(comptes.getSoldes());
            epargnes.setText(comptes.getEpargnes());

        }

    public void Terminer() {
        try {
            Parent racine = FXMLLoader.load(getClass().getResource("MenuController.fxml"));
            Application.getInstance().getStage().getScene().setRoot(racine);

        } catch (IOException exception) {
            System.out.println("Impossible de charger  \n" + exception.getMessage());
        }
    }

    }



