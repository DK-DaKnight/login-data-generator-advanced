package com.daknight.logindatagenerator.ui.menu;

import com.daknight.logindatagenerator.ui.menu.settings.PasswordSettings;
import com.daknight.logindatagenerator.ui.menu.settings.SettingsWindow;
import com.daknight.logindatagenerator.ui.menu.settings.UsernameSettings;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;

public class MenuBarBuilder {
    public static MenuBar build(Runnable onExit) {
        MenuBar menuBar = new MenuBar();

        // All menu
        Menu homeMenu = new Menu("Home");

        // homeMenu items
        MenuItem settingItem = new MenuItem("Settings");
        settingItem.setOnAction(e -> {
            SettingsWindow settingsWindow = new SettingsWindow(new UsernameSettings(5, 5), new PasswordSettings(5, 5, 5, 5));
            settingsWindow.show();
        });
        MenuItem exitItem = new MenuItem("Exit");
        exitItem.setOnAction(e -> onExit.run());

        homeMenu.getItems().addAll(settingItem, new SeparatorMenuItem(), exitItem);
        menuBar.getMenus().addAll(homeMenu);

        return menuBar;
    }
}
