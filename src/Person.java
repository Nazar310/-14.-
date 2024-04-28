import java.util.Objects;

public class Person {
    int yearOfBirth;
    String name;

    public Person(int yearOfBirth, String name) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Equals викликався");
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person that = (Person) obj;
        return yearOfBirth == that.yearOfBirth &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        System.out.println("HashCode викликався - + " + Objects.hash(yearOfBirth, name));
        return Objects.hash(yearOfBirth, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "yearOfBirth=" + yearOfBirth +
                ", name='" + name + '\'' +
                '}';
    }
}