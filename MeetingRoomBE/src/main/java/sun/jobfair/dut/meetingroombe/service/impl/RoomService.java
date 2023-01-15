package sun.jobfair.dut.meetingroombe.service.impl;

import org.springframework.stereotype.Service;
import sun.jobfair.dut.meetingroombe.model.room.Room;
import sun.jobfair.dut.meetingroombe.service.IRoomService;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService implements IRoomService {
    @Override
    public List<Room> getAll() {
        return null;
    }

    @Override
    public Optional<Room> getById(String id) {
        return Optional.empty();
    }

    @Override
    public Room save(Room entity) {
        return null;
    }

    @Override
    public Room update(Room entity) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }
}
