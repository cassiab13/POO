package com.example.livraria.models.repository;

import com.example.livraria.models.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    Livro findByAutorLike(String search);
}
