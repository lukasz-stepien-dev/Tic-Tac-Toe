package com.lukaszstepien.tic_tac_toe.tic_tac_toe;

import javafx.application.Platform;
import javafx.scene.control.TextArea;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.io.OutputStream;

@AllArgsConstructor
public class Console extends OutputStream {
    private final TextArea console;

    @Override
    public void write(int b) throws IOException {
        Platform.runLater(() -> console.appendText(String.valueOf((char) b)));
    }
}
