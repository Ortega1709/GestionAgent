/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author ortega
 */
public class Evaluation {
   private int idEvaluation;
   private int idAgent;
   private String nomAgent;
   private String nomDrh;
   private String quantiteTravail;
   private String qualiteTravail;
   private String autonomie;
   private String motivation;
   private String priseInitiative;
   private String relation;
   private Date dateEvaluation;
   
   /**
    * 
    */
   public Evaluation(){
   }

   /**
    * 
    * @param idEvaluation
    * @param idAgent
    * @param nomAgent
    * @param nomDrh
    * @param quantiteTravail
    * @param qualiteTravail
    * @param autonomie
    * @param motivation
    * @param priseInitiative
    * @param relation
    * @param dateEvaluation 
    */
   public Evaluation(int idEvaluation, int idAgent, String nomAgent, String nomDrh, String quantiteTravail, String qualiteTravail, String autonomie, String motivation, String priseInitiative, String relation, Date dateEvaluation) {
      this.idEvaluation = idEvaluation;
      this.idAgent = idAgent;
      this.nomAgent = nomAgent;
      this.nomDrh = nomDrh;
      this.quantiteTravail = quantiteTravail;
      this.qualiteTravail = qualiteTravail;
      this.autonomie = autonomie;
      this.motivation = motivation;
      this.priseInitiative = priseInitiative;
      this.relation = relation;
      this.dateEvaluation = dateEvaluation;
   }
   
   /* getters and setters */

   public int getIdEvaluation() {
      return idEvaluation;
   }

   public void setIdEvaluation(int idEvaluation) {
      this.idEvaluation = idEvaluation;
   }

   public int getIdAgent() {
      return idAgent;
   }

   public void setIdAgent(int idAgent) {
      this.idAgent = idAgent;
   }

   public String getNomAgent() {
      return nomAgent;
   }

   public void setNomAgent(String nomAgent) {
      this.nomAgent = nomAgent;
   }

   public String getNomDrh() {
      return nomDrh;
   }

   public void setNomDrh(String nomDrh) {
      this.nomDrh = nomDrh;
   }

   public String getQuantiteTravail() {
      return quantiteTravail;
   }

   public void setQuantiteTravail(String quantiteTravail) {
      this.quantiteTravail = quantiteTravail;
   }

   public String getQualiteTravail() {
      return qualiteTravail;
   }

   public void setQualiteTravail(String qualiteTravail) {
      this.qualiteTravail = qualiteTravail;
   }

   public String getAutonomie() {
      return autonomie;
   }

   public void setAutonomie(String autonomie) {
      this.autonomie = autonomie;
   }

   public String getMotivation() {
      return motivation;
   }

   public void setMotivation(String motivation) {
      this.motivation = motivation;
   }

   public String getPriseInitiative() {
      return priseInitiative;
   }

   public void setPriseInitiative(String priseInitiative) {
      this.priseInitiative = priseInitiative;
   }

   public String getRelation() {
      return relation;
   }

   public void setRelation(String relation) {
      this.relation = relation;
   }

   public Date getDateEvaluation() {
      return dateEvaluation;
   }

   public void setDateEvaluation(Date dateEvaluation) {
      this.dateEvaluation = dateEvaluation;
   }
   
   
   
}
