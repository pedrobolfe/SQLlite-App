package com.example.sqllite;

public class Pessoa {
    private String nome;
    private double imc;
    private String categoria;

    public Pessoa(String nome, double imc, String categoria) {
        this.nome = nome;
        this.imc = imc;
        this.categoria = categoria ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
