package sun.jobfair.dut.meetingroombe.service.impl;

import org.springframework.stereotype.Service;
import sun.jobfair.dut.meetingroombe.model.equipment.Category;
import sun.jobfair.dut.meetingroombe.service.ICategoryService;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements ICategoryService {
    @Override
    public List<Category> getAll() {
        return null;
    }

    @Override
    public Optional<Category> getById(String id) {
        return Optional.empty();
    }

    @Override
    public Category save(Category entity) {
        return null;
    }

    @Override
    public Category update(Category entity) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }
}
