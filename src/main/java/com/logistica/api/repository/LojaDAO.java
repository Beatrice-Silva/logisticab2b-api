/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.logistica.api.repository;

import com.logistica.api.model.LojaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BEATRICE
 */
public class LojaDAO {
    
    public int salvarLoja(LojaDTO loja){
    int linhas = 0;
    try{
        Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(
            "INSERT INTO lojas(nome_estabelecimento,cnpj,id_usuario,contato_email,cidade,endereco) VALUES(?,?,?,?,?,?)");
        stmt.setString(1, loja.getNome_Estabelecimento());
        stmt.setString(2, loja.getCnpj());
        stmt.setLong(3, loja.getId_Usuario());
        stmt.setString(4, loja.getEmail());
        stmt.setString(5, loja.getCidade());
        stmt.setString(6, loja.getEndereco());
        linhas = stmt.executeUpdate();
    }catch(SQLException e){ e.printStackTrace(); }
    return linhas;
}

public List<LojaDTO> listarLojas(){
    List<LojaDTO> lista = new ArrayList();
    try{
        Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM usuarios");
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            UsuarioDTO u = new UsuarioDTO();
            u.setId(rs.getLong("id"));
            u.setNome(rs.getString("nome"));
            u.setEmail(rs.getString("email"));
            u.setSenha(rs.getString("senha"));
            u.setPerfilrole(rs.getString("perfilrole"));
            lista.add(u);
        }
    }catch(SQLException e){ e.printStackTrace(); }
    return lista;
}

public int deletarUsuario(long id){
    int linhas = 0;
    try{
        Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement("DELETE FROM lojas WHERE id = ?");
        stmt.setLong(1, id);
        linhas = stmt.executeUpdate();
    }catch(SQLException e){ e.printStackTrace(); }
    return linhas;
}

public int atualizarUsuario(LojaDTO loja){
    int linhas = 0;
    try{
        Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(
            "UPDATE lojas SET=?, =?, =?, =? WHERE id=?");
        
        stmt.setString(1, loja.getNome_Estabelecimento());
        stmt.setString(2, loja.getCnpj());
        stmt.setLong(3, loja.getId_Usuario());
        stmt.setString(4, loja.getEmail());
        stmt.setString(5, loja.getCidade());
        stmt.setString(6, loja.getEndereco());
       
        
        linhas = stmt.executeUpdate();
    }catch(SQLException e){ e.printStackTrace(); }
    return linhas;
}
}
