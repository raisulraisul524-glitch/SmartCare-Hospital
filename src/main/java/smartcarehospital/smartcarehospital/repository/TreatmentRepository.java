package smartcarehospital.smartcarehospital.repository;
import smartcarehospital.smartcarehospital.entity.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatmentRepository extends JpaRepository<Treatment, Integer>  {
}
