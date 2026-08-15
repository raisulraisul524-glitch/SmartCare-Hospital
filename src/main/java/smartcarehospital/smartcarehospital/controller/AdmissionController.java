package smartcarehospital.smartcarehospital.controller;
import smartcarehospital.smartcarehospital.entity.Admission;
import smartcarehospital.smartcarehospital.service.AdmissionService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/admissions")

public class AdmissionController {

    private final AdmissionService admissionService;

    public AdmissionController(AdmissionService admissionService) {
        this.admissionService = admissionService;
    }

    @GetMapping
    public List<Admission> getAllAdmissions() {
        return admissionService.getAllAdmissions();
    }

    @GetMapping("/{id}")
    public Admission getAdmissionById(@PathVariable int id) {
        return admissionService.getAdmissionById(id);
    }

    @PostMapping
    public Admission createAdmission(@RequestBody Admission admission) {
        return admissionService.saveAdmission(admission);
    }

    @PutMapping("/{id}")
    public Admission updateAdmission(@PathVariable int id,
                                     @RequestBody Admission admission) {
        admission.setAdmissionID(id);
        return admissionService.saveAdmission(admission);
    }

    @DeleteMapping("/{id}")
    public void deleteAdmission(@PathVariable int id) {
        admissionService.deleteAdmission(id);
    }
}
