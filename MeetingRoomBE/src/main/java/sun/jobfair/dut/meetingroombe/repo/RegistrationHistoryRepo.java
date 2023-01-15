package sun.jobfair.dut.meetingroombe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sun.jobfair.dut.meetingroombe.model.history.RegistrationHistory;

@Repository
public interface RegistrationHistoryRepo extends JpaRepository<RegistrationHistory, String> {
}
