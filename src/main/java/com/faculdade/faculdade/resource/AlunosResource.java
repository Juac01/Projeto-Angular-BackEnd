package com.faculdade.faculdade.resource;

import com.faculdade.faculdade.entities.Alunos;
import com.faculdade.faculdade.services.AlunosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 33600)
@RestController
@RequestMapping(value = "/alunos")

public class AlunosResource {
    @Autowired
    private AlunosService alunosService;

    @GetMapping(value = "/abertos")
    public ResponseEntity<List<Alunos>> listarAbertos() {
        List<Alunos> alunos = alunosService.listarTodosAbertos();
        return ResponseEntity.ok().body(alunos);
    }
    @GetMapping(value = "/fechados")
    public ResponseEntity<List<Alunos>> listarFechados() {
        List<Alunos> alunos = alunosService.listarTodosFechados();
        return ResponseEntity.ok().body(alunos);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Alunos> findById(@PathVariable int id) {
        Alunos aluno = alunosService.findById(id);
        return ResponseEntity.ok().body(aluno);
    }

    @GetMapping("/nome/{nome}")
    public List<Alunos> findByNome(@PathVariable String nome) {
        return alunosService.findByNome(nome);
    }

    @GetMapping("/ra/{ra}")
    public List<Alunos> findByRa(@PathVariable String ra) {
        return alunosService.findByRa(ra);
    }
    @GetMapping
    public ResponseEntity<List<Alunos>> findAll() {
        List<Alunos> alunos = alunosService.findAll();
        return ResponseEntity.ok().body(alunos);
    }
    @GetMapping("/cep/{cep}")
    public ResponseEntity<List<Alunos>> findByCep(@PathVariable String cep) {
        List<Alunos> alunos = alunosService.findByCep(cep);
        return ResponseEntity.ok().body(alunos);
    }

    @GetMapping("/numero/{numero}")
    public ResponseEntity<List<Alunos>> findByNumero(@PathVariable int numero) {
        List<Alunos> alunos = alunosService.findByNumero(numero);
        return ResponseEntity.ok().body(alunos);
    }

    @GetMapping("/complemento/{complemento}")
    public ResponseEntity<List<Alunos>> findByComplemento(@PathVariable String complemento) {
        List<Alunos> alunos = alunosService.findByComplemento(complemento);
        return ResponseEntity.ok().body(alunos);
    }

    @GetMapping("/notaAdo1/{notaAdo1}")
    public ResponseEntity<List<Alunos>> findByNotaAdo1(@PathVariable double notaAdo1) {
        List<Alunos> alunos = alunosService.findByNotaAdo1(notaAdo1);
        return ResponseEntity.ok().body(alunos);
    }

    @GetMapping("/notaPI/{notaPI}")
    public ResponseEntity<List<Alunos>> findByNotaPI(@PathVariable double notaPI) {
        List<Alunos> alunos = alunosService.findByNotaPI(notaPI);
        return ResponseEntity.ok().body(alunos);
    }


    @PostMapping
    public ResponseEntity<Alunos> gravarAlunos(
            @RequestBody Alunos aluno){
        aluno = alunosService.gravarAluno(aluno);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(aluno.getId()).toUri();
        return ResponseEntity.created(uri).body(aluno);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletarAlunos(@PathVariable Integer id){
        alunosService.deletarAluno(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Alunos> updateAlunos(@PathVariable Integer id, @RequestBody Alunos aluno){
        Alunos alterado = alunosService.updateAlunos(id, aluno);
        return ResponseEntity.ok().body(alterado);
    }



}