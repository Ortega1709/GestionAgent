/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.evaluation;

import dao.DatabaseConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Evaluation;

/**
 *
 * @author ortega
 */
public class EvaluationDaoHibernate implements  EvaluationDao{
   DatabaseConnect dbconnect =  new DatabaseConnect();
   
   @Override
   public void ajoutEvaluation(Evaluation evaluation, int id) {
      PreparedStatement ps;
      String sql = "insert into EVALUATION (IdAgent, NomAgent, NomDrh, QuantiteTravail, QualiteTravail, Autonomie, Motivation, PriseInitiative,Relation) values (?,?,?,?,?,?,?,?,?);";
      String sql1 = "update AGENT set EstEvalue = ? where id = ?";
      Connection connection;
      try {
         Class.forName(dbconnect.getDriver());
         connection = DriverManager.getConnection
                                    (dbconnect.getUrl(),dbconnect.getUsername(),dbconnect.getPassword());
         ps = connection.prepareStatement(sql);
         ps.setInt(1, evaluation.getIdAgent());
         ps.setString(2, evaluation.getNomAgent());
         ps.setString(3, evaluation.getNomDrh());
         ps.setString(4, evaluation.getQuantiteTravail());
         ps.setString(5, evaluation.getQualiteTravail());
         ps.setString(6, evaluation.getAutonomie());
         ps.setString(7, evaluation.getMotivation());
         ps.setString(8, evaluation.getPriseInitiative());
         ps.setString(9, evaluation.getRelation());
         
         /* run query */
         ps.execute();
         
         ps = connection.prepareStatement(sql1);
         ps.setInt(1, 1);
         ps.setInt(2, id);
         
         /* run query */
         ps.execute();
         JOptionPane.showMessageDialog(null, "Evaluation réusie");
         

      } catch (SQLException | ClassNotFoundException e) {
         JOptionPane.showMessageDialog(null, "Echec d'evaluation dans la base des données");
         System.out.println("[×] Erreur -> "+e.getMessage());
      }
   }

   @Override
   public void supprimerEvaluation(int id) {
      PreparedStatement ps = null;
      String sql = "delete from DRH where Id=?";
      Connection connection = null;
      try {
         Class.forName(dbconnect.getDriver());
         connection = DriverManager.getConnection
                                    (dbconnect.getUrl(),dbconnect.getUsername(),dbconnect.getPassword());
         ps = connection.prepareStatement(sql);
         ps.setInt(1, id);
         
         /* run query */
         ps.execute();
         JOptionPane.showMessageDialog(null, "Suppression réusie");
         
         
      } catch (SQLException |ClassNotFoundException e) {
         JOptionPane.showMessageDialog(null, "Echec de suppression dans la base des données");
         System.out.println("[×] Erreur -> "+e.getMessage());
      }
   }

   @Override
   public void modifierEvaluation(Evaluation evaluation) {
      PreparedStatement ps;
      String sql = "update EVALUATION set IdAgent=?, NomAgent=?, NomDrh=?, QuantiteTravail=?, QualiteTravail=?, Autonomie=?, Motivation=?, PriseInitiative=? where Id =?;";
      Connection connection;
      try {
         Class.forName(dbconnect.getDriver());
         connection = DriverManager.getConnection
                                    (dbconnect.getUrl(),dbconnect.getUsername(),dbconnect.getPassword());
         ps = connection.prepareStatement(sql);
         ps.setInt(1, evaluation.getIdAgent());
         ps.setString(2, evaluation.getNomAgent());
         ps.setString(3, evaluation.getNomDrh());
         ps.setString(4, evaluation.getQuantiteTravail());
         ps.setString(5, evaluation.getQualiteTravail());
         ps.setString(6, evaluation.getAutonomie());
         ps.setString(7, evaluation.getMotivation());
         ps.setString(8, evaluation.getPriseInitiative());
         ps.setInt(9, evaluation.getIdEvaluation());
         
         /* run query */
         ps.execute();
         JOptionPane.showMessageDialog(null, "Modification réusie");
         

      } catch (SQLException | ClassNotFoundException e) {
         JOptionPane.showMessageDialog(null, "Echec d'evaluation dans la base des données");
         System.out.println("[×] Erreur -> "+e.getMessage());
      }
   }

   @Override
   public ResultSet afficherEvaluation() {
      PreparedStatement ps = null;
      String sql = "select * from EVALUATION";
      Connection connection = null;
      ResultSet rs = null;
      try {
         Class.forName(dbconnect.getDriver());
         connection = DriverManager.getConnection
                                    (dbconnect.getUrl(),dbconnect.getUsername(),dbconnect.getPassword());
         ps = connection.prepareStatement(sql);
         rs = ps.executeQuery();
         return rs;
        
      } catch (SQLException | ClassNotFoundException e) {
         JOptionPane.showMessageDialog(null, "Echec d'affichage dans la base des données");
         System.out.println("[×] Erreur -> "+e.getMessage());
      }
      return null;
   }
   
   @Override
   public void reinitialiserEvaluation(){
      PreparedStatement ps = null;
      String sql = "truncate table EVALUATION";
      String sql1 = "update AGENT set EstEvalue = ?";
      Connection connection = null;
      try {
         Class.forName(dbconnect.getDriver());
         connection = DriverManager.getConnection
                                    (dbconnect.getUrl(),dbconnect.getUsername(),dbconnect.getPassword());
         ps = connection.prepareStatement(sql);
         
         /* run query */
         ps.execute();
         ps = connection.prepareStatement(sql1);
         
         /* run query */
         ps.setInt(1, 0);
         ps.execute();
         JOptionPane.showMessageDialog(null, "Réinitialisation réusie");
         
         
      } catch (SQLException |ClassNotFoundException e) {
         JOptionPane.showMessageDialog(null, "Echec de la reinitialisation");
         System.out.println("[×] Erreur -> "+e.getMessage());
      }
   }
}

   