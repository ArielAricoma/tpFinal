
package AccesoADatos;

import Dominio.Compra;
import Dominio.DetalleCompra;
import Dominio.Producto;
import com.sun.jdi.connect.spi.Connection;
import java.sql.*;

public class DetalleCompraData {

    private Connection conexion = null;
    private Producto producto = null;
    private Compra compra = null;
     public DetalleCompraData(){
        conexion = (Connection) Conexion.conectar();
    }
     
     
     public void registrarDetalleCompra(DetalleCompra dC){
     String sql = "INSERT INTO detallecompra (idCompra, idProducto, precioCosto, cantidad) VALUES (?,?,?,?)";
     
     
     
     
     
     
     }
     
    /* public List<DetalleCompra>(int idCompra){
         
         return null;
     }
     
     public List<DetalleCompra>(int idProducto){}
     
     public void modificarDetalleCompra(){}
     
     public void eliminarDetalleCompra(int idDetalle){}
     */
     
      
}
