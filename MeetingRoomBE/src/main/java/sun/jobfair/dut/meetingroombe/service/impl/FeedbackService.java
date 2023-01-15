package sun.jobfair.dut.meetingroombe.service.impl;

import org.springframework.stereotype.Service;
import sun.jobfair.dut.meetingroombe.model.feedback.Feedback;
import sun.jobfair.dut.meetingroombe.service.IFeedbackService;

import java.util.List;
import java.util.Optional;

@Service
public class FeedbackService implements IFeedbackService {
    @Override
    public List<Feedback> getAll() {
        return null;
    }

    @Override
    public Optional<Feedback> getById(String id) {
        return Optional.empty();
    }

    @Override
    public Feedback save(Feedback entity) {
        return null;
    }

    @Override
    public Feedback update(Feedback entity) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }
}
