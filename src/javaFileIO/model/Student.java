package javaFileIO.model;

public class Student{
    private Integer id;
    private String uuid;
    private String studentIDCard;
    private String studentName;
    private String studentEmail;

    public Student(Integer id, String uuid, String studentIDCard, String studentName, String studentEmail) {
        this.id = id;
        this.uuid = uuid;
        this.studentIDCard = studentIDCard;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getStudentIDCard() {
        return studentIDCard;
    }

    public void setStudentIDCard(String studentIDCard) {
        this.studentIDCard = studentIDCard;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", studentIDCard='" + studentIDCard + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                '}';
    }
}
