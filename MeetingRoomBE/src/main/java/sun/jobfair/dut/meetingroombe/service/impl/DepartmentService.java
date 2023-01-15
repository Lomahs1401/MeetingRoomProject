package sun.jobfair.dut.meetingroombe.service.impl;

import org.springframework.stereotype.Service;
import sun.jobfair.dut.meetingroombe.model.user.Department;
import sun.jobfair.dut.meetingroombe.service.IDepartmentService;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService implements IDepartmentService {
    @Override
    public List<Department> getAll() {
        return null;
    }

    @Override
    public Optional<Department> getById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Department save(Department entity) {
        return null;
    }

    @Override
    public Department update(Department entity) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
