package src.lesson_4;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Person {
    private String name;
    private String middleName;
    private String familyName;
    public static final int MAX_NAME_LENGTH = 100;
    private int age;
    public static final int DEFAULT_AGE = 18;

    public Person(String name, String middleName, String familyName) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Возраст не может быть отрицательным! Установлено дефолтное значение.");
            this.age = DEFAULT_AGE;
        }
    }

    public int getPersonBirthYear() {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        int currentYear = localDate.getYear();

        return currentYear - age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", familyName='" + familyName + '\'' +
                '}';
    }
}