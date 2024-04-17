package fit.cybersecurity.lr3.model;

import java.util.List;

public class Department extends DataStructure {
    private String name;
    private Human head;
    private List<Group> groups;

    public Department(String name, Human head, List<Group> groups) {
        super(name, head);
        this.groups = groups;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}