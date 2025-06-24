package com.daknight.logindatagenerator.ui.grid;

import com.daknight.logindatagenerator.ui.menu.settings.config.Config;
import com.daknight.logindatagenerator.ui.menu.settings.config.PasswordSettings;
import com.daknight.logindatagenerator.ui.menu.settings.config.ThemeSettings;
import com.daknight.logindatagenerator.ui.menu.settings.config.UsernameSettings;
import com.daknight.logindatagenerator.utils.generators.PasswordGenerator;
import com.daknight.logindatagenerator.utils.generators.UsernameGenerator;
import com.daknight.logindatagenerator.utils.lib.style.uielements.ButtonStyle;
import com.daknight.logindatagenerator.utils.lib.style.uielements.TextElementsStyle;
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
        UsernameSettings usernameSettings = new UsernameSettings(Config.username_maxBigChars, Config.username_maxSmallChars);
        PasswordSettings passwordSettings = new PasswordSettings(Config.password_maxBigChars, Config.password_maxSmallChars, Config.password_maxSpecialChars, Config.password_maxNumbers);
        ThemeSettings themeSettings = new ThemeSettings(Config.userInterface_theme);

        Label username = new Label("Username");
        username.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; -fx-text-fill: white");
        Label password = new Label("Password");
        password.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; -fx-text-fill: white");


        TextField generatedUsername = new TextField("Click 'Generate' to generate a username");
        generatedUsername.setEditable(false);
        generatedUsername.setStyle("-fx-font-size: 14px;");
        generatedUsername.setPrefWidth(300);
        TextElementsStyle.textFieldStyle(generatedUsername);

        TextField generatedPassword = new TextField("Click 'Generate' to generate a password");
        generatedPassword.setEditable(false);
        generatedPassword.setStyle("-fx-font-size: 14px;");
        generatedPassword.setPrefWidth(300);
        TextElementsStyle.textFieldStyle(generatedPassword);

        Button copyUsername = new Button("Copy");
        copyUsername.setCursor(Cursor.HAND);
        copyUsername.setStyle(ButtonStyle.buttonStyle());
        ButtonStyle.buttonHoverStyle(copyUsername);
        copyUsername.setOnAction(e -> {
            ButtonStyle.buttonClickFeedback(copyUsername, "Copied");
            ClipboardContent content = new ClipboardContent();
            content.putString(generatedUsername.getText());
            Clipboard.getSystemClipboard().setContent(content);
        });

        Button copyPassword = new Button("Copy");
        copyPassword.setCursor(Cursor.HAND);
        copyPassword.setStyle(ButtonStyle.buttonStyle());
        ButtonStyle.buttonHoverStyle(copyPassword);
        copyPassword.setOnAction(e -> {
            ButtonStyle.buttonClickFeedback(copyPassword, "Copied");
            ClipboardContent content = new ClipboardContent();
            content.putString(generatedPassword.getText());
            Clipboard.getSystemClipboard().setContent(content);
        });

        Button generateButton = new Button("Generate");
        generateButton.setCursor(Cursor.HAND);
        generateButton.setStyle(ButtonStyle.buttonStyle());
        ButtonStyle.buttonHoverStyle(generateButton);
        generateButton.setOnAction(e -> {
            ButtonStyle.buttonClickFeedback(generateButton, "Generated");
            generatedUsername.setText(new UsernameGenerator(5, 5).generateUsername());
            generatedPassword.setText(new PasswordGenerator(5, 5, 5, 5).generatePassword());
        });

        Button testButton = new Button("Getter");
        testButton.setCursor(Cursor.HAND);
        testButton.setStyle(ButtonStyle.buttonStyle());
        testButton.setOnAction(e -> {
            ButtonStyle.buttonHoverStyle(testButton);
            System.out.println();
            System.out.println("--- Debug - username and password max variables ---");
            System.out.println("Username");
            System.out.println("Username max big chars: " + usernameSettings.getUsernameMaxBigChars());
            System.out.println("Username max small chars: " +  usernameSettings.getUsernameMaxSmallChars());
            System.out.println("Password");
            System.out.println("Password max big chars: " +  passwordSettings.getPasswordMaxBigChars());
            System.out.println("Password max small chars: " + passwordSettings.getPasswordMaxSmallChars());
            System.out.println("Password max special chars: " +  passwordSettings.getPasswordMaxSpecialChars());
            System.out.println("Password max numbers: " +  passwordSettings.getPasswordMaxNumbers());
            System.out.println("User Interface");
            System.out.println("User Interface theme: " + themeSettings.getTheme());
            System.out.println();
        });

        HBox usernameBox = new HBox(10, generatedUsername, copyUsername);
        usernameBox.setAlignment(Pos.CENTER_LEFT);

        HBox passwordBox = new HBox(10, generatedPassword, copyPassword);
        passwordBox.setAlignment(Pos.CENTER_LEFT);

        grid.setHgap(10);
        grid.setVgap(15);
        grid.setPadding(new Insets(20));

        grid.add(username, 0, 0);
        grid.add(usernameBox, 1, 0);
        grid.add(password, 0, 1);
        grid.add(passwordBox, 1, 1);
        grid.add(generateButton, 1, 2);
        //grid.add(testButton, 2, 2);
        grid.setAlignment(Pos.CENTER);

        return grid;
    }
}
