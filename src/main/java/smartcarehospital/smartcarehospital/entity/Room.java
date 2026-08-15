package smartcarehospital.smartcarehospital.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "Room")

public class Room {

    @Id
    @Column(name = "RoomID")
    private int roomID;

    @Column(name = "RoomCategory", nullable = false)
    private String roomCategory;

    @Column(name = "RoomNumber", nullable = false, unique = true)
    private String roomNumber;

    @Column(name = "BedNumber", nullable = false)
    private String bedNumber;

    @Column(name = "AvailabilityStatus", nullable = false)
    private String availabilityStatus;

    // Getters and Setters

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getRoomCategory() {
        return roomCategory;
    }

    public void setRoomCategory(String roomCategory) {
        this.roomCategory = roomCategory;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(String bedNumber) {
        this.bedNumber = bedNumber;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }
}
