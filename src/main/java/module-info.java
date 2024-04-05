module module_for_javafx {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires java.base;
    requires java.desktop;
    requires java.logging;

    opens Exercise_4 to javafx.graphics;
    opens Exercise_6 to javafx.graphics;
    opens Exercise_7.b to javafx.graphics;
    opens Exercise_11 to javafx.graphics;
    opens Exercise_11.Demo to javafx.graphics;
    opens Exercise_15 to javafx.graphics;
}