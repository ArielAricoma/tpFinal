
package AccesoADatos;

import Dominio.Compra;
import Dominio.DetalleCompra;
import Dominio.Producto;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class DetalleCompraData {

    private Connection conexion = null;
    private ProductoData productoData = new ProductoData();
    private CompraData compraData = null;
     public DetalleCompraData(){
        conexion = (Connection) Conexion.conectar();
    }
     
     
     public void registrarDetalleCompra(DetalleCompra dC){
     String sql = "INSERT INTO detallecompra (idCompra, idProducto, precioCosto, cantidad) VALUES (?,?,?,?)";
     
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
     
     
     
    /*
    public List<DetalleCompra>(int idCompra){
        
     
        String  sql = "SELECT idDetalle, idProducto, precioCosto, cantidad FROM detallecompra JOIN compra ON (detallecompra.idCompra = compra.idCompra) WHERE compra.idCompra = ? AND detallecompra.estado = 1";
        List<DetalleCompra> detalles = new ArrayList<>();
       try{
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, idCompra);
     
        ResultSet rs = ps.executeQuery();
     
        while(rs.next()){
            
            DetalleCompra detalle = new DetalleCompra();
            detalle.setIdDetalle(rs.getInt("idDetalle"));
            detalle.setIdProducto(rs.getInt.("idProducto"));
            detalle.setPrecioCosto(rs.getDouble("precioCosto"));
            detalle.setCantidad(rs.getInt("cantidad"));

            detalles.add(detalle);
            
        }
     
        }catch{
            JOptionPane.showMessageDialog(null, "Error al conectar con DetalleCompra", "Error", 0);
        }
     
     
         return detalles;
     }
     */
     
     public List<DetalleCompra>(int idProducto){
         
         List<DetalleCompra> list = null;
     
         return list;
     }
     /*
     public void modificarDetalleCompra(){
         String sql = "UPDATE * FROM detallecompra";
         
     }
     
     public void eliminarDetalleCompra(int idDetalle){}
     */
     
      
}
