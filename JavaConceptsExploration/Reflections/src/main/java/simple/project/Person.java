package simple.project;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
    private final String firstName;
    private String lastName;
    private final LocalDate birthDate;
    private final Sex sex;

    public Person(String firstName, String lastName, LocalDate birthDate, Sex sex) {
        if (birthDate == null || birthDate.isBefore(LocalDate.of(1900, 10, 10))){
            throw new IllegalArgumentException("birthDate argument is incorrect!");
        }
        if (firstName.isBlank() || lastName.isBlank()) {
            throw new IllegalArgumentException("firstName or lastName argument is incorrect!");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.sex = sex;
    }

    private void someSecretMethod(){
        System.out.println("You shall not pass!");
    }

    public long yearsAlive() {
        return ChronoUnit.YEARS.between(birthDate, LocalDate.now());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", sex=" + sex +
                '}';
    }
}
