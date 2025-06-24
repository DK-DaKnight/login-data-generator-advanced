package com.daknight.logindatagenerator.ui.menu.settings;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SettingsWindow {
    private final UsernameSettings usernameSettings;
    private final PasswordSettings passwordSettings;

    public SettingsWindow(UsernameSettings us, PasswordSettings ps) {
        usernameSettings = us;
        passwordSettings = ps;
    }

    public void show() {
        Stage preferencesStage = new Stage();
        preferencesStage.setTitle("Preferences");
        preferencesStage.initModality(Modality.APPLICATION_MODAL);

        ListView<String> categoryList = new ListView<>();
        categoryList.getItems().addAll("Username Settings", "Password Settings");
        categoryList.setPrefWidth(150);

        VBox contentArea = new VBox(10);
        contentArea.setPadding(new Insets(20));

        Button saveButton = new Button("Save");
        saveButton.setPrefWidth(100);
        saveButton.setPrefHeight(25);

        // USERNAME SETTINGS
        Label usernameMaxBigCharsLabel = new Label("Max Big Chars");
        Spinner<Integer> usernameMaxBigCharsSpinner = new Spinner<>();
        usernameMaxBigCharsSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 20, usernameSettings.getUsernameMaxBigChars())
        );
        usernameMaxBigCharsSpinner.setEditable(true);
        usernameMaxBigCharsSpinner.setPrefWidth(800);
        usernameMaxBigCharsSpinner.setPrefHeight(30);

        Label usernameMaxSmallCharsLabel = new Label("Max Small Chars");
        Spinner<Integer> usernameMaxSmallCharsSpinner = new Spinner<>();
        usernameMaxSmallCharsSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 20, usernameSettings.getUsernameMaxSmallChars())
        );
        usernameMaxSmallCharsSpinner.setEditable(true);
        usernameMaxSmallCharsSpinner.setPrefWidth(800);
        usernameMaxSmallCharsSpinner.setPrefHeight(30);

        // PASSWORD SETTINGS
        Label passwordMaxBigCharsLabel = new Label("Max Big Chars");
        Spinner<Integer> passwordMaxBigCharsSpinner = new Spinner<>();
        passwordMaxBigCharsSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 20, passwordSettings.getPasswordMaxBigChars())
        );
        passwordMaxBigCharsSpinner.setEditable(true);
        passwordMaxBigCharsSpinner.setPrefWidth(800);
        passwordMaxBigCharsSpinner.setPrefHeight(30);

        Label passwordMaxSmallCharsLabel = new Label("Max Big Chars");
        Spinner<Integer> passwordMaxSmallCharsSpinner = new Spinner<>();
        passwordMaxSmallCharsSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 20, passwordSettings.getPasswordMaxSmallChars())
        );
        passwordMaxSmallCharsSpinner.setEditable(true);
        passwordMaxSmallCharsSpinner.setPrefWidth(800);
        passwordMaxSmallCharsSpinner.setPrefHeight(30);

        Label passwordMaxSpecialCharsLabel = new Label("Max Big Chars");
        Spinner<Integer> passwordMaxSpecialCharsSpinner = new Spinner<>();
        passwordMaxSpecialCharsSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 20, passwordSettings.getPasswordMaxSpecialChars())
        );
        passwordMaxSpecialCharsSpinner.setEditable(true);
        passwordMaxSpecialCharsSpinner.setPrefWidth(800);
        passwordMaxSpecialCharsSpinner.setPrefHeight(30);

        Label passwordMaxNumbersLabel = new Label("Max Big Chars");
        Spinner<Integer> passwordMaxNumbersSpinner = new Spinner<>();
        passwordMaxNumbersSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 20, passwordSettings.getPasswordMaxNumbers())
        );
        passwordMaxNumbersSpinner.setEditable(true);
        passwordMaxNumbersSpinner.setPrefWidth(800);
        passwordMaxNumbersSpinner.setPrefHeight(30);

        categoryList.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            contentArea.getChildren().clear();

            if ("Username Settings".equals(newVal)) {
                contentArea.getChildren().addAll(
                        usernameMaxBigCharsLabel, usernameMaxBigCharsSpinner,
                        usernameMaxSmallCharsLabel, usernameMaxSmallCharsSpinner
                );
            } else if ("Password Settings".equals(newVal)) {
                Label info = new Label("Password settings UI not implemented.");
                contentArea.getChildren().addAll(
                        passwordMaxBigCharsLabel, passwordMaxBigCharsSpinner,
                        passwordMaxSmallCharsLabel, passwordMaxSmallCharsSpinner,
                        passwordMaxSpecialCharsLabel, passwordMaxSpecialCharsSpinner,
                        passwordMaxNumbersLabel, passwordMaxNumbersSpinner
                );
            }
        });

        categoryList.getSelectionModel().selectFirst();

        saveButton.setOnAction(e -> {
            usernameSettings.setUsernameMaxBigChars(usernameMaxBigCharsSpinner.getValue());
            usernameSettings.setUsernameMaxSmallChars(usernameMaxSmallCharsSpinner.getValue());
            preferencesStage.close();
        });

        BorderPane mainLayout = new BorderPane();
        mainLayout.setLeft(categoryList);
        mainLayout.setCenter(contentArea);
        mainLayout.setBottom(new HBox(saveButton));

        BorderPane.setMargin(saveButton, new Insets(10));
        HBox bottomBox = (HBox) mainLayout.getBottom();
        bottomBox.setPadding(new Insets(0, 20, 10, 20));
        bottomBox.setSpacing(10);
        bottomBox.setStyle("-fx-alignment: center-right;");

        Scene scene = new Scene(mainLayout, 800, 400);
        preferencesStage.setScene(scene);
        preferencesStage.showAndWait();
    }
}
