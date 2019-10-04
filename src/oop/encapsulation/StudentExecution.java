package oop.encapsulation;

public class StudentExecution {
    public static void main(String[] args) {
        Student student = new Student();
        student.setID(13);
        int newID = student.getId();
        System.out.println(newID);

    }
}