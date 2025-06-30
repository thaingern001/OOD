package humen;

import java.time.LocalDate;

public class Lecturer extends Human {
    public int id;

    public Lecturer(String name, LocalDate birthDay ,int id){
        super(name,birthDay);

        this.id = id;
    }

    public void teach(){
        System.out.println("Teach");
    }
}
