package airline;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Product extends javax.swing.JFrame {


    public Product() {
        initComponents();
//        m1();
    }
    Connection con;
    PreparedStatement pst;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        show = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        buy = new javax.swing.JButton();
        sell = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        clerar1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 73, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 111, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Unit Price");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 144, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Stock");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 182, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 70, 218, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 108, 218, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 141, 218, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 179, 218, -1));

        save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 282, 146, -1));

        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 313, 146, -1));

        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 282, 139, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "p_id", "p_namae", "u_price", "stock"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 11, -1, 253));

        show.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        show.setText("show");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        getContentPane().add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 313, 139, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("PRODUCT");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 11, -1, -1));

        buy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buy.setText("Buy");
        buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyActionPerformed(evt);
            }
        });
        getContentPane().add(buy, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 293, 452, 45));

        sell.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sell.setText("Sell");
        sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellActionPerformed(evt);
            }
        });
        getContentPane().add(sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 347, 452, -1));

        refresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refresh.setText("Refresh Table");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        getContentPane().add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 344, 139, 31));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 244, 218, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 213, 218, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Qty");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 216, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Total");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 247, -1, -1));

        clerar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clerar1.setText("clear");
        clerar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clerar1ActionPerformed(evt);
            }
        });
        getContentPane().add(clerar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 344, 146, 31));

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:

        
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abu_jafar", "root", "nclc123");
            pst = con.prepareStatement("insert into new_table values(?,?,?,?)");
            pst.setInt(1, Integer.valueOf(jTextField1.getText()));
            pst.setString(2, jTextField2.getText());
            pst.setString(3, jTextField3.getText());
            pst.setString(4, jTextField4.getText());

            int query = pst.executeUpdate();

            if (query > 0) {
                JOptionPane.showMessageDialog(this, "Added");

            } else {
                JOptionPane.showMessageDialog(this, "Added Faield");
            }
            con.close();

        } catch (Exception e) {
            e.getStackTrace();

        }
    }//GEN-LAST:event_saveActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try{
            
       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abu_jafar","root","nclc123");
       pst = con.prepareStatement("delete from new_table where p_id = ? ");
       pst.setInt(1, Integer.parseInt(jTextField1.getText()));
       int query = pst.executeUpdate();
     
      if(query>0){
      JOptionPane.showMessageDialog(this, "Delete");
     
      }
      else{
      JOptionPane.showMessageDialog(this, "Delete Faield");
      }
      con.close(); 
       }catch(Exception e){
            e.getStackTrace();
       
       }
        
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abu_jafar","root","nclc123");
            pst = con.prepareStatement("UPDATE new_table SET p_name = ? , u_price = ? , stock = ? WHERE p_id = ? ");
            pst.setInt(4, Integer.parseInt(jTextField1.getText()));
            pst.setString(1, jTextField2.getText());
            pst.setString(2, jTextField3.getText());
            pst.setString(3, jTextField4.getText());
            int query = pst.executeUpdate();

            if (query > 0) {
                JOptionPane.showMessageDialog(this, "Update");

            } else {
                JOptionPane.showMessageDialog(this, "Update Faield");
            }
            con.close();
            
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_updateActionPerformed

    
    void m1(){
    try {
        DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
        
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abu_jafar","root","nclc123");
        pst = con.prepareStatement("select * from new_table");
        ResultSet rs = pst.executeQuery();
       for (int i = tm.getRowCount()-1; i >=0; i--) {
       tm.removeRow(i);
       }
        while(rs.next()){
        Vector v = new Vector();
        
        v.add(rs.getInt(1));
        v.add(rs.getString(2));
        v.add(rs.getString(3));
        v.add(rs.getString(4));
        
        tm.addRow(v);
        }
        
        } catch (Exception e) {
        }
    }
    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        
          m1();
    }//GEN-LAST:event_showActionPerformed

    public void sell(){
        String s1 = jTextField1.getText();
            int i1 = Integer.parseInt(s1);
            String s2 = jTextField2.getText();
            String s3 = jTextField3.getText();
            int i2 = Integer.parseInt(s3);
            String s4 = jTextField4.getText();
            int i3 = Integer.parseInt(s4);
            String s5 = jTextField5.getText();
            int i4 = Integer.parseInt(s5);
            
            int i5 = i2*i4;
            
            String s6 = String.valueOf(i5);
            jTextField6.setText(s6);
            
           
        try{
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abu_jafar","root","nclc123");
            pst = con.prepareStatement("UPDATE new_table SET stock = ? WHERE p_id = ? " );
           
            pst.setInt(2, i1);
            pst.setString(1, String.valueOf(i3-i4));
           
            int query = pst.executeUpdate();

            if (query > 0) {
                JOptionPane.showMessageDialog(this, "Sell Sucessfull");

            } else {
                JOptionPane.showMessageDialog(this, "Try Again");
            }
            con.close();
           
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    private void sellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellActionPerformed
        // TODO add your handling code here:
        
        sell();    
    }//GEN-LAST:event_sellActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
         m1();
        
    }//GEN-LAST:event_refreshActionPerformed

     public void buy(){
        String s1 = jTextField1.getText();
            int i1 = Integer.parseInt(s1);
            String s2 = jTextField2.getText();
            String s3 = jTextField3.getText();
            int i2 = Integer.parseInt(s3);
            String s4 = jTextField4.getText();
            int i3 = Integer.parseInt(s4);
            String s5 = jTextField5.getText();
            int i4 = Integer.parseInt(s5);
            
            int i5 = i2*i4;
            
            String s6 = String.valueOf(i5);
            jTextField6.setText(s6);
            
           
        try{
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abu_jafar","root","nclc123");
            pst = con.prepareStatement("UPDATE new_table SET stock = ? WHERE p_id = ? " );
           
            pst.setInt(2, i1);
            pst.setString(1, String.valueOf(i3+i4));
           
            int query = pst.executeUpdate();

            if (query > 0) {
                JOptionPane.showMessageDialog(this, "Buy Sucessfull");

            } else {
                JOptionPane.showMessageDialog(this, "Try Again");
            }
            con.close();
           
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    private void buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyActionPerformed
        // TODO add your handling code here:
        buy();
        
    }//GEN-LAST:event_buyActionPerformed

    private void clerar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clerar1ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
    }//GEN-LAST:event_clerar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buy;
    private javax.swing.JButton clerar1;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton refresh;
    private javax.swing.JButton save;
    private javax.swing.JButton sell;
    private javax.swing.JButton show;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
