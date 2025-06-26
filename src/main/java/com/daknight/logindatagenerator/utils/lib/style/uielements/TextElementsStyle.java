package com.daknight.logindatagenerator.utils.lib.style.uielements;

import com.daknight.logindatagenerator.ui.menu.settings.config.Config;
import com.daknight.logindatagenerator.ui.menu.settings.config.ThemeSettings;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public interface TextElementsStyle {
    ThemeSettings themeSettings = new ThemeSettings(Config.userInterface_theme);
    static void comboBoxStyle(ComboBox<?> comboBox) {
        if (themeSettings.getTheme().equals("Dark")) {
            comboBox.setPrefHeight(30);
            comboBox.setStyle("""
                    -fx-background-color: #2a2a2a;
                    -fx-border-color: #444;
                    -fx-border-radius: 6;
                    -fx-background-radius: 6;
                    -fx-text-fill: white;
                    -fx-font-size: 14px;
                    -fx-padding: 4 10 4 10;
                """);

            if (comboBox.isEditable()) {
                comboBox.getEditor().setStyle("""
                    -fx-background-color: transparent;
                    -fx-text-fill: white;
                    -fx-border-color: transparent;
                """);
            }

            comboBox.getEditor().setStyle("""
                -fx-background-color: transparent;
                -fx-text-fill: white;
                -fx-border-color: transparent;
            """);

            comboBox.lookupAll(".arrow").forEach(node -> node.setStyle("-fx-background-color: transparent;"));
        } else if (themeSettings.getTheme().equals("Light")) {
            comboBox.setPrefHeight(30);
            comboBox.setStyle("""
                -fx-background-color: white;
                -fx-border-color: #444;
                -fx-border-radius: 6;
                -fx-background-radius: 6;
                -fx-text-fill: black;
                -fx-font-size: 14px;
                -fx-padding: 4 10 4 10;
            """);

            if (comboBox.isEditable()) {
                comboBox.getEditor().setStyle("""
                    -fx-background-color: transparent;
                    -fx-text-fill: black;
                    -fx-border-color: transparent;
                """);
            }

            comboBox.getEditor().setStyle("""
                -fx-background-color: transparent;
                -fx-text-fill: black;
                -fx-border-color: transparent;
            """);

            comboBox.lookupAll(".arrow").forEach(node -> node.setStyle("-fx-background-color: transparent;"));
        }
    }

    public static void textFieldStyle(TextField textField) {
        textField.setPrefHeight(30);

        if (themeSettings.getTheme().equals("Dark")) {
            textField.setStyle("""
                -fx-background-color: #2a2a2a;
                -fx-border-color: #444;
                -fx-border-radius: 6;
                -fx-background-radius: 6;
                -fx-text-fill: white;
                -fx-font-size: 14px;
                -fx-padding: 4 10 4 10;
            """);
        } else if (themeSettings.getTheme().equals("Light")) {
            textField.setStyle("""
                -fx-background-color: white;
                -fx-border-color: #444;
                -fx-border-radius: 6;
                -fx-background-radius: 6;
                -fx-text-fill: black;
                -fx-font-size: 14px;
                -fx-padding: 4 10 4 10;
            """);
        }

    }
}
