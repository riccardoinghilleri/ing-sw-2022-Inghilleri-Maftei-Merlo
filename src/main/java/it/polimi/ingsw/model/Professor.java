package it.polimi.ingsw.model;

import it.polimi.ingsw.model.enums.CharacterColor;

public class Professor {
    private String owner;
    private final CharacterColor color;

    public Professor(CharacterColor color) {
        owner = "NONE";
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public CharacterColor getColor() {
        return color;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}
