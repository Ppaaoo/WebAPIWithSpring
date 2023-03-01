package com.example.assignment3.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Franchise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "franchise_name", length = 50, nullable = false)
    private String name;
    private String description;

    @OneToMany(mappedBy = "franchise")
    private Set<Movie> moviesInFranchise;
}