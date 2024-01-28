package method;

import java.io.*;

public class Method1{
    static void readCharacterFromFile(){
        try(FileReader fileReader = new FileReader("Test.txt")){
            int b;
            while ((b=fileReader.read())!=-1){
                System.out.print((char) b);
            }
        }catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }
    }
    public static void main(String[] args){
        readCharacterFromFile();
    }
}
