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
public class StatusHistoricoDTO {
     
    private Long id;
    private Long idPacote;
    private String status;
    private Date dataHora;
    private String descObserv;
    private Long idUsuario;

    public StatusHistoricoDTO() {
    }

    public StatusHistoricoDTO(Long id, Long idPacote, String status, Date dataHora, String descObserv, Long idUsuario) {
        this.id = id;
        this.idPacote = idPacote;
        this.status = status;
        this.dataHora = dataHora;
        this.descObserv = descObserv;
        this.idUsuario = idUsuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPacote() {
        return idPacote;
    }

    public void setIdPacote(Long idPacote) {
        this.idPacote = idPacote;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getDescObserv() {
        return descObserv;
    }

    public void setDescObserv(String descObserv) {
        this.descObserv = descObserv;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
    
}
