package sun.jobfair.dut.meetingroombe.model.room;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import sun.jobfair.dut.meetingroombe.model.EStatus;
import sun.jobfair.dut.meetingroombe.model.feedback.Feedback;
import sun.jobfair.dut.meetingroombe.model.history.RegistrationHistory;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Room {
    @Id
    @GeneratedValue(generator = "roomIdGenerator")
    @GenericGenerator(
            name = "roomIdGenerator",
            parameters = @Parameter(name = "prefix", value = "R"),
            strategy = "sun.jobfair.dut.meetingroombe.utils.IdGenerator"
    )
    private String id;

    private String name;

    @Enumerated(EnumType.STRING)
    private EStatus status;

    private String image;

    private Integer capacity;

    @ManyToOne(targetEntity = Area.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "area_id", referencedColumnName = "id", nullable = false)
    private Area area;

    @ManyToOne(targetEntity = Floor.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "floor_id", referencedColumnName = "id", nullable = false)
    private Floor floor;

    @ManyToOne(targetEntity = RoomType.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "room_type_id", referencedColumnName = "id", nullable = false)
    private RoomType roomType;

    @OneToMany(targetEntity = RegistrationHistory.class, mappedBy = "room", fetch = FetchType.EAGER)
    @JsonBackReference
    private List<RegistrationHistory> registrationHistories;

    @OneToMany(targetEntity = Feedback.class, mappedBy = "room", fetch = FetchType.EAGER)
    @JsonBackReference
    private List<Feedback> feedbacks;
}
