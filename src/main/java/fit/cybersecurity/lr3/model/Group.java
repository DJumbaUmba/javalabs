package fit.cybersecurity.lr3.model;

import java.util.List;

public class Group extends DataStructure {
    private String name;
    private Human head;
    private List<Student> students;

    public Group(String name, Human head, List<Student> students) {
        super(name, head);
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}