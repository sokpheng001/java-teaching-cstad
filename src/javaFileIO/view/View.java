package javaFileIO.view;

import javaFileIO.controller.StudentController;
import javaFileIO.model.Service;
import javaFileIO.model.Student;

import java.io.EOFException;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class View {
    private static int option;
    private static final Scanner scanner = new Scanner(System.in);
    private static final StudentController studentController = new StudentController();
    private static void thumbnail(){
        System.out.println("========== ----------------------- =================");
        System.out.println("          Welcome to CSTAD DataText                 ");
        System.out.println("========== ----------------------- =================");
    }
    private static void selectStudentOptions(){
        System.out.println("====================================================");
        System.out.println("1. Select all Students ");
        System.out.println("2. Select by ID ");
        System.out.println("==");
        System.out.print("[+] Select option: ");
        try{
            option = scanner.nextInt();
            switch (option){
                case 1-> studentController.selectAllStudents();
                case 2-> studentController.selectStudentByID();
                default -> {
                    System.out.println("Option is not matched");
                }
            };
        }catch (Exception error){
            selectStudentOptions();
        }
    }
    private static void crudOfStudent(){
        System.out.println("====================================================");
        System.out.println("1. Insert student ");
        System.out.println("2. Select student ");
        System.out.println("3. Update student ");
        System.out.println("4. Remove student ");
        System.out.println("===");
        System.out.print("[+] Choose option: ");
        try{
            option = scanner.nextInt();
            switch (option){
                case 1-> studentController.insertStudent();
                case 2-> selectStudentOptions();
                default -> {
                    System.out.println("Option is not matched");
                }
            };
        }catch (Exception error){
            System.out.println("[!] Invalid option!!");
            crudOfStudent();
        }
        System.out.println("====================================================");
    }
    private static void fileOfStudent(){
        System.out.println("====================================================");
        System.out.println("1. Import");
        System.out.println("2. Export");
    }
    private static void options(){
        thumbnail();
        System.out.println("[+] Options: ");
        System.out.println("[1] Student CRUD (Insert/Update/Read-Select/Delete): ");
        System.out.println("[2] File (Import/Export)");
    }
    private static void process(int option){
        try{
            if(option==1){
                crudOfStudent();
            }else if(option==2){
                fileOfStudent();
            }
        }catch (Exception exception){
            System.out.println("[!] Error!!!");
        }
    }
    private static void choose(){
        options();
        System.out.println("====================================================");
        System.out.print("[+] Choose options: ");
        try{
            option = scanner.nextInt();
//            System.out.println(new Student(new Random().nextInt(1000000000),UUID.randomUUID().toString(), "KoKo","koko123@gmail.com"));
            process(option);
        }catch (Exception error){
            System.out.println("====================================================");
            System.out.println("[!] Error: " + "Invalid option!!");
            choose();
        }
    }
    public static void getView(){
        while (true){
            choose();
            System.out.print("PRESS Continue...");
            new Scanner(System.in).nextLine();
        }
    }
}
