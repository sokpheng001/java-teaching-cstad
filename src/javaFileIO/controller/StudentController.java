package javaFileIO.controller;

import javaFileIO.model.Service;
import javaFileIO.model.ServiceImp;
import javaFileIO.model.Student;

public class StudentController {
    private final Service service = new ServiceImp();
    public void insertStudent(Student ... student){
        service.insertStudentToAFile();
    }
    public void selectAllStudents(){

    }
    public void selectStudentByID(){

    }
}
