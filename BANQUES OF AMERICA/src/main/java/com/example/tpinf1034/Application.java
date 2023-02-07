package com.example.tpinf1034;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {

    private static Application instance;

    private Stage stage;

    public Application() {
        instance = this;
    }

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;

        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("menuController.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 700);
        stage.setTitle("BANQUE ROYALE AMÉRICAINE");
        stage.setScene(scene);
        stage.show();
    }

    public Stage getStage() {
        return stage;
    }

    public static Application getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        launch();
    }
}