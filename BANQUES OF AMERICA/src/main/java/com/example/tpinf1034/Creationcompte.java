package com.example.tpinf1034;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * KWEPET PANY MATHIEU FLORENT
 * MARIAMA DIALLO
 * FATIMATA DIALLO
 * NONONSI CHARLES

 */

public class Creationcompte {

    @FXML
    private TextField champ_nom;

    @FXML
    private TextField champ_prenom;

    @FXML
    private DatePicker date_naissance;
    @FXML
    private TextField champ_telephone;

    @FXML
    private TextField champ_mail;

    @FXML
    private TextField zone_adresse;
    @FXML
    private TextField code_postal;
    @FXML
    private TextField champ_ville;
    @FXML
    private PasswordField mot_passe;
    @FXML
    private PasswordField confirmer_mdp;
    @FXML
    private Text messageSucces;

    @FXML
    private Text messageErreur;

public void sauvegarder(){

}
    public void validation(ActionEvent actionEvent) {
        String message = "";

        String nom = champ_nom.getText().toString();
        String prenom = champ_prenom.getText().toString();
        String dateNaissance = String.valueOf(date_naissance.getValue());
        String telephone = champ_telephone.getText().toString();
        String adresse_courriel = champ_mail.getText().toString();
        String adresse = zone_adresse.getText().toString();
        String codePostal = code_postal.getText().toString();
        String ville = champ_ville.getText().toString();
        String mot_de_passe= mot_passe.getText().toString();
        String confirmer_mot_de_passe= confirmer_mdp.getText().toString();



        if(
                nom.isBlank() || prenom.isBlank() || telephone.isBlank() ||
                        adresse_courriel.isBlank() || codePostal.isBlank()||
                        dateNaissance.isBlank() || adresse.isBlank()
                        || ville.isBlank() || mot_de_passe.isBlank() || confirmer_mot_de_passe.isBlank()){
            message = "veillez remplir tous les champs";
        } else if (!mot_de_passe.equals(confirmer_mot_de_passe)) {
            message="les deux mot de passes doivent être pareils";
        } else if(!NumberOnly(champ_telephone)){
            message = "Veuillez rentrer un numero de telephone valide";
        }else if(!isValidEmail(adresse_courriel)){
            message = "Veuillez rentrer le bon format en email ";
        }else {
            message = "";
            Utils.comptes.add(new Compte(nom+""+12,nom,"",""));
            messageSucces.setText("Compte enregistre avec succes");
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
            Parent racine = FXMLLoader.load(getClass().getResource("creationCompte.fxml"));
            Application.getInstance().getStage().getScene().setRoot(racine);

        } catch (IOException exception) {
            System.out.println("Impossible de charger  \n" + exception.getMessage());
        }
    }

}





