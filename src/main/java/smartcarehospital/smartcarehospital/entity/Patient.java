package smartcarehospital.smartcarehospital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "Patient")


public class Patient {
    @Id
    @Column(name = "PatientID")
    private Integer patientID;

    @Column(name = "FullName", nullable = false, length = 100)
    private String fullName;

    @Column(name = "DateOfBirth", nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "Address", nullable = false, length = 200)
    private String address;

    @Column(name = "ContactNo", unique = true, length = 10)
    private String contactNo;

    @Column(name = "BloodGroup", length = 5)
    private String bloodGroup;

    // Default constructor
    public Patient() {
    }

    // Constructor
    public Patient(Integer patientID, String fullName, LocalDate dateOfBirth,
                   String address, String contactNo, String bloodGroup) {
        this.patientID = patientID;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.contactNo = contactNo;
        this.bloodGroup = bloodGroup;
    }

    public Integer getPatientID() {
        return patientID;
    }

    public void setPatientID(Integer patientID) {
        this.patientID = patientID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }


}
