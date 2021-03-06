/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ForgetPassword extends javax.swing.JFrame {
    
    public Connection connection;

    /**
     * Creates new form LoginForm
     */
    public ForgetPassword() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signUp_selection = new javax.swing.ButtonGroup();
        account_type = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        error_txt = new javax.swing.JLabel();
        btn_confirm = new javax.swing.JButton();
        radio_agent = new javax.swing.JRadioButton();
        radio_personal = new javax.swing.JRadioButton();
        radio_biller = new javax.swing.JRadioButton();
        sec_answer = new javax.swing.JTextField();
        mobile_no = new javax.swing.JTextField();
        NID_no = new javax.swing.JTextField();
        security_question = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        output_panel = new javax.swing.JPanel();
        empty_panel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        reset_panel = new javax.swing.JPanel();
        btn_change_password = new javax.swing.JButton();
        confirm_password = new javax.swing.JPasswordField();
        new_password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        invalid_panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        error_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error_txt.setEnabled(false);
        jPanel2.add(error_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 360, 192, -1));

        btn_confirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Confirm.png"))); // NOI18N
        btn_confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_confirmMouseClicked(evt);
            }
        });
        jPanel2.add(btn_confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 324, 38));

        radio_agent.setBackground(new java.awt.Color(232, 2, 59));
        account_type.add(radio_agent);
        radio_agent.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        radio_agent.setForeground(new java.awt.Color(255, 255, 255));
        radio_agent.setText("Agent");
        radio_agent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_agentActionPerformed(evt);
            }
        });
        jPanel2.add(radio_agent, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        radio_personal.setBackground(new java.awt.Color(232, 2, 59));
        account_type.add(radio_personal);
        radio_personal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        radio_personal.setForeground(new java.awt.Color(255, 255, 255));
        radio_personal.setText("Personal");
        radio_personal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_personalActionPerformed(evt);
            }
        });
        jPanel2.add(radio_personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        radio_biller.setBackground(new java.awt.Color(232, 2, 59));
        account_type.add(radio_biller);
        radio_biller.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        radio_biller.setForeground(new java.awt.Color(255, 255, 255));
        radio_biller.setText("Biller");
        radio_biller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_billerActionPerformed(evt);
            }
        });
        jPanel2.add(radio_biller, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        sec_answer.setBackground(new java.awt.Color(255, 199, 196));
        sec_answer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sec_answer.setForeground(new java.awt.Color(153, 153, 153));
        sec_answer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sec_answer.setText("Security Question Answer");
        sec_answer.setBorder(null);
        sec_answer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sec_answerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sec_answerFocusLost(evt);
            }
        });
        jPanel2.add(sec_answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 280, 38));

        mobile_no.setBackground(new java.awt.Color(255, 199, 196));
        mobile_no.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mobile_no.setForeground(new java.awt.Color(153, 153, 153));
        mobile_no.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mobile_no.setText("Mobile No");
        mobile_no.setBorder(null);
        mobile_no.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mobile_noFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mobile_noFocusLost(evt);
            }
        });
        jPanel2.add(mobile_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 54, 280, 40));

        NID_no.setBackground(new java.awt.Color(255, 199, 196));
        NID_no.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        NID_no.setForeground(new java.awt.Color(153, 153, 153));
        NID_no.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NID_no.setText("NID No / Trade License");
        NID_no.setBorder(null);
        NID_no.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NID_noFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NID_noFocusLost(evt);
            }
        });
        jPanel2.add(NID_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 122, 280, 40));

        security_question.setBackground(new java.awt.Color(255, 199, 196));
        security_question.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        security_question.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your favourite appetizer?", "What is your favourite dessert?", "What is your favourite drink?" }));
        jPanel2.add(security_question, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 194, 290, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login_bg_forget.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 410));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_backPress_1.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 50, -1));

        output_panel.setLayout(new java.awt.CardLayout());

        empty_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background_small.png"))); // NOI18N
        empty_panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 340));

        output_panel.add(empty_panel, "card2");

        reset_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_change_password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_changePass.png"))); // NOI18N
        btn_change_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_change_passwordMouseClicked(evt);
            }
        });
        btn_change_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_change_passwordActionPerformed(evt);
            }
        });
        reset_panel.add(btn_change_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 324, 38));

        confirm_password.setBackground(new java.awt.Color(255, 199, 196));
        confirm_password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confirm_password.setBorder(null);
        confirm_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_passwordActionPerformed(evt);
            }
        });
        reset_panel.add(confirm_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 186, 290, 30));

        new_password.setBackground(new java.awt.Color(255, 199, 196));
        new_password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        new_password.setBorder(null);
        new_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_passwordActionPerformed(evt);
            }
        });
        reset_panel.add(new_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 105, 290, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login_bg_resetPassword.png"))); // NOI18N
        reset_panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 380, -1));

        output_panel.add(reset_panel, "card3");

        invalid_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login_bg_invalidInfo.png"))); // NOI18N
        invalid_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, -1, -1));

        output_panel.add(invalid_panel, "card5");

        jPanel1.add(output_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 122, 390, 340));

        jLabel2.setForeground(new java.awt.Color(232, 2, 59));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background_Sign.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 584));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void textVisibilty(){
        error_txt.setVisible(false);
    }
    
    private void radio_agentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_agentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_agentActionPerformed

    private void radio_personalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_personalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_personalActionPerformed

    private void radio_billerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_billerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_billerActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        LoginForm login = new LoginForm();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void mobile_noFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobile_noFocusGained
        // TODO add your handling code here:
        if(mobile_no.getText().equals("Mobile No")){
            mobile_no.setText("");
            mobile_no.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_mobile_noFocusGained

    private void mobile_noFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobile_noFocusLost
        // TODO add your handling code here:
        if(mobile_no.getText().equals("")){
            mobile_no.setText("Mobile No");
            mobile_no.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_mobile_noFocusLost

    private void NID_noFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NID_noFocusGained
        // TODO add your handling code here:
        if(NID_no.getText().equals("NID No / Trade License")){
            NID_no.setText("");
            NID_no.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_NID_noFocusGained

    private void NID_noFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NID_noFocusLost
        // TODO add your handling code here:
        if(NID_no.getText().equals("")){
            NID_no.setText("NID No / Trade License");
            NID_no.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_NID_noFocusLost

    private void sec_answerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sec_answerFocusGained
        // TODO add your handling code here:
        if(sec_answer.getText().equals("Security Question Answer")){
            sec_answer.setText("");
            sec_answer.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_sec_answerFocusGained

    private void sec_answerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sec_answerFocusLost
        // TODO add your handling code here:
        if(sec_answer.getText().equals("")){
            sec_answer.setText("Security Question Answer");
            sec_answer.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_sec_answerFocusLost

    private void btn_confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_confirmMouseClicked
        // TODO add your handling code here:
        
        String phoneNo = mobile_no.getText();
        String NID = NID_no.getText();
        String secQ = (String) security_question.getSelectedItem();
        String secA = sec_answer.getText();
        
        if(radio_personal.isSelected()){
            try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=eWallet;selectMethod=cursor", "sa", "123456");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement
                        .executeQuery("SELECT NationalID,SecurityQue,SecurityAns  FROM INFORMATION INNER JOIN PERSONAL ON INFORMATION.Contact = PERSONAL.Contact where INFORMATION.Contact = " + phoneNo +"and PersonalID Like '3%'" );

                while (resultSet.next()) {
                    
                    String DB_NID = resultSet.getString("NationalID");
                    String DB_secQ = resultSet.getString("SecurityQue");
                    String DB_secA = resultSet.getString("SecurityAns");
                    
                    if (NID.equals(DB_NID) &&
                        secQ.equals(DB_secQ) &&
                        secA.equals(DB_secA)) {
                        
                        //remove panel
                        output_panel.removeAll();
                        output_panel.repaint();
                        output_panel.revalidate();

                        // add panel
                        output_panel.add(reset_panel);
                        output_panel.repaint();
                        output_panel.revalidate();
                    } else {
                        //remove panel
                        output_panel.removeAll();
                        output_panel.repaint();
                        output_panel.revalidate();

                        // add panel
                        output_panel.add(invalid_panel);
                        output_panel.repaint();
                        output_panel.revalidate();
                    }
                    
                }    
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }else if(radio_biller.isSelected()){
            
            try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=eWallet;selectMethod=cursor", "sa", "123456");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement
                        .executeQuery("SELECT TradeLicense,SecurityQue,SecurityAns  FROM INFORMATION INNER JOIN BILLER ON INFORMATION.Contact = BILLER.Contact where INFORMATION.Contact = " + phoneNo +"and BillerID Like '4%'" );

                while (resultSet.next()) {
                    
                    String DB_NID = resultSet.getString("TradeLicense");
                    String DB_secQ = resultSet.getString("SecurityQue");
                    String DB_secA = resultSet.getString("SecurityAns");
                    
                    if (NID.equals(DB_NID) &&
                        secQ.equals(DB_secQ) &&
                        secA.equals(DB_secA)) {
                        
                        //remove panel
                        output_panel.removeAll();
                        output_panel.repaint();
                        output_panel.revalidate();

                        // add panel
                        output_panel.add(reset_panel);
                        output_panel.repaint();
                        output_panel.revalidate();
                    } else {
                        //remove panel
                        output_panel.removeAll();
                        output_panel.repaint();
                        output_panel.revalidate();

                        // add panel
                        output_panel.add(invalid_panel);
                        output_panel.repaint();
                        output_panel.revalidate();
                    }
                    
                }    
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }else if(radio_agent.isSelected()){
            try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=eWallet;selectMethod=cursor", "sa", "123456");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement
                        .executeQuery("SELECT NationalID,SecurityQue,SecurityAns  FROM INFORMATION INNER JOIN AGENT ON INFORMATION.Contact = AGENT.Contact where INFORMATION.Contact = " + phoneNo +"and AgentID Like '2%'" );

                while (resultSet.next()) {
                    
                    String DB_NID = resultSet.getString("NationalID");
                    String DB_secQ = resultSet.getString("SecurityQue");
                    String DB_secA = resultSet.getString("SecurityAns");
                    
                    if (NID.equals(DB_NID) &&
                        secQ.equals(DB_secQ) &&
                        secA.equals(DB_secA)) {
                        
                        //remove panel
                        output_panel.removeAll();
                        output_panel.repaint();
                        output_panel.revalidate();

                        // add panel
                        output_panel.add(reset_panel);
                        output_panel.repaint();
                        output_panel.revalidate();
                    } else {
                        //remove panel
                        output_panel.removeAll();
                        output_panel.repaint();
                        output_panel.revalidate();

                        // add panel
                        output_panel.add(invalid_panel);
                        output_panel.repaint();
                        output_panel.revalidate();
                    }
                    
                }    
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Please select account type.");
        }
        
    }//GEN-LAST:event_btn_confirmMouseClicked

    private void btn_change_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_change_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_change_passwordActionPerformed

    private void new_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_passwordActionPerformed

    private void confirm_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirm_passwordActionPerformed

    private void btn_change_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_change_passwordMouseClicked
        // TODO add your handling code here:
        String phoneNo = mobile_no.getText();
        String new_pass = String.valueOf(new_password.getPassword());
        String confirm_pass = String.valueOf(confirm_password.getPassword());
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=eWallet;selectMethod=cursor", "sa", "123456");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            if(new_pass.equals(confirm_pass)){
                
                String query = "UPDATE INFORMATION SET Password = ? where Contact = " + phoneNo;
                PreparedStatement st = connection.prepareStatement(query);
                st.setString(1, new_pass);
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Password cahnged successfully.");
                
                LoginForm login = new LoginForm();
                login.setVisible(true);
                login.pack();
                login.setLocationRelativeTo(null);
                this.dispose();
           
            }else{
                JOptionPane.showMessageDialog(null, "Password doesn't match.");
            }
            } catch (Exception e) {
                e.printStackTrace();
            }
        
    }//GEN-LAST:event_btn_change_passwordMouseClicked

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
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgetPassword().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NID_no;
    private javax.swing.ButtonGroup account_type;
    private javax.swing.JButton btn_change_password;
    private javax.swing.JButton btn_confirm;
    private javax.swing.JPasswordField confirm_password;
    private javax.swing.JPanel empty_panel;
    private javax.swing.JLabel error_txt;
    private javax.swing.JPanel invalid_panel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField mobile_no;
    private javax.swing.JPasswordField new_password;
    private javax.swing.JPanel output_panel;
    private javax.swing.JRadioButton radio_agent;
    private javax.swing.JRadioButton radio_biller;
    private javax.swing.JRadioButton radio_personal;
    private javax.swing.JPanel reset_panel;
    private javax.swing.JTextField sec_answer;
    private javax.swing.JComboBox<String> security_question;
    private javax.swing.ButtonGroup signUp_selection;
    // End of variables declaration//GEN-END:variables
    
    
   
}
