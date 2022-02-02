
package dao;

public class DatabaseConnect {
   
   private String url;
   private String username;
   private String password;
   private String driver;

   /**
    * constructor 
    */
   public DatabaseConnect() {
      this.url = "jdbc:mysql://localhost:3306/GestionAgent";
      this.username = "Ortega_Kabwe_Mulunda";
      this.password = "Observateur17092002@";
      this.driver = "com.mysql.cj.jdbc.Driver";
   }
   
   /* getters */

   public String getUrl() {
      return url;
   }

   public String getUsername() {
      return username;
   }

   public String getPassword() {
      return password;
   }

   public String getDriver() {
      return driver;
   }
   
}
