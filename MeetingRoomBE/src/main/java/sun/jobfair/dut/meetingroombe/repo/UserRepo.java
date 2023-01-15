package sun.jobfair.dut.meetingroombe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sun.jobfair.dut.meetingroombe.model.user.User;

@Repository
public interface UserRepo extends JpaRepository<User, String> {
}
