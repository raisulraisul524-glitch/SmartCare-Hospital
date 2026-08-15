package smartcarehospital.smartcarehospital.controller;
import org.springframework.web.bind.annotation.*;
import smartcarehospital.smartcarehospital.entity.Bill;
import smartcarehospital.smartcarehospital.service.BillService;

import java.util.List;

@RestController
@RequestMapping("/api/bills")

public class BillController {
    private final BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    @GetMapping
    public List<Bill> getAllBills() {
        return billService.getAllBills();
    }

    @GetMapping("/{id}")
    public Bill getBillById(@PathVariable int id) {
        return billService.getBillById(id);
    }

    @PostMapping
    public Bill createBill(@RequestBody Bill bill) {
        return billService.saveBill(bill);
    }

    @PutMapping("/{id}")
    public Bill updateBill(
            @PathVariable int id,
            @RequestBody Bill bill) {

        bill.setBillID(id);
        return billService.saveBill(bill);
    }

    @DeleteMapping("/{id}")
    public void deleteBill(@PathVariable int id) {
        billService.deleteBill(id);
    }
}
