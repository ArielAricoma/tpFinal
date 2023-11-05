/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;

import AccesoADatos.CompraData;
import AccesoADatos.DetalleCompraData;
import AccesoADatos.ProductoData;
import AccesoADatos.ProveedorData;
import AccesoADatos.UsuarioData;
import Dominio.Compra;
import Dominio.DetalleCompra;
import Dominio.Producto;
import Dominio.Proveedor;
import Dominio.Usuario;
import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author ejarq
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //  objetos para llamar a los metodos
        CompraData compraData = new CompraData();
       ProveedorData proveData = new ProveedorData();
        ProductoData produData = new ProductoData();
        UsuarioData uData = new UsuarioData();
        DetalleCompraData dCompraData = new DetalleCompraData();
        
        //objetos para setear atributos      
        Compra compra = null;
        Proveedor proveedor = null;
        Producto producto = null;
        DetalleCompra dCompra = null;
        Usuario user = null;
        
        
        //                    PROBANDO METODOS PROVEEDORDATA FUNCIONAAAAAAAN TODOS
        
        
        //METODO AGREGAR PROVEEDOR 
        //proveedor = new Proveedor(3,"Musimundo", "Pedernera 368", "+54 2657-902030", true);
         //proveData.agregarProveedor(proveedor);
        
        
        //METODO MODIFICAR PROVEEDOR
        //proveData.modificarProveedor(proveedor);
        
        
        //METODO ElIMINAR PROVEEDOR
        //proveData.eliminarProveedor(1);
        
        
        //METODO ListarProveedores
        /*
        List<Proveedor> proveList = new ArrayList();
        proveList = proveData.listarProveedores();
        System.out.println("Lista Proveedores");
        for(Proveedor pro : proveList){
            System.out.println("Nombre: " + pro.getRazonSocial());
            System.out.println(" ");
        }
        */
        
        //BUSCAR POR ID METODO
       
        //proveedor = new Proveedor();
        //proveedor = proveData.buscarProveedor(3);
        
       
        
        
        /*
        proveedor = new Proveedor();
        proveedor = proveData.buscarProveedorNombre("Musimundo");
        
        System.out.println("Nombre: " + proveedor.getRazonSocial());
        */
        
        // PROBANDO METODOS registroProducto Y modificarProducto
        //producto = new Producto(2,"Heladera","HGF358 plata con freezer 282L 220V", 250000, 0, true);
        //produData.registroProducto(producto);            
        //produData.modificarProducto(producto);
        
        
        //PROBANDO METODO ELIMINAR PRODUCTO
        
        //produData.eliminarProducto(3);
        
        //PROBANDO METODO ContultarMetodoPorId
        
        //  NO FUNCIONA-------------------------------------------------------------------------------------------------------------------------------------
       /* producto = new Producto();
        producto = produData.consultaProductoPorID(3);
        
        System.out.println("Nombre: " + producto.getNombre()); */
        
       //METODO registrarCompra
        //compra = new Compra(proveedor, LocalDate.of(2022, 8,21), true);
        //compraData.registrarCompra(compra);

        
        //METODO LISTAR COMPRA POR PROVEEDOR
        /*
        List<Proveedor> listCom = new ArrayList<>();
        listCom = compraData.listarCompraporProveedor(2);
       
        for(Proveedor pro : listCom){
            System.out.println("Nombre: " + pro.getRazonSocial());
        }
        */
        
        
        //METODO ENTE FECHA Y FECHA-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        /*
        List<Compra> listComp = new ArrayList();
        listComp = compraData.entreFechas(LocalDate.of(2023,9,1), LocalDate.of(2023,9,30));
        
        for(Compra com : listComp){
            System.out.println("Fecha: " + com.getFecha());
        }      
        */
        
        
        /*
        compra = new Compra();
        
        compra = compraData.obtenerCompraPorID(1);
        
        System.out.println("id: " + compra.getIdCompra());
        System.out.println("fecha: " + compra.getFecha());
        */
        
        //METODO listarCompraporProducto 
        /*
        List<Producto> listProve = new ArrayList<>();
        listProve = compraData.listarCompraporProducto(2);
        
        for(Producto pd : listProve){
            System.out.println("Nombre" + pd.getNombre());
        }
        */
        
        
        //PROBANDO  detalleCOmpraData
//a corregir ---------------------------------------------------------------------------------------------------------------------
     /*   compra = new Compra();
        compra = compraData.obtenerCompraPorID(2);
        producto = new Producto();
        producto = produData.consultaProductoPorID(2);
        
        dCompra = new DetalleCompra(compra,producto,900.2,100,true);
        
        dCompraData.registrarDetalleCompra(dCompra);
      */
        
        
        
        
        
        
    }
    
}
