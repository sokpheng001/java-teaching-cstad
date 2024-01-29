import classAndObject.Dog;
import classAndObject.Store;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.setId(12);
        System.out.println(dog.getId());
        dog.run();
    }
}