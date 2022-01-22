package ch05;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItemList = new LinkedList<>();

    private LocalDate orderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    enum OrderStatus{
        DONE, DELIVERY, READY
    }
}
