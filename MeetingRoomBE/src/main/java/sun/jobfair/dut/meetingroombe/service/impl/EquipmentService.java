package sun.jobfair.dut.meetingroombe.service.impl;

import org.springframework.stereotype.Service;
import sun.jobfair.dut.meetingroombe.model.equipment.Equipment;
import sun.jobfair.dut.meetingroombe.service.IEquipmentService;

import java.util.List;
import java.util.Optional;

@Service
public class EquipmentService implements IEquipmentService {
    @Override
    public List<Equipment> getAll() {
        return null;
    }

    @Override
    public Optional<Equipment> getById(String id) {
        return Optional.empty();
    }

    @Override
    public Equipment save(Equipment entity) {
        return null;
    }

    @Override
    public Equipment update(Equipment entity) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }
}
