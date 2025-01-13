package factory;

public class PersonFactory {
    public static Person createPerson(String type, String name) {
        if ("Patient".equalsIgnoreCase(type)) {
            return new Patient(name);
        } else if ("Doctor".equalsIgnoreCase(type)) {
            return new Doctor(name);
        } else {
            throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}
