package SimpleDBObject;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="MEMBER")
public class Member {
    @Id
    private String id;
    @Column
    private String username;
    private String age;
}
