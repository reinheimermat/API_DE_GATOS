package br.com.matheusreinheimer.projectn2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.matheusreinheimer.projectn2.model.Cat;
import br.com.matheusreinheimer.projectn2.repository.CatRepository;

@Service // Avisa ao Spring que é um service  
public class CatService {
    @Autowired // permiti injeção de dependencias pra inicialiazação do objeto
    private CatRepository repository; // Defini o repositorio que processa a camada service

    public Cat insertOrUpdate(Cat cat) {
        return repository.save(cat);
    }

    public List<Cat> findAll() {
        return repository.findAll();
    }

    public Optional<Cat> findById(int id) {
        return repository.findById(id);
    }

    public boolean delete(int id) {
        var existCat = this.findById(id);

        // Se encontrar um livro, remover 
        if (existCat.isPresent()) {
            repository.deleteById(id);
            existCat = this.findById(id);
            return existCat.isEmpty();
        }
        return false;
    }
}
