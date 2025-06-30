package humen;


import java.time.LocalDate;

public class Student extends Human{
    public int id;

    public Student(String name, LocalDate birthDay ,int id){
        super(name , birthDay );
        this.id = id;
    }

    public void takeExam(){
        System.out.println("Exam");
    }

    public void registerclass(){
        System.out.println("Register");
    }       
}
