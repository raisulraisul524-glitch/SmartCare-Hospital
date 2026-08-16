package smartcarehospital.smartcarehospital.repository;
import smartcarehospital.smartcarehospital.entity.Admission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdmissionRepository extends JpaRepository<Admission, Integer> {
}
