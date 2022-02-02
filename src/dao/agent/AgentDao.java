/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.agent;
import java.sql.ResultSet;
import model.Agent;

/**
 *
 * @author ortega
 */
public interface AgentDao {
   
   /* action */
   public void ajouterAgent(Agent agent);
   public void supprimerAgent(int id);
   public void modifierAgent(Agent agent);
   public ResultSet rechercherAgent(int id);
   public ResultSet afficherAgents();
   
}
