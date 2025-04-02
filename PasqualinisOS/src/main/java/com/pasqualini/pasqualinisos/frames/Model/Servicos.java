
package com.pasqualini.pasqualinisos.frames.Model;

public class Servicos {
    private String pedidoCliente;
    private String servicosRealizados;
    private double valorServico;

    public Servicos(String pedidoCliente, 
            String servicosRealizados, 
            double valorServico) {
        this.pedidoCliente = pedidoCliente;
        this.servicosRealizados = servicosRealizados;
        this.valorServico = valorServico;
    }

    public String getPedidoCliente() {
        return pedidoCliente;
    }

    public void setPedidoCliente(String pedidoCliente) {
        this.pedidoCliente = pedidoCliente;
    }

    public String getServicosRealizados() {
        return servicosRealizados;
    }

    public void setServicosRealizados(String servicosRealizados) {
        this.servicosRealizados = servicosRealizados;
    }

    public double getValorServico() {
        return valorServico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }
}