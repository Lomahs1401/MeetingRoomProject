package sun.jobfair.dut.meetingroombe.service.impl;

import org.springframework.stereotype.Service;
import sun.jobfair.dut.meetingroombe.model.room.Floor;
import sun.jobfair.dut.meetingroombe.service.IFloorService;

import java.util.List;
import java.util.Optional;

@Service
public class FloorService implements IFloorService {
    @Override
    public List<Floor> getAll() {
        return null;
    }

    @Override
    public Optional<Floor> getById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Floor save(Floor entity) {
        return null;
    }

    @Override
    public Floor update(Floor entity) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
