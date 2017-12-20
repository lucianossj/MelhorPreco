package view;

import datastructures.BinarySearchTree;
import datastructures.DuplicateKeyException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Establishment;
import model.Product;

public class SearchBestPrice extends javax.swing.JDialog {

    public SearchBestPrice(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bestPrice = new javax.swing.JLabel();
        prod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        back = new javax.swing.JButton();
        painelTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        searchBestPrice = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MelhorPreço");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        bestPrice.setBackground(new java.awt.Color(130, 227, 153));
        bestPrice.setFont(new java.awt.Font("Caladea", 1, 18)); // NOI18N

        prod.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel2.setText("Pesquisar Melhor Preço");

        back.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        back.setText("Voltar");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estabelecimento", "Produto", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout painelTabelaLayout = new javax.swing.GroupLayout(painelTabela);
        painelTabela.setLayout(painelTabelaLayout);
        painelTabelaLayout.setHorizontalGroup(
            painelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
        );
        painelTabelaLayout.setVerticalGroup(
            painelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        searchBestPrice.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        searchBestPrice.setText("Pesquisar Melhor Preço!!!");
        searchBestPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBestPriceActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel4.setText("Pesquisar Produto:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prod))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(back, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchBestPrice, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(bestPrice))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addComponent(prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchBestPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bestPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back)
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

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed

        this.dispose();

    }//GEN-LAST:event_backActionPerformed

    private void searchBestPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBestPriceActionPerformed

        String requiredProduct = prod.getText();

        ArrayList<Product> arrayProds = new ArrayList();

        for (Iterator<Product> it = controller.Main.products.iterator(); it.hasNext();) {

            Product p = it.next();

            if (p.getProductName().contains(requiredProduct)) {

                arrayProds.add(p);

            }

        }

        ArrayList<Product> arrayProds2 = new ArrayList();

        for (int i = 0; i < arrayProds.size(); i++) {

            for (int j = 0; j < arrayProds2.size(); j++) {

                if (arrayProds.get(i).getPrice() == arrayProds2.get(j).getPrice()) {

                    String estabs = arrayProds.get(i).getEstablishment().getEstablishment() + " - " + arrayProds.get(i).getEstablishment().getEstablishment();
                    Establishment ests = new Establishment();
                    ests.setEstablishment(estabs);

                    Product finalProduct = new Product();

                    finalProduct.setEstablishment(ests);
                    finalProduct.setProductName(arrayProds.get(i).getProductName());
                    finalProduct.setPrice(arrayProds.get(i).getPrice());

                    arrayProds2.add(finalProduct);

                } else {

                    arrayProds2.add(arrayProds.get(i));

                }

            }

        }

        BinarySearchTree bst = new BinarySearchTree();

        for (int i = 0; i < arrayProds.size(); i++) {

            try {

                bst.insert(arrayProds.get(i).getPrice());

            } catch (DuplicateKeyException ex) {
                Logger.getLogger(MainGraphicInterface.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        ArrayList<Double> bestPriceRanking = bst.allDataArray(bst.getRaiz());

        for (int i = 0; i < bestPriceRanking.size(); i++) {

            DefaultTableModel dtm = (DefaultTableModel) table.getModel();

            for (int j = 0; j < arrayProds.size(); j++) {

                if (bestPriceRanking.get(i) == arrayProds.get(j).getPrice()) {

                    double priceDouble = arrayProds.get(j).getPrice();
                    String priceString = new DecimalFormat("0.00").format(priceDouble);

                    String est = arrayProds.get(j).getEstablishment().getEstablishment();
                    String pro = arrayProds.get(j).getProductName();
                    String pri = priceString;

                    dtm.addRow(new Object[]{est, pro, "R$ " + pri});

                    if (i == 0) {

                        double bestPriceDouble = arrayProds.get(j).getPrice();
                        String bestPriceString = new DecimalFormat("0.00").format(bestPriceDouble);

                        bestPrice.setText(arrayProds.get(j).getEstablishment().getEstablishment() + " - " + arrayProds.get(j).getProductName() + " - R$ " + bestPriceString);

                    }

                }

            }

        }

        searchBestPrice.setEnabled(false);
        prod.setEnabled(false);
        
    }//GEN-LAST:event_searchBestPriceActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel bestPrice;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel painelTabela;
    private javax.swing.JTextField prod;
    private javax.swing.JButton searchBestPrice;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
