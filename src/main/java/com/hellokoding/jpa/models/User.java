package com.hellokoding.jpa.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "active")
    private int active;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_route", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "route_id"))
    private Set<Route> routes;

}