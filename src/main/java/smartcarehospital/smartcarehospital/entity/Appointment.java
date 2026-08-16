package smartcarehospital.smartcarehospital.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "Appointment")

public class Appointment {
    @Id
    @Column(name = "AppointmentID")
    private int appointmentID;

    @Column(name = "PatientID", nullable = false)
    private int patientID;

    @Column(name = "DoctorID", nullable = false)
    private int doctorID;

    @Column(name = "AppointmentDate", nullable = false)
    private LocalDate appointmentDate;

    @Column(name = "AppointmentTime", nullable = false)
    private LocalTime appointmentTime;

    @Column(name = "AppointmentStatus", nullable = false)
    private String appointmentStatus;

    @Column(name = "ConsultationRoom", nullable = false)
    private String consultationRoom;

    public Appointment() {
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
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

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public LocalTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    public String getConsultationRoom() {
        return consultationRoom;
    }

    public void setConsultationRoom(String consultationRoom) {
        this.consultationRoom = consultationRoom;
    }
}
