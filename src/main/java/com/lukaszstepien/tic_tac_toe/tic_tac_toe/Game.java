package com.lukaszstepien.tic_tac_toe.tic_tac_toe;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Game {
    private States gameState = States.TURN_PLAYER_1;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Short moves = 0;

    Game(Player p1, Player p2) {
        this.player1 = p1;
        this.player2 = p2;
        this.currentPlayer = this.player1;
    }

    public void nextTurn() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
            gameState = States.TURN_PLAYER_2;
        } else {
            currentPlayer = player1;
            gameState = States.TURN_PLAYER_1;
        }
    }
}
