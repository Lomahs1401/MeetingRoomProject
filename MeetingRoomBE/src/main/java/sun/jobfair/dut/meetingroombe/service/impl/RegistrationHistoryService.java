package sun.jobfair.dut.meetingroombe.service.impl;

import org.springframework.stereotype.Service;
import sun.jobfair.dut.meetingroombe.model.history.RegistrationHistory;
import sun.jobfair.dut.meetingroombe.service.IRegistrationHistoryService;

import java.util.List;
import java.util.Optional;

@Service
public class RegistrationHistoryService implements IRegistrationHistoryService {
    @Override
    public List<RegistrationHistory> getAll() {
        return null;
    }

    @Override
    public Optional<RegistrationHistory> getById(String id) {
        return Optional.empty();
    }

    @Override
    public RegistrationHistory save(RegistrationHistory entity) {
        return null;
    }

    @Override
    public RegistrationHistory update(RegistrationHistory entity) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }
}
