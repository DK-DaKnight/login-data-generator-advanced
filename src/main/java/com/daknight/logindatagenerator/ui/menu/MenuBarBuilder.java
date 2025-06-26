package com.daknight.logindatagenerator.ui.menu;

import com.daknight.logindatagenerator.ui.LoginDataGeneratorUI;
import com.daknight.logindatagenerator.ui.menu.settings.*;
import com.daknight.logindatagenerator.ui.menu.settings.config.Config;
import com.daknight.logindatagenerator.ui.menu.settings.config.PasswordSettings;
import com.daknight.logindatagenerator.ui.menu.settings.config.ThemeSettings;
import com.daknight.logindatagenerator.ui.menu.settings.config.UsernameSettings;
import com.daknight.logindatagenerator.utils.ui.menu.AppRestart;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;

public class MenuBarBuilder {
    public static MenuBar build(Runnable onExit) {
        ThemeSettings themeSettings = new ThemeSettings(Config.userInterface_theme);
        MenuBar menuBar = new MenuBar();

        // All menus
        Menu homeMenu = new Menu("Home");
        menuBar.getStylesheets().add(themeSettings.changeMenu());

        // home menu items
        MenuItem settingItem = new MenuItem("Settings");
        settingItem.setOnAction(e -> {
            SettingsWindow settingsWindow = new SettingsWindow(
                    new UsernameSettings(Config.username_maxBigChars, Config.username_maxSmallChars),
                    new PasswordSettings(Config.password_maxBigChars, Config.password_maxSmallChars, Config.password_maxSpecialChars, Config.password_maxNumbers),
                    new ThemeSettings(Config.userInterface_theme)
            );
            settingsWindow.show();
        });

        MenuItem restartItem = new MenuItem("Restart");
        restartItem.setAccelerator(new KeyCodeCombination(KeyCode.F, KeyCodeCombination.ALT_DOWN));
        restartItem.setOnAction(e -> AppRestart.restart(LoginDataGeneratorUI.getPrimaryStage()));
        MenuItem exitItem = new MenuItem("Exit");
        exitItem.setOnAction(e -> onExit.run());
        exitItem.setAccelerator(new KeyCodeCombination(KeyCode.DELETE, KeyCodeCombination.ALT_DOWN));

        homeMenu.getItems().addAll(settingItem, new SeparatorMenuItem(), restartItem, exitItem);
        menuBar.getMenus().addAll(homeMenu);

        return menuBar;
    }
}