package com.example.sistemanotaluno.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "notas")
public class Nota {
    @Id
    private String id;
    private String alunoId;
    private String disciplina;
    private double valornota;
}
