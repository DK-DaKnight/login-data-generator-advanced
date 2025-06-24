package com.daknight.logindatagenerator.utils.lib.style.uielements;

import javafx.scene.control.Spinner;

public interface SpinnerStyle {
    static void spinnerStyle(Spinner<?> spinner) {
        spinner.setEditable(true);
        spinner.setPrefHeight(30);
        spinner.setStyle("""
            -fx-background-color: #2a2a2a;
            -fx-border-color: #444;
            -fx-border-radius: 6;
            -fx-background-radius: 6;
            -fx-text-fill: white;
            -fx-font-size: 14px;
            -fx-padding: 4 10 4 10;
        """);

        spinner.getEditor().setStyle("""
            -fx-background-color: transparent;
            -fx-text-fill: white;
            -fx-border-color: transparent;
        """);

        spinner.lookupAll(".increment-arrow-button").forEach(node -> node.setVisible(false));
        spinner.lookupAll(".decrement-arrow-button").forEach(node -> node.setVisible(false));
    }
}
