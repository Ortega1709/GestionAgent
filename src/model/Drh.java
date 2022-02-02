/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ortega
 */
public class Drh {
   private int id;
   private String email;
   private String motDePasse;
   
   /**
    * 
    */
   public Drh(){}

   /**
    * @param id
    * @param email
    * @param motDePasse 
    */
   public Drh(int id, String email, String motDePasse) {
      this.id = id;
      this.email = email;
      this.motDePasse = motDePasse;
   }
   
   /* getters and setters */

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getMotDePasse() {
      return motDePasse;
   }

   public void setMotDePasse(String motDePasse) {
      this.motDePasse = motDePasse;
   }
   
   
   
   
}
