
package com.pasqualini.pasqualinisos.frames;

import com.pasqualini.pasqualinisos.frames.Model.Clientes;
import com.pasqualini.pasqualinisos.frames.Model.OrdemDeServico;
import com.pasqualini.pasqualinisos.frames.Model.Pecas;
import com.pasqualini.pasqualinisos.frames.Model.Servicos;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class OrdemServicoFrame extends javax.swing.JFrame {
    
    private MenuPrincipalFrame menuPrincipal;
    private Clientes clienteAtual;
    private Clientes cliente;
    private ArrayList<Pecas> listaPecas;
    private ArrayList<Servicos> listaServicos;
    private JTextField tfPedidoCliente;
    private JTable tabelaOrdensServico;

   public OrdemServicoFrame(MenuPrincipalFrame menuPrincipal, 
                                Clientes clienteSelecionado,
                                ArrayList<Pecas> listaPecas, 
                                ArrayList<Servicos> listaServicos) {
        initComponents();
        setTitle("Pasqualini's Mecanica - Ordem de Serviço");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        this.menuPrincipal = menuPrincipal;
        this.clienteAtual = clienteSelecionado;
        this.listaPecas = listaPecas != 
                null ? listaPecas : new ArrayList<>();
        this.listaServicos = listaServicos != 
                null ? listaServicos : new ArrayList<>();
       
        preencherRelatorio();
        txOrdemDeServico.setLineWrap(true);  
        txOrdemDeServico.setWrapStyleWord(true);
        txOrdemDeServico.setEditable(false);

   }
    
    private void preencherRelatorio() {
    StringBuilder relatorio = new StringBuilder();

    if (this.clienteAtual != null) {
        relatorio.append("======== ORDEM DE SERVIÇO ========\n\n")
                 .append("Cliente: ").append(clienteAtual.getNome())
                 .append("\n")
                 .append("Carro: ").append(clienteAtual.getCarro())
                 .append(" - Placa: ").append(clienteAtual.getPlaca())
                 .append("\n\n");

        relatorio.append(">>> Pedido do Cliente:\n");
        for (Servicos servico : clienteAtual.getServicos()) {
            relatorio.append(" - ").append(servico.getPedidoCliente())
                      .append("\n");
        }

        relatorio.append("\n>>> Serviços Realizados:\n");
        for (Servicos servico : clienteAtual.getServicos()) {
            relatorio.append(String.format(
                    " - %s | Valor: R$ %.2f%n", 
                    servico.getServicosRealizados(), 
                    servico.getValorServico()));
        }

        relatorio.append("\n>>> Peças Utilizadas:\n");
        double totalPecas = 0;
        for (Pecas peca : listaPecas) {
            double subtotal = peca.getQuantidade() * peca.getValorUnitario();
            relatorio.append(String.format(
                    " - %s | Quantidade: %dx | Unitário: R$ %.2f | Total: R$ %.2f%n", 
                    peca.getNome(), 
                    peca.getQuantidade(), 
                    peca.getValorUnitario(), 
                    subtotal));
            totalPecas += subtotal;
        }

        double valorTotalServicos = clienteAtual.getValorTotalServicos();
        double valorTotal = valorTotalServicos + totalPecas;

        relatorio.append("\n>>> Resumo Financeiro:\n")
                 .append(String.format(" - Total Serviços: R$ %.2f%n", 
                         valorTotalServicos))
                 .append(String.format(" - Total Peças: R$ %.2f%n", 
                         totalPecas))
                 .append(String.format(" - VALOR FINAL: R$ %.2f%n", 
                         valorTotal))
                 .append("\n\n======== ORDEM DE SERVIÇO ========\n\n");

        txOrdemDeServico.setText(relatorio.toString());
    }
    }
                                             

    private void salvarOrdemServico() {
    if (menuPrincipal == null) {
        JOptionPane.showMessageDialog(this, 
            "Erro: O Menu Principal não foi inicializado.");
        return;
    }

    if (clienteAtual == null) {
        JOptionPane.showMessageDialog(this, 
            "Erro: Cliente não selecionado.");
        return;
    }

    if (tfPedidoCliente == null) {
        JOptionPane.showMessageDialog(this, 
            "Erro: Campo 'Pedido do Cliente' não foi inicializado.");
        return;
    }

    double valorTotal = listaPecas.stream()
        .mapToDouble(p -> p.getQuantidade() * p.getValorUnitario())
        .sum();

    OrdemDeServico ordem = new OrdemDeServico(
        clienteAtual, 
        listaPecas, 
        listaServicos, 
        tfPedidoCliente.getText().trim(), 
        valorTotal
    );
    
    if (menuPrincipal.tabelaMenuPrincipal != null) {
        DefaultTableModel model = 
                (DefaultTableModel) menuPrincipal
                        .tabelaMenuPrincipal.getModel();
        model.addRow(new Object[]{
            clienteAtual.getNome(),
            clienteAtual.getCarro(),
            tfPedidoCliente.getText().trim(),
            String.format("R$ %.2f", valorTotal)
        });
    } else {
        JOptionPane.showMessageDialog(this,
            "Erro: Tabela principal não encontrada!",
            "Erro", JOptionPane.ERROR_MESSAGE);
    }

    this.dispose();
    }

    private double calcularValorTotal() {
        return listaPecas.stream()
            .mapToDouble(p -> p.getQuantidade() * p.getValorUnitario())
            .sum();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txOrdemDeServico = new javax.swing.JTextArea();
        btSalvarOrdemServico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pasqualini's Mecanica - Ordem De Serviço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 11), new java.awt.Color(0, 0, 153))); // NOI18N

        txOrdemDeServico.setColumns(20);
        txOrdemDeServico.setRows(5);
        jScrollPane1.setViewportView(txOrdemDeServico);

        btSalvarOrdemServico.setBackground(new java.awt.Color(0, 0, 153));
        btSalvarOrdemServico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btSalvarOrdemServico.setForeground(new java.awt.Color(255, 255, 255));
        btSalvarOrdemServico.setText("Salvar");
        btSalvarOrdemServico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btSalvarOrdemServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvarOrdemServico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvarOrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarOrdemServicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvarOrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSalvarOrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarOrdemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarOrdemServicoActionPerformed

     try {
        double totalPecas = listaPecas.stream()
            .mapToDouble(p -> p.getQuantidade() * p.getValorUnitario())
            .sum();

        String pedido = (tfPedidoCliente != null) ? 
                tfPedidoCliente.getText().trim() : 
                "Sem descrição";

        DefaultTableModel model = (DefaultTableModel) 
                menuPrincipal.tabelaMenuPrincipal.getModel();
        
        model.addRow(new Object[]{
            clienteAtual.getNome(),
            clienteAtual.getCarro(),
            clienteAtual.getContato(),
            String.format("R$ %.2f", totalPecas) 
        });

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, 
            "Erro ao salvar: " + e.getMessage(), 
            "Erro", JOptionPane.ERROR_MESSAGE);
    }

    this.dispose();
    }//GEN-LAST:event_btSalvarOrdemServicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvarOrdemServico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txOrdemDeServico;
    // End of variables declaration//GEN-END:variables
}
