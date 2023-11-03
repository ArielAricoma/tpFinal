
package AccesoADatos;

import Dominio.Usuario;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UsuarioData {
    private Connection conexion = null;

    public UsuarioData(){
        conexion = Conexion.conectar();
    }      
//idUsuario, nombreCuenta, contrasena, correoElec, estado
    public Usuario buscarUsuario(String nombre){
        String sql = "SELEECT * FROM usuario WHERE nombreUsuario = ?%"; //buscar en la teoria como se hacia para buscar por contenido o comienzo 
        Usuario user = null;
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
    
    public void listarUsuarios(){}
    
    public void crearUsuario(Usuario user){
        String sql="INSERT usuario";    
    }
    
    public void cambiarContasena(){    
    }
    
    public void darDeBaja(){
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
