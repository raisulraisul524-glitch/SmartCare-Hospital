package smartcarehospital.smartcarehospital.service;

import smartcarehospital.smartcarehospital.entity.Doctor;
import smartcarehospital.smartcarehospital.repository.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DoctorService {private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    // Get all doctors
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    // Get doctor by ID
    public Optional<Doctor> getDoctorById(Integer id) {
        return doctorRepository.findById(id);
    }

    // Add doctor
    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    // Update doctor
    public Doctor updateDoctor(Integer id, Doctor doctorDetails) {
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor not found"));

        doctor.setDoctorName(doctorDetails.getDoctorName());
        doctor.setSpecialization(doctorDetails.getSpecialization());
        doctor.setQualification(doctorDetails.getQualification());
        doctor.setContactNo(doctorDetails.getContactNo());
        doctor.setConsultationFee(doctorDetails.getConsultationFee());
        doctor.setDepartmentID(doctorDetails.getDepartmentID());

        return doctorRepository.save(doctor);
    }

    // Delete doctor
    public void deleteDoctor(Integer id) {
        doctorRepository.deleteById(id);
    }

}
