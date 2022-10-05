/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package setdialogopacity;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SetDialogOpacity extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(final Stage primaryStage) {
        primaryStage.setTitle("Dialog");
        Group root = new Group();
        Scene scene = new Scene(root, 400, 300, Color.WHITE);

        
        primaryStage.setScene(scene);
        primaryStage.show();
        
        Stage myDialog = new MyDialog(primaryStage);
        myDialog.sizeToScene();
        myDialog.show();
  
    }
}

class MyDialog extends Stage {

    public MyDialog(Stage owner) {
        super();
        initOwner(owner);
        setTitle("title");
        setOpacity(.90);
        Group root = new Group();
        Scene scene = new Scene(root, 250, 150, Color.WHITE);
        setScene(scene);

        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(5));
        gridpane.setHgap(5);
        gridpane.setVgap(5);

        Label userNameLbl = new Label("User Name: ");
        gridpane.add(userNameLbl, 0, 1);

        Label passwordLbl = new Label("Password: ");
        gridpane.add(passwordLbl, 0, 2);
        final TextField userNameFld = new TextField("Admin");
        gridpane.add(userNameFld, 1, 1);

        final PasswordField passwordFld = new PasswordField();
        passwordFld.setText("password");
        gridpane.add(passwordFld, 1, 2);

        Button login = new Button("Change");
        login.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                close();
            }
        });
        gridpane.add(login, 1, 3);
        GridPane.setHalignment(login, HPos.RIGHT);
        root.getChildren().add(gridpane);
    }
}

