package smartcarehospital.smartcarehospital.repository;

import smartcarehospital.smartcarehospital.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
