
package com.pasqualini.pasqualinisos.frames.Model;

public class Pecas {
    private String nome;
    private int quantidade;
    private double valorUnitario;

    public Pecas(String nome, 
            int quantidade, 
            double valorUnitario) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public double getValorTotal() {
        return quantidade * valorUnitario;
    }
} 
