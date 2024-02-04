package fileIOvol2;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File1 {
    public static void main(String[] args) {
        Path file = Paths.get("Test.csv");
        Path destination = Paths.get("C:\\Users\\burit\\OneDrive\\Desktop\\Test.csv");
        System.out.println(destination);
        try{
            Files.copy(file, destination);
            System.out.println(STR."File \{file.getFileName()} has been copied successfully.");
        }catch (IOException ioException){
            System.out.println(STR."Error: \{ioException.getLocalizedMessage()}");
        }
    }
}