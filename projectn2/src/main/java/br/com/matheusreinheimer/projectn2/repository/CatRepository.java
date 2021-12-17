package br.com.matheusreinheimer.projectn2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.matheusreinheimer.projectn2.model.Cat;

@Repository // avisa ao spring que é um repository
public interface CatRepository extends JpaRepository<Cat, Integer>  /* Extende a interface JpaRepository */ {
    
}
