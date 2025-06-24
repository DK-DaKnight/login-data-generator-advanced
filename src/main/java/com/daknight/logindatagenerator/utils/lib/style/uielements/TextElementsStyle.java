package com.daknight.logindatagenerator.utils.lib.style.uielements;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public interface TextElementsStyle {
    static void comboBoxStyle(ComboBox<?> comboBox) {
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
    }

    public static void textFieldStyle(TextField textField) {
        textField.setPrefHeight(30);
        textField.setStyle("""
            -fx-background-color: #2a2a2a;
            -fx-border-color: #444;
            -fx-border-radius: 6;
            -fx-background-radius: 6;
            -fx-text-fill: white;
            -fx-font-size: 14px;
            -fx-padding: 4 10 4 10;
        """);
    }
}
