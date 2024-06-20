module org.example.studentmanager {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.example.studentmanager to javafx.fxml;
    opens controllers to javafx.fxml;
    opens models to javafx.base;

    exports org.example.studentmanager;
    exports controllers;
    exports models;
}
