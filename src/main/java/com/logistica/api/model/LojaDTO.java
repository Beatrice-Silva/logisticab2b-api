/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.logistica.api.model;

import java.sql.Date;

/**
 *
 * @author BEATRICE
 */
public class LojaDTO {
    
    private Long id;
    private String nome_Estabelecimento;
    private String cnpj;
    private Long id_Usuario; 
    private String email;
    private String cidade;
    private String endereco;

    public LojaDTO() {
    }

    public LojaDTO(Long id, String nome_Estabelecimento, String cnpj, Long id_Usuario, String email, String cidade, String endereco) {
        this.id = id;
        this.nome_Estabelecimento = nome_Estabelecimento;
        this.cnpj = cnpj;
        this.id_Usuario = id_Usuario;
        this.email = email;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome_Estabelecimento() {
        return nome_Estabelecimento;
    }

    public void setNome_Estabelecimento(String nome_Estabelecimento) {
        this.nome_Estabelecimento = nome_Estabelecimento;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Long getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(Long id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
                    
         

    
}
