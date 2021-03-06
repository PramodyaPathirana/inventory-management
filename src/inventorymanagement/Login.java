package inventorymanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import resources.DBConnection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sashini Shihara
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setSize(850, 600);
        setLocationRelativeTo(null);
    }
    
    private static Connection connection = DBConnection.getInstance().getConnection();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_uname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_pw = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(550, 20, 0, 0);

        jPanel1.setBackground(new java.awt.Color(255, 252, 242));
        jPanel1.setLayout(null);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(140, 130, 70, 70);

        txt_uname.setToolTipText("");
        jPanel1.add(txt_uname);
        txt_uname.setBounds(250, 210, 380, 70);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(140, 230, 70, 70);

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(300, 400, 250, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pramodya Pathirana\\Downloads\\user.png")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(370, 70, 110, 120);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pramodya Pathirana\\Downloads\\iconfinder_Rounded-31_2024644.png")); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(180, 210, 102, 64);

        txt_pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pwActionPerformed(evt);
            }
        });
        jPanel1.add(txt_pw);
        txt_pw.setBounds(249, 310, 380, 60);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pramodya Pathirana\\Downloads\\iconfinder_Password_2_372911.png")); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(180, 300, 64, 64);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jPanel2);
        jPanel2.setBounds(130, 50, 570, 450);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pramodya Pathirana\\Downloads\\green-linear-gradient-white-1920x1080-c2-00fa9a-ffffff-a-270-f-14.png")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-6, 25, 840, 540);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 840, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            String name = txt_uname.getText();
            String pw = txt_pw.getText();
            String pass = null;
            
            

            String sql = "select password from staff where username='" + name + "'";

            PreparedStatement pstm = connection.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery(sql);

            while (rs.next()) {
                pass = rs.getString("password");
            }

            if (!pass.equals(pw)) {
                JOptionPane.showMessageDialog(null, "Username or Password incorrect");

            } else {
                Dashboard dash = new Dashboard();
                dash.setVisible(true);

                dispose();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "invalid username and password");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pwActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txt_pw;
    private javax.swing.JTextField txt_uname;
    // End of variables declaration//GEN-END:variables
}
