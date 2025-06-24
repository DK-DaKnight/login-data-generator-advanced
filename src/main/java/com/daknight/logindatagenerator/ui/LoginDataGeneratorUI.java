package com.daknight.logindatagenerator.ui;

import com.daknight.logindatagenerator.ui.grid.GridBuilder;
import com.daknight.logindatagenerator.ui.menu.MenuBarBuilder;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LoginDataGeneratorUI extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        root.setBackground(new Background(new BackgroundFill(
                Color.web("#212121"), CornerRadii.EMPTY, Insets.EMPTY
        )));

        root.setTop(MenuBarBuilder.build(primaryStage::close));
        root.setCenter(GridBuilder.build());

        Scene scene = new Scene(root, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login Data Generator");
        primaryStage.setMaximized(true);
        primaryStage.show();
    }
}
