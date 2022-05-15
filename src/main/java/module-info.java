module com.example.lepitla {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.lepitla to javafx.fxml;
    exports com.example.lepitla;
}