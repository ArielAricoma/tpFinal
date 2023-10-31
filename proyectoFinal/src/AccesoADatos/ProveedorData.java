package AccesoADatos;

import Dominio.Proveedor;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProveedorData {

    private Proveedor proveedor = null;
    private Connection conexion = null;

    public ProveedorData() {
        conexion = Conexion.conectar();
    }

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

            } else {
                JOptionPane.showMessageDialog(null, "El proveedor ingresado es ERRONEO", "ERROR", 0);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la Tabla Proveedor.", "Error de Conexion.", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void modificarProveedor(Proveedor prove) {
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
            JOptionPane.showMessageDialog(null, "Error al conectar con la Tabla Proveedor.", "Error de Conexion.", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void eliminarProveedor(int id) {
        String sql = "UPDATE proveedor SET estado = 0 WHERE idProveedor = ?";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la Tabla Proveedor.", "Error de Conexion.", JOptionPane.ERROR_MESSAGE);
        }

    }

    public List<Proveedor> listarProveedores() throws SQLException {
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
    }
    
    
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
        }

        
        
        ps.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al conectar con Proveedor", "Error", JOptionPane.ERROR_MESSAGE);
    }

    return prove;
}
    
}
