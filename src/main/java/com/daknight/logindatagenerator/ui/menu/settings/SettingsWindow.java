package com.daknight.logindatagenerator.ui.menu.settings;

import com.daknight.logindatagenerator.ui.menu.settings.config.Config;
import com.daknight.logindatagenerator.ui.menu.settings.config.PasswordSettings;
import com.daknight.logindatagenerator.ui.menu.settings.config.ThemeSettings;
import com.daknight.logindatagenerator.ui.menu.settings.config.UsernameSettings;
import com.daknight.logindatagenerator.utils.lib.style.uielements.ButtonStyle;
import com.daknight.logindatagenerator.utils.lib.style.uielements.ListViewStyle;
import com.daknight.logindatagenerator.utils.lib.style.uielements.SpinnerStyle;
import com.daknight.logindatagenerator.utils.lib.style.uielements.TextElementsStyle;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SettingsWindow {
    private final UsernameSettings usernameSettings;
    private final PasswordSettings passwordSettings;
    private final ThemeSettings themeSettings;

    public SettingsWindow(UsernameSettings us, PasswordSettings ps, ThemeSettings ts) {
        usernameSettings = us;
        passwordSettings = ps;
        themeSettings = ts;
    }

    public void show() {
        Stage settingStage = new Stage();
        settingStage.setTitle("Settings");
        settingStage.initModality(Modality.APPLICATION_MODAL);

        ListView<String> categoryList = new ListView<>();
        categoryList.getItems().addAll("User Interface", "Username Settings", "Password Settings");
        categoryList.setPrefWidth(200);
        categoryList.setStyle(ListViewStyle.listViewStyle());
        categoryList.setCellFactory(lv -> new ListCell<>() {{
            setOnMouseEntered(e -> {
                    if (!isEmpty()) {
                        setBackground(new Background(new BackgroundFill(
                                themeSettings.listViewBackgroundEntered(), CornerRadii.EMPTY, Insets.EMPTY
                        )));
                        setTextFill(themeSettings.listViewTextFillEntered());
                    }
                });

                setOnMouseExited(e -> {
                    if (!isEmpty()) {
                        setBackground(new Background(new BackgroundFill(
                                themeSettings.listViewBackgroundExited(), CornerRadii.EMPTY, Insets.EMPTY
                        )));
                        setTextFill(themeSettings.listViewTextFillExited());
                    }
                });
            }

            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);

                if (empty || item == null) {
                    setText(null);
                    setBackground(null);
                    setTextFill(themeSettings.listViewUpdateItemTextFill());
                } else {
                    setText(item);

                    // Auswahlfarbe setzen
                    if (isSelected()) {
                        setBackground(new Background(new BackgroundFill(
                                themeSettings.listViewIsSelectedBackground(), CornerRadii.EMPTY, Insets.EMPTY
                        )));
                        setTextFill(themeSettings.listViewIsSelectedTextFill());
                    } else {
                        setBackground(new Background(new BackgroundFill(
                                themeSettings.listViewIsNotSelectedBackground(), CornerRadii.EMPTY, Insets.EMPTY
                        )));
                        setTextFill(themeSettings.listViewIsNotSelectedTextFill());
                    }
                }
            }
        });


        VBox contentArea = new VBox(10);
        contentArea.setPadding(new Insets(20));

        // USER INTERFACE
        Label themeLabel = new Label("Theme");
        ComboBox<String> themeBox = new ComboBox<>();
        themeBox.setValue(themeSettings.getTheme());
        themeBox.getItems().addAll("Dark", "Light");
        themeBox.setPrefWidth(800);
        themeBox.setPrefHeight(30);
        themeLabel.setStyle(themeSettings.changeLabel());
        TextElementsStyle.comboBoxStyle(themeBox);

        // USERNAME SETTINGS
        Label usernameMaxBigCharsLabel = new Label("Max Big Chars");
        Spinner<Integer> usernameMaxBigCharsSpinner = new Spinner<>();
        usernameMaxBigCharsSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 20, usernameSettings.getUsernameMaxBigChars())
        );
        usernameMaxBigCharsSpinner.setEditable(true);
        usernameMaxBigCharsSpinner.setPrefWidth(800);
        usernameMaxBigCharsSpinner.setPrefHeight(30);
        usernameMaxBigCharsLabel.setStyle(themeSettings.changeLabel());
        SpinnerStyle.spinnerStyle(usernameMaxBigCharsSpinner);

        Label usernameMaxSmallCharsLabel = new Label("Max Small Chars");
        Spinner<Integer> usernameMaxSmallCharsSpinner = new Spinner<>();
        usernameMaxSmallCharsSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 20, usernameSettings.getUsernameMaxSmallChars())
        );
        usernameMaxSmallCharsSpinner.setEditable(true);
        usernameMaxSmallCharsSpinner.setPrefWidth(800);
        usernameMaxSmallCharsSpinner.setPrefHeight(30);
        usernameMaxSmallCharsLabel.setStyle(themeSettings.changeLabel());
        SpinnerStyle.spinnerStyle(usernameMaxSmallCharsSpinner);

        // PASSWORD SETTINGS
        Label passwordMaxBigCharsLabel = new Label("Max Big Chars");
        Spinner<Integer> passwordMaxBigCharsSpinner = new Spinner<>();
        passwordMaxBigCharsSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 20, passwordSettings.getPasswordMaxBigChars())
        );
        passwordMaxBigCharsSpinner.setEditable(true);
        passwordMaxBigCharsSpinner.setPrefWidth(800);
        passwordMaxBigCharsSpinner.setPrefHeight(30);
        passwordMaxBigCharsLabel.setStyle(themeSettings.changeLabel());
        SpinnerStyle.spinnerStyle(passwordMaxBigCharsSpinner);

        Label passwordMaxSmallCharsLabel = new Label("Max Small Chars");
        Spinner<Integer> passwordMaxSmallCharsSpinner = new Spinner<>();
        passwordMaxSmallCharsSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 20, passwordSettings.getPasswordMaxSmallChars())
        );
        passwordMaxSmallCharsSpinner.setEditable(true);
        passwordMaxSmallCharsSpinner.setPrefWidth(800);
        passwordMaxSmallCharsSpinner.setPrefHeight(30);
        passwordMaxSmallCharsLabel.setStyle(themeSettings.changeLabel());
        SpinnerStyle.spinnerStyle(passwordMaxSmallCharsSpinner);

        Label passwordMaxSpecialCharsLabel = new Label("Max Special Chars");
        Spinner<Integer> passwordMaxSpecialCharsSpinner = new Spinner<>();
        passwordMaxSpecialCharsSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 20, passwordSettings.getPasswordMaxSpecialChars())
        );
        passwordMaxSpecialCharsSpinner.setEditable(true);
        passwordMaxSpecialCharsSpinner.setPrefWidth(800);
        passwordMaxSpecialCharsSpinner.setPrefHeight(30);
        passwordMaxSpecialCharsLabel.setStyle(themeSettings.changeLabel());
        SpinnerStyle.spinnerStyle(passwordMaxSpecialCharsSpinner);

        Label passwordMaxNumbersLabel = new Label("Max Numbers");
        Spinner<Integer> passwordMaxNumbersSpinner = new Spinner<>();
        passwordMaxNumbersSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 20, passwordSettings.getPasswordMaxNumbers())
        );
        passwordMaxNumbersSpinner.setEditable(true);
        passwordMaxNumbersSpinner.setPrefWidth(800);
        passwordMaxNumbersSpinner.setPrefHeight(30);
        passwordMaxNumbersLabel.setStyle(themeSettings.changeLabel());
        SpinnerStyle.spinnerStyle(passwordMaxNumbersSpinner);

        categoryList.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            contentArea.getChildren().clear();

            if ("Username Settings".equals(newVal)) {
                contentArea.getChildren().addAll(
                        usernameMaxBigCharsLabel, usernameMaxBigCharsSpinner,
                        usernameMaxSmallCharsLabel, usernameMaxSmallCharsSpinner
                );
            } else if ("Password Settings".equals(newVal)) {
                contentArea.getChildren().addAll(
                        passwordMaxBigCharsLabel, passwordMaxBigCharsSpinner,
                        passwordMaxSmallCharsLabel, passwordMaxSmallCharsSpinner,
                        passwordMaxSpecialCharsLabel, passwordMaxSpecialCharsSpinner,
                        passwordMaxNumbersLabel, passwordMaxNumbersSpinner
                );
            } else if ("User Interface".equals(newVal)) {
                contentArea.getChildren().addAll(
                        themeLabel, themeBox
                );
            }
        });

        categoryList.getSelectionModel().selectFirst();
        Button saveButton = new Button("Save");
        saveButton.setCursor(Cursor.HAND);
        saveButton.setPrefWidth(100);
        saveButton.setPrefHeight(25);
        saveButton.setStyle(ButtonStyle.buttonStyle());
        ButtonStyle.buttonHoverStyle(saveButton);
        saveButton.setOnAction(e -> {
            ButtonStyle.buttonClickFeedback(saveButton, "Saved");
            // USERNAME CONFIG
            Config.username_maxBigChars = usernameMaxBigCharsSpinner.getValue();
            Config.username_maxSmallChars = usernameMaxSmallCharsSpinner.getValue();
            // PASSWORD CONFIG
            Config.password_maxBigChars = passwordMaxBigCharsSpinner.getValue();
            Config.password_maxSmallChars = passwordMaxSmallCharsSpinner.getValue();
            Config.password_maxSpecialChars = passwordMaxSpecialCharsSpinner.getValue();
            Config.password_maxNumbers = passwordMaxNumbersSpinner.getValue();
            // USER INTERFACE CONFIG
            Config.userInterface_theme = themeBox.getValue();

            settingStage.close();

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

        BorderPane mainLayout = new BorderPane();
        mainLayout.setBackground(new Background(new BackgroundFill(
                themeSettings.changeBackground(), CornerRadii.EMPTY, Insets.EMPTY
        )));
        mainLayout.setLeft(categoryList);
        mainLayout.setCenter(contentArea);
        mainLayout.setBottom(new HBox(saveButton));

        BorderPane.setMargin(saveButton, new Insets(10));
        HBox bottomBox = (HBox) mainLayout.getBottom();
        bottomBox.setPadding(new Insets(0, 20, 10, 20));
        bottomBox.setSpacing(10);
        bottomBox.setStyle("-fx-alignment: center-right;");

        Scene scene = new Scene(mainLayout, 800, 400);
        settingStage.setScene(scene);
        settingStage.showAndWait();
    }
}