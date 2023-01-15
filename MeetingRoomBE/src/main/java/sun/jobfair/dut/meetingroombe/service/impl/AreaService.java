package sun.jobfair.dut.meetingroombe.service.impl;

import org.springframework.stereotype.Service;
import sun.jobfair.dut.meetingroombe.model.room.Area;
import sun.jobfair.dut.meetingroombe.service.IAreaService;

import java.util.List;
import java.util.Optional;

@Service
public class AreaService implements IAreaService {
    @Override
    public List<Area> getAll() {
        return null;
    }

    @Override
    public Optional<Area> getById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Area save(Area entity) {
        return null;
    }

    @Override
    public Area update(Area entity) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
