package com.maxi.gestao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maxi.gestao.entities.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

}
