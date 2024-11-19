module com.example.ejen {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejen to javafx.fxml;
    exports com.example.ejen;
}