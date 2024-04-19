package fit.cybersecurity.lr3.controller;

import fit.cybersecurity.lr3.model.Sex;
import fit.cybersecurity.lr3.model.Human;

public class HumanCreator {
    public static Human createHuman(String name, String surname, String patronymic, Sex sex) {
        Human human = new Human();
        human.setName(name);
        human.setSurname(surname);
        human.setPatronymic(patronymic);
        human.setSex(sex);
        return human;
    }
}