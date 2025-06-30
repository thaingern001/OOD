package Person;

public class Person {
    private Organ[] organs;

    Person(){
        Organ[] organs = new Organ[32];
        // organs[0] = new Brain();
        organs[1] = new Heart();
        // organs[2] = new Lung();
    }
}
