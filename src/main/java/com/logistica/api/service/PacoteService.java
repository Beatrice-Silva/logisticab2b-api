/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.logistica.api.service;

import com.logistica.api.model.PacoteDTO;
import com.logistica.api.repository.PacoteDAO;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author BEATRICE
 */
@Service
public class PacoteService {
    
  private final PacoteDAO dao = new PacoteDAO();
  
  public List<PacoteDTO> listarTodos(){
      return dao.listar();
  }
  
  public PacoteDTO buscarPorCodigo(String codigoLon){
      return dao.buscarPorCodigo(codigoLon);
  }
  
  public PacoteDTO criar(PacoteDTO pacote){
      if(pacote.getCodigoLon() == null){
          pacote.setCodigoLon("LON" + System.currentTimeMillis());
      }
      pacote.setStatusAtual("Criado");
      dao.inserir(pacote);
      return pacote;
  }
  
  public void atualizarStatus(Long id, String novoStatus){
      dao.atualizarStatus(id, novoStatus);
  }
  
  
}
/*

-- Login POST
insert into tabela(1,2,3,4) values ("1","2","3", "4");
INSERT INTO editais (titulo, descricao, data_fechamento, status) VALUES (?,?,?,?)

-- listar encomendasds GET
SELECT * from tabela;

-- SELECT por id especfico 
SELECT * FROM editais WHERE id = ?;

-- Deletar
DELETE FROM ferramenta WHERE id = ? 

*/