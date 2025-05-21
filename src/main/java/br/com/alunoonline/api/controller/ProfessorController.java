package br.com.alunoonline.api.controller;

import br.com.alunoonline.api.model.Professor;
import br.com.alunoonline.api.service.ProfessorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/professores")
@Tag(name="Professor", description = "Endpoints para gerenciar professor")
public class ProfessorController {

    @Autowired
    ProfessorService professorService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Endpoint para criar professor")
    public void criarProfessor(@RequestBody Professor professor){
        professorService.criarProfessor(professor);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Endpoint para listar todos os professores")
    public List<Professor> listarTodosProfessores(){
        return professorService.listarTodosProfessores();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Endpoint para buscar professor por Id")
    public Optional<Professor> buscarProfessorPorId(@PathVariable Long id){
        return professorService.buscarProfessorPorId(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "Endpoint para deletar professor por Id")
    public void deletarProfessorPorId(@PathVariable Long id){
        professorService.deletarProfessorPorId(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "Endpoint para atualizar professor por Id")
    public void atualizarProfessorPorId(@PathVariable Long id, @RequestBody Professor professor){
        professorService.atualizarProfessorPorId(id, professor);
    }

}
