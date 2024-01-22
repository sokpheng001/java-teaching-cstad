package javaFileIO.byteSteam;


import java.io.FileWriter;
import java.io.ObjectInput;

public class ReadWriteByteData {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("test.txt")){
            fileWriter.write("This is sokpheng from ITC");
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
