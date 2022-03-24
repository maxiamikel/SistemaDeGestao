package com.maxi.gestao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maxi.gestao.dominios.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, String> {

}