package factory;

public class Doctor extends Person {
    public Doctor(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Doktor Adı: " + getName());
    }
}
