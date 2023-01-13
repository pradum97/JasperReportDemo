module com.example.jasperreport {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    requires jasperreports;

    exports com.example.jasperreport;
    opens com.example.jasperreport to javafx.fxml;

    exports com.example.jasperreport.model;
    opens com.example.jasperreport.model to javafx.fxml;


}