/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import dao.agent.AgentDaoHibernate;
import dao.drh.DrhDaoHibernate;
import dao.evaluation.EvaluationDaoHibernate;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;
import model.Agent;
import model.Drh;
import model.Evaluation;

/**
 *
 * @author ortega
 */
public class DrhAdmin extends javax.swing.JFrame {

   private int id;
   private String user;

   /**
    * Creates new form DrhAdmin
    */
   public DrhAdmin() {
      initComponents();
      this.voirAgents();
      this.voirDrh();
      this.voirEvaluation();
      this.ShowUserSession();
   }

   private void voirAgents() {
      try {
         DefaultTableModel model = (DefaultTableModel) dataTableAgent.getModel();
         AgentDaoHibernate agentdaohibernate = new AgentDaoHibernate();
         ResultSet rs = agentdaohibernate.afficherAgents();
         Object rowData[] = new Object[7];
         model.setNumRows(0);
         while (rs.next()) {
            rowData[0] = rs.getInt("Id");
            rowData[1] = rs.getString("Nom");
            rowData[2] = rs.getString("Telephone");
            rowData[3] = rs.getString("Email");
            rowData[4] = rs.getString("DateNaissance");
            rowData[5] = rs.getString("Adresse");
            rowData[6] = rs.getString("Fonction");
            model.addRow(rowData);
         }
      } catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "erreur");
      }
   }

   private void voirDrh() {
      try {
         DefaultTableModel model = (DefaultTableModel) dataDrhTable.getModel();
         DrhDaoHibernate drhDaoHibernate = new DrhDaoHibernate();
         ResultSet rs = drhDaoHibernate.afficherDrhs();
         Object rowData[] = new Object[3];
         model.setNumRows(0);
         while (rs.next()) {
            rowData[0] = rs.getInt("Id");
            rowData[1] = rs.getString("Email");
            rowData[2] = rs.getString("MotDePasse");
            model.addRow(rowData);
         }
      } catch (SQLException e) {
      }
   }

   private void voirEvaluation() {
      DefaultTableModel model = (DefaultTableModel) dataEvaluationTable.getModel();
      EvaluationDaoHibernate evaluationDaoHibernate = new EvaluationDaoHibernate();
      ResultSet rs = evaluationDaoHibernate.afficherEvaluation();
      Object rowData[] = new Object[11];
      model.setNumRows(0);
      try {
         while (rs.next()) {
            rowData[0] = rs.getInt("IdEvaluation");
            rowData[1] = rs.getInt("IdAgent");
            rowData[2] = rs.getString("NomAgent");
            rowData[3] = rs.getString("NomDrh");
            rowData[4] = rs.getString("QuantiteTravail");
            rowData[5] = rs.getString("QualiteTravail");
            rowData[6] = rs.getString("Autonomie");
            rowData[7] = rs.getString("Motivation");
            rowData[8] = rs.getString("PriseInitiative");
            rowData[9] = rs.getString("Relation");
            rowData[10] = rs.getString("DateEvaluation");
            model.addRow(rowData);
         }

      } catch (SQLException ex) {
         Logger.getLogger(DrhAdmin.class.getName()).log(Level.SEVERE, null, ex);
      }
   }

   private void clearAgent() {
      txtEmail.setText("");
      txtTelephonr.setText("");
      txtDate.setText("");
      txtNom.setText("");
      txtFonction.setText("");
      txtAdresse.setText("");
   }

   private void clearDrh() {
      txtEmailDrh.setText("");
      txtPassword.setText("");
      txtConfirmation.setText("");
   }

   private void clearEvaluation() {
      txtIdEvaluation.setText("");
      txtNomEvaluation.setText("");
      txtAdresseEvaluation.setText("");
      txtEmailEvaluation.setText("");
      txtFonctionEvaluation.setText("");
      txtPhoneEvaluation.setText("");
      txtNaissanceEvaluation.setText("");
      cmbAutonomie.setSelectedItem("Mention");
      cmbInitiative.setSelectedItem("Mention");
      cmbMotivation.setSelectedItem("Mention");
      cmbQT.setSelectedItem("Mention");
      cmbQlT.setSelectedItem("Mention");
      cmbRelation.setSelectedItem("Mention");

   }

   private void reinitialiser() {
      EvaluationDaoHibernate evaluationDaoHibernate = new EvaluationDaoHibernate();
      try {
         evaluationDaoHibernate.reinitialiserEvaluation();
         this.voirEvaluation();
      } catch (Exception e) {
      }
   }
   
   private void ShowUserSession(){
      DrhDaoHibernate drhDaoHibernate =  new DrhDaoHibernate();
      ResultSet rs =  drhDaoHibernate.showDrhSession();
      try{
      while(rs.next()){
         labelUser.setText(rs.getString("Email"));
         labelUser1.setText(rs.getString("Email"));
         labelUser2.setText(rs.getString("Email"));
         labelUser3.setText(rs.getString("Email"));
         this.user = rs.getString("Email");
      }}catch(SQLException e){
      }
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")


   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel6 = new javax.swing.JPanel();
      jButton2 = new javax.swing.JButton();
      jButton4 = new javax.swing.JButton();
      jPanel1 = new javax.swing.JPanel();
      jPanel2 = new javax.swing.JPanel();
      btnEvaluation = new javax.swing.JButton();
      btnAgent = new javax.swing.JButton();
      jButton3 = new javax.swing.JButton();
      jButton5 = new javax.swing.JButton();
      jLabel24 = new javax.swing.JLabel();
      jLabel26 = new javax.swing.JLabel();
      btnQuitter = new javax.swing.JButton();
      jTabbedPane2 = new javax.swing.JTabbedPane();
      espace = new javax.swing.JTabbedPane();
      jPanel8 = new javax.swing.JPanel();
      txtNomEvaluation = new javax.swing.JTextField();
      txtEmailEvaluation = new javax.swing.JTextField();
      txtPhoneEvaluation = new javax.swing.JTextField();
      txtAdresseEvaluation = new javax.swing.JTextField();
      txtFonctionEvaluation = new javax.swing.JTextField();
      txtNaissanceEvaluation = new javax.swing.JTextField();
      cmbQT = new javax.swing.JComboBox<>();
      cmbQlT = new javax.swing.JComboBox<>();
      cmbAutonomie = new javax.swing.JComboBox<>();
      cmbMotivation = new javax.swing.JComboBox<>();
      cmbInitiative = new javax.swing.JComboBox<>();
      cmbRelation = new javax.swing.JComboBox<>();
      jLabel10 = new javax.swing.JLabel();
      jLabel11 = new javax.swing.JLabel();
      jLabel12 = new javax.swing.JLabel();
      jLabel13 = new javax.swing.JLabel();
      jLabel14 = new javax.swing.JLabel();
      jLabel15 = new javax.swing.JLabel();
      jLabel16 = new javax.swing.JLabel();
      jLabel17 = new javax.swing.JLabel();
      jLabel18 = new javax.swing.JLabel();
      jLabel19 = new javax.swing.JLabel();
      jLabel20 = new javax.swing.JLabel();
      jLabel21 = new javax.swing.JLabel();
      btnEvaluationEvaluation = new javax.swing.JButton();
      btnEffacerEvaluation = new javax.swing.JButton();
      btnChercherEvaluation = new javax.swing.JButton();
      txtIdEvaluation = new javax.swing.JTextField();
      jLabel22 = new javax.swing.JLabel();
      jPanel4 = new javax.swing.JPanel();
      jLabel25 = new javax.swing.JLabel();
      labelUser = new javax.swing.JLabel();
      jPanel9 = new javax.swing.JPanel();
      jScrollPane1 = new javax.swing.JScrollPane();
      dataTableAgent = new javax.swing.JTable();
      txtNom = new javax.swing.JTextField();
      txtEmail = new javax.swing.JTextField();
      txtAdresse = new javax.swing.JTextField();
      txtTelephonr = new javax.swing.JTextField();
      txtDate = new javax.swing.JTextField();
      txtFonction = new javax.swing.JTextField();
      btnAjout = new javax.swing.JButton();
      btnSupprimer = new javax.swing.JButton();
      btnModifier = new javax.swing.JButton();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      jLabel6 = new javax.swing.JLabel();
      jPanel5 = new javax.swing.JPanel();
      jLabel27 = new javax.swing.JLabel();
      labelUser1 = new javax.swing.JLabel();
      jPanel11 = new javax.swing.JPanel();
      jScrollPane3 = new javax.swing.JScrollPane();
      dataEvaluationTable = new javax.swing.JTable();
      btnAjouterEvaluation = new javax.swing.JButton();
      btnReinitialiserEvaluation = new javax.swing.JButton();
      jPanel3 = new javax.swing.JPanel();
      jLabel28 = new javax.swing.JLabel();
      labelUser2 = new javax.swing.JLabel();
      jPanel10 = new javax.swing.JPanel();
      jLabel7 = new javax.swing.JLabel();
      jLabel8 = new javax.swing.JLabel();
      jLabel9 = new javax.swing.JLabel();
      txtEmailDrh = new javax.swing.JTextField();
      txtPassword = new javax.swing.JTextField();
      txtConfirmation = new javax.swing.JTextField();
      btnAjouterDrh = new javax.swing.JButton();
      btnSupprimerDrh = new javax.swing.JButton();
      btnModifierDrh = new javax.swing.JButton();
      jScrollPane2 = new javax.swing.JScrollPane();
      dataDrhTable = new javax.swing.JTable();
      jPanel7 = new javax.swing.JPanel();
      jLabel29 = new javax.swing.JLabel();
      labelUser3 = new javax.swing.JLabel();

      javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
      jPanel6.setLayout(jPanel6Layout);
      jPanel6Layout.setHorizontalGroup(
         jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 100, Short.MAX_VALUE)
      );
      jPanel6Layout.setVerticalGroup(
         jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 100, Short.MAX_VALUE)
      );

      jButton2.setText("jButton2");

      jButton4.setText("jButton4");

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setUndecorated(true);
      getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

      jPanel1.setBackground(new java.awt.Color(255, 255, 255));

      jPanel2.setBackground(new java.awt.Color(0, 51, 102));

      btnEvaluation.setBackground(new java.awt.Color(0, 51, 102));
      btnEvaluation.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      btnEvaluation.setForeground(new java.awt.Color(255, 255, 255));
      btnEvaluation.setText("Evaluation");
      btnEvaluation.setBorderPainted(false);
      btnEvaluation.setContentAreaFilled(false);
      btnEvaluation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
      btnEvaluation.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnEvaluationActionPerformed(evt);
         }
      });

      btnAgent.setBackground(new java.awt.Color(0, 51, 102));
      btnAgent.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      btnAgent.setForeground(new java.awt.Color(255, 255, 255));
      btnAgent.setText("Manage Agent");
      btnAgent.setContentAreaFilled(false);
      btnAgent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
      btnAgent.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAgentActionPerformed(evt);
         }
      });

      jButton3.setBackground(new java.awt.Color(0, 51, 102));
      jButton3.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jButton3.setForeground(new java.awt.Color(255, 255, 255));
      jButton3.setText("Manage DRH");
      jButton3.setContentAreaFilled(false);
      jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
      jButton3.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton3ActionPerformed(evt);
         }
      });

      jButton5.setBackground(new java.awt.Color(0, 51, 102));
      jButton5.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jButton5.setForeground(new java.awt.Color(255, 255, 255));
      jButton5.setText("Manage Evaluation");
      jButton5.setContentAreaFilled(false);
      jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
      jButton5.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton5ActionPerformed(evt);
         }
      });

      jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/afficheAgent.png"))); // NOI18N

      jLabel26.setFont(new java.awt.Font("Mallanna", 0, 22)); // NOI18N
      jLabel26.setForeground(new java.awt.Color(255, 255, 255));
      jLabel26.setText("Gestion d'Evaluation");
      jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

      btnQuitter.setBackground(new java.awt.Color(0, 51, 102));
      btnQuitter.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      btnQuitter.setForeground(new java.awt.Color(255, 255, 255));
      btnQuitter.setText("Quitter");
      btnQuitter.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnQuitterActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(btnEvaluation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(btnAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addGap(40, 40, 40)
                  .addComponent(jLabel26)
                  .addGap(0, 43, Short.MAX_VALUE)))
            .addContainerGap())
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(74, 74, 74)
            .addComponent(btnQuitter)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(78, 78, 78)
            .addComponent(btnEvaluation, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(12, 12, 12)
            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
            .addComponent(btnQuitter)
            .addGap(55, 55, 55))
      );

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jTabbedPane2))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jTabbedPane2)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
      );

      getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, -1));

      jPanel8.setBackground(new java.awt.Color(204, 204, 255));
      jPanel8.setForeground(new java.awt.Color(0, 0, 0));

      txtNomEvaluation.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      txtNomEvaluation.setForeground(new java.awt.Color(0, 0, 0));

      txtEmailEvaluation.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      txtEmailEvaluation.setForeground(new java.awt.Color(0, 0, 0));
      txtEmailEvaluation.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtEmailEvaluationActionPerformed(evt);
         }
      });

      txtPhoneEvaluation.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      txtPhoneEvaluation.setForeground(new java.awt.Color(0, 0, 0));
      txtPhoneEvaluation.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtPhoneEvaluationActionPerformed(evt);
         }
      });

      txtAdresseEvaluation.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      txtAdresseEvaluation.setForeground(new java.awt.Color(0, 0, 0));

      txtFonctionEvaluation.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      txtFonctionEvaluation.setForeground(new java.awt.Color(0, 0, 0));
      txtFonctionEvaluation.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtFonctionEvaluationActionPerformed(evt);
         }
      });

      txtNaissanceEvaluation.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      txtNaissanceEvaluation.setForeground(new java.awt.Color(0, 0, 0));

      cmbQT.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      cmbQT.setForeground(new java.awt.Color(0, 0, 0));
      cmbQT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mention", "tres satisfaisant", "satisfaisant", "moyen", "insuffisant" }));

      cmbQlT.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      cmbQlT.setForeground(new java.awt.Color(0, 0, 0));
      cmbQlT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mention", "tres satisfaisant", "satisfaisant", "moyen", "insuffisant" }));

      cmbAutonomie.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      cmbAutonomie.setForeground(new java.awt.Color(0, 0, 0));
      cmbAutonomie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mention", "tres satisfaisant", "satisfaisant", "moyen", "insuffisant" }));

      cmbMotivation.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      cmbMotivation.setForeground(new java.awt.Color(0, 0, 0));
      cmbMotivation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mention", "tres satisfaisant", "satisfaisant", "moyen", "insuffisant" }));

      cmbInitiative.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      cmbInitiative.setForeground(new java.awt.Color(0, 0, 0));
      cmbInitiative.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mention", "tres satisfaisant", "satisfaisant", "moyen", "insuffisant" }));

      cmbRelation.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      cmbRelation.setForeground(new java.awt.Color(0, 0, 0));
      cmbRelation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mention", "tres satisfaisant", "satisfaisant", "moyen", "insuffisant" }));

      jLabel10.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel10.setForeground(new java.awt.Color(0, 0, 0));
      jLabel10.setText("Nom");

      jLabel11.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel11.setForeground(new java.awt.Color(0, 0, 0));
      jLabel11.setText("Email");

      jLabel12.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel12.setForeground(new java.awt.Color(0, 0, 0));
      jLabel12.setText("Phone");

      jLabel13.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel13.setForeground(new java.awt.Color(0, 0, 0));
      jLabel13.setText("Adresse");

      jLabel14.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel14.setForeground(new java.awt.Color(0, 0, 0));
      jLabel14.setText("Fonction");

      jLabel15.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel15.setForeground(new java.awt.Color(0, 0, 0));
      jLabel15.setText("Naissance");

      jLabel16.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel16.setForeground(new java.awt.Color(0, 0, 0));
      jLabel16.setText("Quantite de travail");

      jLabel17.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel17.setForeground(new java.awt.Color(0, 0, 0));
      jLabel17.setText("Qualite de travail");

      jLabel18.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel18.setForeground(new java.awt.Color(0, 0, 0));
      jLabel18.setText("Autonomie");

      jLabel19.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel19.setForeground(new java.awt.Color(0, 0, 0));
      jLabel19.setText("Motivation");

      jLabel20.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel20.setForeground(new java.awt.Color(0, 0, 0));
      jLabel20.setText("Initiative");

      jLabel21.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel21.setForeground(new java.awt.Color(0, 0, 0));
      jLabel21.setText("Relation");

      btnEvaluationEvaluation.setBackground(new java.awt.Color(0, 51, 102));
      btnEvaluationEvaluation.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      btnEvaluationEvaluation.setForeground(new java.awt.Color(255, 255, 255));
      btnEvaluationEvaluation.setText("Evaluer");
      btnEvaluationEvaluation.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnEvaluationEvaluationActionPerformed(evt);
         }
      });

      btnEffacerEvaluation.setBackground(new java.awt.Color(0, 51, 102));
      btnEffacerEvaluation.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      btnEffacerEvaluation.setForeground(new java.awt.Color(255, 255, 255));
      btnEffacerEvaluation.setText("Effacer");
      btnEffacerEvaluation.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnEffacerEvaluationActionPerformed(evt);
         }
      });

      btnChercherEvaluation.setBackground(new java.awt.Color(0, 51, 102));
      btnChercherEvaluation.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      btnChercherEvaluation.setForeground(new java.awt.Color(255, 255, 255));
      btnChercherEvaluation.setText("Chercher");
      btnChercherEvaluation.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnChercherEvaluationActionPerformed(evt);
         }
      });

      txtIdEvaluation.setForeground(new java.awt.Color(0, 0, 0));

      jLabel22.setForeground(new java.awt.Color(0, 0, 0));
      jLabel22.setText("Id");

      jPanel4.setBackground(new java.awt.Color(0, 51, 102));
      jPanel4.setForeground(new java.awt.Color(255, 255, 255));

      jLabel25.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel25.setForeground(new java.awt.Color(255, 255, 255));
      jLabel25.setText("Formulaire d'Evaluation");

      labelUser.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      labelUser.setForeground(new java.awt.Color(255, 255, 255));
      labelUser.setText("jLabel27");

      javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
      jPanel4.setLayout(jPanel4Layout);
      jPanel4Layout.setHorizontalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(labelUser)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel25)
            .addContainerGap())
      );
      jPanel4Layout.setVerticalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel4Layout.createSequentialGroup()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel25)
               .addComponent(labelUser))
            .addGap(0, 0, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
      jPanel8.setLayout(jPanel8Layout);
      jPanel8Layout.setHorizontalGroup(
         jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel8Layout.createSequentialGroup()
            .addGap(97, 97, 97)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(jLabel15)
                  .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING))
               .addComponent(jLabel13)
               .addComponent(jLabel12)
               .addComponent(jLabel11)
               .addComponent(jLabel10)
               .addComponent(jLabel22))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(txtAdresseEvaluation, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                  .addComponent(txtFonctionEvaluation)
                  .addComponent(txtNaissanceEvaluation))
               .addComponent(txtIdEvaluation, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(txtEmailEvaluation, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtNomEvaluation, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addComponent(txtPhoneEvaluation, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                  .addComponent(btnChercherEvaluation, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(btnEvaluationEvaluation, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(btnEffacerEvaluation, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addComponent(cmbRelation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                     .addComponent(jLabel20)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(cmbInitiative, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                     .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                           .addComponent(jLabel16)
                           .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING))
                        .addComponent(jLabel17))
                     .addGap(18, 18, 18)
                     .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmbMotivation, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbAutonomie, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbQlT, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbQT, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGap(0, 84, Short.MAX_VALUE))
         .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      jPanel8Layout.setVerticalGroup(
         jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel8Layout.createSequentialGroup()
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(64, 64, 64)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtIdEvaluation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(cmbQT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel16)
               .addComponent(jLabel22))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel8Layout.createSequentialGroup()
                  .addGap(27, 27, 27)
                  .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel17)
                     .addComponent(cmbQlT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addGroup(jPanel8Layout.createSequentialGroup()
                  .addGap(18, 18, 18)
                  .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(txtNomEvaluation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel10))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtEmailEvaluation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel11)
               .addComponent(jLabel18)
               .addComponent(cmbAutonomie, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(34, 34, 34)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtPhoneEvaluation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel12)
               .addComponent(cmbMotivation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel19))
            .addGap(38, 38, 38)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtAdresseEvaluation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel13)
               .addComponent(cmbInitiative, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel20))
            .addGap(46, 46, 46)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtFonctionEvaluation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel14)
               .addComponent(cmbRelation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel21))
            .addGap(41, 41, 41)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnEffacerEvaluation, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnEvaluationEvaluation, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnChercherEvaluation, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(txtNaissanceEvaluation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel15))
            .addGap(77, 77, 77))
      );

      espace.addTab("tab1", jPanel8);

      jPanel9.setBackground(new java.awt.Color(204, 204, 255));
      jPanel9.setForeground(new java.awt.Color(0, 0, 0));

      dataTableAgent.setBackground(new java.awt.Color(255, 255, 255));
      dataTableAgent.setFont(new java.awt.Font("Mallanna", 0, 16)); // NOI18N
      dataTableAgent.setForeground(new java.awt.Color(0, 0, 0));
      dataTableAgent.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {

         },
         new String [] {
            "Id", "Nom", "Téléphone", "Email", "Naissance", "Adresse", "Fonction"
         }
      ));
      dataTableAgent.setGridColor(new java.awt.Color(255, 255, 255));
      dataTableAgent.getTableHeader().setResizingAllowed(false);
      dataTableAgent.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            dataTableAgentMouseClicked(evt);
         }
      });
      jScrollPane1.setViewportView(dataTableAgent);

      txtNom.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      txtNom.setForeground(new java.awt.Color(0, 0, 0));

      txtEmail.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      txtEmail.setForeground(new java.awt.Color(0, 0, 0));

      txtAdresse.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      txtAdresse.setForeground(new java.awt.Color(0, 0, 0));
      txtAdresse.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtAdresseActionPerformed(evt);
         }
      });

      txtTelephonr.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      txtTelephonr.setForeground(new java.awt.Color(0, 0, 0));

      txtDate.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      txtDate.setForeground(new java.awt.Color(0, 0, 0));

      txtFonction.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      txtFonction.setForeground(new java.awt.Color(0, 0, 0));

      btnAjout.setBackground(new java.awt.Color(0, 51, 102));
      btnAjout.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      btnAjout.setForeground(new java.awt.Color(255, 255, 255));
      btnAjout.setText("Ajouter");
      btnAjout.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAjoutActionPerformed(evt);
         }
      });

      btnSupprimer.setBackground(new java.awt.Color(0, 51, 102));
      btnSupprimer.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      btnSupprimer.setForeground(new java.awt.Color(255, 255, 255));
      btnSupprimer.setText("Supprimer");
      btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnSupprimerActionPerformed(evt);
         }
      });

      btnModifier.setBackground(new java.awt.Color(0, 51, 102));
      btnModifier.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      btnModifier.setForeground(new java.awt.Color(255, 255, 255));
      btnModifier.setText("Modifier");
      btnModifier.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnModifierActionPerformed(evt);
         }
      });

      jLabel1.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel1.setForeground(new java.awt.Color(0, 0, 0));
      jLabel1.setText("Nom");

      jLabel2.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel2.setForeground(new java.awt.Color(0, 0, 0));
      jLabel2.setText("Email");

      jLabel3.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel3.setForeground(new java.awt.Color(0, 0, 0));
      jLabel3.setText("Phone");

      jLabel4.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel4.setForeground(new java.awt.Color(0, 0, 0));
      jLabel4.setText("Adresse");

      jLabel5.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel5.setForeground(new java.awt.Color(0, 0, 0));
      jLabel5.setText("Fonction");

      jLabel6.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel6.setForeground(new java.awt.Color(0, 0, 0));
      jLabel6.setText("Naissance");

      jPanel5.setBackground(new java.awt.Color(0, 51, 102));
      jPanel5.setForeground(new java.awt.Color(255, 255, 255));

      jLabel27.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel27.setForeground(new java.awt.Color(255, 255, 255));
      jLabel27.setText("Formulaire d'Ajouts");

      labelUser1.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      labelUser1.setForeground(new java.awt.Color(255, 255, 255));
      labelUser1.setText("jLabel27");

      javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
      jPanel5.setLayout(jPanel5Layout);
      jPanel5Layout.setHorizontalGroup(
         jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(labelUser1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel27)
            .addContainerGap())
      );
      jPanel5Layout.setVerticalGroup(
         jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(labelUser1))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
      jPanel9.setLayout(jPanel9Layout);
      jPanel9Layout.setHorizontalGroup(
         jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel9Layout.createSequentialGroup()
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel9Layout.createSequentialGroup()
                  .addGap(81, 81, 81)
                  .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel5)
                     .addComponent(jLabel2)
                     .addComponent(jLabel1))
                  .addGap(28, 28, 28))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(jLabel6)
                  .addGap(18, 18, 18)))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel9Layout.createSequentialGroup()
                  .addComponent(txtFonction, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addContainerGap())
               .addGroup(jPanel9Layout.createSequentialGroup()
                  .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201))
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                           .addGroup(jPanel9Layout.createSequentialGroup()
                              .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jLabel3))
                           .addGroup(jPanel9Layout.createSequentialGroup()
                              .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                  .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                     .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(txtAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(txtTelephonr, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
         .addGroup(jPanel9Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      jPanel9Layout.setVerticalGroup(
         jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtTelephonr, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel3)
               .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel1))
            .addGap(18, 18, 18)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel4)
               .addComponent(txtAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel2))
            .addGap(18, 18, 18)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtFonction, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel5))
            .addGap(18, 18, 18)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel6)
               .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(16, 16, 16))
      );

      espace.addTab("tab2", jPanel9);

      jPanel11.setBackground(new java.awt.Color(204, 204, 255));
      jPanel11.setForeground(new java.awt.Color(0, 0, 0));

      dataEvaluationTable.setBackground(new java.awt.Color(255, 255, 255));
      dataEvaluationTable.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      dataEvaluationTable.setForeground(new java.awt.Color(0, 0, 0));
      dataEvaluationTable.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {
            {null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null}
         },
         new String [] {
            "Id", "IdAgent", "NomAgent", "emailAgent", "QuantiteTravail", "QualiteTravail", "Autonomie", "Motivation de travail", "Initiative", "Relation", "Date"
         }
      ));
      dataEvaluationTable.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            dataEvaluationTableMouseClicked(evt);
         }
      });
      jScrollPane3.setViewportView(dataEvaluationTable);

      btnAjouterEvaluation.setBackground(new java.awt.Color(0, 51, 102));
      btnAjouterEvaluation.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      btnAjouterEvaluation.setForeground(new java.awt.Color(255, 255, 255));
      btnAjouterEvaluation.setText("Ajouter");
      btnAjouterEvaluation.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAjouterEvaluationActionPerformed(evt);
         }
      });

      btnReinitialiserEvaluation.setBackground(new java.awt.Color(0, 51, 102));
      btnReinitialiserEvaluation.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      btnReinitialiserEvaluation.setForeground(new java.awt.Color(255, 255, 255));
      btnReinitialiserEvaluation.setText("Reinitialiser");
      btnReinitialiserEvaluation.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnReinitialiserEvaluationActionPerformed(evt);
         }
      });

      jPanel3.setBackground(new java.awt.Color(0, 51, 102));
      jPanel3.setForeground(new java.awt.Color(255, 255, 255));

      jLabel28.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel28.setForeground(new java.awt.Color(255, 255, 255));
      jLabel28.setText("Manage Evaluations");

      labelUser2.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      labelUser2.setForeground(new java.awt.Color(255, 255, 255));
      labelUser2.setText("jLabel27");

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(labelUser2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel28)
            .addContainerGap())
      );
      jPanel3Layout.setVerticalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(labelUser2))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
      jPanel11.setLayout(jPanel11Layout);
      jPanel11Layout.setHorizontalGroup(
         jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAjouterEvaluation, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btnReinitialiserEvaluation, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(38, 38, 38))
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
            .addContainerGap())
         .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      jPanel11Layout.setVerticalGroup(
         jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnAjouterEvaluation, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnReinitialiserEvaluation, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );

      espace.addTab("tab4", jPanel11);

      jPanel10.setBackground(new java.awt.Color(204, 204, 255));
      jPanel10.setForeground(new java.awt.Color(0, 0, 0));

      jLabel7.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel7.setForeground(new java.awt.Color(0, 0, 0));
      jLabel7.setText("Email");

      jLabel8.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel8.setForeground(new java.awt.Color(0, 0, 0));
      jLabel8.setText("Mot de passe");

      jLabel9.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel9.setForeground(new java.awt.Color(0, 0, 0));
      jLabel9.setText("Confirmation");

      txtEmailDrh.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      txtEmailDrh.setForeground(new java.awt.Color(0, 0, 0));

      txtPassword.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      txtPassword.setForeground(new java.awt.Color(0, 0, 0));

      txtConfirmation.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      txtConfirmation.setForeground(new java.awt.Color(0, 0, 0));

      btnAjouterDrh.setBackground(new java.awt.Color(0, 51, 102));
      btnAjouterDrh.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      btnAjouterDrh.setForeground(new java.awt.Color(255, 255, 255));
      btnAjouterDrh.setText("Ajouter");
      btnAjouterDrh.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAjouterDrhActionPerformed(evt);
         }
      });

      btnSupprimerDrh.setBackground(new java.awt.Color(0, 51, 102));
      btnSupprimerDrh.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      btnSupprimerDrh.setForeground(new java.awt.Color(255, 255, 255));
      btnSupprimerDrh.setText("Supprimer");
      btnSupprimerDrh.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnSupprimerDrhActionPerformed(evt);
         }
      });

      btnModifierDrh.setBackground(new java.awt.Color(0, 51, 102));
      btnModifierDrh.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      btnModifierDrh.setForeground(new java.awt.Color(255, 255, 255));
      btnModifierDrh.setText("Modifier");
      btnModifierDrh.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnModifierDrhActionPerformed(evt);
         }
      });

      dataDrhTable.setBackground(new java.awt.Color(255, 255, 255));
      dataDrhTable.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      dataDrhTable.setForeground(new java.awt.Color(0, 0, 0));
      dataDrhTable.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {

         },
         new String [] {
            "Id", "Email", "Mot de Passe"
         }
      ));
      dataDrhTable.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            dataDrhTableMouseClicked(evt);
         }
      });
      jScrollPane2.setViewportView(dataDrhTable);

      jPanel7.setBackground(new java.awt.Color(0, 51, 102));
      jPanel7.setForeground(new java.awt.Color(255, 255, 255));

      jLabel29.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      jLabel29.setForeground(new java.awt.Color(255, 255, 255));
      jLabel29.setText("Manage DRH");

      labelUser3.setFont(new java.awt.Font("Mallanna", 0, 19)); // NOI18N
      labelUser3.setForeground(new java.awt.Color(255, 255, 255));
      labelUser3.setText("jLabel27");

      javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
      jPanel7.setLayout(jPanel7Layout);
      jPanel7Layout.setHorizontalGroup(
         jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(labelUser3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel29)
            .addContainerGap())
      );
      jPanel7Layout.setVerticalGroup(
         jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel7Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(labelUser3))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
      jPanel10.setLayout(jPanel10Layout);
      jPanel10Layout.setHorizontalGroup(
         jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel10Layout.createSequentialGroup()
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                  .addGap(79, 79, 79)
                  .addComponent(jLabel9)
                  .addGap(26, 26, 26)
                  .addComponent(txtConfirmation, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(191, 191, 191)
                  .addComponent(btnModifierDrh, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(btnSupprimerDrh, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(btnAjouterDrh, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                  .addContainerGap()
                  .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                           .addGroup(jPanel10Layout.createSequentialGroup()
                              .addComponent(jLabel7)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(txtEmailDrh, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                           .addGroup(jPanel10Layout.createSequentialGroup()
                              .addComponent(jLabel8)
                              .addGap(18, 18, 18)
                              .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
            .addContainerGap(9, Short.MAX_VALUE))
         .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      jPanel10Layout.setVerticalGroup(
         jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel10Layout.createSequentialGroup()
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel10Layout.createSequentialGroup()
                  .addGap(44, 44, 44)
                  .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(txtEmailDrh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel7))
                  .addGap(18, 18, 18)
                  .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel8))
                  .addGap(18, 18, 18)
                  .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(txtConfirmation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel9)))
               .addGroup(jPanel10Layout.createSequentialGroup()
                  .addGap(147, 147, 147)
                  .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(btnModifierDrh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(btnSupprimerDrh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(btnAjouterDrh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      espace.addTab("tab3", jPanel10);

      getContentPane().add(espace, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, -30, 870, 660));

      pack();
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

   private void btnEvaluationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluationActionPerformed
      // TODO add your handling code here:
      espace.setSelectedIndex(0);
   }//GEN-LAST:event_btnEvaluationActionPerformed

   private void btnAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgentActionPerformed
      // TODO add your handling code here:
      espace.setSelectedIndex(1);
   }//GEN-LAST:event_btnAgentActionPerformed

   private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      // TODO add your handling code here:
      espace.setSelectedIndex(3);
   }//GEN-LAST:event_jButton3ActionPerformed

   private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      // TODO add your handling code here:
      espace.setSelectedIndex(2);
   }//GEN-LAST:event_jButton5ActionPerformed

   private void btnAjouterDrhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterDrhActionPerformed
      // TODO add your handling code here:
      if (txtEmailDrh.getText().isEmpty() || txtPassword.getText().isEmpty() || txtConfirmation.getText().isEmpty()) {
         JOptionPane.showMessageDialog(null, "Erreur");
      } else if (txtPassword.getText().equals(txtConfirmation.getText())) {
         try {
            DrhDaoHibernate drhDaoHibernate = new DrhDaoHibernate();
            Drh drh = new Drh();

            drh.setEmail(txtEmailDrh.getText());
            drh.setMotDePasse(txtPassword.getText());

            drhDaoHibernate.ajouterDrh(drh);
         } catch (Exception e) {

         }
         this.clearDrh();
         this.voirDrh();
      } else {
         JOptionPane.showMessageDialog(null, "Erreur");
      }
   }//GEN-LAST:event_btnAjouterDrhActionPerformed

   private void btnAjouterEvaluationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterEvaluationActionPerformed
      // TODO add your handling code here:
      espace.setSelectedIndex(0);
   }//GEN-LAST:event_btnAjouterEvaluationActionPerformed

   private void txtEmailEvaluationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailEvaluationActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_txtEmailEvaluationActionPerformed

   private void txtPhoneEvaluationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneEvaluationActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_txtPhoneEvaluationActionPerformed

   private void txtFonctionEvaluationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFonctionEvaluationActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_txtFonctionEvaluationActionPerformed

   private void btnChercherEvaluationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChercherEvaluationActionPerformed
      // TODO add your handling code here:
      if (txtIdEvaluation.getText().equals("")) {
         JOptionPane.showMessageDialog(null, "Erreur");
      } else {
         try {
            Agent agent = new Agent();
            AgentDaoHibernate agentDaoHibernate = new AgentDaoHibernate();
            ResultSet rs = agentDaoHibernate.rechercherAgent(Integer.parseInt(txtIdEvaluation.getText()));

            while (rs.next()) {
               txtIdEvaluation.setText(String.valueOf(rs.getInt("Id")));
               txtNomEvaluation.setText(rs.getString("Nom"));
               txtAdresseEvaluation.setText(rs.getString("Adresse"));
               txtEmailEvaluation.setText(rs.getString("Email"));
               txtFonctionEvaluation.setText(rs.getString("Fonction"));
               txtPhoneEvaluation.setText(rs.getString("Telephone"));
               txtNaissanceEvaluation.setText(rs.getString("DateNaissance"));
            }
         } catch (NumberFormatException | SQLException e) {
         }
      }
   }//GEN-LAST:event_btnChercherEvaluationActionPerformed

   private void btnEffacerEvaluationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEffacerEvaluationActionPerformed
      // TODO add your handling code here:
      this.clearEvaluation();
   }//GEN-LAST:event_btnEffacerEvaluationActionPerformed

   private void btnEvaluationEvaluationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluationEvaluationActionPerformed
      // TODO add your handling code here:
      if (txtNomEvaluation.getText().isEmpty()
              || cmbInitiative.getSelectedItem().equals("Mention")
              || cmbAutonomie.getSelectedItem().equals("Motivation")
              || cmbQT.getSelectedItem().equals("Motivation")
              || cmbQlT.getSelectedItem().equals("Motivation")
              || cmbMotivation.getSelectedItem().equals("Motivation")
              || cmbRelation.getSelectedItem().equals("Motivation")) {
         JOptionPane.showMessageDialog(null, "Erreur");
      } else {
         try {
            Evaluation evaluation = new Evaluation();
            EvaluationDaoHibernate evaluationDaoHibernate = new EvaluationDaoHibernate();
            evaluation.setNomAgent(txtNomEvaluation.getText());
            evaluation.setNomDrh(this.user);
            evaluation.setIdAgent(Integer.parseInt(txtIdEvaluation.getText()));
            evaluation.setPriseInitiative((String) cmbInitiative.getSelectedItem());
            evaluation.setAutonomie((String) cmbAutonomie.getSelectedItem());
            evaluation.setQuantiteTravail((String) cmbQT.getSelectedItem());
            evaluation.setQualiteTravail((String) cmbQlT.getSelectedItem());
            evaluation.setMotivation((String) cmbMotivation.getSelectedItem());
            evaluation.setRelation((String) cmbRelation.getSelectedItem());

            evaluationDaoHibernate.ajoutEvaluation(evaluation, Integer.parseInt(txtIdEvaluation.getText()));
            this.clearEvaluation();
            this.voirEvaluation();
         } catch (NumberFormatException e) {
         }
      }
   }//GEN-LAST:event_btnEvaluationEvaluationActionPerformed

   private void btnReinitialiserEvaluationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReinitialiserEvaluationActionPerformed
      // TODO add your handling code here:
      this.reinitialiser();
      this.voirEvaluation();
   }//GEN-LAST:event_btnReinitialiserEvaluationActionPerformed

   private void dataDrhTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataDrhTableMouseClicked
      // TODO add your handling code here:
      this.id = (int) dataDrhTable.getValueAt(dataDrhTable.getSelectedRow(), 0);
      txtEmailDrh.setText(dataDrhTable.getValueAt(dataDrhTable.getSelectedRow(), 1).toString());
      txtPassword.setText(dataDrhTable.getValueAt(dataDrhTable.getSelectedRow(), 2).toString());
      txtConfirmation.setText(dataDrhTable.getValueAt(dataDrhTable.getSelectedRow(), 2).toString());
   }//GEN-LAST:event_dataDrhTableMouseClicked

   private void dataEvaluationTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataEvaluationTableMouseClicked
      // TODO add your handling code here:
   }//GEN-LAST:event_dataEvaluationTableMouseClicked

   private void btnSupprimerDrhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerDrhActionPerformed
      // TODO add your handling code here:
      DrhDaoHibernate drhDaoHibernate = new DrhDaoHibernate();
      drhDaoHibernate.supprimerDrh(this.id);
      this.voirDrh();
      this.clearDrh();
   }//GEN-LAST:event_btnSupprimerDrhActionPerformed

   private void btnModifierDrhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierDrhActionPerformed
      // TODO add your handling code here:
      if (txtEmailDrh.getText().isEmpty() || txtPassword.getText().isEmpty() || txtConfirmation.getText().isEmpty()) {
         JOptionPane.showMessageDialog(null, "Erreur");
      } else if (txtPassword.getText().equals(txtConfirmation.getText())) {
         DrhDaoHibernate drhDaoHibernate = new DrhDaoHibernate();
         Drh drh = new Drh();
         drh.setId(this.id);
         drh.setEmail(txtEmailDrh.getText());
         drh.setMotDePasse(txtPassword.getText());
         drhDaoHibernate.modifierDrh(drh);
         this.clearDrh();
         this.voirDrh();
      } else {
         JOptionPane.showMessageDialog(null, "Erreur");
      }
   }//GEN-LAST:event_btnModifierDrhActionPerformed

   private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
      // TODO add your handling code here:
      if (txtNom.getText().isEmpty()
         || txtEmail.getText().isEmpty()
         || txtAdresse.getText().isEmpty()
         || txtTelephonr.getText().isEmpty()
         || txtDate.getText().isEmpty()
         || txtFonction.getText().isEmpty()) {
         JOptionPane.showMessageDialog(null, "Erreur");
      } else {
         AgentDaoHibernate agentDaoHibernate = new AgentDaoHibernate();
         Agent agent = new Agent();
         agent.setId(this.id);
         agent.setNom(txtNom.getText());
         agent.setEmail(txtEmail.getText());
         agent.setTelephone(txtTelephonr.getText());
         agent.setAdresse(txtAdresse.getText());
         agent.setFonction(txtFonction.getText());
         agent.setDateNaissance(txtDate.getText());

         agentDaoHibernate.modifierAgent(agent);
         this.voirAgents();
         this.clearAgent();
      }
   }//GEN-LAST:event_btnModifierActionPerformed

   private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
      // TODO add your handling code here:
      AgentDaoHibernate agentDaoHibernate = new AgentDaoHibernate();
      agentDaoHibernate.supprimerAgent(this.id);
      this.voirAgents();
      this.clearAgent();
   }//GEN-LAST:event_btnSupprimerActionPerformed

   private void btnAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjoutActionPerformed
      // TODO add your handling code here:
      if (txtNom.getText().isEmpty()
         || txtEmail.getText().isEmpty()
         || txtAdresse.getText().isEmpty()
         || txtTelephonr.getText().isEmpty()
         || txtDate.getText().isEmpty()
         || txtFonction.getText().isEmpty()) {
         JOptionPane.showMessageDialog(null, "Erreur");
      } else {
         try {
            AgentDaoHibernate agentDaoHibernate = new AgentDaoHibernate();
            Agent agent = new Agent();
            agent.setNom(txtNom.getText());
            agent.setTelephone(txtTelephonr.getText());
            agent.setAdresse(txtAdresse.getText());
            agent.setDateNaissance(txtDate.getText());
            agent.setEmail(txtEmail.getText());
            agent.setFonction(txtFonction.getText());

            agentDaoHibernate.ajouterAgent(agent);
         } catch (Exception e) {
         }

         this.clearAgent();
         voirAgents();
      }
   }//GEN-LAST:event_btnAjoutActionPerformed

   private void txtAdresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdresseActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_txtAdresseActionPerformed

   private void dataTableAgentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTableAgentMouseClicked
      // TODO add your handling code here:
      this.id = (int) dataTableAgent.getValueAt(dataTableAgent.getSelectedRow(), 0);
      txtNom.setText(dataTableAgent.getValueAt(dataTableAgent.getSelectedRow(), 1).toString());
      txtEmail.setText(dataTableAgent.getValueAt(dataTableAgent.getSelectedRow(), 3).toString());
      txtTelephonr.setText(dataTableAgent.getValueAt(dataTableAgent.getSelectedRow(), 2).toString());
      txtAdresse.setText(dataTableAgent.getValueAt(dataTableAgent.getSelectedRow(), 5).toString());
      txtFonction.setText(dataTableAgent.getValueAt(dataTableAgent.getSelectedRow(), 6).toString());
      txtDate.setText(dataTableAgent.getValueAt(dataTableAgent.getSelectedRow(), 4).toString());
   }//GEN-LAST:event_dataTableAgentMouseClicked

   private void btnQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitterActionPerformed
      // TODO add your handling code here:
      System.exit(0);
   }//GEN-LAST:event_btnQuitterActionPerformed

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
         java.util.logging.Logger.getLogger(DrhAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(DrhAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(DrhAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(DrhAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new DrhAdmin().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnAgent;
   private javax.swing.JButton btnAjout;
   private javax.swing.JButton btnAjouterDrh;
   private javax.swing.JButton btnAjouterEvaluation;
   private javax.swing.JButton btnChercherEvaluation;
   private javax.swing.JButton btnEffacerEvaluation;
   private javax.swing.JButton btnEvaluation;
   private javax.swing.JButton btnEvaluationEvaluation;
   private javax.swing.JButton btnModifier;
   private javax.swing.JButton btnModifierDrh;
   private javax.swing.JButton btnQuitter;
   private javax.swing.JButton btnReinitialiserEvaluation;
   private javax.swing.JButton btnSupprimer;
   private javax.swing.JButton btnSupprimerDrh;
   private javax.swing.JComboBox<String> cmbAutonomie;
   private javax.swing.JComboBox<String> cmbInitiative;
   private javax.swing.JComboBox<String> cmbMotivation;
   private javax.swing.JComboBox<String> cmbQT;
   private javax.swing.JComboBox<String> cmbQlT;
   private javax.swing.JComboBox<String> cmbRelation;
   private javax.swing.JTable dataDrhTable;
   private javax.swing.JTable dataEvaluationTable;
   private javax.swing.JTable dataTableAgent;
   private javax.swing.JTabbedPane espace;
   private javax.swing.JButton jButton2;
   private javax.swing.JButton jButton3;
   private javax.swing.JButton jButton4;
   private javax.swing.JButton jButton5;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel10;
   private javax.swing.JLabel jLabel11;
   private javax.swing.JLabel jLabel12;
   private javax.swing.JLabel jLabel13;
   private javax.swing.JLabel jLabel14;
   private javax.swing.JLabel jLabel15;
   private javax.swing.JLabel jLabel16;
   private javax.swing.JLabel jLabel17;
   private javax.swing.JLabel jLabel18;
   private javax.swing.JLabel jLabel19;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel20;
   private javax.swing.JLabel jLabel21;
   private javax.swing.JLabel jLabel22;
   private javax.swing.JLabel jLabel24;
   private javax.swing.JLabel jLabel25;
   private javax.swing.JLabel jLabel26;
   private javax.swing.JLabel jLabel27;
   private javax.swing.JLabel jLabel28;
   private javax.swing.JLabel jLabel29;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JLabel jLabel9;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel10;
   private javax.swing.JPanel jPanel11;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JPanel jPanel4;
   private javax.swing.JPanel jPanel5;
   private javax.swing.JPanel jPanel6;
   private javax.swing.JPanel jPanel7;
   private javax.swing.JPanel jPanel8;
   private javax.swing.JPanel jPanel9;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JScrollPane jScrollPane3;
   private javax.swing.JTabbedPane jTabbedPane2;
   private javax.swing.JLabel labelUser;
   private javax.swing.JLabel labelUser1;
   private javax.swing.JLabel labelUser2;
   private javax.swing.JLabel labelUser3;
   private javax.swing.JTextField txtAdresse;
   private javax.swing.JTextField txtAdresseEvaluation;
   private javax.swing.JTextField txtConfirmation;
   private javax.swing.JTextField txtDate;
   private javax.swing.JTextField txtEmail;
   private javax.swing.JTextField txtEmailDrh;
   private javax.swing.JTextField txtEmailEvaluation;
   private javax.swing.JTextField txtFonction;
   private javax.swing.JTextField txtFonctionEvaluation;
   private javax.swing.JTextField txtIdEvaluation;
   private javax.swing.JTextField txtNaissanceEvaluation;
   private javax.swing.JTextField txtNom;
   private javax.swing.JTextField txtNomEvaluation;
   private javax.swing.JTextField txtPassword;
   private javax.swing.JTextField txtPhoneEvaluation;
   private javax.swing.JTextField txtTelephonr;
   // End of variables declaration//GEN-END:variables
}
