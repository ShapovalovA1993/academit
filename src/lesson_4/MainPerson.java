package src.lesson_4;

public class MainPerson {

    public static void main(String[] args) {
        Person person = new Person("Ivan", "Ivanovich", "Ivanov");
        System.out.println(person);

        person.setAge(20);
        System.out.println("Год рождения человека: " + person.getPersonBirthYear());
    }
}
