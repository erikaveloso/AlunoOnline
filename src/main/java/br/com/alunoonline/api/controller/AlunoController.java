package br.com.alunoonline.api.controller;

import br.com.alunoonline.api.model.Aluno;
import br.com.alunoonline.api.service.AlunoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
@Tag(name="Aluno", description = "Endpoints para gerenciar aluno")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Endpoint para criar aluno")
    public void criarAluno(@RequestBody Aluno aluno){
        alunoService.criarAluno(aluno);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Endpoint para listar todos os alunos")
    public List<Aluno> listarTodosAlunos(){
        return alunoService.listarTodosAlunos();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Endpoint para buscar aluno por Id")
    public Optional<Aluno> buscarAlunoPorId(@PathVariable Long id){
        return alunoService.buscarAlunoPorId(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "Endpoint para deletar aluno por Id")
    public void deletarAlunoPorId(@PathVariable Long id){
        alunoService.deletarAlunoPorId(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "Endpoint para atualizar aluno por Id")
    public void atualizarAlunoPorId(@PathVariable Long id, @RequestBody Aluno aluno){
        alunoService.atualizarAlunoPorId(id, aluno);
    }
}