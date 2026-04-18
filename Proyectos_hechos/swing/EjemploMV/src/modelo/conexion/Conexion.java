package modelo.conexion;
//* modificado para que corra en Java 8.0

import java.sql.*;

/*En este archivo lo único que hay que modificar es el login y password (línea 12 y 13)
que utiliza en su máquina para acceder a MySQL y si lo quiere usar en otro proyecto
cambiar además el nombre de la base de datos que utilice (línea 11) el resto es siempre igual*/

public class Conexion {
	
   static String bd = "instituto";  
   static String login = "root";
   static String password = "admin";
   static String url = "jdbc:mysql://localhost/"+bd+
		   "?useTimezone=true&serverTimezone=UTC"; //*
   
   Connection conn = null;

   /** Constructor */
   public Conexion() {
      try{
         //obtenemos el driver  para mysql
         Class.forName("com.mysql.cj.jdbc.Driver");   //*
         //obtenemos la conexión
         conn = DriverManager.getConnection(url,login,password);

         if (conn!=null){
            System.out.println("Conexión a base de datos "+bd+" OK");
         }
      }
      catch(SQLException e){
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }catch(Exception e){
         System.out.println(e);
      }
   }
   /**Permite retornar la conexión*/
   public Connection getConnection(){
      return conn;
   }

   public void desconectar(){
      conn = null;
   }

}