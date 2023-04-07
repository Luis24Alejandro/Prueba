package com.example.buscaminas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.application.Application;
import java.io.IOException;

public abstract class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button dummy;

    @FXML
    private Button advanced;

    @FXML
    public void abrirDummy(ActionEvent event) extends Application {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("dummy.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        Stage.setTitle("Busca Minas");
        Stage.setScene(scene);
        Stage.show();
    }
}