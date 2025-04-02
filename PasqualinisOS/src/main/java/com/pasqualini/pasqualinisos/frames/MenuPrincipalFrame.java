
package com.pasqualini.pasqualinisos.frames;

import com.pasqualini.pasqualinisos.frames.Model.Clientes;
import com.pasqualini.pasqualinisos.frames.Model.Pecas;
import com.pasqualini.pasqualinisos.frames.Model.Servicos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MenuPrincipalFrame extends javax.swing.JFrame {
    
    private List<Clientes> listaClientes = new ArrayList<>();
    private Clientes clienteAtual = null;
    private ArrayList<Pecas> listaPecas = new ArrayList<>();
    private ArrayList<Servicos> listaServicos = new ArrayList<>();
    
    public MenuPrincipalFrame() {
        initComponents();
        setTitle("Pasqualini's Mecanica - Menu Principal");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        
        tabelaMenuPrincipal.setDefaultEditor(Object.class, null);
        
        DefaultTableModel model = (DefaultTableModel) tabelaMenuPrincipal.getModel();
        model.setRowCount(0);
    }
    
     public boolean isCellEditable(int row, int column) {
        return false; 
    }
     
    
    public void setClienteAtual(Clientes clientes) {
        this.clienteAtual = clientes;
        
    }
    
    public JTable getTabelaMenuPrincipal() {
    return tabelaMenuPrincipal;
    }
    
    public void adicionarCliente(Clientes novoCliente) {
    if (novoCliente != null) {
        listaClientes.add(novoCliente);
        clienteAtual = novoCliente;
        System.out.println("Cliente adicionado: " + novoCliente.getNome());
        JOptionPane.showMessageDialog(this, 
            "Cliente Adicionado com Sucesso!", 
            "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, 
            "Preencha Todos os Campos Corretamente!", 
            "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }

    private void removerLinhasVazias(DefaultTableModel modelo) {
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            boolean linhaVazia = true;
            for (int j = 0; j < modelo.getColumnCount(); j++) {
                if (modelo.getValueAt(i, j) != null && !modelo.getValueAt(i, j).
                        toString().isEmpty()) {
                    linhaVazia = false;
                    break;
                }
            }

            if (linhaVazia) {
                modelo.removeRow(i);
            }
        }
    }
    
    public void atualizarTabelaClientes() {
        DefaultTableModel modelo = (DefaultTableModel) 
                tabelaMenuPrincipal.getModel();
        modelo.setRowCount(0);  
        
        for (Clientes cliente : listaClientes) {
            modelo.addRow(
                    new Object[]{
                        cliente.getNome(), 
                        cliente.getCarro(), 
                        cliente.getContato()});
        }
    }
    
    public void adicionarOrdemServicoNaTabela(String nome, 
                                            String carro, 
                                            String contato, 
                                            double valorTotal) {
        DefaultTableModel modelo = 
                (DefaultTableModel) tabelaMenuPrincipal.getModel();

            removerLinhasVazias(modelo);

        modelo.addRow(new Object[]{nome, carro, contato, valorTotal});
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btAdicionarCliente = new javax.swing.JButton();
        btAdicionarServico = new javax.swing.JButton();
        btAdicionarPecasMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMenuPrincipal = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pasqualini's Mecanica - Menu Principal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 11), new java.awt.Color(0, 0, 153))); // NOI18N

        btAdicionarCliente.setBackground(new java.awt.Color(0, 0, 153));
        btAdicionarCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btAdicionarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btAdicionarCliente.setText("+ Adicionar Cliente");
        btAdicionarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btAdicionarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAdicionarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAdicionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarClienteActionPerformed(evt);
            }
        });

        btAdicionarServico.setBackground(new java.awt.Color(0, 0, 153));
        btAdicionarServico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btAdicionarServico.setForeground(new java.awt.Color(255, 255, 255));
        btAdicionarServico.setText("+ Adicionar Serviço");
        btAdicionarServico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btAdicionarServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAdicionarServico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAdicionarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarServicoActionPerformed(evt);
            }
        });

        btAdicionarPecasMenu.setBackground(new java.awt.Color(0, 0, 153));
        btAdicionarPecasMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btAdicionarPecasMenu.setForeground(new java.awt.Color(255, 255, 255));
        btAdicionarPecasMenu.setText("+ Adicionar Peças ");
        btAdicionarPecasMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btAdicionarPecasMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAdicionarPecasMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAdicionarPecasMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarPecasMenuActionPerformed(evt);
            }
        });

        tabelaMenuPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cliente", "Carro", "Contato", "Valor"
            }
        ));
        jScrollPane1.setViewportView(tabelaMenuPrincipal);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(btAdicionarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(btAdicionarPecasMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdicionarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btAdicionarPecasMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btAdicionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarClienteActionPerformed
        
        AdicionarClientesFrame adicionarClienteFrame = 
                new AdicionarClientesFrame(this);
        adicionarClienteFrame.setVisible(true);
        
    }//GEN-LAST:event_btAdicionarClienteActionPerformed

    private void btAdicionarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarServicoActionPerformed
        
        if (clienteAtual == null) {
            JOptionPane.showMessageDialog(this, 
                    "Adicione um Cliente Primeiro!");
            return;
        }

        AdicionarServicoFrame adicionarServicoFrame = 
                new AdicionarServicoFrame(clienteAtual);
        adicionarServicoFrame.setVisible(true);
        
    }//GEN-LAST:event_btAdicionarServicoActionPerformed

    private void btAdicionarPecasMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarPecasMenuActionPerformed
        
    if (clienteAtual != null) {
        AdicionarPecasFrame adicionarPecasFrame = 
                new AdicionarPecasFrame(this, clienteAtual);
        adicionarPecasFrame.setVisible(true);
    } else {
        JOptionPane.showMessageDialog(this, 
                "Adicione um Cliente e um Serviço Primeiro.");
    }
    
    }//GEN-LAST:event_btAdicionarPecasMenuActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarCliente;
    private javax.swing.JButton btAdicionarPecasMenu;
    private javax.swing.JButton btAdicionarServico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tabelaMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
