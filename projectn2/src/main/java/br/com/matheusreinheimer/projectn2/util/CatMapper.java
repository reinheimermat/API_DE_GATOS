package br.com.matheusreinheimer.projectn2.util;

import br.com.matheusreinheimer.projectn2.model.Cat;
import br.com.matheusreinheimer.projectn2.model.dto.CatDTO;

public class CatMapper {
    private CatMapper(){
    }

    public static CatDTO fromCat(Cat cat) {
        return new CatDTO(cat.getId(), cat.getFur(), cat.getBreed());
    }

    public static Cat toCat(CatDTO dto) {
        return new Cat(dto.getId(), dto.getFur(), dto.getBreed());
    }
}
