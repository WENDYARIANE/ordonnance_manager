package co.kozao.ordonnance_manager.model;

import co.kozao.ordonnance_manager.utils.PrescriptionStatus;
import java.time.LocalDate;

public class Prescription {

	private static int countPrescription = 0;
    private int id;
    private String medication;
    private LocalDate prescriptionDate;
    private String dosage;
    private String patientName;
    private PrescriptionStatus status;

  
    public Prescription( String medication, LocalDate prescriptionDate,
                        String dosage, String patientName) {
        this.id = ++countPrescription;
        this.medication = medication;
        this.prescriptionDate = prescriptionDate;
        this.dosage = dosage;
        this.patientName = patientName;
        this.status = PrescriptionStatus.PENDING; 
    }

 
    public int getId() { return id; }
    public String getMedication() { return medication; }
    public LocalDate getPrescriptionDate() { return prescriptionDate; }
    public String getDosage() { return dosage; }
    public String getPatientName() { return patientName; }
    public PrescriptionStatus getStatus() { return status; }

   
    public void setStatus(PrescriptionStatus status) {
        this.status = status;
    }

   
  
    public String toString() {
        return "Prescription #" + id +
               " | Medication: " + medication +
               " | Patient: " + patientName +
               " | Date: " + prescriptionDate +
               " | Dosage: " + dosage +
               " | Status: " + status;
    }
}