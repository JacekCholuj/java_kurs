package pl.raiffeisensolutions;

/**
 * Created by rb9310 on 2016-07-22.
 */
public class MainPerson {
    public static void main(String[] args) {
        String firstName = "Jan";
        String lastName = "Kowalski";
        int age = 55;
//        System.out.println(firstName);
//        CallImmutablePerson(firstName, lastName, age);

        MutablePerson person = new MutablePerson();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);
        System.out.println(person);

        ImmutablePerson immutablePerson = new ImmutablePerson(firstName, lastName, age);
        immutablePerson = immutablePerson.withFirstName("Karol");
        immutablePerson = immutablePerson.withLastName("Duma");
        System.out.println(immutablePerson);

    }

//    private static void CallImmutablePerson(String firstName, String lastName, int age) {
//        firstName = firstName + "cio";
//        System.out.println(person);
}

