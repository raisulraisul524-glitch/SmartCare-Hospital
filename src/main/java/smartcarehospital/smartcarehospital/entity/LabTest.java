package smartcarehospital.smartcarehospital.entity;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "lab_test")

public class LabTest {

    @Id
    @Column(name = "LabTestID")
    private int labTestID;

    @Column(name = "PatientID", nullable = false)
    private int patientID;

    @Column(name = "DoctorID", nullable = false)
    private int doctorID;

    @Column(name = "TestName", nullable = false)
    private String testName;

    @Column(name = "TestDate", nullable = false)
    private LocalDate testDate;

    @Column(name = "TestResult")
    private String testResult;

    @Column(name = "TechnicianName", nullable = false)
    private String technicianName;

    @Column(name = "TestStatus", nullable = false)
    private String testStatus;

    // Getters and Setters

    public int getLabTestID() {
        return labTestID;
    }

    public void setLabTestID(int labTestID) {
        this.labTestID = labTestID;
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

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public LocalDate getTestDate() {
        return testDate;
    }

    public void setTestDate(LocalDate testDate) {
        this.testDate = testDate;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getTechnicianName() {
        return technicianName;
    }

    public void setTechnicianName(String technicianName) {
        this.technicianName = technicianName;
    }

    public String getTestStatus() {
        return testStatus;
    }

    public void setTestStatus(String testStatus) {
        this.testStatus = testStatus;
    }
}
