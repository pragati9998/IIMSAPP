module com.example.iimsapploginsignup {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.iimsapploginsignup to javafx.fxml;
    exports com.example.iimsapploginsignup;
}