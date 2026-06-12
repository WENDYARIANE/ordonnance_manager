package co.kozao.ordonnance_manager.model;

public abstract class Person {

    
    private int id;
    private String lastName;
    private String firstName;
    private String email;
    private String phone;

    
    public Person(int id, String lastName, String firstName,
                    String email, String phone) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.phone = phone;
    }

    
    public abstract void displayInfo();

 
    public int getId() { return id; }
    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
}