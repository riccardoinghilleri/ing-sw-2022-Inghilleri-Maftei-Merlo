package it.polimi.ingsw.client.gui.controllers;

import it.polimi.ingsw.client.gui.Gui;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class WelcomeController implements GuiController {

    private Gui gui;

    public void pressButton(MouseEvent event) {
        ((Button) event.getSource()).getStyleClass().add("buttonPressed");

    }

    public void releaseButton(MouseEvent event) {
        ((Button) event.getSource()).getStyleClass().clear();
        ((Button) event.getSource()).getStyleClass().add("button");
    }

    public void nextPage() {
        gui.changeScene("settings.fxml");
    }

    public void close() {
        gui.close();
    }

    @Override
    public void setGui(Gui gui) {
        this.gui = gui;
    }
}
