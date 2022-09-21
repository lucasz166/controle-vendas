package com.api.controlevendas.dtos;
import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

public class ControleVendasDto {

    @NotBlank
    private String nome;
    @NotBlank
    private String categoria;
    private String precoCusto;
    @NotBlank
    private String precoVenda;
    @NotBlank
    private String estoqueAtual;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(String precoCusto) {
        this.precoCusto = precoCusto;
    }

    public String getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(String precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getEstoqueAtual() {
        return estoqueAtual;
    }

    public void setEstoqueAtual(String estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }
}
