package smartcarehospital.smartcarehospital.controller;
import org.springframework.web.bind.annotation.*;
import smartcarehospital.smartcarehospital.entity.LabTest;
import smartcarehospital.smartcarehospital.service.LabTestService;
import java.util.List;

@RestController
@RequestMapping("/api/labtests")

public class LabTestController {
    private final LabTestService labTestService;

    public LabTestController(LabTestService labTestService) {
        this.labTestService = labTestService;
    }

    @GetMapping
    public List<LabTest> getAllLabTests() {
        return labTestService.getAllLabTests();
    }

    @GetMapping("/{id}")
    public LabTest getLabTestById(@PathVariable int id) {
        return labTestService.getLabTestById(id);
    }

    @PostMapping
    public LabTest createLabTest(@RequestBody LabTest labTest) {
        return labTestService.saveLabTest(labTest);
    }

    @PutMapping("/{id}")
    public LabTest updateLabTest(
            @PathVariable int id,
            @RequestBody LabTest labTest) {

        labTest.setLabTestID(id);
        return labTestService.saveLabTest(labTest);
    }

    @DeleteMapping("/{id}")
    public void deleteLabTest(@PathVariable int id) {
        labTestService.deleteLabTest(id);
    }
}
