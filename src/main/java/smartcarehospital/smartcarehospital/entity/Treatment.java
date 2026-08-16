package smartcarehospital.smartcarehospital.entity;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Treatment")

public class Treatment {

    @Id
    @Column(name = "TreatmentID")
    private int treatmentID;

    @Column(name = "PatientID", nullable = false)
    private int patientID;

    @Column(name = "DoctorID", nullable = false)
    private int doctorID;

    @Column(name = "Diagnosis", nullable = false)
    private String diagnosis;

    @Column(name = "PrescriptionDetails")
    private String prescriptionDetails;

    @Column(name = "TreatmentNotes")
    private String treatmentNotes;

    @Column(name = "TreatmentDate", nullable = false)
    private LocalDate treatmentDate;

    // Getters and Setters

    public int getTreatmentID() {
        return treatmentID;
    }

    public void setTreatmentID(int treatmentID) {
        this.treatmentID = treatmentID;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrescriptionDetails() {
        return prescriptionDetails;
    }

    public void setPrescriptionDetails(String prescriptionDetails) {
        this.prescriptionDetails = prescriptionDetails;
    }

    public String getTreatmentNotes() {
        return treatmentNotes;
    }

    public void setTreatmentNotes(String treatmentNotes) {
        this.treatmentNotes = treatmentNotes;
    }

    public LocalDate getTreatmentDate() {
        return treatmentDate;
    }

    public void setTreatmentDate(LocalDate treatmentDate) {
        this.treatmentDate = treatmentDate;
    }
}
