package sun.jobfair.dut.meetingroombe.model.history;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import sun.jobfair.dut.meetingroombe.model.room.Room;
import sun.jobfair.dut.meetingroombe.model.user.User;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RegistrationHistory {
    @Id
    @GeneratedValue(generator = "registrationHistoryIdGenerator")
    @GenericGenerator(
            name = "registrationHistoryIdGenerator",
            parameters = @Parameter(name = "prefix", value = "RH"),
            strategy = "sun.jobfair.dut.meetingroombe.utils.IdGenerator"
    )
    private String id;

    private LocalDate dateStart;

    private LocalDate dateEnd;

    private LocalTime timeStart;

    private LocalTime timeEnd;

    private String description;

    private boolean isCancel;

    @ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;

    @ManyToOne(targetEntity = Room.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "room_id", referencedColumnName = "id", nullable = false)
    private Room room;
}
