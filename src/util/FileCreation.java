package util;

import globalVariable.GlobalVariable;
import javaFileIO.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class FileCreation {
    private static File file;
    private static final String fileDataName = GlobalVariable.OUT_PUT_FILE_PATH.getPath() + "studentData.txt";
    public void saveDataToFile(Student student) throws IOException {
        file = new File(fileDataName);
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileDataName, true))){
            objectOutputStream.writeObject(student);
            System.out.println("========== ------------------------------- =========");
            System.out.println("           STUDENT DATA Saved successfully          ");
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
//        if(file.createNewFile()){
//            System.out.println("========== ----------------------- =================");
//            System.out.println("        Create STUDENT DATA FILE successfully       ");
//            System.out.println("===");
//        }
//        if(new File(fileDataName).exists()){
//            Path path = Paths.get(fileDataName);
//            Files.write(path,(student.toString()+"\r\n---\r\n").getBytes(),StandardOpenOption.APPEND);
//            System.out.println("========== ------------------------------- =========");
//            System.out.println("           STUDENT DATA Saved successfully          ");
//        }
    }
    public void getDataFromFile(){
        List<Student> studentList = new ArrayList<>();
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileDataName))){
            while (true){
                try{
                    Student student = (Student) objectInputStream.readObject();
                    studentList.add(student);
                }catch(IOException exception){
                    System.out.println(exception.getMessage());
                }
            }
        }catch (Exception exception){
            System.out.println("[!] Error: " + exception.getMessage());
        }
        studentList.forEach(System.out::println);
    }
}
