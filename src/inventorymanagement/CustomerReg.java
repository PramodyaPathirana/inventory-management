package inventorymanagement;

import com.sun.xml.internal.bind.v2.model.core.ID;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import resources.DBConnection;

public class CustomerReg extends javax.swing.JFrame {

    public CustomerReg() {
        initComponents();
         setSize(850, 600);
        setLocationRelativeTo(null);
        getAllItems();
        showTable();
    }

    private static Connection connection = DBConnection.getInstance().getConnection();
//    private static Connection conn = DB.getInstance().getConnection();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        customer_name = new javax.swing.JTextField();
        customer_id = new javax.swing.JTextField();
        customer_address = new javax.swing.JTextField();
        customer_tel = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        reg_date = new javax.swing.JTextField();
        Reset = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 204));
        setForeground(new java.awt.Color(0, 255, 204));
        setSize(new java.awt.Dimension(850, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Customer ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 152, 176, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Manage Customers");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 29, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 191, 195, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 232, 119, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Telephone Number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 275, -1, -1));

        customer_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_nameActionPerformed(evt);
            }
        });
        getContentPane().add(customer_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 195, 467, -1));

        customer_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_idActionPerformed(evt);
            }
        });
        getContentPane().add(customer_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 156, 467, -1));

        customer_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_addressActionPerformed(evt);
            }
        });
        getContentPane().add(customer_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 232, 467, -1));
        getContentPane().add(customer_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 279, 467, -1));

        Search.setBackground(new java.awt.Color(255, 102, 51));
        Search.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Search.setText("Search Customers");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 101, -1, -1));

        Update.setBackground(new java.awt.Color(255, 102, 102));
        Update.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        Save.setBackground(new java.awt.Color(255, 102, 102));
        Save.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, -1, -1));

        Delete.setBackground(new java.awt.Color(255, 102, 102));
        Delete.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, -1, -1));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustomerId", "Name", "Address", "TelephoneNo", "Registration Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setSelectionForeground(new java.awt.Color(51, 255, 204));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 407, 666, 190));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 150, 20));

        reg_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_dateActionPerformed(evt);
            }
        });
        getContentPane().add(reg_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 470, -1));

        Reset.setBackground(new java.awt.Color(255, 102, 102));
        Reset.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        getContentPane().add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, -1, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed

        String Customer = customer_id.getText();
        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory", "root", "");

            String sql = "select * from Customer where customer_id ='" + Customer + "' ";
            PreparedStatement pstmt = connection.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery(sql);

            if (rs.next()) {
                customer_name.setText(rs.getString("customer_name"));
                customer_address.setText(rs.getString("customer_address"));
                customer_tel.setText(rs.getString("customer_tel"));
                reg_date.setText(rs.getString("reg_date"));
            } else {
                JOptionPane.showMessageDialog(null, "Message not Found");
            }
//            co.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        try {

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int selectIndex = jTable1.getSelectedRow();

            String sql = "UPDATE customer SET customer_name=?, customer_address=?, customer_tel=? WHERE customer_id=?";

            PreparedStatement pstmt = connection.prepareStatement(sql);

            int Id = Integer.parseInt(customer_id.getText());
            String Name = customer_name.getText();
            String Address = customer_address.getText();
            int TeleNo = Integer.parseInt(customer_tel.getText());
//            String Date = reg_date.getText();

            System.out.println(Name);
            System.out.println(Address);
            System.out.println(TeleNo);
