package br.com.matheusreinheimer.apifeupuda.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.matheusreinheimer.apifeupuda.model.dto.CatDTO;
import br.com.matheusreinheimer.apifeupuda.service.CatService;
import br.com.matheusreinheimer.apifeupuda.util.CatMapper;

@RestController
@RequestMapping("/api/feupudos")
public class APICatController {
    @Autowired
    private CatService service;
    
    @PostMapping
    public ResponseEntity<CatDTO> insert(@RequestBody CatDTO catDTO) {
        var cat = service.insertOrUpdate(
            CatMapper.toCat(catDTO)
        );
        
        if(cat != null)
            return new ResponseEntity<>(
                CatMapper.fromCat(cat),
                HttpStatus.CREATED
            );
            return new ResponseEntity<>(new CatDTO(),
                HttpStatus.NOT_FOUND
            );
    }

    @PutMapping
    public ResponseEntity<CatDTO> update(@RequestBody CatDTO catDTO) {
        var cat = service.insertOrUpdate(
            CatMapper.toCat(catDTO)
        );

        if (cat != null)
            return new ResponseEntity<>(
                CatMapper.fromCat(cat),
                HttpStatus.OK
            );
            return new ResponseEntity<>(new CatDTO(), HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public List<CatDTO> findAll() {
        return service.findAll().stream().map(
            (obj) -> CatMapper.fromCat(obj)
        ).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CatDTO> findById(@PathVariable int id) {
        var cat = service.findById(id);

        if(cat.isPresent())
            return new ResponseEntity<>(
                CatMapper.fromCat(cat.get()), HttpStatus.OK
            );
            return new ResponseEntity<>(new CatDTO(), HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        var isSuccess = service.delete(id);

        if(isSuccess)
            return new ResponseEntity<>("Gato deletado do sistema!", HttpStatus.OK
        );
        return new ResponseEntity<>("[ERRO!!!]Não foi possivel remover o gato do sistema!", HttpStatus.NOT_FOUND
        );
    }
}
