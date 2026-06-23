/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.logistica.api.controller;

import com.logistica.api.service.PacoteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author BEATRICE
 */
    
@RestController
@RequestMapping("/api/pacotes")
public class PacoteController {
 
    /*
POST /api/remessas → cria remessa, retorna LON2026xxx
PUT /api/pacotes/{id}/status → avança status
GET /api/rastreio/{codigo} → consulta pública
    */
    @Autowired
    private PacoteService service;

    // GET http://localhost:8080/api/pacotes
    @GetMapping
    public List<Pacote> listar() {
        return service.listarTodos();
    }

    // GET http://localhost:8080/api/pacotes/LON2026001
    @GetMapping("/{codigo}")
    public Pacote buscar(@PathVariable String codigo) {
        return service.buscarPorCodigo(codigo);
    }

    // POST http://localhost:8080/api/pacotes
    @PostMapping
    public Pacote criar(@RequestBody Pacote pacote) {
        return service.criar(pacote);
    }

    // PUT http://localhost:8080/api/pacotes/1/status
    @PutMapping("/{id}/status")
    public void mudarStatus(@PathVariable Long id, @RequestBody String status) {
        service.atualizarStatus(id, status.replace("\"", ""));
    }
}
}
