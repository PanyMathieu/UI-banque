package com.example.tpinf1034;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
/**
 * KWEPET PANY MATHIEU FLORENT
 * MARIAMA DIALLO
 * FATIMATA DIALLO
 * NONONSI CHARLES

 */

public class menuController {


    @FXML
    private void afficher(ActionEvent event) {
        Node source = (Node) event.getSource();
        Menu type = Menu.valueOf((String) source.getUserData());

        chargerContenu(type.getFichierFxml());
    }

    /**
     * Charge le contenu du fichier en paramètre et le place comme racine du stage actuel

     */
    private void chargerContenu(String nomFichier) {
        try {
            Parent racine = FXMLLoader.load(getClass().getResource(nomFichier));
            Application.getInstance().getStage().getScene().setRoot(racine);

        } catch (IOException exception) {
            System.out.println("Impossible de charger le fichier " + nomFichier + "\n" + exception.getMessage());
        }
    }




}


