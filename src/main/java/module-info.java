module com.example.practica_html {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practica_html to javafx.fxml;
    exports com.example.practica_html;
}