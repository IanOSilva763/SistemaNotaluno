package com.example.sistemanotaluno.repository;

import com.example.sistemanotaluno.dominio.Aluno;
import com.example.sistemanotaluno.dominio.Nota;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NotaRepository extends MongoRepository<Nota, String> {
    List<Nota> findByAlunoId(String alunoId);
}

