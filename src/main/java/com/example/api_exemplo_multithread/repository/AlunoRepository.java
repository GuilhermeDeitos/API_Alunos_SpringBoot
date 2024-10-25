package com.example.api_exemplo_multithread.repository;
import com.example.api_exemplo_multithread.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
