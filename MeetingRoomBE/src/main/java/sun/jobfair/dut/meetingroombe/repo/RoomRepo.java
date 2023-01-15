package sun.jobfair.dut.meetingroombe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sun.jobfair.dut.meetingroombe.model.room.Room;

@Repository
public interface RoomRepo extends JpaRepository<Room, String> {
}
