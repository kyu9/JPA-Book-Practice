package entity

import javax.persistence.*

class Order (
    @Id @GeneratedValue @Column(name = "MEMBER_ID")
    var id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")
    var member: Member,

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    var orderItems: List<OrderItem> = arrayListOf()
)