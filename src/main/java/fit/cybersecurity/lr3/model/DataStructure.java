package fit.cybersecurity.lr3.model;

public abstract class DataStructure {
    private String name;
    private Human head;

    public DataStructure(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHead() {
        return this.head;
    }

    public void setHead(Human head) {
        this.head = head;
    }
}
