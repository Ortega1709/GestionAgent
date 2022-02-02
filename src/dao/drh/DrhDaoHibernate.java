/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.drh;

import dao.DatabaseConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import model.Drh;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author ortega
 */
public class DrhDaoHibernate implements DrhDao{
   DatabaseConnect dbconnect =  new DatabaseConnect();
   
   public DrhDaoHibernate(){}
   
   @Override
   public void ajouterDrh(Drh drh) {
      PreparedStatement ps;
      String sql = "insert into DRH (Email,MotDePasse) values (?,?);";
      Connection connection;
      try {
         Class.forName(dbconnect.getDriver());
         connection = DriverManager.getConnection
                                    (dbconnect.getUrl(),dbconnect.getUsername(),dbconnect.getPassword());
         ps = connection.prepareStatement(sql);
         ps.setString(1, drh.getEmail());
         ps.setString(2, drh.getMotDePasse());
         
         /* run query */
         ps.execute();
         JOptionPane.showMessageDialog(null, "Insertion réusie");
         

      } catch (SQLException | ClassNotFoundException e) {
         JOptionPane.showMessageDialog(null, "Echec d'enregistrement dans la base des données");
         System.out.println("[×] Erreur -> "+e.getMessage());
      }
   }

   @Override
   public void supprimerDrh(int id) {
      
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
   public void modifierDrh(Drh drh) {
      PreparedStatement ps = null;
      String sql = "update DRH set Email = ? ,MotDePasse = ?  where Id = ?;";
      Connection connection = null;
      try {
         Class.forName(dbconnect.getDriver());
         connection = DriverManager.getConnection
                                    (dbconnect.getUrl(),dbconnect.getUsername(),dbconnect.getPassword());
         ps = connection.prepareStatement(sql);
         ps.setString(1, drh.getEmail());
         ps.setString(2, drh.getMotDePasse());
         ps.setInt(3, drh.getId());
      
         /* run query */
         ps.execute();
         JOptionPane.showMessageDialog(null, "Modification réusie");
         
         
      } catch (SQLException |ClassNotFoundException e) {
         JOptionPane.showMessageDialog(null, "Echec de modification dans la base des données");
         System.out.println("[×] Erreur -> "+e.getMessage());
      }
   }

   @Override
   public ResultSet afficherDrhs() {
      
      PreparedStatement ps = null;
      String sql = "select * from DRH";
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
         JOptionPane.showMessageDialog(null, "Echec de la recherche dans la base des données");
         System.out.println("[×] Erreur -> "+e.getMessage());
      }
      return null;
   }
   
   @Override
   public boolean loginDrh(String email, String password){
      
      PreparedStatement ps = null;
      String sql = "select * from DRH where Email=?";
      Connection connection = null;
      ResultSet rs = null;
      try {
         Class.forName(dbconnect.getDriver());
         connection = DriverManager.getConnection
                                    (dbconnect.getUrl(),dbconnect.getUsername(),dbconnect.getPassword());
         ps = connection.prepareStatement(sql);
         ps.setString(1, email);
         rs = ps.executeQuery();
         
         while (rs.next()) {            
            if (rs.getString("MotDePasse").equals(password)) {
               return true;
            }
         }
         return false;
        
      } catch (SQLException | ClassNotFoundException e) {
         JOptionPane.showMessageDialog(null, "Echec de la recherche dans la base des données");
         System.out.println("[×] Erreur -> "+e.getMessage());
      }
      return false;
   }
   
   @Override
   public ResultSet showDrhSession(){
      PreparedStatement ps = null;
      String sql = "select * from DRHsession";
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
         JOptionPane.showMessageDialog(null, "Echec de la recherche dans la base des données");
         System.out.println("[×] Erreur -> "+e.getMessage());
      }
      return null;
   }
   
   @Override
   public void updateDrhSession(String email){
      PreparedStatement ps = null;
      String sql = "update DRHsession set Email = ? where Id = ?;";
      Connection connection = null;
      try {
         Class.forName(dbconnect.getDriver());
         connection = DriverManager.getConnection
                                    (dbconnect.getUrl(),dbconnect.getUsername(),dbconnect.getPassword());
         ps = connection.prepareStatement(sql);
         ps.setString(1, email);
         ps.setInt(2, 1);
     
      
         /* run query */
         ps.execute();
        
      } catch (SQLException |ClassNotFoundException e) {
         JOptionPane.showMessageDialog(null, "Echec de modification dans la base des données");
         System.out.println("[×] Erreur -> "+e.getMessage());
      }
   }
}
