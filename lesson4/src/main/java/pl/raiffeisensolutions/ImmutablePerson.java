package pl.raiffeisensolutions;

/**
 * Created by rb9310 on 2016-07-22.
 */
public class ImmutablePerson {
    private String firstName;
    private String lastName;
    private int age;

    public ImmutablePerson(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public ImmutablePerson withFirstName(String newFirstName) {
        return new ImmutablePerson(newFirstName, lastName, age);
    }


    public ImmutablePerson withLastName(String newLastName) {
        return new ImmutablePerson(firstName,newLastName,age);
    }
}
