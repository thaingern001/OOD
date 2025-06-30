package humen;


import java.time.LocalDate;

public class Human {
    String name;
    LocalDate birthDay;

    public Human(String name, LocalDate birthDay){
        this.name = name;
        this.birthDay = birthDay;
    }

    public void eat(){
        System.out.println("Eat");
    }
    
    public void sleep(){
        System.out.println("Sleep");
    }

}
