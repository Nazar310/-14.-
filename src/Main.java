public class Main {
    public static void main(String[] args) {
        PersonsList personsList = new PersonsList();
        Person randomPerson = new Person(2009, "Nazar");
        personsList.printArray();

        for (int i =  0; i < 6; i++) {
            personsList.add(randomPerson);
        }

        personsList.printArray();

    }
}
