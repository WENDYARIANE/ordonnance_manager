package co.kozao.ordonnance_manager.model;

public class Medecin extends Person {
    private String fonction;

    public Medecin(int id, String lastName, String firstName, String email, String phone, String fonction) {
        super(id, lastName, firstName, email, phone);
        this.fonction = fonction;
    }

    public String getFonction() { return fonction; }

    @Override
    public void displayInfo() {
        System.out.println("[" + getId() + "] " + getLastName() + " " + getFirstName() + " - " + fonction);
    }

    @Override
    public String toString() {
        return "[" + getId() + "] " + getLastName() + " " + getFirstName() + " - " + fonction;
    }
}