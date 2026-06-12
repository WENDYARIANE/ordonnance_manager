package co.kozao.ordonnance_manager.model;

public class Patient extends Person {

    public Patient(int id, String lastName, String firstName, String email, String phone) {
        super(id, lastName, firstName, email, phone);
    }

    @Override
    public void displayInfo() {
        System.out.println("[" + getId() + "] " + getLastName() + " " + getFirstName());
    }

    @Override
    public String toString() {
        return "[" + getId() + "] " + getLastName() + " " + getFirstName();
    }
}