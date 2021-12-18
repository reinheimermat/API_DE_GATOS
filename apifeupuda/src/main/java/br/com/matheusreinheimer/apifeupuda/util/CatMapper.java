package br.com.matheusreinheimer.apifeupuda.util;

import br.com.matheusreinheimer.apifeupuda.model.Cat;
import br.com.matheusreinheimer.apifeupuda.model.dto.CatDTO;

public class CatMapper {
    private CatMapper() {

    }

    public static CatDTO fromCat(Cat objCat) {
        return new CatDTO(objCat.getId(), objCat.getName(), objCat.getFur(), objCat.getBreed());
    }

    public static Cat toCat(CatDTO dto) {
        return new Cat(dto.getId(), dto.getName(), dto.getFur(), dto.getBreed());
    }
}
