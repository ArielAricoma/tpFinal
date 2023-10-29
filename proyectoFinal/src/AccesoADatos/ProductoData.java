
package AccesoADatos;

import Dominio.Producto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ProductoData {
    private Producto producto= null;
    private Connection conexion = null;
    
    public ProductoData(){
        conexion = Conexion.conectar();
    }
    
    public void registroProducto(Producto produ){
        String sql="INSER INTO producto(nombre,descripcion,precio, descuento,estado) VALUES(?, ?, ?, ?, ?)";
        producto= new Producto();
        try{
            PreparedStatement ps = conexion.prepareStatement(sql);
            
            ps.setString(1, produ.getNombre());
            ps.setString(2, produ.getDescripcion());
            ps.setDouble(3, produ.getPrecio());
            ps.setDouble(4, produ.getDescuento());
            ps.setBoolean(5, produ.isEstado());
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"producto incorrecto");
        }
    }
    
    public void modificarProducto(Producto produ){
        
        String sql="UPDATE producto SET nombre = ?, descripcion=?, precio=?, descuento=?, estado=? WHERE idProducto=?";
        try{
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, produ.getNombre());
            ps.setString(2, produ.getDescripcion());
            ps.setDouble(3, produ.getPrecio());
            ps.setDouble(4, produ.getDescuento());
            ps.setBoolean(5, true);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Producto no encontrado","error de conexion",0);
        }
    }
    public void eliminarProducto(int idProducto){
        String sql="UPDATE producto SET estado = 0 WHERE idProducto = ?";
        try{
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1,idProducto);
            ps.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Producto no encontrado");
        }
    }
    
    public Producto consultaProductoPorID(int idProducto){
        String sql="SELECT * FROM producto WHERE idProducto = ?";
        Producto producto = null;
        try{
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idProducto);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                producto =new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion("descripcion");
                producto.setPrecio(rs.getDouble("precio"));
                producto.setDescuento(rs.getDouble("descuento"));
                producto.setEstado(rs.getBoolean("estado"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Producto no encontrado");
        }
        
        
        return null;
   
    }
    
    public List<Producto> listarProductos(){
        String sql="SELECT * FROM producto WHERE estado = 1";
        List<Producto>listaProducto = new ArrayList();
        try{
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Producto producto= new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setDescuento(rs.getDouble("descuento"));
                producto.setEstado(rs.getBoolean("estado"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"No hay Productos");
        }
        return listaProducto;
    }
}
