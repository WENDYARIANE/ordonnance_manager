package co.kozao.ordonnance_manager.exception;

public class PrescriptionNotFoundException extends Exception {
    public PrescriptionNotFoundException(int id) {
        super("Prescription #" + id + " introuvable !");
    }
}