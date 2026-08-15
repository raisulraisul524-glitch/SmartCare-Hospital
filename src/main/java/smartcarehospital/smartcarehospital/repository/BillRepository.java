package smartcarehospital.smartcarehospital.repository;
import smartcarehospital.smartcarehospital.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Integer> {
}
