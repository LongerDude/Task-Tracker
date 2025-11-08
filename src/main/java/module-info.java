module com.longerdude.taskmanagerandcalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.longerdude.taskmanagerandcalculator to javafx.fxml;
    exports com.longerdude.taskmanagerandcalculator;
}