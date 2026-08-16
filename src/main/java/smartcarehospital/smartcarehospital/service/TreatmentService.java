package smartcarehospital.smartcarehospital.service;
import smartcarehospital.smartcarehospital.entity.Treatment;
import smartcarehospital.smartcarehospital.repository.TreatmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TreatmentService {
    private final TreatmentRepository treatmentRepository;

    public TreatmentService(TreatmentRepository treatmentRepository) {
        this.treatmentRepository = treatmentRepository;
    }

    public List<Treatment> getAllTreatments() {
        return treatmentRepository.findAll();
    }

    public Treatment getTreatmentById(int id) {
        return treatmentRepository.findById(id).orElse(null);
    }

    public Treatment saveTreatment(Treatment treatment) {
        return treatmentRepository.save(treatment);
    }

    public void deleteTreatment(int id) {
        treatmentRepository.deleteById(id);
    }
}
