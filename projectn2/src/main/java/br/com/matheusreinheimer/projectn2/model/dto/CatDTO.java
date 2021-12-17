package br.com.matheusreinheimer.projectn2.model.dto;

import br.com.matheusreinheimer.projectn2.model.Breed;
import br.com.matheusreinheimer.projectn2.model.Fur;

// Classe de dados DTO
public class CatDTO {
    private int id; // Identificador
    private Fur fur; // Pelagem
    private Breed breed; // Raça 
    
    public CatDTO() {
    }
    
    public CatDTO(int id, Fur fur, Breed breed) {
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
