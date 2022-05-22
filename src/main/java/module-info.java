module com.example.parcialadsw {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.xml.bind;

    opens com.example.parcialadsw to javafx.fxml;
    exports com.example.parcialadsw;
}