//            System.out.println(Date);

            pstmt.setString(1, Name);
            pstmt.setString(2, Address);
            pstmt.setInt(3, TeleNo);
            pstmt.setInt(4, Id);

            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Successfully Updated");
                showTable();
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_UpdateActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed

        int ID = Integer.parseInt(customer_id.getText());
        String Name = customer_name.getText();
        String Address = customer_address.getText();
        int TeleNo = Integer.parseInt(customer_tel.getText());
        String Date = reg_date.getText();

        try {

            String sql = "insert into customer(customer_id,customer_name,customer_address,customer_tel,reg_date)" + "values (?,?,?,?,?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, ID);
            pstmt.setString(2, Name);
            pstmt.setString(3, Address);
            pstmt.setInt(4, TeleNo);
            pstmt.setString(5, Date);
            pstmt.executeUpdate();
            
            showTable();
            JOptionPane.showMessageDialog(null, "Recorded Successfully");
//            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hello" + e);

    }//GEN-LAST:event_SaveActionPerformed
    }

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed

        try {

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int selectIndex = jTable1.getSelectedRow();

            int Id = Integer.parseInt(model.getValueAt(selectIndex, 0).toString());

            String sql = "DELETE FROM customer WHERE customer_id=?";
            PreparedStatement pstmt = connection.prepareStatement(sql);

            pstmt.setInt(1, Id);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Deleted");
            showTable();
        } catch (SQLException ex) {
            System.out.println(ex);
        }


    }//GEN-LAST:event_DeleteActionPerformed


    private void customer_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customer_nameActionPerformed

    private void customer_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customer_addressActionPerformed

    private void reg_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reg_dateActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        customer_id.setText("");
        customer_name.setText("");
        customer_address.setText("");
        customer_tel.setText("");
        reg_date.setText("");
    }//GEN-LAST:event_ResetActionPerformed

    private void customer_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customer_idActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();

        int Id = Integer.parseInt(model.getValueAt(selectIndex, 0).toString());
        String Name = model.getValueAt(selectIndex, 1).toString();
        String Address = model.getValueAt(selectIndex, 2).toString();
        int teleNo = Integer.parseInt(model.getValueAt(selectIndex, 3).toString());
        String Date = model.getValueAt(selectIndex, 4).toString();

        customer_id.setText(String.valueOf(Id));
        customer_name.setText(Name);
        customer_address.setText(Address);
        customer_tel.setText(String.valueOf(teleNo));
        reg_date.setText(Date);
    }//GEN-LAST:event_jTable1MouseClicked

    public static ArrayList getAllItems() {

        ArrayList itemsList = new ArrayList();
        try {
            String sql = "SELECT * FROM customer";
            Statement stmt = connection.createStatement();

            ResultSet res_st = stmt.executeQuery(sql);

            while (res_st.next()) {
                ItemModel2 singleItem = new ItemModel2(
                        res_st.getInt(1),
                        res_st.getString(2),
                        res_st.getString(3),
                        res_st.getInt(4),
                        res_st.getDate(5));

                itemsList.add(singleItem);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return itemsList;
    }

    public void showTable() {
        ArrayList<ItemModel2> showlist = getAllItems();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[5];
        model.setNumRows(0);
        for (int i = 0; i < showlist.size(); i++) {
            row[0] = showlist.get(i).getCustomer_id();
            row[1] = showlist.get(i).getCustomer_name();
            row[2] = showlist.get(i).getCustomer_address();
            row[3] = showlist.get(i).getCustomer_tel();
            row[4] = showlist.get(i).getReg_date();
            System.out.println(row);
            model.addRow(row);
        }
    }

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
            java.util.logging.Logger.getLogger(CustomerReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerReg().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Save;
    private javax.swing.JButton Search;
    private javax.swing.JButton Update;
    private javax.swing.JTextField customer_address;
    private javax.swing.JTextField customer_id;
    private javax.swing.JTextField customer_name;
    private javax.swing.JTextField customer_tel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField reg_date;
    // End of variables declaration//GEN-END:variables
}

class ItemModel2 {

    int customer_id;
    String customer_name;
    String customer_address;
    int customer_tel;
    Date reg_date;

    ItemModel2(int a, String b, String c, int d, Date e) {
        this.customer_id = a;
        this.customer_name = b;
        this.customer_address = c;
        this.customer_tel = d;
        this.reg_date = e;

    }

    public int getCustomer_id() {
        return customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public int getCustomer_tel() {
        return customer_tel;
    }

    public Date getReg_date() {
        return reg_date;
    }

}
