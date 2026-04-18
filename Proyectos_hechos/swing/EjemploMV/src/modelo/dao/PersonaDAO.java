package modelo.dao;
import java.sql.*;

import modelo.conexion.Conexion;
import modelo.vo.*;

public class PersonaDAO {
    private Conexion conexion;
   
	    
    public PersonaDAO(){
        conexion = new Conexion();
    }
    
    public String insertarPersona(Persona per) {
        String rptaRegistro=null;
        int numFAfectas=0;
     
        try{
			Connection acceDB = conexion.getConnection();
			String sql="INSERT INTO persona VALUES(?,?,?) ";
			PreparedStatement estatuto = acceDB.prepareStatement(sql);
			
            estatuto.setInt(1, per.getCedula());
            estatuto.setString(2, per.getNombre() );
            estatuto.setString(3, per.getApellido());
            
            numFAfectas=estatuto.executeUpdate();
			            
			if(numFAfectas>0){
				rptaRegistro="Registro exitoso.";
			}
			
    	} catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
		return rptaRegistro;
    }
    
    public int eliminarPersona(int cedula){
        int filAfectadas= 0;
        try {
            Connection accesoDB = conexion.getConnection();
            String sql="DELETE FROM persona WHERE cedula=?";
			PreparedStatement estatuto = accesoDB.prepareStatement(sql);
			estatuto.setInt(1, cedula);
            filAfectadas = estatuto.executeUpdate();
        } catch (Exception e) {
        	System.out.println(e.getMessage());
			
        }
        
        return filAfectadas;
    }
    
    
    public String actualizarPersona(Persona per) {  
        int numFAfectas=0;
        String resp=null;
     
        
        	try{
        		Connection acceDB = conexion.getConnection();
        		String sql="UPDATE persona SET cedula= ? ,nombre = ? , apellido=? "
        				+ "WHERE cedula= ? ";
        		PreparedStatement estatuto = acceDB.prepareStatement(sql);
    			
                estatuto.setInt(1, per.getCedula());
                estatuto.setString(2, per.getNombre());
                estatuto.setString(3, per.getApellido());
                estatuto.setInt(4, per.getCedula());
    			
    			numFAfectas=estatuto.executeUpdate();
    			if (numFAfectas>0)
            		resp="ok";
    			    			
        	} catch (Exception e) {
        		System.out.println(e.getMessage());
        	}
        	
     return resp; 	
     }
    
    
    public ListaPersonas listarPersonas(){
        ListaPersonas listaPersona = new ListaPersonas();
        Persona persona;
        try {
            Connection acceDB = conexion.getConnection();
            String sql="select * from persona";
            PreparedStatement estatuto = acceDB.prepareStatement(sql);
            ResultSet rs = estatuto.executeQuery();
            while(rs.next()){
                persona = new Persona();
                persona.setCedula(rs.getInt(1));
                persona.setNombre(rs.getString(2));
                persona.setApellido(rs.getString(3));
                listaPersona.agregar(persona);
            }
        } catch (Exception e) {
        	System.out.println(e.getMessage());
		}
        return listaPersona;
    }
    
    public Persona buscarXCedula(int cedula){
        Persona p = new Persona();
        p.setCedula(cedula);
        try {
            Connection acceDB = conexion.getConnection();
            String sql="select * from persona where cedula="+cedula+";";
            PreparedStatement estatuto = acceDB.prepareStatement(sql);
            ResultSet rs = estatuto.executeQuery();
            while(rs.next()){
                p.setNombre(rs.getString(2));
                p.setApellido(rs.getString(3));
                
            }
        } catch (Exception e) {
        	System.out.println(e.getMessage());
		}
        return p;
    }
    
    

}
