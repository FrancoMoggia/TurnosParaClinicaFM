package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Persona;
import models.PersonaGenero;

public class Consulta {
   
   public Persona recuperarPersonaUsuClave(Connection conexion, String pUsu, String pClave) throws SQLException {
      Persona unaPersona = null;
      PersonaGenero personaGenero;
      try{
         PreparedStatement consulta = conexion.prepareStatement("select id, nombre, apellido, persona_genero_id, dni from persona where usuario = ? and  contrasena = md5(?)");
         consulta.setString(1, pUsu);
         consulta.setString(2, pClave);
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
             personaGenero = this.recuperarGeneroID(conexion, resultado.getInt("persona_genero_id"));
             unaPersona = new Persona(resultado.getInt("id"), personaGenero, resultado.getString("nombre"), resultado.getString("apellido"), resultado.getInt("dni"));
            
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return unaPersona;
     
   }
   public PersonaGenero recuperarGeneroID (Connection conexion, Integer idGenero) throws SQLException {
       PersonaGenero personaGenero = null;
      try{
         PreparedStatement consulta = conexion.prepareStatement("select id, nombre from persona_genero where id = ?");
         consulta.setInt(1, idGenero);
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
             personaGenero = new PersonaGenero(resultado.getInt("id"), resultado.getString("nombre"));
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return personaGenero;
   }
   
   public ArrayList<Persona> ListadoPersonas(Connection conexion) throws SQLException {
       PersonaGenero personaGenero = null;
          ArrayList<Persona> listaPersonas = new ArrayList();
        try{
         PreparedStatement consulta = conexion.prepareStatement("select id, nombre, apellido, persona_genero_id, dni from persona");
       
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
             personaGenero = this.recuperarGeneroID(conexion, resultado.getInt("persona_genero_id"));
             listaPersonas.add(new Persona(resultado.getInt("id"), personaGenero, resultado.getString("nombre"), resultado.getString("apellido"), resultado.getInt("dni")));
            
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return listaPersonas;
   }
   public ArrayList<PersonaGenero> listadoPersonaGenero(Connection conexion) throws SQLException {
       ArrayList<PersonaGenero> listaGeneros = new ArrayList();
         try{
         PreparedStatement consulta = conexion.prepareStatement("select id, nombre from persona_genero");
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
             listaGeneros.add(new PersonaGenero(resultado.getInt("id"), resultado.getString("nombre")));
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
         return listaGeneros;    
   }
}
