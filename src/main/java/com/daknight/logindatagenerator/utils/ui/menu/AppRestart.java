package com.daknight.logindatagenerator.utils.ui.menu;

import com.daknight.logindatagenerator.ui.LoginDataGeneratorUI;
import javafx.application.Platform;
import javafx.stage.Stage;

public class AppRestart {
    public static void restart(Stage currenStage) {
        Platform.runLater(() -> {
            try {
                currenStage.close();

                LoginDataGeneratorUI app = new LoginDataGeneratorUI();
                Stage newStage = new Stage();
                app.start(newStage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
