
package AccesoADatos;

import Dominio.Proveedor;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProveedorData {

    private Proveedor proveedor = null;
    private Connection conexion = null;
    
    public ProveedorData(){
        conexion = Conexion.conectar();
    }
    
    
 public void registrarProveedor(Proveedor prove) {
     String sql = "INSERT INTO proveedor (razonSocial, domicilio, telefono, estado) VALUES (?, ?, ?, ?)";
     proveedor = new Proveedor();
        try {
            
            PreparedStatement ps = conexion.prepareStatement(sql);
            
            
            if(proveedor != null){
                ps.setString(1, prove.getRazonSocial());
                ps.setString(2, prove.getDomicilio());
                ps.setString(3, prove.getTelefono());
                ps.setBoolean(4, prove.getEstado());
                
                ps.executeUpdate();
                
            }else{
                JOptionPane.showMessageDialog(null, "El proveedor ingresado es ERRONEO", "ERROR", 0);
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la Tabla Proveedor","Error de Conexion.", 0);
        }
 }
 
 public void modificarProveedor(Proveedor prove){
     String sql = "UPDATE proveedor SET razonSocial = ?, domicilio = ?, telefono = ?, estado = ? WHERE idProveedor = ?";
     
     
     
        try {
     
            PreparedStatement ps = conexion.prepareStatement(sql);
            
            ps.setString(1, prove.getRazonSocial());
            ps.setString(2, prove.getDomicilio());
            ps.setString(3, prove.getTelefono());
            ps.setBoolean(4, prove.getEstado());
            ps.setInt(5, prove.getIdProveedor());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la Tabla Proveedor","Error de Conexion.", 0);
        }
 
 }
 
 public void eliminarProveedor(int id){
     String sql ="UPDATE proveedor SET estado = 0 WHERE idProveedor = ?";
     
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            
            
            ps.setInt(1, id);
            ps.executeUpdate();
           
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la Tabla Proveedor","Error de Conexion.", 0);
        }
     
 }
 
 
public List<Proveedor> listarProveedores(){


    
    
    
return null;
}
    
public Proveedor obtenerProveedorMasComprado(){
    
    
    
    
return null;
}
}
