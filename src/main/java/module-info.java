module com.company.tipcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.company.tipcalculator to javafx.fxml;
    exports com.company.tipcalculator;
}