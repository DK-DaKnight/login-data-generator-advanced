package com.daknight.logindatagenerator.ui;

import com.daknight.logindatagenerator.ui.grid.GridBuilder;
import com.daknight.logindatagenerator.ui.menu.MenuBarBuilder;
import com.daknight.logindatagenerator.ui.menu.settings.config.Config;
import com.daknight.logindatagenerator.ui.menu.settings.config.ThemeSettings;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.stage.Stage;

public class LoginDataGeneratorUI extends Application {
    private static Stage primaryStage;

    @Override
    public void start(Stage stage) throws Exception {
        primaryStage = stage;

        BorderPane root = new BorderPane();
        ThemeSettings themeSettings = new ThemeSettings(Config.userInterface_theme);
        root.setBackground(new Background(new BackgroundFill(
                themeSettings.changeBackground(), CornerRadii.EMPTY, Insets.EMPTY
        )));

        root.setTop(MenuBarBuilder.build(stage::close));
        root.setCenter(GridBuilder.build());

        Scene scene = new Scene(root, 800, 800);
        stage.setScene(scene);
        stage.setTitle("Login Data Generator");
        stage.setMaximized(true);
        stage.show();
    }

    public static Stage getPrimaryStage() {
        return primaryStage;
    }
}
