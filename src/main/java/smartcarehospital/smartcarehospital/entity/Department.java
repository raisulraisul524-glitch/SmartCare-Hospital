package smartcarehospital.smartcarehospital.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "Department")

public class Department {
    @Id
    @Column(name = "DepartmentID", insertable = true, updatable = false)
    private int departmentID;

    @Column(name = "DepartmentName", nullable = false, unique = true)
    private String departmentName;

    @Column(name = "Location", nullable = false)
    private String location;

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }




}
