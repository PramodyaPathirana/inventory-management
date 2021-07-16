/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagement;

import javax.swing.JOptionPane;
import java.sql.*;
//import net.proteanit.sql.DbUtils;

/**
 *
 * @author Aamir ali Shafeek
 */
public class AddingStaff extends javax.swing.JFrame {

    String power;

//    private static Connection connection = DBConnection.get

    /**
     * Creates new form AddingStaff
     */
    public AddingStaff() {
        initComponents();
        setSize(850, 600);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        s_id = new javax.swing.JTextField();
        s_name = new javax.swing.JTextField();
        Telno = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        Admin = new javax.swing.JRadioButton();
        staffMember = new javax.swing.JRadioButton();
        userName = new javax.swing.JTextField();
        passWord = new javax.swing.JTextField();
        Cancel = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.SystemColor.activeCaption);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Staff ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Staff Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Address:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Telephone no.:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Privelage:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("Log In Detials");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 140, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("User Name:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("Password:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        jButton3.setBackground(new java.awt.Color(102, 153, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 90, 40));

        jButton4.setBackground(new java.awt.Color(102, 153, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton4.setText("Submit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 110, 40));

        s_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_idActionPerformed(evt);
            }
        });
        getContentPane().add(s_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 242, 30));
        getContentPane().add(s_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 242, 30));
        getContentPane().add(Telno, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 242, 30));
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 242, 71));

        Admin.setBackground(new java.awt.Color(204, 255, 204));
        buttonGroup1.add(Admin);
        Admin.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Admin.setText("Admin");
        getContentPane().add(Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        staffMember.setBackground(new java.awt.Color(204, 255, 204));
        buttonGroup1.add(staffMember);
        staffMember.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        staffMember.setText("Staff Member");
        staffMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffMemberActionPerformed(evt);
            }
        });
        getContentPane().add(staffMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        getContentPane().add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 250, 30));

        passWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passWordActionPerformed(evt);
            }
        });
        getContentPane().add(passWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 250, 30));

        Cancel.setBackground(new java.awt.Color(102, 153, 255));
        Cancel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 100, 40));

        jLabel9.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Staff Registration");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 320, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void staffMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffMemberActionPerformed

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        s_id.setText("");
        s_name.setText("");
        Telno.setText("");
        address.setText("");
        buttonGroup1.clearSelection();
        userName.setText("");
        passWord.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void passWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passWordActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
            String sql = "INSERT INTO staff (staff_id,staff_name,staff_address,staff_tel,priviledge,username,password)"+"VALUES (?,?,?,?,?,?,?)";
            
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setInt(1, Integer.parseInt(s_id.getText()));
            pstm.setString(2, s_name.getText());
            pstm.setString(3, address.getText());
            pstm.setInt(4, Integer.parseInt(Telno.getText()));
            String privilege = null;
        if (Admin.isSelected()) {
            privilege = Admin.getText();
        }
        if (staffMember.isSelected()) {
            privilege = staffMember.getText();
        }
        pstm.setString(5, privilege);
        pstm.setString(6, userName.getText());
        pstm.setString(7, passWord.getText());

            //int affectedRows = pstm.executeUpdate();

            //result = (affectedRows > 0);
         pstm.executeUpdate();
         JOptionPane.showMessageDialog(null,"Successfully insert");
         con.close();
        } catch (Exception e) {
//            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
              JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void s_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s_idActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_CancelActionPerformed

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
            java.util.logging.Logger.getLogger(AddingStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddingStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddingStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddingStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddingStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Admin;
    private javax.swing.JButton Cancel;
    private javax.swing.JTextField Telno;
    private javax.swing.JTextField address;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField passWord;
    private javax.swing.JTextField s_id;
    private javax.swing.JTextField s_name;
    private javax.swing.JRadioButton staffMember;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
