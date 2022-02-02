/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import dao.drh.DrhDaoHibernate;
import javax.swing.JOptionPane;

/**
 *
 * @author ortega
 */
public class DrhLogin extends javax.swing.JFrame {
   
   public String email;

   /**
    * Creates new form DrhLogin
    */
   public DrhLogin() {
      initComponents();
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

      jLabel1 = new javax.swing.JLabel();
      jPanel1 = new javax.swing.JPanel();
      jPanel2 = new javax.swing.JPanel();
      jLabel7 = new javax.swing.JLabel();
      QuitBtn = new javax.swing.JButton();
      jSeparator1 = new javax.swing.JSeparator();
      txtEmail = new javax.swing.JTextField();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      txtConnexion = new javax.swing.JButton();
      jLabel5 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      txtPassword = new javax.swing.JPasswordField();

      jLabel1.setText("jLabel1");

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setUndecorated(true);

      jPanel1.setBackground(new java.awt.Color(204, 204, 255));

      jPanel2.setBackground(new java.awt.Color(0, 51, 102));

      jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/afficheAgent.png"))); // NOI18N
      jLabel7.setText("jLabel7");

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 407, Short.MAX_VALUE))
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
      );

      QuitBtn.setBackground(new java.awt.Color(255, 255, 255));
      QuitBtn.setForeground(new java.awt.Color(255, 255, 255));
      QuitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close.png"))); // NOI18N
      QuitBtn.setBorder(null);
      QuitBtn.setBorderPainted(false);
      QuitBtn.setContentAreaFilled(false);
      QuitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            QuitBtnMouseClicked(evt);
         }
      });

      jSeparator1.setBackground(new java.awt.Color(0, 51, 102));
      jSeparator1.setForeground(new java.awt.Color(0, 51, 102));
      jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
      jSeparator1.setOpaque(true);

      txtEmail.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      txtEmail.setToolTipText("****@gmail.com");
      txtEmail.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtEmailActionPerformed(evt);
         }
      });

      jLabel2.setBackground(new java.awt.Color(0, 0, 0));
      jLabel2.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel2.setForeground(new java.awt.Color(0, 0, 0));
      jLabel2.setText("Email");

      jLabel3.setBackground(new java.awt.Color(0, 0, 0));
      jLabel3.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel3.setForeground(new java.awt.Color(0, 0, 0));
      jLabel3.setText("Password");

      txtConnexion.setBackground(new java.awt.Color(0, 51, 102));
      txtConnexion.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      txtConnexion.setForeground(new java.awt.Color(255, 255, 255));
      txtConnexion.setText("Connexion");
      txtConnexion.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtConnexionActionPerformed(evt);
         }
      });

      jLabel5.setFont(new java.awt.Font("Mallanna", 0, 12)); // NOI18N
      jLabel5.setForeground(new java.awt.Color(0, 51, 102));
      jLabel5.setText("© by group four ");

      jLabel4.setFont(new java.awt.Font("Mallanna", 0, 30)); // NOI18N
      jLabel4.setForeground(new java.awt.Color(0, 0, 0));
      jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_login.png"))); // NOI18N
      jLabel4.setText("Login");

      txtPassword.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(6, 6, 6)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(26, 26, 26)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtConnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                           .addComponent(jLabel3)
                           .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                           .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel5)))
                  .addGap(40, 50, Short.MAX_VALUE))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(141, 141, 141))
                     .addComponent(QuitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                  .addComponent(QuitBtn)
                  .addGap(38, 38, 38)
                  .addComponent(jLabel4)
                  .addGap(28, 28, 28)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel2))
                  .addGap(38, 38, 38)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel3)
                     .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(36, 36, 36)
                  .addComponent(txtConnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jLabel5))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(jSeparator1))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
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
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

   private void QuitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitBtnMouseClicked
      // TODO add your handling code here:
      System.exit(0);
   }//GEN-LAST:event_QuitBtnMouseClicked

   private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_txtEmailActionPerformed

   private void txtConnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConnexionActionPerformed
      // TODO add your handling code here:
      this.login();
   }//GEN-LAST:event_txtConnexionActionPerformed

   public void setMail(String mail){ this.email = mail;}
   
   private void login(){
      
      DrhDaoHibernate drh = new DrhDaoHibernate();
      if (txtEmail.getText().equals("")) {
         JOptionPane.showMessageDialog(null, "Entrer l'adresse email");
      }if(txtPassword.getText().equals("")){
         JOptionPane.showMessageDialog(null, "Entrer le mot de passe");
      }else{
         if(drh.loginDrh(txtEmail.getText(), txtPassword.getText())){ 
             drh.updateDrhSession(txtEmail.getText());
             new DrhAdmin().setVisible(true);
             this.setVisible(false);
         }else{
            JOptionPane.showMessageDialog(null, "Authentification incorrecte");
         }
         
      }
   }
   
   
      
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
         java.util.logging.Logger.getLogger(DrhLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(DrhLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(DrhLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(DrhLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new DrhLogin().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton QuitBtn;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JSeparator jSeparator1;
   private javax.swing.JButton txtConnexion;
   private javax.swing.JTextField txtEmail;
   private javax.swing.JPasswordField txtPassword;
   // End of variables declaration//GEN-END:variables
}
