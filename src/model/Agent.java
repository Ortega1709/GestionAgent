/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ortega
 */
public class Agent {
   private int id;
   private String nom;
   private String telephone;
   private String email;
   private String dateNaissance;
   private String adresse;
   private String fonction;
   private boolean estEvalue;
   
   /**
    * 
    */
   public Agent(){}
   
   /**
    * 
    * @param id
    * @param nom
    * @param telephone
    * @param email
    * @param dateNaissance
    * @param adresse
    * @param fonction
    * @param estEvalue 
    */
   public Agent(int id,String nom, String telephone, String email, String dateNaissance, String adresse, String fonction, boolean estEvalue) {
      this.id = id;
      this.nom = nom;
      this.telephone = telephone;
      this.email = email;
      this.dateNaissance = dateNaissance;
      this.adresse = adresse;
      this.fonction = fonction;
      this.estEvalue = estEvalue;
   }
   
   /* getters and setters */
   
   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getNom() {
      return nom;
   }

   public void setNom(String nom) {
      this.nom = nom;
   }

   public String getTelephone() {
      return telephone;
   }

   public void setTelephone(String telephone) {
      this.telephone = telephone;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getDateNaissance() {
      return dateNaissance;
   }

   public void setDateNaissance(String dateNaissance) {
      this.dateNaissance = dateNaissance;
   }

   public String getAdresse() {
      return adresse;
   }

   public void setAdresse(String adresse) {
      this.adresse = adresse;
   }

   public String getFonction() {
      return fonction;
   }

   public void setFonction(String fonction) {
      this.fonction = fonction;
   }

   public boolean isEstEvalue() {
      return estEvalue;
   }

   public void setEstEvalue(boolean estEvalue) {
      this.estEvalue = estEvalue;
   }
   
   
   
   
   
}
