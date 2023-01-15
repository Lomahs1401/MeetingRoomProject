package sun.jobfair.dut.meetingroombe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sun.jobfair.dut.meetingroombe.model.user.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, String> {
}
