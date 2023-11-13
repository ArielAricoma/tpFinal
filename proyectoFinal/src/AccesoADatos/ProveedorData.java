package AccesoADatos;

import Dominio.Proveedor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProveedorData {

    private Proveedor proveedor = null;
    private Connection conexion = null;

    public ProveedorData() {
        conexion = Conexion.conectar();
    }

    
    
       //        METODO AGREGAR PROVEEDOR 
    
    public void agregarProveedor(Proveedor prove) {
        String sql = "INSERT INTO proveedor (razonSocial, domicilio, telefono, estado) VALUES (?, ?, ?, ?)";
        proveedor = new Proveedor();
        try {

            PreparedStatement ps = conexion.prepareStatement(sql);

            if (proveedor != null) {
                ps.setString(1, prove.getRazonSocial());
                ps.setString(2, prove.getDomicilio());
                ps.setString(3, prove.getTelefono());
                ps.setBoolean(4, prove.getEstado());

                ps.executeUpdate();
                
            } 

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la Tabla Proveedor.", "Error de Conexion.", JOptionPane.ERROR_MESSAGE);
        }
    }   //se usa
    
    //           METODO MODIFICAR PROVEEDOR
    
    public void modificarProveedor(Proveedor proveedor) {
    String sql = "UPDATE proveedor SET razonSocial = ?, domicilio = ?, telefono = ?, estado = ? WHERE idProveedor = ?";
     
    try {
        PreparedStatement ps = conexion.prepareStatement(sql);
        
        ps.setString(1, proveedor.getRazonSocial());
        ps.setString(2, proveedor.getDomicilio());
        ps.setString(3, proveedor.getTelefono());
        ps.setBoolean(4, proveedor.getEstado());
        ps.setInt(5, proveedor.getIdProveedor()); 
        
        ps.executeUpdate();
        
        
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al conectar con la Tabla Proveedor.", "Error de Conexion.", JOptionPane.ERROR_MESSAGE);
    }
}//se usa
    
    //           METODO ELIMINAR PROVEEDOR
    
    public void eliminarProveedor(String razonSocial) {
        String sql = "UPDATE proveedor SET estado = 0 WHERE razonSocial = ?";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, razonSocial);
            ps.executeUpdate();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la Tabla Proveedor.", "Error de Conexion.", JOptionPane.ERROR_MESSAGE);
        }

    }    //se usa
    
     public void darDeAltaProveedor(String razonSocial) {
        String sql = "UPDATE proveedor SET estado = 1 WHERE razonSocial = ?";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, razonSocial);
            ps.executeUpdate();
            
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la Tabla Proveedor.", "Error de Conexion.", JOptionPane.ERROR_MESSAGE);
        }

    }    //se usa
    
    //           METODOS LISTAR PROVEEDORES.
    
    public List<Proveedor> listarProveedores()  {
        String sql = "SELECT * FROM proveedor";
        List<Proveedor> listaProveedor = new ArrayList();

        //idProveedor, razonSocial, domicilio, telefono, estado
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Proveedor proveedor = new Proveedor();
                proveedor.setIdProveedor(rs.getInt("idProveedor"));
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getString("telefono"));
                proveedor.setEstado(rs.getBoolean("estado"));

                listaProveedor.add(proveedor);

                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la Tabla Proveedor.", "Error de Conexion.", JOptionPane.ERROR_MESSAGE);
        }
        return listaProveedor;
    }    //se usa
    
    public List<Proveedor> listarProveedoresActivos()  {
        String sql = "SELECT * FROM proveedor WHERE estado = 1";
        List<Proveedor> listaProveedor = new ArrayList();

        //idProveedor, razonSocial, domicilio, telefono, estado
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Proveedor proveedor = new Proveedor();
                proveedor.setIdProveedor(rs.getInt("idProveedor"));
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getString("telefono"));
                proveedor.setEstado(rs.getBoolean("estado"));

                listaProveedor.add(proveedor);

                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la Tabla Proveedor.", "Error de Conexion.", JOptionPane.ERROR_MESSAGE);
        }
        return listaProveedor;
    }    //se usa
    
    public List<Proveedor> listarProveedoresNoActivos()  {
        String sql = "SELECT * FROM proveedor WHERE estado = 0";
        List<Proveedor> listaProveedor = new ArrayList();

        //idProveedor, razonSocial, domicilio, telefono, estado
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Proveedor proveedor = new Proveedor();
                proveedor.setIdProveedor(rs.getInt("idProveedor"));
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getString("telefono"));
                proveedor.setEstado(rs.getBoolean("estado"));

                listaProveedor.add(proveedor);

                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la Tabla Proveedor.", "Error de Conexion.", JOptionPane.ERROR_MESSAGE);
        }
        return listaProveedor;
    }    //se usa
    
    
    //          METODO PARA BUSCAR PROVEEDOR POR ID
    //sacar prove y colocar proveedor
  public Proveedor buscarProveedor(int id) {
    String sql = "SELECT * FROM proveedor WHERE idProveedor = ? AND estado = 1";
    Proveedor prove = null; 

    try {
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            prove = new Proveedor();

            prove.setIdProveedor(rs.getInt("idProveedor"));
            prove.setRazonSocial(rs.getString("razonSocial"));
            prove.setDomicilio(rs.getString("domicilio"));
            prove.setTelefono(rs.getString("telefono"));
            prove.setEstado(rs.getBoolean("estado"));
        }

        
        
        ps.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al conectar con Proveedor", "Error", JOptionPane.ERROR_MESSAGE);
    }

    return prove;
}
  
  //                  METODO PARA BUSCAR PROVEEDOR POR NOMBRE
  
  public Proveedor buscarProveedorNombre(String rSocial){
      String sql = "SELECT * FROM proveedor WHERE razonSocial = ?";
      
        try {
            
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, rSocial);
            
            ResultSet rs = ps.executeQuery();
          
            while(rs.next()){
                proveedor = new Proveedor();
                
                
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getString("telefono"));
                proveedor.setEstado(rs.getBoolean("estado"));
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con Proveedor", "Error", JOptionPane.ERROR_MESSAGE);
        }
      
  
  
      return proveedor;
  } //se usa
    
}
