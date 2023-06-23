package com.example.sistemanotaluno.repository;

import com.example.sistemanotaluno.dominio.Aluno;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AlunoRepository extends MongoRepository<Aluno, String> {
    List<Aluno> findByNome(String nome);
    List<Aluno> findByIdadeGreaterThan(int idade);
}
