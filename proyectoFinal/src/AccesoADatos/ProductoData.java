
package AccesoADatos;

import Dominio.Producto;
import java.sql.Connection;
import java.util.List;


public class ProductoData {
    private Producto producto= null;
    private Connection conexion = null;
    
    public ProductoData(){
        conexion = Conexion.conectar();
    }
    
    public void registroProducto(Producto producto){
    
    }
    
    public void modificarProducto(Producto producto){
    
    }
    public void eliminarProducto(int idProducto){
    
    }
    
    public Producto consultaProductoPorID(int idProducto){
    
    }
    
    public List<Producto> listarProductos(){
    
    }
}
