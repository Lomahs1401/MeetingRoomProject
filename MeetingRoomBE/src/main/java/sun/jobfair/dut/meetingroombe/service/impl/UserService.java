package sun.jobfair.dut.meetingroombe.service.impl;

import org.springframework.stereotype.Service;
import sun.jobfair.dut.meetingroombe.model.user.User;
import sun.jobfair.dut.meetingroombe.service.IUserService;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public Optional<User> getById(String id) {
        return Optional.empty();
    }

    @Override
    public User save(User entity) {
        return null;
    }

    @Override
    public User update(User entity) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }
}
