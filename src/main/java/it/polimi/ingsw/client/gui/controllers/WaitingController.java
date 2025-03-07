package it.polimi.ingsw.client.gui.controllers;

import it.polimi.ingsw.client.gui.Gui;
import it.polimi.ingsw.constants.Constants;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Waiting Controller displays the waiting page, while the other players are choosing the parameters.
 */
public class WaitingController implements GuiController {
    private Gui gui;
    @FXML
    Label infoText;

    /**
     * @see GuiController
     * @param gui of type Gui- the main Gui class
     */
    @Override
    public void setGui(Gui gui) {
        this.gui = gui;
    }

    /**
     * This method sets the infoText label, and it shows what the other player is doing
     * @param text of type String
     */
    public void setInfoText(String text) {
        if(!text.equalsIgnoreCase(Constants.WAITING)){
            infoText.setText(text);
        }
    }
}
