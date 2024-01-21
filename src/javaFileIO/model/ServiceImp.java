package javaFileIO.model;

import javaFileIO.model.studentDto.InsertStudentDto;
import util.FileCreation;


import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class ServiceImp implements Service{
    private static Student student;
    private final static FileCreation fileCreation = new FileCreation();
    private static final InsertStudentDto insertStudentDto = new InsertStudentDto();
    private static final Scanner scanner = new Scanner(System.in);
    private static final int idRandom = new Random().nextInt(100000000);

    private static void studentEmailInsertion(){
        System.out.print("Student email: ");
        insertStudentDto.email = scanner.nextLine();
        if(insertStudentDto.email.isBlank()){
            studentEmailInsertion();
        }
    }
    private static void studentNameInsertion(){
        System.out.print("Student name: ");
        insertStudentDto.name = scanner.nextLine();
        if(insertStudentDto.name.isBlank()){
            studentNameInsertion();
        }
    }
    private static Student studentData(){
        System.out.println("=========== Insert student Information =============");
        studentNameInsertion();
        studentEmailInsertion();
        return new Student(idRandom, UUID.randomUUID().toString(),"ISTAD" + idRandom ,insertStudentDto.name, insertStudentDto.email);
    }
    @Override
    public void insertStudentToAFile(Student ... student) {
        try{
            fileCreation.saveDataToFile(studentData());
        }catch (Exception error){
            System.out.println("[!] Error!!!");
        }
    }

    @Override
    public void selectAllStudents() {
        try{
            fileCreation.getDataFromFile();
        }catch (Exception exception){
            System.out.println("[!] Error during get all students from a file: " + exception.getMessage());
        }
    }

    @Override
    public void selectById(Integer id) {

    }
}
