package smartcarehospital.smartcarehospital.repository;
import smartcarehospital.smartcarehospital.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
}
