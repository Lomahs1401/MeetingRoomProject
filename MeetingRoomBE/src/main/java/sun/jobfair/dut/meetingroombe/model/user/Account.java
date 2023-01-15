package sun.jobfair.dut.meetingroombe.model.user;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Account {
    @Id
    private String username;

    private String password;

    @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER, mappedBy = "account")
    @JsonBackReference
    private User user;

    @Enumerated(EnumType.STRING)
    private ERole role;
}
