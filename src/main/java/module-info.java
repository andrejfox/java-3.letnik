module module_for_javafx {
    requires javafx.controls;
    requires javafx.graphics;
    requires java.base;
    requires java.desktop;

    opens Exercise_4 to javafx.graphics;
    opens Exercise_6 to javafx.graphics;
}