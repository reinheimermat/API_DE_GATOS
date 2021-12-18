package br.com.matheusreinheimer.apifeupuda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.matheusreinheimer.apifeupuda.model.Cat;
import br.com.matheusreinheimer.apifeupuda.repository.CatRepository;

@Service
public class CatService {
    @Autowired
    private CatRepository repository;

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

        if (existCat.isPresent()) {
            repository.deleteById(id);
            existCat = this.findById(id);
            return existCat.isEmpty();
        }
        return false;
    }
}

