package fit.cybersecurity.lr3;

import fit.cybersecurity.lr3.controller.*;
import fit.cybersecurity.lr3.model.*;

public class Run {
    public static void main(String[] args) {
        University university = createTypicalUniversity();
    }

    public static University createTypicalUniversity() {
        Human typicalHuman = HumanCreator.createHuman("Петро ", "Шевченко", "Олександрович", Sex.MALE);
        Human typicalHuman1 = HumanCreator.createHuman("Марія", "Коваленко", "Іванівна", Sex.FEMALE);
        Human typicalHuman3 = HumanCreator.createHuman("Олег", "Мельник", "Васильович", Sex.MALE);
        Human typicalHuman4 = HumanCreator.createHuman("Наталія", "Бойко", "Юріївна", Sex.FEMALE);
        Human typicalHuman5 = HumanCreator.createHuman("Андрій", "Захарчук", "Миколайович", Sex.MALE);
        Student typicalStudent1 = StudentCreator.createStudent(typicalHuman, 1);
        Student typicalStudent2 = StudentCreator.createStudent(typicalHuman1, 2);
        Student typicalStudent3 = StudentCreator.createStudent(typicalHuman3, 3);
        Student typicalStudent4 = StudentCreator.createStudent(typicalHuman4, 4);
        Student typicalStudent5 = StudentCreator.createStudent(typicalHuman5, 5);
        Student[] students = {typicalStudent1, typicalStudent2, typicalStudent3, typicalStudent4, typicalStudent5};

        Human groupHead = HumanCreator.createHuman("Вікторія", "Сидоренко", "Петрівна", Sex.FEMALE);
        Group group = GroupCreator.createGroup(
                "125-20-3",
                groupHead,
                students
        );
        Group[] groups = {group};

        Human departmentHead = HumanCreator.createHuman("Ігор", "Кравчук", "Ярославович", Sex.MALE);
        Department department = DepartmentCreator.createDepartment(
                "БІТ",
                departmentHead,
                groups
        );
        Department[] departments = {department};

        Human facultyHead = HumanCreator.createHuman("Юлія", "Романенко", "Сергіївна", Sex.FEMALE);
        Faculty faculty = FacultyCreator.createFaculty(
                "ФІТ",
                facultyHead,
                departments
        );
        Faculty[] faculties = {faculty};

        Human universityHead = HumanCreator.createHuman("Володимир", "Литвин", "Дмитрович", Sex.MALE);
        University university = UniversityCreator.createUniversity(
                "НТУДП",
                universityHead,
                faculties
        );
        return university;
    }
}
