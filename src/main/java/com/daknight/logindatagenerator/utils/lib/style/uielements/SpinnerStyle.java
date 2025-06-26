package com.daknight.logindatagenerator.utils.lib.style.uielements;

import com.daknight.logindatagenerator.ui.menu.settings.config.Config;
import com.daknight.logindatagenerator.ui.menu.settings.config.ThemeSettings;
import javafx.scene.control.Spinner;

public interface SpinnerStyle {
    static void spinnerStyle(Spinner<?> spinner) {
        ThemeSettings themeSettings = new ThemeSettings(Config.userInterface_theme);
        if (themeSettings.getTheme().equals("Dark")) {
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

        } else if (themeSettings.getTheme().equals("Light")) {
            spinner.setEditable(true);
            spinner.setPrefHeight(30);
            spinner.setStyle("""
                        -fx-background-color: white;
                        -fx-border-color: #444;
                        -fx-border-radius: 6;
                        -fx-background-radius: 6;
                        -fx-text-fill: black;
                        -fx-font-size: 14px;
                        -fx-padding: 4 10 4 10;
                    """);

            spinner.getEditor().setStyle("""
                        -fx-background-color: transparent;
                        -fx-text-fill: black;
                        -fx-border-color: transparent;
                    """);

            spinner.lookupAll(".increment-arrow-button").forEach(node -> node.setVisible(false));
            spinner.lookupAll(".decrement-arrow-button").forEach(node -> node.setVisible(false));
        }
    }
}
