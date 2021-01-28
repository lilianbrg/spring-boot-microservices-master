package com.course.orders.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    private Long paidTotal;
    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderItem> orders;

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPaidTotal() {
        return paidTotal;
    }

    public void setPaidTotal(Long paidTotal) {
        this.paidTotal = paidTotal;
    }

    public List<OrderItem> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderItem> orders) {
        this.orders = orders;
    }

    public Order(Long id, Long paidTotal, List<OrderItem> orders) {
        this.id = id;
        this.paidTotal = paidTotal;
        this.orders = orders;
    }


    public void addOrderItem (OrderItem orderItem){
        this.orders.add(orderItem);
    }
    
}
