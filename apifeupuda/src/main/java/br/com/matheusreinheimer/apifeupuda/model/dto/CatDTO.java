package br.com.matheusreinheimer.apifeupuda.model.dto;

import br.com.matheusreinheimer.apifeupuda.model.Breed;
import br.com.matheusreinheimer.apifeupuda.model.Fur;

public class CatDTO {
    private int id;
    private String name;
    private Fur fur;
    private Breed breed;

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

    public CatDTO(int id, String name, Fur fur, Breed breed) {
        this.id = id;
        this.name = name;
        this.fur = fur;
        this.breed = breed;
    }

    public CatDTO() {
    }
}
