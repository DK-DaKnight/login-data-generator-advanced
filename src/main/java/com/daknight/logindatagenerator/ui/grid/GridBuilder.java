package com.daknight.logindatagenerator.ui.grid;

import com.daknight.logindatagenerator.utils.generators.PasswordGenerator;
import com.daknight.logindatagenerator.utils.generators.UsernameGenerator;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


public class GridBuilder {
    public static GridPane build() {
        GridPane grid = new GridPane();

        Label username = new Label("Username");
        username.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; -fx-text-fill: white");
        Label password = new Label("Password");
        password.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; -fx-text-fill: white");


        TextField generatedUsername = new TextField("Click 'Generate' to generate a username");
        generatedUsername.setEditable(false);
        generatedUsername.setStyle("-fx-font-size: 14px;");
        generatedUsername.setPrefWidth(300);

        TextField generatedPassword = new TextField("Click 'Generate' to generate a password");
        generatedPassword.setEditable(false);
        generatedPassword.setStyle("-fx-font-size: 14px;");
        generatedPassword.setPrefWidth(300);

        Button copyUsername = new Button("Copy");
        copyUsername.setCursor(Cursor.HAND);
        copyUsername.setStyle(buttonStyle());
        copyUsername.setOnAction(e -> {
            ClipboardContent content = new ClipboardContent();
            content.putString(generatedUsername.getText());
            Clipboard.getSystemClipboard().setContent(content);
        });

        Button copyPassword = new Button("Copy");
        copyPassword.setCursor(Cursor.HAND);
        copyPassword.setStyle(buttonStyle());
        copyPassword.setOnAction(e -> {
            ClipboardContent content = new ClipboardContent();
            content.putString(generatedPassword.getText());
            Clipboard.getSystemClipboard().setContent(content);
        });

        HBox usernameBox = new HBox(10, generatedUsername, copyUsername);
        usernameBox.setAlignment(Pos.CENTER_LEFT);

        HBox passwordBox = new HBox(10, generatedPassword, copyPassword);
        passwordBox.setAlignment(Pos.CENTER_LEFT);

        Button generateButton = new Button("Generate");
        generateButton.setCursor(Cursor.HAND);
        generateButton.setStyle(buttonStyle());
        generateButton.setOnAction(e -> {
            generatedUsername.setText(new UsernameGenerator(5, 5).generateUsername());
            generatedPassword.setText(new PasswordGenerator(5, 5, 5, 5).generatePassword());
        });

        grid.setHgap(10);
        grid.setVgap(15);
        grid.setPadding(new Insets(20));

        grid.add(username, 0, 0);
        grid.add(usernameBox, 1, 0);
        grid.add(password, 0, 1);
        grid.add(passwordBox, 1, 1);
        grid.add(generateButton, 1, 2);
        grid.setAlignment(Pos.CENTER);

        return grid;
    }
    private static String buttonStyle() {
        return """
                -fx-background-color: #4CAF50;
                -fx-text-fill: white;
                -fx-font-size: 14px;
                -fx-font-weight: bold;
                -fx-background-radius: 6;
                -fx-padding: 6 12;
                """;
    }
}
