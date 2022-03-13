package entity

import lombok.Data
import javax.persistence.Column
import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
@Data
class Member (
    @Id @GeneratedValue @Column(name = "MEMBER_ID")
    var id: Long? = null,

    var name: String,

    @Embedded
    var address: Address,

    @OneToMany(mappedBy = "member")
    var orders: List<Order> ?= null
        )