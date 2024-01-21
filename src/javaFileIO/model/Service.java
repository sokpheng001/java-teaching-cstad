package javaFileIO.model;

public interface Service {
    void insertStudentToAFile(Student ... student);
    void selectAllStudents();
    void selectById(Integer id);
}
