package com.example.livraria.models.domain;

import com.example.livraria.models.enums.Genero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Livro {
    private Long id;
    private String titulo;
    private String autor;
    private Integer anoPublicacao;
    private Genero genero;
}
