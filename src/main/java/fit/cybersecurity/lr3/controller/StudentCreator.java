package fit.cybersecurity.lr3.controller;

import fit.cybersecurity.lr3.model.Human;
import fit.cybersecurity.lr3.model.Student;

public class StudentCreator {
    public static Student createStudent(Human human, int studentID) {
        Student student = new Student();
        student.getStudentID(studentID);
        student.setName(human.getName());
        student.setSurname(human.getSurname());
        student.setPatronymic(human.getPatronymic());
        student.setSex(human.getSex());
        return student;
    }
}
