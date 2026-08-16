package smartcarehospital.smartcarehospital.service;
import smartcarehospital.smartcarehospital.entity.Bill;
import smartcarehospital.smartcarehospital.repository.BillRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class BillService {

    private final BillRepository billRepository;

    public BillService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    public List<Bill> getAllBills() {
        return billRepository.findAll();
    }

    public Bill getBillById(int id) {
        return billRepository.findById(id).orElse(null);
    }

    public Bill saveBill(Bill bill) {
        return billRepository.save(bill);
    }

    public void deleteBill(int id) {
        billRepository.deleteById(id);
    }
}
