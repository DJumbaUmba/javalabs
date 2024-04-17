package fit.cybersecurity.lr3.model;

import java.util.List;

public class Faculty extends DataStructure {
    private String name;
    private Human head;
    private List<Department> departments;

    public Faculty(String name, Human head, List<Department> departments) {
        super(name, head);
        this.departments = departments;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}