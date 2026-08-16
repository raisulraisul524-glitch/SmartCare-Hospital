package smartcarehospital.smartcarehospital.service;
import smartcarehospital.smartcarehospital.entity.Patient;
import smartcarehospital.smartcarehospital.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PatientService {
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patient getPatientById(Integer id) {
        return patientRepository.findById(id).orElse(null);
    }

    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Patient updatePatient(Integer id, Patient patient) {
        Patient existingPatient = patientRepository.findById(id).orElse(null);

        if (existingPatient != null) {
            existingPatient.setFullName(patient.getFullName());
            existingPatient.setDateOfBirth(patient.getDateOfBirth());
            existingPatient.setAddress(patient.getAddress());
            existingPatient.setContactNo(patient.getContactNo());
            existingPatient.setBloodGroup(patient.getBloodGroup());

            return patientRepository.save(existingPatient);
        }

        return null;
    }

    public void deletePatient(Integer id) {
        patientRepository.deleteById(id);
    }
}
