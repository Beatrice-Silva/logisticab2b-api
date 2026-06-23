/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.logistica.api.repository;
import com.logistica.api.model.PacoteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
/**
 *
 * @author BEATRICE
 */

@Repository
public class PacoteDAO {
    
    public int inserir(PacoteDTO pacote){
    int linhas = 0;
    try{
        Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(
            "INSERT INTO pacotes(codigo_lon,id_loja,endereco,status_atual,peso,desc_observ) VALUES(?,?,?,?,?,?)");
        
        stmt.setString(1, pacote.getCodigo_Lon());
        stmt.setLong(2, pacote.getId_Loja());
        stmt.setString(3, pacote.getEndereco());
        stmt.setString(4, pacote.getStatus_atual());
        stmt.setDouble(5, pacote.getPeso());
        stmt.setString(6, pacote.getObservacao());
        
        linhas = stmt.executeUpdate();
    }catch(SQLException e){ e.printStackTrace(); }
    return linhas;
}

public List<PacoteDTO> listarPacotes(){
    List<PacoteDTO> lista = new ArrayList();
    try{
        Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM pacotes");
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            PacoteDTO pacote = new PacoteDTO();
            pacote.setId(rs.getLong("id"));
            pacote.setCodigo_Lon(rs.getString("codigo_lon"));
            pacote.setId_Loja(rs.getLong("id_loja"));
            pacote.setEndereco(rs.getString("endereco"));
            pacote.setStatus_atual(rs.getString("status_atual"));
            pacote.setPeso(rs.getDouble("peso"));
            pacote.setObservacao(rs.getString("desc_observ"));
            lista.add(pacote);
        }
    }catch(SQLException e){
        e.printStackTrace(); 
    }
    return lista;
}

public PacoteDTO buscarPorCodigo(String codigo){//funcao para usuario e entregador
    PacoteDTO pacote = null;
    try{
        Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM pacotes WHERE codigo_lon = ?");
        stmt.setString(1, codigo);
        ResultSet rs = stmt.executeQuery();
        
        if(rs.next()){
            pacote = new PacoteDTO();
            
            pacote.setId(rs.getLong("id"));
            pacote.setCodigo_Lon(rs.getString("codigo_lon"));
            pacote.setId_Loja(rs.getLong("id_loja"));
            pacote.setEndereco(rs.getString("endereco"));
            pacote.setStatus_atual(rs.getString("status_atual"));
            pacote.setPeso(rs.getDouble("peso"));
            pacote.setObservacao(rs.getString("desc_observ"));
            
        }
        
        
    }catch(SQLException e){
    e.printStackTrace();
    }
    return pacote;//editar para linhas afetadas...
    
}

}
