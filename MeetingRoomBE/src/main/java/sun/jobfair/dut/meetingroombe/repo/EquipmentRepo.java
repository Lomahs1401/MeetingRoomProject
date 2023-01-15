package sun.jobfair.dut.meetingroombe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sun.jobfair.dut.meetingroombe.model.equipment.Equipment;

@Repository
public interface EquipmentRepo extends JpaRepository<Equipment, String> {
}
