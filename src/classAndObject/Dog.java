package classAndObject;
public class Dog {
    private int id;
    private String breed;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void run(){
        System.out.println("What the dog doing!!!");
    }
}
