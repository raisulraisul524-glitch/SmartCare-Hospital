package smartcarehospital.smartcarehospital.service;
import smartcarehospital.smartcarehospital.entity.Admission;
import smartcarehospital.smartcarehospital.repository.AdmissionRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdmissionService {
    private final AdmissionRepository admissionRepository;

    public AdmissionService(AdmissionRepository admissionRepository) {
        this.admissionRepository = admissionRepository;
    }

    public List<Admission> getAllAdmissions() {
        return admissionRepository.findAll();
    }

    public Admission getAdmissionById(int id) {
        return admissionRepository.findById(id).orElse(null);
    }

    public Admission saveAdmission(Admission admission) {
        return admissionRepository.save(admission);
    }

    public void deleteAdmission(int id) {
        admissionRepository.deleteById(id);
    }
}
