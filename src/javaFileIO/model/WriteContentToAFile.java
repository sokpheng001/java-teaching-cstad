package javaFileIO.model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class WriteContentToAFile {
    private static String content;
    private static File file;
    private final static Scanner scanner = new Scanner(System.in);
    public static void writeContent(String filePath){
        System.out.println("===========================================");
        System.out.print("[+] Write content to file: ");
        content = scanner.nextLine();
        file = new File(filePath);
        if(file.exists()){
            try{
                content+="\r\n"; // separate new line
                //append new content
                Path path = Paths.get(filePath);
                Files.write(path,(System.lineSeparator() + content).getBytes(), StandardOpenOption.APPEND);
            }catch (IOException error){
                System.out.println(error.getMessage());
            }
        }
    }
}
