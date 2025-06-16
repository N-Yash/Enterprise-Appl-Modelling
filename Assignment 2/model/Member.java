package com.assignment2.library.model;

import jakarta.persistence.*;

@Entity
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private Date mamb_date;
    private String memb_type;
    private Date expiry_date;


    public Member() {}
    public Member(String name, String address, Date mamb_date, String memb_type, Date expiry_date) {
        this.name = name;
        this.address = address;
        this.mamb_date = mamb_date;
        this.memb_type = memb_type;
        this.expiry_date = expiry_date;

    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public Date getMamb_date() { return mamb_date; }
    public void setMamb_date(Date mamb_date) { this.mamb_date = mamb_date; }
    public String getMemb_type() { return memb_type; }
    public void setMemb_type(String memb_type) { this.memb_type = memb_type; }
    public Date getExpiry_date() { return expiry_date; }
    public void setExpiry_date(Date expiry_date) { this.expiry_date = expiry_date;
}