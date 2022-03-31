package it.polimi.ingsw.model;

import it.polimi.ingsw.model.enums.CharacterColor;
import it.polimi.ingsw.model.enums.PlayerColor;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class School {
    private final String owner;
    private List<Student> hall;
    private Map<CharacterColor,List<Student>> classroom;
    private List<Tower> towers;
    private PlayerColor playerColor;
    private Board observerBoard;
    public School(String owner, PlayerColor playerColor, List<Student> hall, Board observerBoard) {
        this.owner = owner;
        this.playerColor= playerColor;
        this.hall=hall;
        this.observerBoard=observerBoard;
    }

    //---GETTER---//

    public String getOwner() {
        return owner;
    }

    public List<Student> getHall() {
        return hall;
    }

    public Map<CharacterColor, List<Student>> getClassroom() {
        return classroom;
    }

    public int getTowersNumber() {
        return towers.size();
    }

    public PlayerColor getTowerColor() {
        return playerColor;
    }

    //---STUDENTSMOVEMENT---//



    public void addClassroomStudent(Student student) {
        classroom.get(student.getColor()).add(student);
    }

    public void addHallStudent(Student student) {
        hall.add(student);

    }

    public void addHallStudents(List<Student> students) {
        hall.addAll(students);

    }

    public Student removeHallStudent(CharacterColor studentColor)
    {
        //TODO lanciare un'eccezione se non è presente nella hall uno studente del colore desiderato

            Student student = null;
            for(int i=0; i<hall.size() && student == null; i++) {
                if(hall.get(i).getColor().equals(studentColor)) {
                    student = hall.remove(i);
            }
        }
        return student;}

    public Student removeClassroomStudent(CharacterColor studentColor) {
        //TODO  LANCIARE ECC SE NON è PRESENTE UNO STUDENTE DEL COLORE DESIDERATO
        Student student= null;
        if (classroom.containsKey(studentColor))
        {
            student= classroom.get(studentColor).remove(0);
        }
        return student;
    }
    public void fromHalltoClassroom(CharacterColor studentColor)
    //TODO  LANCIARE ECC SE NON è PRESENTE UNO STUDENTE DEL COLORE DESIDERATO
    {
        addClassroomStudent(removeHallStudent(studentColor));
        observerBoard.updateProfessor();
    }

    //---TOWERSMOVEMENT---//

    public Tower removeTower() {
        return towers.remove(towers.size() - 1);
    }

    public void restockTower(List<Tower> towers) {
      //TODO se towers.isEmpty() c'è un vincitore
        this.towers.addAll(towers);

        }


    @Override
    public String toString() {
        String professors =new String() ;
        for( CharacterColor c: CharacterColor.values()){
            if(observerBoard.getProfessorbyColor().getOwner().equals(owner)){
                professors = professors + c.toString() + "\n";
            }
        }
        String students = new String();
        for( Student s: hall){
            students= students + s.toString() + "\t";
        }

        return
                "Owner: " +getOwner() +
                "Towers: " + towers.size() + getTowerColor() +
                "\nHall: " +students +
                "\nClassroom:" +
                "\nRED:"+ classroom.get(CharacterColor.RED).size() +
                "\nBLUE:" + classroom.get(CharacterColor.BLUE).size() +
                "\nYElLOW"+ classroom.get(CharacterColor.YELLOW).size() +
                 "\nPINK" + classroom.get(CharacterColor.PINK).size() +
                 "\nGREEN" + classroom.get(CharacterColor.GREEN).size() +
                 "\n" + professors;

    }
}



