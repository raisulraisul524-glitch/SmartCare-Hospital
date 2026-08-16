package smartcarehospital.smartcarehospital.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "doctor")

public class Doctor {

    @Id
    @Column(name = "DoctorID")
    private Integer doctorID;

    @Column(name = "DoctorName", nullable = false, length = 100)
    private String doctorName;

    @Column(name = "Specialization", nullable = false, length = 100)
    private String specialization;

    @Column(name = "Qualification", nullable = false, length = 100)
    private String qualification;

    @Column(name = "ContactNo", unique = true, length = 10)
    private String contactNo;

    @Column(name = "ConsultationFee", nullable = false, precision = 10, scale = 2)
    private BigDecimal consultationFee;

    @Column(name = "DepartmentID", nullable = false)
    private Integer departmentID;

    public Doctor() {
    }

    public Doctor(Integer doctorID, String doctorName, String specialization,
                  String qualification, String contactNo,
                  BigDecimal consultationFee, Integer departmentID) {
        this.doctorID = doctorID;
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.qualification = qualification;
        this.contactNo = contactNo;
        this.consultationFee = consultationFee;
        this.departmentID = departmentID;
    }

    public Integer getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(Integer doctorID) {
        this.doctorID = doctorID;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public BigDecimal getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(BigDecimal consultationFee) {
        this.consultationFee = consultationFee;
    }

    public Integer getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Integer departmentID) {
        this.departmentID = departmentID;
    }
}
