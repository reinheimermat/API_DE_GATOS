package br.com.matheusreinheimer.apifeupuda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feupudos")
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(columnDefinition = "varchar(50) not null")
    private String name;
    @Column(nullable = false)
    private Fur fur;
    @Column(nullable = false)
    private Breed breed;

    public Cat(int id, String name, Fur fur, Breed breed) {
        this.id = id;
        this.name = name;
        this.fur = fur;
        this.breed = breed;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fur getFur() {
        return this.fur;
    }

    public void setFur(Fur fur) {
        this.fur = fur;
    }

    public Breed getBreed() {
        return this.breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public Cat() {
    }
}