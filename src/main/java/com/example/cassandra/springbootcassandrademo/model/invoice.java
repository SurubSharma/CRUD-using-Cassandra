package com.example.cassandra.springbootcassandrademo.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("invoice")
public class invoice {

    @PrimaryKey
    private int id;
    private String name;
    private String number;
    private double amount;

    public invoice(int id, String name, String number, double amount) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
