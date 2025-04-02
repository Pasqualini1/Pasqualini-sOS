package com.pasqualini.pasqualinisos.frames.Model;

import java.util.ArrayList;
import java.util.List;

public class Clientes {
    private String nome;
    private String contato;
    private String endereco;
    private String numeroCasa;
    private String cep;
    private String carro;
    private String placa;
    private String marca;
    private String ano;
    private List<Servicos> servicos;
    private List<OrdemDeServico> ordensDeServico;
    private List<Pecas> pecas;

    
    public Clientes(String nome, 
            String contato, 
            String endereco, 
            String numeroCasa, 
            String cep, 
            String carro, 
            String placa, 
            String marca, 
            String ano) {
        this.nome = nome;
        this.contato = contato;
        this.endereco = endereco;
        this.numeroCasa = numeroCasa;
        this.cep = cep;
        this.carro = carro;
        this.placa = placa;
        this.marca = marca;
        this.ano = ano;
        this.servicos = new ArrayList<>();
        this.ordensDeServico = new ArrayList<>();
        this.pecas = new ArrayList<>();
        
    }
    
     public void adicionarOrdemDeServico(OrdemDeServico ordem) {
        this.ordensDeServico.add(ordem);  
    }

     public List<OrdemDeServico> getOrdensDeServico() {
        return ordensDeServico;
    }


     public List<Servicos> getServicos() {
        return servicos;
    }

    public void addServico(Servicos servico) {
        servicos.add(servico);
    }
    
    public void setPecas(List<Pecas> pecas) {
        this.pecas = pecas;
    }
    
     public List<Pecas> getPecas() {
        return pecas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
    public double getValorTotalServicos() {
        double total = 0;
        if (servicos != null) {
            for (Servicos servico : servicos) {
                total += servico.getValorServico();
            }
        }
        return total;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nContato: " + contato + "\nEndereço: " + endereco +
               ", " + numeroCasa + "\nCEP: " + cep + "\nCarro: " + marca + " " + carro +
               " (" + ano + ")\nPlaca: " + placa;
    }
}
