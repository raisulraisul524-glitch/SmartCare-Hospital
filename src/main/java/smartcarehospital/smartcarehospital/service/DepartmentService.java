package smartcarehospital.smartcarehospital.service;
import smartcarehospital.smartcarehospital.entity.Department;
import smartcarehospital.smartcarehospital.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department getDepartmentById(int id) {
        return departmentRepository.findById(id).orElse(null);
    }

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public void deleteDepartment(int id) {
        departmentRepository.deleteById(id);
    }
}
