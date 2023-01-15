package sun.jobfair.dut.meetingroombe.service.impl;

import org.springframework.stereotype.Service;
import sun.jobfair.dut.meetingroombe.model.user.Account;
import sun.jobfair.dut.meetingroombe.service.IAccountService;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService implements IAccountService {
    @Override
    public List<Account> getAll() {
        return null;
    }

    @Override
    public Optional<Account> getById(String id) {
        return Optional.empty();
    }

    @Override
    public Account save(Account entity) {
        return null;
    }

    @Override
    public Account update(Account entity) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }
}
