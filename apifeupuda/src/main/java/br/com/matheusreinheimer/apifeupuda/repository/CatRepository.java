package br.com.matheusreinheimer.apifeupuda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.matheusreinheimer.apifeupuda.model.Cat;

@Repository
public interface CatRepository extends JpaRepository<Cat, Integer> {
    
}
