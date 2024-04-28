import java.util.Arrays;

public class PersonsList {

    private static final int initialCapacity = 5;
    private Person[] people = new Person[initialCapacity];
    private int size = 0;

    public void add(Person person) {
        if (person == null) {
            System.err.println("Person is not initialized");
            return;
        }
        if (size == people.length) {
            increaseCapacity();
        }
        people[size++] = person;
    }

    private void increaseCapacity() {
        int newCapacity = people.length + initialCapacity;
        people = Arrays.copyOf(people, newCapacity);
    }

    public void remove(int index) {
        if (checkArrayBounds(index)) {
            System.err.println("Array index out of bounds exception");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            people[i] = people[i + 1];
        }
        people[--size] = null;
    }

    public void setPerson(int index, Person person) {
        if (checkArrayBounds(index) || person == null) {
            System.err.println("Array index out of bounds exception or person wasn't initialized");
            return;
        }
        people[index] = person;
    }

    public Person getPerson(int index) {
        if (checkArrayBounds(index)) {
            System.err.println("Array index out of bounds exception");
            return null;
        }
        return people[index];
    }

    private boolean checkArrayBounds(int index) {
        return index >= size || index < 0;
    }

    public void printArray() {
        System.out.println(Arrays.toString(people));
    }
}
