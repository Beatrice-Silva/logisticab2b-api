/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.logistica.api.repository;
import com.logistica.api.model.StatusHistoricoDTO;
import org.springframework.stereotype.Repository;
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
public class StatusHistoricoDAO {
    
public int salvarHistorico(StatusHistoricoDTO h){
    int linhas = 0;
    try{
        Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(
            "INSERT INTO status_historico(id_pacote,status,data_hora,desc_observ,id_usuario) VALUES(?,?,?,?,?)");
        stmt.setLong(1, h.getIdPacote());
        stmt.setString(2, h.getStatus());
        // usa Timestamp porque seu DATETIME entende
        stmt.setTimestamp(3, new java.sql.Timestamp(System.currentTimeMillis()));
        stmt.setString(4, h.getDescObserv());
        stmt.setLong(5, h.getIdUsuario());
        linhas = stmt.executeUpdate();
    }catch(SQLException e){ e.printStackTrace(); }
    return linhas;
}

public List<StatusHistoricoDTO> listarPorPacote(long idPacote){
    List<StatusHistoricoDTO> lista = new ArrayList();
    try{
        Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(
            "SELECT * FROM status_historico WHERE id_pacote = ? ORDER BY data_hora");
        stmt.setLong(1, idPacote);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            StatusHistoricoDTO h = new StatusHistoricoDTO();
            h.setId(rs.getLong("id"));
            h.setIdPacote(rs.getLong("id_pacote"));
            h.setStatus(rs.getString("status"));
            h.setDataHora(rs.getDate("data_hora"));
            h.setDescObserv(rs.getString("desc_observ"));
            h.setIdUsuario(rs.getLong("id_usuario"));
            lista.add(h);
        }
    }catch(SQLException e){ e.printStackTrace(); }
    return lista;
}
    
}
