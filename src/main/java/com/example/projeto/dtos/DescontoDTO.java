package com.example.projeto.dtos;

import java.time.LocalDateTime;

public class DescontoDTO {

    private Double valor;
    private String tipo;
    private LocalDateTime dataExpiracao;

    // Getters e Setters

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(LocalDateTime dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }
}
