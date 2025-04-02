
package com.pasqualini.pasqualinisos.frames.Model;

import java.util.ArrayList;
import java.util.List;

public class OrdemDeServico {
    private Clientes cliente;
    private List<Pecas> pecas;
    private List<Servicos> servicos;
    private double valorTotal;
    private String pedidoCliente;

    public OrdemDeServico(Clientes cliente, 
            List<Pecas> pecas, 
            List<Servicos> servicos, 
            String pedidoCliente, double valorTotal) {
        this.cliente = cliente;
        this.pecas = pecas;
        this.servicos = servicos;
        this.pedidoCliente = pedidoCliente;
        this.valorTotal = valorTotal;  
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }
    
    public String getPedidoCliente() {
        return pedidoCliente;
    }
    
    public void setPedidoCliente(String pedidoCliente) {
        this.pedidoCliente = pedidoCliente;
    }

    public List<Pecas> getPecas() {
        return pecas;
    }

    public void setPecas(List<Pecas> pecas) {
        this.pecas = pecas;
    }

    public List<Servicos> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servicos> servicos) {
        this.servicos = servicos;
    }

    public double getValorTotal() {
        return valorTotal;
    }
    
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    private double calcularValorTotal() {
        double total = 0;
        for (Pecas peca : pecas) {
            total += peca.getValorUnitario() * peca.getQuantidade();
        }
        for (Servicos servico : servicos) {
            total += servico.getValorServico();
        }
        return total;
    }
}
