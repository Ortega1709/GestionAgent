
import dao.agent.AgentDaoHibernate;
import dao.drh.DrhDaoHibernate;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Agent;

/*0
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ortega
 */
public class Test {
   public static void main(String[] args) throws SQLException {
      
      
      Agent agent = new Agent();
      
      DrhDaoHibernate drhH = new DrhDaoHibernate();
      System.out.println(drhH.loginDrh("kabweortega@gmail.com", "observateur17092002"));
      
      
   }
}
