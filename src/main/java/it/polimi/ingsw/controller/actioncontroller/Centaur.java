package it.polimi.ingsw.controller.actioncontroller;

import it.polimi.ingsw.controller.Message;
import it.polimi.ingsw.model.GameModel;

public class Centaur extends ActionController {

    public Centaur(GameModel gameModel, String player) {
        super(gameModel, player);
        //TODO da finire
    }

    @Override
    public String getInfluence(Message influenceMessage) {
        return "a"; //TODO da fare
    }
}
