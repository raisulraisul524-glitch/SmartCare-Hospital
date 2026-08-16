package smartcarehospital.smartcarehospital.service;
import smartcarehospital.smartcarehospital.entity.Appointment;
import smartcarehospital.smartcarehospital.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service

public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    // Get all appointments
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    // Get appointment by ID
    public Optional<Appointment> getAppointmentById(int id) {
        return appointmentRepository.findById(id);
    }

    // Add appointment
    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    // Update appointment
    public Appointment updateAppointment(int id, Appointment appointment) {
        appointment.setAppointmentID(id);
        return appointmentRepository.save(appointment);
    }

    // Delete appointment
    public void deleteAppointment(int id) {
        appointmentRepository.deleteById(id);
    }


}
