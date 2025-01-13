package facade;

import decorator.VIPPatient;
import factory.Person;
import factory.PersonFactory;
import strategy.ListingStrategy;
import strategy.SimpleListing;

public class Controller {
    private final ListingStrategy listingStrategy;
    private final PatientManager patientManager;
    private final DoctorManager doctorManager;
    private final NotifierManager notifierManager;
    private final LoggerManager loggerManager;

    public Controller() {
        this.listingStrategy = new SimpleListing();
        this.patientManager = new PatientManager();
        this.doctorManager = new DoctorManager();
        this.notifierManager = new NotifierManager();
        this.loggerManager = new LoggerManager();
    }

    protected void initializeData() {
        loggerManager.log("Sistem başlatılıyor...");

        // Doktor ve Hastaları oluşturuyoruz.
        Person doctor1 = PersonFactory.createPerson("Doctor", "Dr. Arslan");
        notifierManager.addObserverToNotifier(message -> System.out.println("Bildirim: " + message)); // Bildirim eklendi
        notifierManager.notifyObservers("Yeni doktor kaydı oluşturuldu! Doktor Adı " + doctor1.getName());
        Person doctor2 = PersonFactory.createPerson("Doctor", "Dr. Subaru");
        notifierManager.notifyObservers("Yeni doktor kaydı oluşturuldu! Doktor Adı " + doctor2.getName());

        doctorManager.addDoctor(doctor1);
        doctorManager.addDoctor(doctor2);

        Person patient1 = PersonFactory.createPerson("Patient", "Erdem Buke");
        notifierManager.notifyObservers("Yeni hasta kaydı oluşturuldu! Hasta Adı " + patient1.getName());
        Person patient2 = new VIPPatient(PersonFactory.createPerson("Patient", "Mehmet Enes"));
        notifierManager.notifyObservers("Yeni hasta kaydı oluşturuldu! Hasta Adı " + patient2.getName());

        patientManager.addPatient(patient1);
        patientManager.addPatient(patient2);

        loggerManager.log("Veri girişleri tamamlandı.");
    }

    protected void displayData() {
        System.out.println("\nKayıtlı Doktorlar:");
        listingStrategy.list(doctorManager.getDoctors());

        System.out.println(); // Ciktiyi daha rahat okuyabilmek icin

        System.out.println("Kayıtlı Hastalar:");
        listingStrategy.list(patientManager.getPatients());

    }
}
