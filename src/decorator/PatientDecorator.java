package decorator;

import factory.Person;

public abstract class PatientDecorator extends Person {
    protected Person patient;

    public PatientDecorator(Person patient) {
        super(patient.getName());
        this.patient = patient;
    }

    @Override
    public void displayInfo() {
        patient.displayInfo();
    }
}
