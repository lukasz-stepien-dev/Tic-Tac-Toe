package com.lukaszstepien.tic_tac_toe.tic_tac_toe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.kordamp.ikonli.javafx.FontIcon;

import java.io.PrintStream;

@Getter
@Setter
public class GridController {
    private Game game;
    public void initialize() {
        setGame(
                new Game(
                        new Player("bi-circle"),
                        new Player("bi-x")
                )
        );}

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
    public void handleCellAction(@NonNull ActionEvent event) {
        System.out.println(game.getCurrentPlayer().getLiteral());
        Button clickedBtn = (Button) event.getSource();
        FontIcon fontIcon = (FontIcon) clickedBtn.getGraphic();
        fontIcon.setIconLiteral(getGame().getCurrentPlayer().getLiteral());
        clickedBtn.setDisable(true);
        game.nextTurn();
    }
}
