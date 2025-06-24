package com.daknight.logindatagenerator.ui;

import com.daknight.logindatagenerator.ui.grid.GridBuilder;
import com.daknight.logindatagenerator.ui.menu.MenuBarBuilder;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class LoginDataGeneratorUI extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();

        root.setTop(MenuBarBuilder.build(primaryStage::close));
        root.setCenter(GridBuilder.build());

        Scene scene = new Scene(root, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login Data Generator");
        primaryStage.setMaximized(true);
        primaryStage.show();
    }
}
