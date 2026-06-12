package co.kozao.ordonnance_manager.model;

import co.kozao.ordonnance_manager.utils.PrescriptionStatus;
import java.time.LocalDate;

public class Prescription {

    
    private int id;
    private String medication;
    private LocalDate prescriptionDate;
    private String dosage;
    private String patientName;
    private int patientId;
    private int doctorId;
    private PrescriptionStatus status;

    
    public Prescription(String medication, LocalDate prescriptionDate,
                        String dosage, String patientName,
                        int patientId, int doctorId) {
        this.medication = medication;
        this.prescriptionDate = prescriptionDate;
        this.dosage = dosage;
        this.patientName = patientName;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.status = PrescriptionStatus.PENDING;
    }

   
    public Prescription(int id, String medication, 
                        LocalDate prescriptionDate,
                        String dosage, String patientName,
                        int patientId, int doctorId,
                        PrescriptionStatus status) {
        this.id = id;
        this.medication = medication;
        this.prescriptionDate = prescriptionDate;
        this.dosage = dosage;
        this.patientName = patientName;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.status = status;
    }

    
    public int getId() { return id; }
    public String getMedication() { return medication; }
    public LocalDate getPrescriptionDate() { return prescriptionDate; }
    public String getDosage() { return dosage; }
    public String getPatientName() { return patientName; }
    public int getPatientId() { return patientId; }
    public int getDoctorId() { return doctorId; }
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