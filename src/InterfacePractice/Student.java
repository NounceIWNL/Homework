package InterfacePractice;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;

public class Student {
    public int id;
    public String surname;
    public String name;
    public String patronymic;
    public Date birthDate;
    public String address;
    public int phoneNumber;
    public String faculty;
    public int grade;
    public String group;

    public Student(int id, String surname, String name,
                   String patronymic, Date birthDate,
                   String address, int phoneNumber,
                   String faculty, int grade, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.grade = grade;
        this.group = group;
    }

    public static void checkFaculty(String check, Student[] arrayToCheck) {
        for (int i = 0; i < arrayToCheck.length; i++) {
            if (arrayToCheck[i].getFaculty().equals(check)) {
                arrayToCheck[i].printFullName();
            }
        }
    }

    public static void checkGrade(Integer check, Student[] arrayToCheck) {
        for (int i = 0; i < arrayToCheck.length; i++) {
            if (arrayToCheck[i].getGrade() == check) {
                arrayToCheck[i].printFullName();
            }
        }
    }

    public void printFullName() {
        System.out.println(name + " "
                + patronymic + " "
                + surname);
    }

    public static void pickTheFacultyAndGradeInfo(Student[] arrayToCheck) {
        HashSet<String> checkAllPossibleFaculties = new HashSet<String>();
        HashSet<Integer> checkAllPossibleGrades = new HashSet<Integer>();
        for (int i = 0; i < arrayToCheck.length; i++) {
            checkAllPossibleFaculties.add(arrayToCheck[i].getFaculty());
            checkAllPossibleGrades.add(arrayToCheck[i].getGrade());
        }
        System.out.println(checkAllPossibleFaculties);
        System.out.println(checkAllPossibleGrades);
        System.out.println();
        for (String faculty : checkAllPossibleFaculties) {
            checkFaculty(faculty, arrayToCheck);
        }
        System.out.println();
        for (Integer grade : checkAllPossibleGrades) {
            checkGrade(grade, arrayToCheck);
        }
    }

    public static void checkTheBirthDate(Date checkDate, Student[] arrayToCheck) {
        for (int i = 0; i < arrayToCheck.length; i++) {
            if (checkDate.before(arrayToCheck[i].getBirthDate()))
                arrayToCheck[i].printFullName();
        }
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getGrade() {
        return grade;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthDate=" + birthDate +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", faculty='" + faculty + '\'' +
                ", grade=" + grade +
                ", group='" + group + '\'' +
                '}' + "\n";
    }
}
