package facade;

public class HospitalFacade {
    private final Controller controller;

    public HospitalFacade() {
        this.controller = new Controller();
    }

    public void run() {
        controller.initializeData();
        controller.displayData();
    }
}
