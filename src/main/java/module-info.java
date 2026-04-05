module com.lukaszstepien.tic_tac_toe.tic_tac_toe {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.lukaszstepien.tic_tac_toe.tic_tac_toe to javafx.fxml;
    exports com.lukaszstepien.tic_tac_toe.tic_tac_toe;
}