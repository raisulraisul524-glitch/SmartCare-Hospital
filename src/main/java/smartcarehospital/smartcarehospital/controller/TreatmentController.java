package smartcarehospital.smartcarehospital.controller;
import org.springframework.web.bind.annotation.*;
import smartcarehospital.smartcarehospital.entity.Treatment;
import smartcarehospital.smartcarehospital.service.TreatmentService;

import java.util.List;
@RestController
@RequestMapping("/api/treatments")

public class TreatmentController {
    private final TreatmentService treatmentService;

    public TreatmentController(TreatmentService treatmentService) {
        this.treatmentService = treatmentService;
    }

    @GetMapping
    public List<Treatment> getAllTreatments() {
        return treatmentService.getAllTreatments();
    }

    @GetMapping("/{id}")
    public Treatment getTreatmentById(@PathVariable int id) {
        return treatmentService.getTreatmentById(id);
    }

    @PostMapping
    public Treatment createTreatment(@RequestBody Treatment treatment) {
        return treatmentService.saveTreatment(treatment);
    }

    @PutMapping("/{id}")
    public Treatment updateTreatment(
            @PathVariable int id,
            @RequestBody Treatment treatment) {

        treatment.setTreatmentID(id);
        return treatmentService.saveTreatment(treatment);
    }

    @DeleteMapping("/{id}")
    public void deleteTreatment(@PathVariable int id) {
        treatmentService.deleteTreatment(id);
    }


}
