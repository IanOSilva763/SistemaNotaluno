package com.example.sistemanotaluno.service;

import com.example.sistemanotaluno.dominio.Aluno;
import com.example.sistemanotaluno.dominio.Nota;
import com.example.sistemanotaluno.repository.AlunoRepository;
import com.example.sistemanotaluno.repository.NotaRepository;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

import static com.mongodb.client.model.Aggregates.project;

@Service
public class AlunoService {
    private final AlunoRepository alunoRepository;
    private final NotaRepository notaRepository;

    public AlunoService(AlunoRepository alunoRepository, NotaRepository notaRepository) {
        this.alunoRepository = alunoRepository;
        this.notaRepository = notaRepository;
    }

    public List<Nota> getNotasByNomeAluno(String nome) {
        List<Aluno> alunos = alunoRepository.findByNome(nome);
        if (alunos.isEmpty()) {
            return Collections.emptyList();
        }

        Aluno aluno = alunos.get(0);
        return notaRepository.findByAlunoId(aluno.getId());
    }

    public List<Aluno> getAlunosMaioresDeIdade() {
        return alunoRepository.findByIdadeGreaterThan(18);
    }
}

