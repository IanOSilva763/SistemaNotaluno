package com.example.sistemanotaluno.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "alunos")
public class Aluno {
    @Id
    private String id;
    private String nome;
    private String curso;
    private int idade;
}
