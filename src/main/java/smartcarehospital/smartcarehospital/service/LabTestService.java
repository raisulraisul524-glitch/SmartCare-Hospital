package smartcarehospital.smartcarehospital.service;
import smartcarehospital.smartcarehospital.entity.LabTest;
import smartcarehospital.smartcarehospital.repository.LabTestRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class LabTestService {

    private final LabTestRepository labTestRepository;

    public LabTestService(LabTestRepository labTestRepository) {
        this.labTestRepository = labTestRepository;
    }

    public List<LabTest> getAllLabTests() {
        return labTestRepository.findAll();
    }

    public LabTest getLabTestById(int id) {
        return labTestRepository.findById(id).orElse(null);
    }

    public LabTest saveLabTest(LabTest labTest) {
        return labTestRepository.save(labTest);
    }

    public void deleteLabTest(int id) {
        labTestRepository.deleteById(id);
    }
}
