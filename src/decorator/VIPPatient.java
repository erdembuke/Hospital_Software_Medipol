package decorator;

import factory.Person;

public class VIPPatient extends PatientDecorator {
    public VIPPatient(Person patient) {
        super(patient);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kategori: VIP Hasta");
    }
}
