
package com.pasqualini.pasqualinisos.frames;

import com.pasqualini.pasqualinisos.frames.Model.Clientes;
import com.pasqualini.pasqualinisos.frames.Model.Servicos;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AdicionarServicoFrame extends javax.swing.JFrame {
    private Clientes clienteAtual;  

    public AdicionarServicoFrame(Clientes clienteAtual)  {
        initComponents();
        setTitle("Pasqualini's Mecanica - Adicionar Serviço");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        this.clienteAtual = clienteAtual;  
    }
    
    public Servicos obterDadosServico() {
        
    String pedido = 
            tfPedidoCliente.getText().trim();  
    String servicosRealizados = 
            tfServicosRealizadosCliente.getText().trim();
    String valorString = 
            tfVlrServico.getText().trim();

    if (pedido.isEmpty() || 
            servicosRealizados.isEmpty() || 
            valorString.isEmpty()) {
        JOptionPane.showMessageDialog(this, 
                "Preencha todos os campos", 
                "Erro", JOptionPane.ERROR_MESSAGE);
        return null;
    }

    double valorServico = 0.0;
    try {
        valorServico = Double.parseDouble(valorString.replace(",", "."));
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, 
                "Valor do Serviço Inválido", 
                "Erro", JOptionPane.ERROR_MESSAGE);
        return null;
    }

    return new Servicos(pedido, servicosRealizados, valorServico);
    }       

    
    public String getPedidoCliente() {
        return tfPedidoCliente.getText();
    }

    public String getServicosRealizados() {
        return tfServicosRealizadosCliente.getText();
    }

    public String getValorServico() {
        return tfVlrServico.getText().trim();
    }
    
    public JTextField getTfVlrServico() {
    return tfVlrServico;
    }   
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfServicosRealizadosCliente = new javax.swing.JTextField();
        btSalvarServico = new javax.swing.JButton();
        tfPedidoCliente = new javax.swing.JTextField();
        tfVlrServico = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pasqualini's Mecanica - Adicionar Serviço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 11), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pedido do Cliente:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Serviços a Serem Realizados:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Valor do Serviço $:");

        btSalvarServico.setBackground(new java.awt.Color(0, 0, 153));
        btSalvarServico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btSalvarServico.setForeground(new java.awt.Color(255, 255, 255));
        btSalvarServico.setText("Salvar");
        btSalvarServico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btSalvarServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarServicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(tfServicosRealizadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addComponent(tfPedidoCliente))
                    .addComponent(tfVlrServico, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPedidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfServicosRealizadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfVlrServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btSalvarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
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

    private void btSalvarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarServicoActionPerformed
    
    if (tfPedidoCliente.getText().trim().isEmpty() ||
        tfServicosRealizadosCliente.getText().trim().isEmpty() ||
        tfVlrServico.getText().trim().isEmpty()) {
        
        JOptionPane.showMessageDialog(this, 
            "Preencha Todos os Campos do Serviço.", 
            "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    double valorServico;
    try {
        valorServico = Double.parseDouble(
            tfVlrServico.getText().trim().replace(",", ".")
        );
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, 
            "Digite um valor válido para a mão de obra (ex: 150,50)",
            "Erro", JOptionPane.ERROR_MESSAGE);
        return; 
    }

    if (clienteAtual == null) {
        JOptionPane.showMessageDialog(this, 
            "Nenhum Cliente Selecionado!", 
            "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Servicos servico = new Servicos(
        tfPedidoCliente.getText().trim(),
        tfServicosRealizadosCliente.getText().trim(),
        valorServico
    );
    
    clienteAtual.addServico(servico); 
    JOptionPane.showMessageDialog(this, 
        "Serviço Adicionado com Sucesso!", 
        "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    
    tfPedidoCliente.setText("");
    tfServicosRealizadosCliente.setText("");
    tfVlrServico.setText("");
    
    this.dispose();
    }//GEN-LAST:event_btSalvarServicoActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvarServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfPedidoCliente;
    private javax.swing.JTextField tfServicosRealizadosCliente;
    private javax.swing.JTextField tfVlrServico;
    // End of variables declaration//GEN-END:variables
}
