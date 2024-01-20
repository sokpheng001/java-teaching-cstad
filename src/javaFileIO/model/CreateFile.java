package javaFileIO.model;

import globalVariable.GlobalVariable;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    private File file;
    private String fileName;
    private String content;
    private String directory = GlobalVariable.OUT_PUT_FILE_PATH.getPath();
    private final Scanner scanner = new Scanner(System.in);
    public void createFile() {
        try{
            System.out.println("===========================================");
            System.out.print("[+] Insert text file name: ");
            this.fileName = scanner.nextLine();
            if(this.fileName.isEmpty()){
                createFile();
            }else {
                file = new File(GlobalVariable.OUT_PUT_FILE_PATH.getPath() + this.fileName);
                if(file.createNewFile()){
                    System.out.println("====== ----------------------------- ======");
                    System.out.println("====== CREATED new file successfully ======");
                    System.out.println("====== ----------------------------- ======");
                }else {
                    System.out.println("====== ----------------------------- ======");
                    System.out.printf("  This file {%s} is already existed\n", this.fileName);
                    WriteContentToAFile.writeContent(GlobalVariable.OUT_PUT_FILE_PATH.getPath() + this.fileName);
                }
//                else {
//                    System.out.println("====== ----------------------------- ======");
//                    System.out.printf("The file named {%s} is already existed", this.fileName);
//                    System.out.println();
//                    System.out.println("====== ----------------------------- ======");
//                }
            }
        }catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }
    }
}
