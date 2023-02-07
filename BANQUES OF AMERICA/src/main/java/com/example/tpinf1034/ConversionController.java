package com.example.tpinf1034;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.IOException;
/**
 * KWEPET PANY MATHIEU FLORENT
 * MARIAMA DIALLO
 * FATIMATA DIALLO
 * NONONSI CHARLES

 */

public class ConversionController
{

    @FXML
    private Label errorNumber;
    @FXML
    private TextField somme1;

    @FXML
    private ChoiceBox monnaies;
    @FXML
    private TextField tauxResult;

    @FXML
    private Text currencyError;
    double dinarAlgerien = 0.0011;
    double Bitcoin = 50000;
    double Rouble = 0.0164;
    double polonais = 0.2955;
    double franc = 0.0021;
    double Usd = 1.26;
    double euro = 1.37;
    double dinarTunisien = 0.42;
    double livreSterling = 1.64;
    double roupîeIndienne = 0.017;

@FXML
    public void Calculer() {
       if(NumberOnly()) {
        double total = 0;
        double somme = Integer.parseInt(somme1.getText());
        String monnaie = getCurrency();
        switch (monnaie){
            case "Franc CFA":
                total = somme * franc;
                break;
            case "Euro":
                total = somme * euro;
                break;
            case "Dollars USD" :
                total = somme * Usd ;
                break;
            case "Livre Sterling" :
                total = somme * livreSterling;
                break;
            case "Roupie Indienne" :
                total = somme * roupîeIndienne;
                break;
            case "Dinar Tunisien" :
                total = somme * dinarTunisien;
                break;
            case "dinarAlgerien":
                total = somme * dinarAlgerien;
                break;
            case "Bitcoin":
                total = somme * Bitcoin;
                break;
            case "Polonais":
                total = somme * polonais;
                break;
            case "Rouble":
                total = somme * Rouble;
                break;

        }
        double arrondir = Math.round(total*100.00000)/100.00000;
        tauxResult.setText(arrondir + " $");
System.out.println("user input " + monnaie + " $");

       }
       }

@FXML
    public void Terminer() {
    try {
        Parent racine = FXMLLoader.load(getClass().getResource("MenuController.fxml"));
        Application.getInstance().getStage().getScene().setRoot(racine);

    } catch (IOException exception) {
        System.out.println("Impossible de charger  \n" + exception.getMessage());
    }
}

    public boolean NumberOnly(){
        boolean isnotNumber = false;
             isnotNumber = somme1.getText().toString().chars().allMatch( x -> Character.isDigit(x));
if(!isnotNumber ||  somme1.getText().isBlank())
    errorNumber.setText("Veuillez rentrer un chiffre ");
else
    errorNumber.setText("");

        return isnotNumber;
    }
    public String getCurrency(){
        String monnaie = null;
         monnaie = monnaies.getValue().toString();
            if (monnaie.equals("monnaies") )
                currencyError.setText("Veuillez selectionner une monnaie ");
            else
                currencyError.setText("");

            return  monnaie;
    }
}
