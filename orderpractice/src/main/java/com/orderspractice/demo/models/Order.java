package com.orderspractice.demo.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ordernum;
    private double orderamount;
    private double adanceamount;
    private String orderdescription;

    @ManyToMany
    @JoinTable(name = "orderspayments",
    joinColumns = @JoinColumn(name = "ordernum"),
    inverseJoinColumns = @JoinColumn(name = "paymentid"))
    Set<Payment> payments = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "custcode", nullable = false)
    private Customer customer;

    public Order()
    {
        //default constructor
    }

    public Order(double orderamount, double adanceamount, Customer customer, String orderdescription)
    {
        this.orderamount = orderamount;
        this.adanceamount = adanceamount;
        this.orderdescription = orderdescription;
    }

    public double getOrderamount() {
        return orderamount;
    }

    public void setOrderamount(double orderamount) {
        this.orderamount = orderamount;
    }

    public double getAdanceamount() {
        return adanceamount;
    }

    public void setAdanceamount(double adanceamount) {
        this.adanceamount = adanceamount;
    }

    public String getOrderdescription() {
        return orderdescription;
    }

    public void setOrderdescription(String orderdescription) {
        this.orderdescription = orderdescription;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
