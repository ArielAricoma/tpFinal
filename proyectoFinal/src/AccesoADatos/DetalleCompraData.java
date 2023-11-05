
package AccesoADatos;

import Dominio.Compra;
import Dominio.DetalleCompra;
import Dominio.Producto;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DetalleCompraData {

    private Connection conexion = null;
    private ProductoData productoData = new ProductoData();
    private CompraData compraData = null;
    private DetalleCompra compra = null;
     public DetalleCompraData(){
        conexion = (Connection) Conexion.conectar();
    }
     
     
     public void registrarDetalleCompra(DetalleCompra dC){
     String sql = "INSERT INTO detallecompra (idCompra, idProducto, precioCosto, cantidad) VALUES ( ?, ?, ?, ?)";
     
      try {            
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, dC.getIdCompra().getIdCompra());
            ps.setInt(2, dC.getIdProducto().getIdProducto());
            ps.setDouble(3, dC.getPrecioCosto());
            ps.setInt(4, dC.getCantidad());
     
            ps.executeUpdate();
            
        } catch (SQLException ex) {           
            JOptionPane.showMessageDialog(null, "Error al conectar con DetalleCompra", "Error", 0);
        }    
     }
     
     
     
    
    public List<DetalleCompra> listarDetalleCOmpra(int idCompra){
        
     
        String  sql = "SELECT idDetalle, idProducto, precioCosto, cantidad FROM detallecompra JOIN compra ON (detallecompra.idCompra = compra.idCompra) WHERE compra.idCompra = ? AND detallecompra.estado = 1";
        List<DetalleCompra> detalles = new ArrayList<>();
       try{
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, idCompra);
     
        ResultSet rs = ps.executeQuery();
     
        while(rs.next()){
            
            DetalleCompra detalle = new DetalleCompra();
            detalle.setIdDetalle(rs.getInt("idDetalle"));
            detalle.getIdProducto().setIdProducto(rs.getInt("idProducto"));
            detalle.setPrecioCosto(rs.getDouble("precioCosto"));
            detalle.setCantidad(rs.getInt("cantidad"));

            detalles.add(detalle);
            
        }
     
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al conectar con DetalleCompra", "Error", 0);
        }
     
     
         return detalles;
     }
     
     
     public List<DetalleCompra> listarDetalleDelProducto (int idProducto){
         String sql = "SELECT producto.nombre, producto.descripcion, detallecompra.cantidad FROM detallecompra JOIN producto ON (detallecompra.idProducto = producto.idProducto) WHERE idProducto = ?";
         
        List<DetalleCompra> list = new ArrayList<>();
            
        try {
            
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1,idProducto);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                 compra = new DetalleCompra();
                 compra.getIdProducto().setNombre(rs.getString("nombre"));
                 compra.getIdProducto().setDescripcion(rs.getString("descripcion"));
                 compra.setCantidad(rs.getInt("cantidad"));
                 
                 
              list.add(compra);
            }
            
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al conectar con DetalleCompra", "Error", JOptionPane.ERROR_MESSAGE);
        }
         
         
         return list;
     }
     
     public void modificarDetalleCompra(DetalleCompra detalle){
         String sql = "UPDATE * FROM detallecompra SET   precioCosto = ?, cantidad = ? WHERE estado = 1 AND idDetalle = ?";
         
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setDouble(1, detalle.getPrecioCosto());
            ps.setInt(2, detalle.getCantidad());
            ps.setInt(3, detalle.getIdDetalle());
            
        } catch (SQLException ex) {
            
            Logger.getLogger(DetalleCompraData.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         
     }
     
     public void eliminarDetalleCompra(int idDetalle){
        String sql = "UPDATE detallecompra SET estado = 0 WHERE idDetalle = ? AND estado = 1";
     
        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, idDetalle);
     
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con DetalleCompra", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
     
     }
    
     
      
}
