
package view;

import controller.Main;
import java.util.Iterator;
import javax.swing.JOptionPane;
import model.Category;
import model.Establishment;
import model.Product;

public class UpdateProduct extends javax.swing.JDialog {

    public UpdateProduct(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        cat.setEnabled(false);
        okCat.setEnabled(false);
        prod.setEnabled(false);
        registerProd.setEnabled(false);
        price.setEnabled(false);
        updateProd.setEnabled(false);
        
        est.addItem("Selecione...");
        
        for (Iterator<Establishment> it = controller.Main.establishments.iterator(); it.hasNext();) {
            
            Establishment es = it.next();
            
            est.addItem(es.getEstablishment());
            
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        updateProd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        est = new javax.swing.JComboBox<>();
        okEst = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        cat = new javax.swing.JComboBox<>();
        okCat = new javax.swing.JButton();
        prod = new javax.swing.JComboBox<>();
        registerProd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        okProd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MelhorPreço");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel1.setText("Produto:");

        updateProd.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        updateProd.setText("Atualizar Preço do Produto");
        updateProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel2.setText("Atualizar Produto");

        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel3.setText("Categoria:");

        jButton2.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel4.setText("Estabelecimento:");

        est.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        okEst.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        okEst.setText("Ok");
        okEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okEstActionPerformed(evt);
            }
        });

        cat.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        okCat.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        okCat.setText("Ok");
        okCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okCatActionPerformed(evt);
            }
        });

        prod.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        registerProd.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        registerProd.setText("Cadastrar Produto");
        registerProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerProdActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel5.setText("Preço:");

        price.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        price.setText("R$ 00,00");

        okProd.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        okProd.setText("Ok");
        okProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(jSeparator4)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(est, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(okEst))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(updateProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prod, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(okProd))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(62, 62, 62)
                                .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(okCat))
                            .addComponent(registerProd, javax.swing.GroupLayout.Alignment.TRAILING))))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(est, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(okEst))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okCat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okProd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateProd)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void okEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okEstActionPerformed

        est.setEnabled(false);
        
        cat.setEnabled(true);
        okCat.setEnabled(true);
        
        cat.addItem("Selecione...");
        
        for (Iterator<Category> it = controller.Main.categories.iterator(); it.hasNext();) {
            
            Category ca = it.next();
            
            cat.addItem(ca.getCategory());
            
        }
        
    }//GEN-LAST:event_okEstActionPerformed

    private void okCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okCatActionPerformed

        cat.setEnabled(false);
        
        prod.setEnabled(true);
        registerProd.setEnabled(true);
        
        prod.addItem("Selecione...");
        
        for (Iterator<Product> it = controller.Main.products.iterator(); it.hasNext();) {
            
            Product product = it.next();
            
            if(product.getEstablishment().getEstablishment().equals(est.getSelectedItem())){
            
                prod.addItem(product.getProductName());
                
            }
            
        }
        
    }//GEN-LAST:event_okCatActionPerformed

    private void registerProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerProdActionPerformed
        
        RegisterProduct registerProd = new RegisterProduct(null, true);
        
        this.dispose();
        
        registerProd.setVisible(true);
        
    }//GEN-LAST:event_registerProdActionPerformed

    private void okProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okProdActionPerformed
        
        price.setEnabled(true);
        updateProd.setEnabled(true);
        
        for (Iterator<Product> it = controller.Main.products.iterator(); it.hasNext();) {
            
            Product product = it.next();
            
            if(product.getProductName().equals(prod.getSelectedItem()) && product.getEstablishment().getEstablishment().equals(est.getSelectedItem().toString())){
            
                price.setText(Double.toString(product.getPrice()));
                
            }
        
        }
        
    }//GEN-LAST:event_okProdActionPerformed

    private void updateProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProdActionPerformed

        for (Iterator<Product> it = controller.Main.products.iterator(); it.hasNext();) {
            
            Product product = it.next();
            
            if(product.getProductName().equals(prod.getSelectedItem()) && product.getEstablishment().getEstablishment().equals(est.getSelectedItem().toString())){
            
                product.setPrice(Double.parseDouble(price.getText()));
                
            }
        
        }
        
        JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!!!\nObrigado pela colaboração!!!", "PRODUTO ATUALIZADO", JOptionPane.INFORMATION_MESSAGE);
        
        this.dispose();
        
    }//GEN-LAST:event_updateProdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cat;
    private javax.swing.JComboBox<String> est;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton okCat;
    private javax.swing.JButton okEst;
    private javax.swing.JButton okProd;
    private javax.swing.JTextField price;
    private javax.swing.JComboBox<String> prod;
    private javax.swing.JButton registerProd;
    private javax.swing.JButton updateProd;
    // End of variables declaration//GEN-END:variables
}

