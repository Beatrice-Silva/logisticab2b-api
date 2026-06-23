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
public class PacoteDTO {
    
    private Long id;
    private String codigo_Lon;
      private String otp_Codigo;
    private Date otp_Expira;
    private Long id_Loja;
    private String endereco;
    private String status_atual;
    private Double peso;
    private String observacao;

    public PacoteDTO() {
    }

    public PacoteDTO(Long id, String codigo_Lon, Long id_Loja, String endereco, String status_atual, Double peso, String observacao) {
        this.id = id;
        this.codigo_Lon = codigo_Lon;
        this.id_Loja = id_Loja;
        this.endereco = endereco;
        this.status_atual = status_atual;
        this.peso = peso;
        this.observacao = observacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo_Lon() {
        return codigo_Lon;
    }

    public void setCodigo_Lon(String codigo_Lon) {
        this.codigo_Lon = codigo_Lon;
    }

    public Long getId_Loja() {
        return id_Loja;
    }

    public void setId_Loja(Long id_Loja) {
        this.id_Loja = id_Loja;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getStatus_atual() {
        return status_atual;
    }

    public void setStatus_atual(String status_atual) {
        this.status_atual = status_atual;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    

     
}
