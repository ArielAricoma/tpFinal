
package AccesoADatos;

import java.sql.Connection;


public class CompraData {
    private Connection conexion;

    public CompraData() {
       conexion= Conexion.conectar();
    }
    
    
    
    

}
