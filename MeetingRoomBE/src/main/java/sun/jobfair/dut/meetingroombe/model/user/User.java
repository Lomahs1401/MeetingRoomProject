package sun.jobfair.dut.meetingroombe.model.user;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import sun.jobfair.dut.meetingroombe.model.history.RegistrationHistory;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(generator = "userIdGenerator")
    @GenericGenerator(
            name = "userIdGenerator",
            parameters = @Parameter(name = "prefix", value = "U"),
            strategy = "sun.jobfair.dut.meetingroombe.utils.IdGenerator"
    )
    private String id;

    private String fullName;

    private String email;

    private boolean gender;

    private String address;

    private LocalDateTime dateOfBirth;

    private String IdCard;

    private String phone;

    private String image;

    @ManyToOne(targetEntity = Department.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id", referencedColumnName = "id", nullable = false)
    private Department department;

    @OneToOne(targetEntity = Account.class, fetch = FetchType.EAGER)
    private Account account;

    @OneToMany(targetEntity = RegistrationHistory.class, mappedBy = "user", fetch = FetchType.EAGER)
    @JsonBackReference
    private List<RegistrationHistory> registrationHistories;
}
