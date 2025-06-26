package com.daknight.logindatagenerator.utils.lib.style.uielements;

import com.daknight.logindatagenerator.ui.menu.settings.config.Config;
import com.daknight.logindatagenerator.ui.menu.settings.config.ThemeSettings;

public interface ListViewStyle {
    ThemeSettings themeSettings = new ThemeSettings(Config.userInterface_theme);
    static String listViewStyle() {
        if (themeSettings.getTheme().equals("Dark")) {
            return """
                -fx-background-color: #1a1a1a;
                -fx-text-fill: white;
                -fx-font-size: 14px;
                -fx-font-weight: bold;
            """;
        } else if (themeSettings.getTheme().equals("Light")) {
            return """
                        -fx-background-color: white;
                        -fx-text-fill: black;
                        -fx-font-size: 14px;
                        -fx-font-weight: bold;
                    """;
        }
        return null;
    }

}
