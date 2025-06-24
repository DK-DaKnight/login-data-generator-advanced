package com.daknight.logindatagenerator.utils.lib.style;

import javafx.animation.PauseTransition;
import javafx.scene.control.Button;
import javafx.animation.ScaleTransition;
import javafx.util.Duration;

public interface ButtonStyle {
    static String buttonStyle() {
        return """
        -fx-background-color: #2a2a2a;
        -fx-border-color: #444;
        -fx-border-radius: 6;
        -fx-background-radius: 6;
        -fx-text-fill: white;
        -fx-font-size: 14px;
        -fx-padding: 4 10 4 10;
        -fx-effect: dropshadow(gaussian, transparent, 0, 0, 0, 0); /* placeholder to enable transition */
        """;
    }

    static void buttonHoverStyle(Button button) {
        button.setStyle(buttonStyle());

        ScaleTransition stEnter = new ScaleTransition(Duration.millis(200), button);
        stEnter.setToX(1.05);
        stEnter.setToY(1.05);
        stEnter.setInterpolator(javafx.animation.Interpolator.EASE_BOTH);

        ScaleTransition stExit = new ScaleTransition(Duration.millis(200), button);
        stExit.setToX(1.0);
        stExit.setToY(1.0);
        stExit.setInterpolator(javafx.animation.Interpolator.EASE_BOTH);

        button.setOnMouseEntered(e -> {
            stExit.stop();
            stEnter.playFromStart();
        });

        button.setOnMouseExited(e -> {
            stEnter.stop();
            stExit.playFromStart();
        });
    }

    static void buttonClickFeedback(Button button, String temporaryText) {
        String originalText = button.getText();

        button.setText(temporaryText);

        PauseTransition pause = new PauseTransition(Duration.seconds(1));
        pause.setOnFinished(e -> button.setText(originalText));
        pause.play();
    }
}
