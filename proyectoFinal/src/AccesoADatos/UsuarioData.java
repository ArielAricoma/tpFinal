
package AccesoADatos;

import Dominio.Usuario;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UsuarioData {
    private Connection conexion = null;
    private Usuario user = null;
    public UsuarioData(){
        conexion = Conexion.conectar();
    }      
//idUsuario, nombreCuenta, contrasena, correoElec, estado
    public Usuario buscarUsuario(String nombre){
        String sql = "SELEECT * FROM usuario WHERE nombreUsuario = ?%"; //buscar en la teoria como se hacia para buscar por contenido o comienzo 
        
        try {
            
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, nombre);
            
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                user = new Usuario();
                user.setIdUsuario(rs.getInt("idUsuario"));
                user.setNombreCuenta(rs.getString("nombreUsuario"));
                user.setContrasena(rs.getString("contrasena"));
                user.setCorreoElec(rs.getString("correoElec"));
                rs.close();
                ps.close();
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return user;
    }
    
    public Usuario listarUsuariosActivos(){
        String sql = "SELECT * FROM usuario WHERE estado = 1";
        
        
        try {
            
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                user = new Usuario();
                user.setIdUsuario(rs.getInt("idUsuario"));
                user.setNombreCuenta(rs.getString("nombreCuenta"));
                user.setContrasena(rs.getString("contrasena"));
                user.setCorreoElec(rs.getString("correoElec"));
                
                rs.close();
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
    //idUsuario, nombreCuenta, contrasena, correoElec, estado
    
    public void crearUsuario(Usuario user){
        String sql="INSERT INTO usuario( nombreCuenta, contrasena, correoElec, estado)" + " VALUES (?, ?, ?, 1)";    
        
        try {
            
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, user.getNombreCuenta());
            ps.setString(2, user.getContrasena());
            ps.setString(3, user.getCorreoElec());
            
            ps.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            
            Logger.getLogger(UsuarioData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cambiarContasena(String nombreUsuario, String newContrasena){  
        String sql= "UPDATE  usuario SET contrasena = ? WHERE nombreCuenta = ? AND estado = 1";
        
        try {
            
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, newContrasena);
            ps.setString(2, nombreUsuario);
            
            ps.executeUpdate();
            
            ps.close();
            
        } catch (SQLException ex) {
            
            Logger.getLogger(UsuarioData.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
    public void darDeBaja(String nombreCuenta){
        String sql = "UPDATE usuario SET estado = 0 WHERE nombreCuenta = ? AND estado = 1";
        
        try {
            
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, nombreCuenta);
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            
            Logger.getLogger(UsuarioData.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
