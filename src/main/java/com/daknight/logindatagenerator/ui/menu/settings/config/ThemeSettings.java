package com.daknight.logindatagenerator.ui.menu.settings.config;

import javafx.geometry.Insets;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class ThemeSettings {
    private String theme;

    public ThemeSettings(String theme) {
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Color changeBackground() {
        if (this.theme.equals("Dark")) {
            return Color.web("#212121");
        }
        else if (this.theme.equals("Light")) {
            return Color.web("#fff");
        }
        return null;
    }

    public String changeMenu() {
        if (this.theme.equals("Dark")) {
            return "data:text/css," +
                    ".menu-bar .label { -fx-text-fill: white; -fx-font-weight: bold; }" +
                    ".menu-bar { -fx-background-color: #1a1a1a; }" +
                    ".context-menu { -fx-background-color: #1a1a1a; }" +
                    ".menu-item .label { -fx-text-fill: white; }";
        } else if (this.theme.equals("Light")) {
            return "data:text/css," +
                    ".menu-bar .label { -fx-text-fill: black; -fx-font-weight: bold; }" +
                    ".menu-bar { -fx-background-color: white; }" +
                    ".context-menu { -fx-background-color: white; }" +
                    ".menu-item .label { -fx-text-fill: black; }";
        }
        return null;
    }
}
