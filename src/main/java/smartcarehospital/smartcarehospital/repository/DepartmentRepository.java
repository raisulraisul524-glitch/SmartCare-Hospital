package smartcarehospital.smartcarehospital.repository;
import smartcarehospital.smartcarehospital.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
