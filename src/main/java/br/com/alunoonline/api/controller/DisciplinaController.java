package br.com.alunoonline.api.controller;

import br.com.alunoonline.api.model.Disciplina;
import br.com.alunoonline.api.service.DisciplinaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/disciplinas")
@Tag(name="Disciplina", description = "Endpoints para gerenciar disciplina")
public class DisciplinaController {

    @Autowired
    DisciplinaService disciplinaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Endpoint para criar disciplina")
    public void criarDisciplina(@RequestBody Disciplina disciplina){
        disciplinaService.criarDisciplina(disciplina);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Endpoint para listar todas as disciplinas")
    public List<Disciplina> listarTodasDisciplinas(){
        return disciplinaService.listarTodasDisciplinas();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Endpoint para buscar disciplina por Id")
    public Optional<Disciplina> buscarDisciplinaPorId(@PathVariable Long id){
        return disciplinaService.buscarDisciplinaPorId(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "Endpoint para deletar disciplina por Id")
    public void deletarDisciplinaPorId(@PathVariable Long id){
        disciplinaService.deletarDisciplinaPorId(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "Endpoint para atualizar disciplina por Id")
    public void atualizarDisciplinaPorId(@PathVariable Long id, @RequestBody Disciplina disciplina){
        disciplinaService.atualizarDisciplinaPorId(id, disciplina);
    }

    @GetMapping("/professor/{professorId}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Endpoint para listar disciplinas do professor")
    public List<Disciplina> listarDisciplinasDoProf(@PathVariable Long professorId){
        return disciplinaService.listarDisciplinaDoProf(professorId);
    }
}
