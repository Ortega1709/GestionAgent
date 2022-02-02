/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.drh;
import model.Drh;
import java.sql.ResultSet;

/**
 *
 * @author ortega
 */
public interface DrhDao {
   /* actions */
   public void ajouterDrh(Drh drh);
   public void supprimerDrh(int id);
   public void modifierDrh(Drh drh);
   public ResultSet afficherDrhs();
   public boolean loginDrh(String email,String password);
   public ResultSet showDrhSession();
   public void updateDrhSession(String email);
}
