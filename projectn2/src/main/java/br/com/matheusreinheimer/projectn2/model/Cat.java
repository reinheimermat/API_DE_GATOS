package br.com.matheusreinheimer.projectn2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Vincula a classe a uma tabela no BD.
@Table(name = "cats")
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Gerar primary key 
    private int id; // Identificador
    @Column(nullable = false)
    private Fur fur; // Pelagem
    @Column(nullable = false)
    private Breed breed; // Raça 

    public Cat() {
    }
    
    public Cat(int id, Fur fur, Breed breed) {
        this.id = id;
        this.fur = fur;
        this.breed = breed;
    }

    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
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
}
