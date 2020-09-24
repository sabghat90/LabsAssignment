package Lab02;

public class AnimalTest {
    public static void main(String[] args) {
        Animal cat = new Animal("Cat","Grey", 4, false);
        Animal bird = new Animal("Bird","Black", 2, false);
        Animal dog = new Animal("Dog","White", 4, false);

        System.out.println(cat);
        System.out.println(bird);
        System.out.println(dog);
    }
}
