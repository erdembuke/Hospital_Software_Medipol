package facade;

import factory.Person;
import java.util.ArrayList;
import java.util.List;

public class DoctorManager {
    private final List<Person> doctors = new ArrayList<>();

    public void addDoctor(Person doctor) {
        doctors.add(doctor);
    }

    public List<Person> getDoctors() {
        return new ArrayList<>(doctors);
    }
}
