import java.io.*;


record Person(String id) implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L; // Helps in version control during deserialization

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}

public class Main {
    static void writingTextToFile(String content){
        try(FileOutputStream fileOutputStream = new FileOutputStream("Test.txt")){
            byte [] bytes = content.getBytes();
            fileOutputStream.write(bytes);
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
    public static void main(String[] args) {
        writingTextToFile("Hello, It's DevOps class");
    }
}