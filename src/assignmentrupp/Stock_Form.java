/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentrupp;

import java.awt.Dialog.ModalityType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Stock_Form extends javax.swing.JFrame {

    /**
     * Creates new form Stock_Form
     */
    public Stock_Form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        checkTable = new SubJTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(234, 126, 33));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 51, 0), 5));
        jPanel2.setPreferredSize(new java.awt.Dimension(840, 620));

        jButton7.setBackground(new java.awt.Color(255, 154, 60));
        jButton7.setText("back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 51, 0), 5));

        checkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Product Name", "Category", "Unit Price", "Qty"
            }
        ));
        checkTable.setRowHeight(24);
        jScrollPane2.setViewportView(checkTable);
        if (checkTable.getColumnModel().getColumnCount() > 0) {
            checkTable.getColumnModel().getColumn(0).setMaxWidth(90);
            checkTable.getColumnModel().getColumn(1).setMaxWidth(223);
            checkTable.getColumnModel().getColumn(2).setMaxWidth(90);
            checkTable.getColumnModel().getColumn(3).setMaxWidth(90);
            checkTable.getColumnModel().getColumn(4).setMaxWidth(90);
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
        );

        jButton4.setBackground(new java.awt.Color(255, 154, 60));
        jButton4.setFont(new java.awt.Font("Georgia", 2, 18)); // NOI18N
        jButton4.setText("Add Stock");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 154, 60));
        jButton5.setFont(new java.awt.Font("Georgia", 2, 18)); // NOI18N
        jButton5.setText("Delete Stock");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 154, 60));
        jButton8.setFont(new java.awt.Font("Georgia", 2, 18)); // NOI18N
        jButton8.setText("Update Stock");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 154, 60));
        jButton9.setText("refresh");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Main_Form().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new AddStock_Form(null, true,mod).show();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(checkTable.getSelectedRow() != -1){
            int click = JOptionPane.showConfirmDialog(this, "Are you sure want to delete this item?","Comfirm to delete",JOptionPane.YES_NO_OPTION);
            if(click== JOptionPane.YES_OPTION){
             try {
                int index[] = checkTable.getSelectedRows();
                long id[] = new long[index.length];
                for(int i =0 ; i<id.length;i++){
                    id[i] = Long.valueOf(""+mod.getValueAt(index[i],0));
                }
                Statement s = DatabaseConnection.DataCon.getCon().createStatement();
                for(int i=0;i<id.length;i++){
                    s.execute("delete from product where id ="+id[i]+";");
                    mod.removeRow(index[i]);
                }
                s.close();

            } catch (SQLException ex) {
                Logger.getLogger(Stock_Form.class.getName()).log(Level.SEVERE, null, ex);
            }   
            }
        }else{
            JOptionPane.showMessageDialog(this, "You Must Select Row to delete");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            // TODO add your handling code here:
            mod=new TableModify();
            mod.addColumn("ID");
            mod.addColumn("ProductName");
            mod.addColumn("Category");
            mod.addColumn("UnitPrice");
            mod.addColumn("Qty");
            checkTable.setModel(mod);
            checkTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            checkTable.getColumnModel().getColumn(0).setPreferredWidth(90);
            checkTable.getColumnModel().getColumn(1).setPreferredWidth(223);
            checkTable.getColumnModel().getColumn(2).setPreferredWidth(90);
            checkTable.getColumnModel().getColumn(3).setPreferredWidth(90);
            checkTable.getColumnModel().getColumn(4).setMaxWidth(100);
            
            Statement s = DatabaseConnection.DataCon.getCon().createStatement();
            ResultSet rs = s.executeQuery("select * from product as p inner join category as c on p.cate_id=c.id order by p.id");
            if (rs.first()) {
//                int id= 1;
                do {                    
                    DefaultTableModel model= (DefaultTableModel)checkTable.getModel();
                    String id= rs.getString(1);
                    String productName= rs.getString(2);
                    String category = rs.getString("category_name");
                    String price = "$"+rs.getString(4);
                    String qty = rs.getString(5);
                    String result[] = {id+"",productName,category,price,qty};
                    model.addRow(result);
//                    id++;
                } while (rs.next());
            }
            s.close();
            rs.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Stock_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        
        if(checkTable.getSelectedRow() != -1){
            long id= Long.valueOf(""+mod.getValueAt(checkTable.getSelectedRow(),0));
            new Update_Form(this,true,id,mod,checkTable.getSelectedRow()).show();
        }else{
            JOptionPane.showMessageDialog(this, "You must select 1 record to update");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            mod=new TableModify();
            mod.addColumn("ID");
            mod.addColumn("ProductName");
            mod.addColumn("Category");
            mod.addColumn("UnitPrice");
            mod.addColumn("Qty");
            checkTable.setModel(mod);
            checkTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            checkTable.getColumnModel().getColumn(0).setPreferredWidth(90);
            checkTable.getColumnModel().getColumn(1).setPreferredWidth(223);
            checkTable.getColumnModel().getColumn(2).setPreferredWidth(90);
            checkTable.getColumnModel().getColumn(3).setPreferredWidth(90);
            checkTable.getColumnModel().getColumn(4).setMaxWidth(100);

            Statement s = DatabaseConnection.DataCon.getCon().createStatement();
            ResultSet rs = s.executeQuery("select * from product as p inner join category as c on p.cate_id=c.id order by p.id");
            if (rs.first()) {
                //                int id= 1;
                do {
                    DefaultTableModel model= (DefaultTableModel)checkTable.getModel();
                    String id= rs.getString(1);
                    String productName= rs.getString(2);
                    String category = rs.getString("category_name");
                    String price = "$"+rs.getString(4);
                    String qty = rs.getString(5);
                    String result[] = {id+"",productName,category,price,qty};
                    model.addRow(result);
                    //                    id++;
                } while (rs.next());
            }
            s.close();
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(Stock_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton9ActionPerformed
    TableModify mod;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Stock_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable checkTable;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
