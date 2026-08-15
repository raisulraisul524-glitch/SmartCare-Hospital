package smartcarehospital.smartcarehospital.entity;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Admission")

public class Admission {

    @Id
    @Column(name = "AdmissionID")
    private int admissionID;

    @Column(name = "PatientID", nullable = false)
    private int patientID;

    @Column(name = "RoomID", nullable = false)
    private int roomID;

    @Column(name = "AdmissionDate", nullable = false)
    private LocalDate admissionDate;

    @Column(name = "DischargeDate")
    private LocalDate dischargeDate;

    @Column(name = "AdmissionStatus", nullable = false)
    private String admissionStatus;

    public int getAdmissionID() {
        return admissionID;
    }

    public void setAdmissionID(int admissionID) {
        this.admissionID = admissionID;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public LocalDate getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(LocalDate dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getAdmissionStatus() {
        return admissionStatus;
    }

    public void setAdmissionStatus(String admissionStatus) {
        this.admissionStatus = admissionStatus;
    }
}
