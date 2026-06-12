package co.kozao.ordonnance_manager.exception;

public class AccessDeniedException extends Exception {
    public AccessDeniedException(String role) {
        super("Access denied : " + role + " vous n'estes pas autoriser a effecetuer cette action");
    }
}