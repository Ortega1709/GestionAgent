/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.evaluation;
import model.Evaluation;
import java.sql.ResultSet;

/**
 *
 * @author ortega
 */
public interface EvaluationDao {
   
   /* actions */
   public void ajoutEvaluation(Evaluation evaluation, int id);
   public void supprimerEvaluation(int id);
   public void modifierEvaluation(Evaluation evaluation);
   public ResultSet afficherEvaluation();
   public void reinitialiserEvaluation();
}
