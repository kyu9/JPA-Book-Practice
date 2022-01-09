package EntityMappingExample;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Member {

    @Id
    @Column(name = "MEMBER_ID")
    private Long id;

    private String username;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;

}
