package sun.jobfair.dut.meetingroombe.model.feedback;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import sun.jobfair.dut.meetingroombe.model.equipment.Equipment;
import sun.jobfair.dut.meetingroombe.model.room.Room;
import sun.jobfair.dut.meetingroombe.model.user.User;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Feedback {
    @Id
    @GeneratedValue(generator = "feedbackIdGenerator")
    @GenericGenerator(
            name = "feedbackIdGenerator",
            parameters = @Parameter(name = "prefix", value = "FB"),
            strategy = "sun.jobfair.dut.meetingroombe.utils.IdGenerator"
    )
    private String id;

    private LocalDate dateRequest;

    private LocalDate dateResponse;

    private String note;

    @ManyToOne(targetEntity = Problem.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "problem_id", referencedColumnName = "id", nullable = false)
    private Problem problem;

    @ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;

    @ManyToOne(targetEntity = Equipment.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "equipment_id", referencedColumnName = "id", nullable = false)
    private Equipment equipment;

    @ManyToOne(targetEntity = Room.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "room_id", referencedColumnName = "id", nullable = false)
    private Room room;
}
