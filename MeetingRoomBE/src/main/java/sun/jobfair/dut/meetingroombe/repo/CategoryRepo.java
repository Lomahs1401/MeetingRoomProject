package sun.jobfair.dut.meetingroombe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sun.jobfair.dut.meetingroombe.model.equipment.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
