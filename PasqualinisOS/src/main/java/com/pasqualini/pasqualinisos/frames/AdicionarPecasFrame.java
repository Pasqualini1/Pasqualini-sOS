
package com.pasqualini.pasqualinisos.frames;

import com.pasqualini.pasqualinisos.frames.Model.Clientes;
import com.pasqualini.pasqualinisos.frames.Model.Pecas;
import com.pasqualini.pasqualinisos.frames.Model.Servicos;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AdicionarPecasFrame extends javax.swing.JFrame {
    
    private ArrayList<Pecas> listaPecas = new ArrayList<>();
    private Clientes clienteAtual;
    private MenuPrincipalFrame menuPrincipal;
    

    public AdicionarPecasFrame(MenuPrincipalFrame menuPrincipal, 
                                            Clientes clienteAtual) {
        initComponents();
        setTitle("Pasqualini's Mecanica - Adicionar Peça");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        this.clienteAtual = clienteAtual;
        this.listaPecas = listaPecas;
        this.menuPrincipal = menuPrincipal;
        
        permitirApenasNumeros(tfQntdPecas);
    }
    
    
    private void permitirApenasNumeros(JTextField campo) {
    campo.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (!Character.isDigit(c)) {
                e.consume(); 
            }
        }
    });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNomePeca = new javax.swing.JTextField();
        tfQntdPecas = new javax.swing.JTextField();
        tfValorUnitarioPecas = new javax.swing.JTextField();
        btAdicionarPecas = new javax.swing.JButton();
        btSalvarPecas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pasqualini's Mecanica - Adicionar Peças", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 11), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome da Peça:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Qntd.:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Vlr. Unitario:");

        btAdicionarPecas.setBackground(new java.awt.Color(0, 0, 153));
        btAdicionarPecas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btAdicionarPecas.setForeground(new java.awt.Color(255, 255, 255));
        btAdicionarPecas.setText("Adicionar");
        btAdicionarPecas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btAdicionarPecas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAdicionarPecas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAdicionarPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarPecasActionPerformed(evt);
            }
        });

        btSalvarPecas.setBackground(new java.awt.Color(0, 0, 153));
        btSalvarPecas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btSalvarPecas.setForeground(new java.awt.Color(255, 255, 255));
        btSalvarPecas.setText("Salvar");
        btSalvarPecas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btSalvarPecas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvarPecas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvarPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarPecasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(tfNomePeca, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(tfQntdPecas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(tfValorUnitarioPecas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btAdicionarPecas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(btSalvarPecas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNomePeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfQntdPecas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfValorUnitarioPecas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdicionarPecas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvarPecas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
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

    private void btAdicionarPecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarPecasActionPerformed
        
        String nomePeca = tfNomePeca.getText().trim();
        String quantidadeStr = tfQntdPecas.getText().trim();
        String valorStr = tfValorUnitarioPecas.getText().trim();

        if (nomePeca.isEmpty() || 
                quantidadeStr.isEmpty() || 
                valorStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha Todos os Campos!", 
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int quantidade = Integer.parseInt(quantidadeStr);
        double valorUnitario = Double.parseDouble(
                tfValorUnitarioPecas.getText().replace(",", "."));

        Pecas novaPeca = new Pecas(nomePeca, quantidade, valorUnitario);
        listaPecas.add(novaPeca);

        tfNomePeca.setText("");
        tfQntdPecas.setText("");
        tfValorUnitarioPecas.setText("");

        JOptionPane.showMessageDialog(this, "Peça Adicionada com Sucesso!", 
                "Sucesso", JOptionPane.INFORMATION_MESSAGE);
   
    }//GEN-LAST:event_btAdicionarPecasActionPerformed

    private void btSalvarPecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarPecasActionPerformed
   
    ArrayList<Servicos> listaServicos = new ArrayList<>(); 

    OrdemServicoFrame ordemFrame = new OrdemServicoFrame(
            menuPrincipal, clienteAtual, listaPecas, listaServicos);
    
    this.dispose();
    
    ordemFrame.setVisible(true);
    }//GEN-LAST:event_btSalvarPecasActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarPecas;
    private javax.swing.JButton btSalvarPecas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfNomePeca;
    private javax.swing.JTextField tfQntdPecas;
    private javax.swing.JTextField tfValorUnitarioPecas;
    // End of variables declaration//GEN-END:variables
}
