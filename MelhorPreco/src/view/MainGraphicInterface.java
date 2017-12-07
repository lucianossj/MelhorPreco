
package view;

public class MainGraphicInterface extends javax.swing.JDialog {

    public MainGraphicInterface(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        estabs = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        categs = new javax.swing.JButton();
        prods = new javax.swing.JButton();
        upProd = new javax.swing.JButton();
        searchMP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MelhorPreço");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        estabs.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        estabs.setText("Cadastrar Estabelecimento");
        estabs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estabsActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel2.setText("MelhorPreço 1.0");

        jButton2.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jButton2.setText("Sair");

        categs.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        categs.setText("Cadastrar Categoria");
        categs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categsActionPerformed(evt);
            }
        });

        prods.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        prods.setText("Cadastrar Produto");
        prods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodsActionPerformed(evt);
            }
        });

        upProd.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        upProd.setText("Atualizar Produto");
        upProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upProdActionPerformed(evt);
            }
        });

        searchMP.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        searchMP.setText("Pesquisar MELHOR PREÇO!!!");
        searchMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(estabs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prods, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(upProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchMP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estabs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prods)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(upProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchMP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void estabsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estabsActionPerformed

        RegisterEstablishment registerEstablishment = new RegisterEstablishment(null, true);
        registerEstablishment.setVisible(true);
        
    }//GEN-LAST:event_estabsActionPerformed

    private void categsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categsActionPerformed
        
        RegisterCategory registerCategory = new RegisterCategory(null, true);
        registerCategory.setVisible(true);
        
    }//GEN-LAST:event_categsActionPerformed

    private void prodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodsActionPerformed
        
        RegisterProduct registerProduct = new RegisterProduct(null, true);
        registerProduct.setVisible(true);
        
    }//GEN-LAST:event_prodsActionPerformed

    private void upProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upProdActionPerformed

        UpdateProduct updateProduct = new UpdateProduct(null, true);
        updateProduct.setVisible(true);
        
    }//GEN-LAST:event_upProdActionPerformed

    private void searchMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMPActionPerformed
        
        
        
    }//GEN-LAST:event_searchMPActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton categs;
    private javax.swing.JButton estabs;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton prods;
    private javax.swing.JButton searchMP;
    private javax.swing.JButton upProd;
    // End of variables declaration//GEN-END:variables
}
