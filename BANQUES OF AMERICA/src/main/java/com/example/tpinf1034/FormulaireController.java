package com.example.tpinf1034;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.scene.control.*;
/**
 * KWEPET PANY MATHIEU FLORENT
 * MARIAMA DIALLO
 * FATIMATA DIALLO
 * NONONSI CHARLES

 */

public class FormulaireController {

    @FXML
    private ChoiceBox choix;

    @FXML
    private RadioButton statutcelibataire;

    @FXML
    private RadioButton statutmariee;

    @FXML
    private RadioButton statutconcubinage;

    @FXML
    private RadioButton statutveuf;

    @FXML
    private ToggleGroup theme;

    @FXML
    private Text menu ;

    @FXML
    private Text centre;

    @FXML
    private TextField champ_nom;

    @FXML
    private TextField champ_prenom;

    @FXML
    private DatePicker date_naissance;

    @FXML
    private TextField lieu_naissance;

    @FXML
    private DatePicker date_evenement;

    @FXML
    private ToggleGroup Statut;

    @FXML
    private TextField numero_telephone;

    @FXML
    private TextField champ_mail;

    @FXML
    private TextField zone_adresse;

    @FXML
    private TextField code_postal;

    @FXML
    private TextField champ_ville;

    @FXML
    private TextField champ_profesion;
    @FXML
    private Text messageSucces;

    @FXML
    private Text messageErreur;

    @FXML
    private CheckBox champ_assurance;




    private  String  trouverElementSelectionner () {
        if ( statutcelibataire . isSelected ()) {
            return  "celibataire" ;
        } else  if ( statutmariee . isSelected ()) {
            return  "mariee" ;
        } else if (statutconcubinage . isSelected ()) {
            return "concubinage" ;
        } else  if ( statutveuf . isSelected ()) {
            return  "veuf" ;
        } else {
            return  "aucun" ;
        }
    }
    public void validation(ActionEvent actionEvent) {
        String message = "";

        String nom = champ_nom.getText().toString();
        String prenom = champ_prenom.getText().toString();
        String telephone = numero_telephone.getText().toString();
        String adresse_courriel = champ_mail.getText().toString();
        String adresse = zone_adresse.getText().toString();
        String codePostal = code_postal.getText().toString();
        String ville = champ_ville.getText().toString();
        if(
                nom.isBlank() || prenom.isBlank() || telephone.isBlank() ||
                        adresse_courriel.isBlank() || codePostal.isBlank()||
                       adresse.isBlank()
                        || ville.isBlank() ){
            message = "veillez remplir tous les champs";
        }
         else if(!NumberOnly(numero_telephone)){
            message = "Veuillez rentrer un numero de telephone valide";
        }else if(!isValidEmail(adresse_courriel)){
            message = "Veuillez rentrer le bon format en email ";
        }else {
            message = "";
            messageSucces.setText("Formulaire remplis avec succes");
        }

        messageErreur.setText(message);
    }

    public boolean NumberOnly(TextField txtField){
        boolean isnotNumber = false;
        isnotNumber = txtField.getText().toString().chars().allMatch( x -> Character.isDigit(x));
        return isnotNumber;
    }

    public static boolean isValidEmail(String email) {

        String regex = "^(.+)@(.+)$";

        //initialize the Pattern object

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }



    public void Terminer() {
        try {
            Parent racine = FXMLLoader.load(getClass().getResource("MenuController.fxml"));
            Application.getInstance().getStage().getScene().setRoot(racine);

        } catch (IOException exception) {
            System.out.println("Impossible de charger  \n" + exception.getMessage());
        }
    }
    public void Reinitialiser() {
        try {
            Parent racine = FXMLLoader.load(getClass().getResource("gestionformulaire.fxml"));
            Application.getInstance().getStage().getScene().setRoot(racine);

        } catch (IOException exception) {
            System.out.println("Impossible de charger  \n" + exception.getMessage());
        }
    }
}





