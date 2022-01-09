package EntityMappingExample;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Team {
    @Id
    @Column(name = "TEAM_ID")
    private String id;

    private String name;
}
