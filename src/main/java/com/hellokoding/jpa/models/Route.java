package com.hellokoding.jpa.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "route")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "route_id")

    private int id;
    @Column(name = "route")
    private String route;

}
