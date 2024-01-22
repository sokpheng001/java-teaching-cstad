package util;

import globalVariable.GlobalVariable;
import javaFileIO.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FileCreation {
    private static File file;
    private static final String fileDataName = GlobalVariable.OUT_PUT_FILE_PATH.getPath() + "studentData.txt";
    private static void writeDataToAFile(boolean append, Student student){
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileDataName, append))){
            objectOutputStream.writeObject(student);
            System.out.println("========== ------------------------------- =========");
            System.out.println("           STUDENT DATA Saved successfully          ");
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
    public void saveDataToFile(Student student) throws IOException {
        file = new File(fileDataName);
        writeDataToAFile(!file.createNewFile(),student);
    }
    public void getDataFromFile(){
        List<Student> studentList = new ArrayList<>();
        Student [] students = new Student[0];
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileDataName))){
            while (true){
                try{
                    Student student = (Student) objectInputStream.readObject();
                    studentList.add(student);
                }catch(ClassNotFoundException |IOException exception){
                    System.out.println("[!] Error during select student data: " + exception.getMessage());
                    break;
                }
            }
        }catch (Exception exception){
            System.out.println("[!] Error: " + exception.getMessage());
        }
        System.out.println("========== ------------------------------- =========");
        studentList.forEach(System.out::println);

    }
}
