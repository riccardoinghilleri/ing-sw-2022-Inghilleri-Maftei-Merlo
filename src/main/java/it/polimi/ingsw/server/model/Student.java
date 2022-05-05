package it.polimi.ingsw.server.model;

import it.polimi.ingsw.constants.Constants;
import it.polimi.ingsw.enums.CharacterColor;

import java.io.Serializable;

public class Student implements Serializable {
    private final CharacterColor color;

    public Student(CharacterColor color) {
        this.color = color;
    }

    public CharacterColor getColor() {
        return color;
    }

    @Override
    public String toString(){
        return Constants.getAnsi(color)+"●"+Constants.ANSI_RESET;
    }
}
