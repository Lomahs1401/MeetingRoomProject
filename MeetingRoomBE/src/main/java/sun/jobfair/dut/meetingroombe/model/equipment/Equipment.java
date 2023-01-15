package sun.jobfair.dut.meetingroombe.model.equipment;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import sun.jobfair.dut.meetingroombe.model.EStatus;
import sun.jobfair.dut.meetingroombe.model.feedback.Feedback;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Equipment {
    @Id
    @GeneratedValue(generator = "equipmentIdGenerator")
    @GenericGenerator(
        name = "equipmentIdGenerator",
        parameters = @Parameter(name = "prefix", value = "EQUIP"),
        strategy = "sun.jobfair.dut.meetingroombe.utils.IdGenerator"
    )
    private String id;

    private String name;

    private String description;

    private Double price;

    private String image;

    @Enumerated(EnumType.STRING)
    private EStatus status;

    @ManyToOne(targetEntity = Category.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", referencedColumnName = "id", nullable = false)
    private Category category;

    @OneToMany(targetEntity = Feedback.class, mappedBy = "equipment", fetch = FetchType.EAGER)
    @JsonBackReference
    private List<Equipment> equipmentList;
}
