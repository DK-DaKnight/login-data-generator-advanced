module com.daknight.logindatagenerator.logindatagenerator {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.daknight.logindatagenerator.ui to javafx.fxml;
    exports com.daknight.logindatagenerator.ui;
    exports com.daknight.logindatagenerator.ui.menu;
    opens com.daknight.logindatagenerator.ui.menu to javafx.fxml;
}