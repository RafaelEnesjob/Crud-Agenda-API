package com.agenda.agendaapi.controller;

import com.agenda.agendaapi.model.Contato;
import com.agenda.agendaapi.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contato")
public class ContatoController {

    @Autowired
    private ContatoRepository contatoRepository;

    @PostMapping
    public ResponseEntity<Contato> inserirContato(@RequestBody Contato contato){
        contatoRepository.save(contato);
        return ResponseEntity.ok().body(contato);
    }

    @PutMapping
    public ResponseEntity<Contato> editarContato(@RequestBody Contato contato){
        contatoRepository.save(contato);
        return ResponseEntity.ok().body(contato);
    }

    @GetMapping
    public ResponseEntity<List<Contato>> buscarContatos(){
        List<Contato> contatos = contatoRepository.findAll();
        return ResponseEntity.ok().body(contatos);
    }

    @DeleteMapping("/{id}")
    public void deletarContato(@PathVariable Integer id){
        contatoRepository.deleteById(id);
    }



}
