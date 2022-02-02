/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.agent;

import model.Agent;
import java.sql.ResultSet;
import dao.DatabaseConnect;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ortega
 */
public class AgentDaoHibernate implements AgentDao{
   DatabaseConnect dbconnect =  new DatabaseConnect();

   public AgentDaoHibernate() {
     
   }
   
   
   
   @Override
   public void ajouterAgent(Agent agent) {
      PreparedStatement ps;
      String sql = "insert into AGENT(Nom,Telephone,Email,DateNaissance,Adresse,Fonction) values (?,?,?,?,?,?)";
      Connection connection;
      try {
         Class.forName(dbconnect.getDriver());
         connection = DriverManager.getConnection
                                    (dbconnect.getUrl(),dbconnect.getUsername(),dbconnect.getPassword());
         ps = connection.prepareStatement(sql);
         ps.setString(1, agent.getNom());
         ps.setString(2, agent.getTelephone());
         ps.setString(3, agent.getEmail());
         ps.setString(4, agent.getDateNaissance());
         ps.setString(5, agent.getAdresse());
         ps.setString(6, agent.getFonction());
         
         /* run query */
         ps.execute();
         JOptionPane.showMessageDialog(null, "Insertion réusie");
         

         
         
      } catch (SQLException | ClassNotFoundException e) {
         JOptionPane.showMessageDialog(null, "Echec d'enregistrement dans la base des données");
         System.out.println("[×] Erreur -> "+e.getMessage());
      }
   }

   @Override
   public void supprimerAgent(int id) {
      PreparedStatement ps = null;
      String sql = "delete from AGENT where Id=?";
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
   public void modifierAgent(Agent agent) {
      PreparedStatement ps = null;
      String sql = "update AGENT set Nom = ? ,Telephone = ? ,Email = ? ,DateNaissance = ? ,Adresse = ? ,Fonction = ? where Id = ?;";
      Connection connection = null;
      try {
         Class.forName(dbconnect.getDriver());
         connection = DriverManager.getConnection
                                    (dbconnect.getUrl(),dbconnect.getUsername(),dbconnect.getPassword());
         ps = connection.prepareStatement(sql);
         ps.setString(1, agent.getNom());
         ps.setString(2, agent.getTelephone());
         ps.setString(3, agent.getEmail());
         ps.setString(4, agent.getDateNaissance());
         ps.setString(5, agent.getAdresse());
         ps.setString(6, agent.getFonction());
         ps.setInt(7, agent.getId());
         
         /* run query */
         ps.execute();
         JOptionPane.showMessageDialog(null, "Modification réusie");
         
         
      } catch (SQLException |ClassNotFoundException e) {
         JOptionPane.showMessageDialog(null, "Echec de modification dans la base des données");
         System.out.println("[×] Erreur -> "+e.getMessage());
      }
   }

   @Override
   public ResultSet rechercherAgent(int id) {
      PreparedStatement ps = null;
      String sql = "select * from AGENT where Id = ? and EstEvalue = ?;";
      Connection connection = null;
      ResultSet rs = null;
      try {
         Class.forName(dbconnect.getDriver());
         connection = DriverManager.getConnection
                                    (dbconnect.getUrl(),dbconnect.getUsername(),dbconnect.getPassword());
         ps = connection.prepareStatement(sql);
         ps.setInt(1, id);
         ps.setInt(2, 0);
         
         /* run query */
         rs = ps.executeQuery();
         return rs;
      } catch (SQLException | ClassNotFoundException e) {
         JOptionPane.showMessageDialog(null, "Echec de la recherche dans la base des données");
         System.out.println("[×] Erreur -> "+e.getMessage());
      }
      return null;
   }

   @Override
   public ResultSet afficherAgents() {
      PreparedStatement ps = null;
      String sql = "select * from AGENT";
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
   
   
}
