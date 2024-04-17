package fit.cybersecurity.lr3.model;

import java.util.List;

public class University extends DataStructure {
    private String name;
    private Human head;
    private List<Faculty> faculties;

    public University(String name, Human head, List<Faculty> faculties) {
        super(name, head);
        this.faculties = faculties;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }
}