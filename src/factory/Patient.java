package factory;

public class Patient extends Person {

    public Patient(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Hasta Adı: " + getName());
    }
}
