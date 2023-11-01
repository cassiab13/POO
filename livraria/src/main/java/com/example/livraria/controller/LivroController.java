package com.example.livraria.controller;

import com.example.livraria.models.domain.Livro;
import com.example.livraria.models.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @GetMapping
    public List<Livro> all() {
        return livroRepository.findAll();
    }

    @GetMapping("/{id}")
    public Livro findById(@PathVariable Long id){
        return livroRepository.findById(id).orElse(null);
    }

    @GetMapping("/consulta")
    public Livro findByAutor(@RequestParam("autor") String autor){
        return livroRepository.findByAutorLike(autor);
    }

}
