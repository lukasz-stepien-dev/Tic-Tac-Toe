package com.lukaszstepien.tic_tac_toe.tic_tac_toe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class GridController {
    private Game game = new Game(
            new Player("fa-plus"),
            new Player("fa-x")
    );

    // cell_[row]_[column]
    public Button cell_0_0;
    public Button cell_0_1;
    public Button cell_0_2;
    public Button cell_1_0;
    public Button cell_1_1;
    public Button cell_1_2;
    public Button cell_2_0;
    public Button cell_2_1;
    public Button cell_2_2;

    @FXML
    private void handleCellClick(ActionEvent event) {

    }
}
