package facade;

import factory.Person;
import java.util.ArrayList;
import java.util.List;

public class PatientManager {
    private final List<Person> patients = new ArrayList<>();

    public void addPatient(Person patient) {
        patients.add(patient);
    }

    public List<Person> getPatients() {
        return new ArrayList<>(patients);
    }
}
