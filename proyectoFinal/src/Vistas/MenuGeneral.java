/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template|
 */
package Vistas;
//librerias que contienen los metodos con las sentencias sql
import AccesoADatos.CompraData;
import AccesoADatos.DetalleCompraData;
import AccesoADatos.ProductoData;
import AccesoADatos.ProveedorData;

//librerias necesarias para poder crear los objetos de la BD
import Dominio.Compra;
import Dominio.DetalleCompra;
import Dominio.Producto;
import Dominio.Proveedor;


import java.awt.Color;//libreria necesaria para poder utilizar Nimbus(es lo que usamos para los colores)
import java.awt.Component;
import java.awt.Graphics;//Esta libreria se utiliza para colocar una imagen de fondo
import java.awt.Image;//libreria necesaria para colocar las imagenes, va de la mano con el Grapthics(Jpanel-imagenes de fondo)
import javax.swing.ImageIcon;//necesario para realizar un objeto de tipo Icon

//librerias necesarias para el uso de LocalDate y Date. 
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

//Necesario para crear listas
import java.util.ArrayList;
import java.util.List;


import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class MenuGeneral extends javax.swing.JFrame {
    //son los modelos de las tablas utilizadas
    private DefaultTableModel modelo;    
    private DefaultTableModel modelo2;
    private DefaultTableModel modelo3;
    private DefaultTableModel modelo4;
    private DefaultTableModel modelo5;
    
    //objetos necesarios de cada AccesoADatos para poder utilizar los metodos
    private ProveedorData proveedorData = new ProveedorData();
    private DetalleCompraData detalleData = new DetalleCompraData();  
    private ProductoData productoData = new ProductoData();
    private CompraData compraData = new CompraData();
    
    //objetos para poder utilizar los atributos de Dominio-Base Datos
    private Proveedor proveedor = null;
    private DetalleCompra detalle = null;
    private Compra compra = null;  
    private Producto producto = null;
    
    //listas utilizadas para guardar datos
    List<Producto> productos = null;  
    List<Proveedor> proveedores = null;
    
    
    //La mayoria de booleanos, los utilizamos para que las tablas se carguen una sola vez. 
    private boolean cabeceraProdIni = false;
    private boolean cabeceraCompraIni = false;
    private boolean cabeceraDetalleIni = false;
    private boolean cabeceraRepoIni = false;
    private boolean listaCompra = false;
    private boolean listaDetalle = false;
    private boolean listaRepoIni = false;
    private boolean comboProveedor = false;
    private boolean comboProducto = false;
    private boolean listaProductosCargada = false;
    
    public MenuGeneral() {        
        initComponents();         
        modelo = new DefaultTableModel();
        modelo2 = new DefaultTableModel();    
        modelo3 = new DefaultTableModel(); 
        modelo4 = new DefaultTableModel(); 
        modelo5 = new DefaultTableModel();
        cargaTablaIni(); //carga la tabla principal desde que ejecuta el programa      
    }      
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMenu = new Fondo();
        jlTitulo = new javax.swing.JLabel();
        jlIcono = new javax.swing.JLabel();
        jpPrincipal = new Fondo();
        jlIconoPrin = new javax.swing.JLabel();
        jlPrincipal = new javax.swing.JLabel();
        jpProveedor = new Fondo();
        jlIconoProv = new javax.swing.JLabel();
        jlProveedores = new javax.swing.JLabel();
        jpProducto = new Fondo();
        jlIconoProd = new javax.swing.JLabel();
        jlProducto = new javax.swing.JLabel();
        jpCompra = new Fondo();
        jlIconoCompra = new javax.swing.JLabel();
        jlCompra = new javax.swing.JLabel();
        jPanel2 = new Fondo();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlabelUsuario = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        jtpEscritorio = new javax.swing.JTabbedPane();
        jpInicio = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtRepositorio = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jbtnRellenarStock = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jlAlto = new javax.swing.JLabel();
        jlMedio = new javax.swing.JLabel();
        jlReferencia = new javax.swing.JLabel();
        jlBajo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jpInivioProveedor = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProveedor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jtxBuscarProveedor = new javax.swing.JTextField();
        btnNuevoProve = new javax.swing.JButton();
        btnDeshabilitar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jtxRazonSocial = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jtxDomicilio = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jtxTelefono = new javax.swing.JTextField();
        jbtnGuardarNewProveedor = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jcbTelefono = new javax.swing.JComboBox<>();
        jtxTelefonoo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnBuscarProveedor = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnHabilitar = new javax.swing.JButton();
        jcbActivos = new javax.swing.JCheckBox();
        jcbNoActivos = new javax.swing.JCheckBox();
        btnActualizarTabla = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jpInicioProducto = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtTablaProducto = new javax.swing.JTable();
        jlProductoTitulo = new javax.swing.JLabel();
        jbNuevoP = new javax.swing.JButton();
        jbModificarP = new javax.swing.JButton();
        jbEliminarP = new javax.swing.JButton();
        jlProductos = new javax.swing.JLabel();
        jpNuevoProducto = new javax.swing.JPanel();
        jlNuevoPTitulo = new javax.swing.JLabel();
        jlNuevoPNombre = new javax.swing.JLabel();
        jlNuevoPDescripcion = new javax.swing.JLabel();
        jlNuevoPPrecio = new javax.swing.JLabel();
        jtNuevoPNombre = new javax.swing.JTextField();
        jtNuevoPDescripcion = new javax.swing.JTextField();
        jtNuevoPPrecio = new javax.swing.JTextField();
        jbGuardarProNuevo = new javax.swing.JButton();
        jbCancelarProNuevo = new javax.swing.JButton();
        jlNuevoPStock = new javax.swing.JLabel();
        jtNuevoPStock = new javax.swing.JTextField();
        jcbListaProductos = new javax.swing.JComboBox<>();
        jcbMasBajo = new javax.swing.JCheckBox();
        jcbListarAlto = new javax.swing.JCheckBox();
        jbActualizarTProdu = new javax.swing.JButton();
        jtfBuscarProducto = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jpInicioCompra = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtTablaDetalle = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtTablaCompra = new javax.swing.JTable();
        jlCompraDetalleCTabla = new javax.swing.JLabel();
        jlCompraTabla = new javax.swing.JLabel();
        jdcCompraFecha1 = new com.toedter.calendar.JDateChooser();
        jdcCompraFecha2 = new com.toedter.calendar.JDateChooser();
        jpnewCompra = new javax.swing.JPanel();
        jlNuevaCProvedor = new javax.swing.JLabel();
        jcbNuevaCProveedor = new javax.swing.JComboBox<>();
        jlNuevaCProducto = new javax.swing.JLabel();
        jlNuevaCFecha = new javax.swing.JLabel();
        jdcNuevaCFecha = new com.toedter.calendar.JDateChooser();
        jlNuevaCPrecio = new javax.swing.JLabel();
        jtNuevaCPrecio = new javax.swing.JTextField();
        jlNuevaCCantidad = new javax.swing.JLabel();
        jtNuevaCCantidad = new javax.swing.JTextField();
        jbNuevaCComprar = new javax.swing.JButton();
        jlNuevaCompraTitulo = new javax.swing.JLabel();
        jbNuevaCCancelar = new javax.swing.JButton();
        jcbNuevaCProducto = new javax.swing.JComboBox<>();
        jlCompraSeleccionar = new javax.swing.JLabel();
        jlCompraY = new javax.swing.JLabel();
        jbNuevaCompra = new javax.swing.JButton();
        btnBuscarFecha = new javax.swing.JButton();
        jbtnActualizaTabla = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnComprasXProveedor = new javax.swing.JButton();
        jtfComprasXProveedor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jlTITULOPRINCIPAL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpMenu.setBackground(new java.awt.Color(2, 104, 66));

        jlTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlTitulo.setText("Administracion");

        jlIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosVistas/image.png"))); // NOI18N

        jpPrincipal.setBackground(new java.awt.Color(2, 104, 66));
        jpPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpPrincipalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpPrincipalMouseExited(evt);
            }
        });

        jlIconoPrin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosVistas/Principal.png"))); // NOI18N

        jlPrincipal.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jlPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jlPrincipal.setText("Principal");

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jlIconoPrin)
                .addGap(18, 18, 18)
                .addComponent(jlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlIconoPrin, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpProveedor.setBackground(new java.awt.Color(2, 104, 66));
        jpProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpProveedorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpProveedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpProveedorMouseExited(evt);
            }
        });

        jlIconoProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosVistas/Proveedor.png"))); // NOI18N

        jlProveedores.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jlProveedores.setForeground(new java.awt.Color(255, 255, 255));
        jlProveedores.setText("Proveedores");

        javax.swing.GroupLayout jpProveedorLayout = new javax.swing.GroupLayout(jpProveedor);
        jpProveedor.setLayout(jpProveedorLayout);
        jpProveedorLayout.setHorizontalGroup(
            jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProveedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlIconoProv)
                .addGap(18, 18, 18)
                .addComponent(jlProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpProveedorLayout.setVerticalGroup(
            jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProveedorLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addComponent(jlIconoProv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpProducto.setBackground(new java.awt.Color(2, 104, 66));
        jpProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpProductoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpProductoMouseExited(evt);
            }
        });

        jlIconoProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosVistas/Producto.png"))); // NOI18N

        jlProducto.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jlProducto.setForeground(new java.awt.Color(255, 255, 255));
        jlProducto.setText("Producto");

        javax.swing.GroupLayout jpProductoLayout = new javax.swing.GroupLayout(jpProducto);
        jpProducto.setLayout(jpProductoLayout);
        jpProductoLayout.setHorizontalGroup(
            jpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProductoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlIconoProd)
                .addGap(18, 18, 18)
                .addComponent(jlProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpProductoLayout.setVerticalGroup(
            jpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProductoLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addComponent(jlIconoProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpCompra.setBackground(new java.awt.Color(2, 104, 66));
        jpCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpCompraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpCompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpCompraMouseExited(evt);
            }
        });

        jlIconoCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosVistas/Compra.png"))); // NOI18N

        jlCompra.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jlCompra.setForeground(new java.awt.Color(255, 255, 255));
        jlCompra.setText("Compra");

        javax.swing.GroupLayout jpCompraLayout = new javax.swing.GroupLayout(jpCompra);
        jpCompra.setLayout(jpCompraLayout);
        jpCompraLayout.setHorizontalGroup(
            jpCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCompraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlIconoCompra)
                .addGap(20, 20, 20)
                .addComponent(jlCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpCompraLayout.setVerticalGroup(
            jpCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCompraLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jpCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlIconoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlIcono)
                    .addComponent(jlTitulo))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlIcono)
                .addGap(28, 28, 28)
                .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(557, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(2, 104, 66));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bienvenido:");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosVistas/usuario.png"))); // NOI18N

        jlabelUsuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jlabelUsuario.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosVistas/electrodomestico (2).png"))); // NOI18N

        btnCerrarSesion.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCerrarSesion)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(1886, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jlabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCerrarSesion))))
        );

        jtRepositorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtRepositorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtRepositorioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtRepositorio);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setText("Repositorio de Cantidad");

        jButton1.setText("jButton1");

        jbtnRellenarStock.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jbtnRellenarStock.setText("Rellenar Stock");
        jbtnRellenarStock.setEnabled(false);
        jbtnRellenarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRellenarStockActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel3.setText("by -EJARQUE and ROMERO -");

        jLabel15.setText("jLabel14");

        jlAlto.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jlAlto.setText("Stock Alto:");

        jlMedio.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jlMedio.setText("Stock Medio:");

        jlReferencia.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jlReferencia.setText("Referencias:");

        jlBajo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jlBajo.setText("Stock Bajo:");

        jPanel3.setBackground(new java.awt.Color(130, 224, 170));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(249, 231, 159));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(205, 97, 85));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpInicioLayout = new javax.swing.GroupLayout(jpInicio);
        jpInicio.setLayout(jpInicioLayout);
        jpInicioLayout.setHorizontalGroup(
            jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInicioLayout.createSequentialGroup()
                .addGroup(jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jpInicioLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpInicioLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jbtnRellenarStock))
                            .addGroup(jpInicioLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlBajo)
                                    .addComponent(jlAlto)
                                    .addComponent(jlMedio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jpInicioLayout.createSequentialGroup()
                        .addGap(497, 497, 497)
                        .addComponent(jLabel2)
                        .addGap(454, 454, 454)
                        .addComponent(jlReferencia)))
                .addContainerGap(750, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInicioLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(57, 57, 57))
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(jpInicioLayout.createSequentialGroup()
                .addGap(571, 571, 571)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpInicioLayout.setVerticalGroup(
            jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInicioLayout.createSequentialGroup()
                .addGroup(jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInicioLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2))
                    .addGroup(jpInicioLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jlReferencia)))
                .addGap(40, 40, 40)
                .addGroup(jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlAlto)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel15)
                .addGap(22, 22, 22)
                .addGroup(jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInicioLayout.createSequentialGroup()
                        .addGroup(jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpInicioLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jlMedio))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlBajo)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(112, 112, 112)
                        .addComponent(jbtnRellenarStock))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(50, 50, 50)
                .addComponent(jButton1)
                .addGap(67, 67, 67))
        );

        jtpEscritorio.addTab("tab1", jpInicio);

        jtProveedor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jtProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo ", "Razon Social", "Domicilio", "Telefono", "Estado"
            }
        ));
        jtProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProveedorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtProveedor);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel1.setText("Proveedores ");

        jtxBuscarProveedor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jtxBuscarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxBuscarProveedorMouseClicked(evt);
            }
        });

        btnNuevoProve.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        btnNuevoProve.setText("Nuevo");
        btnNuevoProve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProveActionPerformed(evt);
            }
        });

        btnDeshabilitar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        btnDeshabilitar.setText("Deshabilitar");
        btnDeshabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeshabilitarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel17.setText("Razon Social");

        jtxRazonSocial.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel18.setText("Domicilio");

        jtxDomicilio.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel19.setText("Telefono:");

        jtxTelefono.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jbtnGuardarNewProveedor.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jbtnGuardarNewProveedor.setText("Cargar");
        jbtnGuardarNewProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarNewProveedorActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel21.setText("Cargar de Proveedor");

        btnCancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jcbTelefono.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jcbTelefono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+54 9" }));

        jtxTelefonoo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel7.setText("Cod. de Area:");

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel8.setText("Num. Telefono");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jbtnGuardarNewProveedor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(110, 110, 110)
                                                .addComponent(btnCancelar))))
                                    .addComponent(jtxRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jcbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jtxTelefono))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxTelefonoo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)))
                                    .addComponent(jtxDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel21)
                .addGap(121, 121, 121)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jtxRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jtxDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jtxTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxTelefonoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnGuardarNewProveedor)
                    .addComponent(btnCancelar))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        btnBuscarProveedor.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        btnBuscarProveedor.setText("Buscar");
        btnBuscarProveedor.setEnabled(false);
        btnBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProveedorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel4.setText("Ingrese proveedor");

        btnHabilitar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        btnHabilitar.setText("Habilitar");
        btnHabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabilitarActionPerformed(evt);
            }
        });

        jcbActivos.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jcbActivos.setText("proveedores ACTIVOS");
        jcbActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbActivosActionPerformed(evt);
            }
        });

        jcbNoActivos.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jcbNoActivos.setText("proveedores NO activos");
        jcbNoActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNoActivosActionPerformed(evt);
            }
        });

        btnActualizarTabla.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        btnActualizarTabla.setText("Actualizar Tabla");
        btnActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTablaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel11.setText("by -EJARQUE and ROMERO -");

        javax.swing.GroupLayout jpInivioProveedorLayout = new javax.swing.GroupLayout(jpInivioProveedor);
        jpInivioProveedor.setLayout(jpInivioProveedorLayout);
        jpInivioProveedorLayout.setHorizontalGroup(
            jpInivioProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                .addGroup(jpInivioProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                        .addGroup(jpInivioProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(jpInivioProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                                        .addComponent(btnNuevoProve)
                                        .addGap(53, 53, 53)
                                        .addComponent(btnModificar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnActualizarTabla)
                                        .addGap(54, 54, 54)
                                        .addComponent(btnHabilitar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDeshabilitar))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                                .addGap(362, 362, 362)
                                .addComponent(jLabel1))
                            .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabel4)
                                .addGap(46, 46, 46)
                                .addComponent(jtxBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(btnBuscarProveedor))
                            .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(jcbActivos)
                                .addGap(136, 136, 136)
                                .addComponent(jcbNoActivos)))
                        .addGap(125, 125, 125)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                        .addGap(634, 634, 634)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(609, Short.MAX_VALUE))
        );
        jpInivioProveedorLayout.setVerticalGroup(
            jpInivioProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jpInivioProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addGroup(jpInivioProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtxBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarProveedor))
                        .addGap(31, 31, 31)
                        .addGroup(jpInivioProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbActivos)
                            .addComponent(jcbNoActivos))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(jpInivioProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeshabilitar)
                            .addComponent(btnModificar)
                            .addComponent(btnNuevoProve)
                            .addComponent(btnHabilitar)
                            .addComponent(btnActualizarTabla))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(135, 135, 135))
        );

        jtpEscritorio.addTab("tab2", jpInivioProveedor);

        jtTablaProducto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jtTablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtTablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaProductoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtTablaProducto);

        jlProductoTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jlProductoTitulo.setText("Producto");

        jbNuevoP.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jbNuevoP.setText("Nuevo");
        jbNuevoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoPActionPerformed(evt);
            }
        });

        jbModificarP.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jbModificarP.setText("Modificar");
        jbModificarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarPActionPerformed(evt);
            }
        });

        jbEliminarP.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jbEliminarP.setText("Eliminar");
        jbEliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarPActionPerformed(evt);
            }
        });

        jlProductos.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jlProductos.setText("Productos:");

        jlNuevoPTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jlNuevoPTitulo.setText("Cargar un Producto");

        jlNuevoPNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jlNuevoPNombre.setText("Nombre:");

        jlNuevoPDescripcion.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jlNuevoPDescripcion.setText("Descripcion:");

        jlNuevoPPrecio.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jlNuevoPPrecio.setText("Precio:");

        jtNuevoPNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jtNuevoPDescripcion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jtNuevoPPrecio.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jbGuardarProNuevo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jbGuardarProNuevo.setText("Guardar");
        jbGuardarProNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarProNuevoActionPerformed(evt);
            }
        });

        jbCancelarProNuevo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jbCancelarProNuevo.setText("Cancelar");
        jbCancelarProNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarProNuevoActionPerformed(evt);
            }
        });

        jlNuevoPStock.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jlNuevoPStock.setText("Stock:");

        jtNuevoPStock.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        javax.swing.GroupLayout jpNuevoProductoLayout = new javax.swing.GroupLayout(jpNuevoProducto);
        jpNuevoProducto.setLayout(jpNuevoProductoLayout);
        jpNuevoProductoLayout.setHorizontalGroup(
            jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNuevoProductoLayout.createSequentialGroup()
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpNuevoProductoLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlNuevoPStock)
                            .addComponent(jlNuevoPPrecio)
                            .addComponent(jbGuardarProNuevo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNuevoProductoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlNuevoPDescripcion)
                            .addComponent(jlNuevoPNombre))
                        .addGap(36, 36, 36)))
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpNuevoProductoLayout.createSequentialGroup()
                        .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtNuevoPDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtNuevoPNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtNuevoPPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(jtNuevoPStock, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jpNuevoProductoLayout.createSequentialGroup()
                                .addComponent(jlNuevoPTitulo)
                                .addGap(53, 53, 53)))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNuevoProductoLayout.createSequentialGroup()
                        .addComponent(jbCancelarProNuevo)
                        .addGap(73, 73, 73))))
        );
        jpNuevoProductoLayout.setVerticalGroup(
            jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNuevoProductoLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jlNuevoPTitulo)
                .addGap(119, 119, 119)
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNuevoPNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNuevoPNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNuevoPDescripcion)
                    .addComponent(jtNuevoPDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNuevoPStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNuevoPStock))
                .addGap(54, 54, 54)
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNuevoPPrecio)
                    .addComponent(jtNuevoPPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardarProNuevo)
                    .addComponent(jbCancelarProNuevo))
                .addGap(133, 133, 133))
        );

        jcbListaProductos.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jcbListaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaProductosActionPerformed(evt);
            }
        });

        jcbMasBajo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jcbMasBajo.setText("Precio mas bajo");
        jcbMasBajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMasBajoActionPerformed(evt);
            }
        });

        jcbListarAlto.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jcbListarAlto.setText("Precio mas alto");
        jcbListarAlto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListarAltoActionPerformed(evt);
            }
        });

        jbActualizarTProdu.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jbActualizarTProdu.setText("Actualiazar Tabla");
        jbActualizarTProdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarTProduActionPerformed(evt);
            }
        });

        jtfBuscarProducto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jtfBuscarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfBuscarProductoMouseClicked(evt);
            }
        });

        btnBuscarProducto.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        btnBuscarProducto.setText("Buscar");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel12.setText("by -EJARQUE and ROMERO -");

        javax.swing.GroupLayout jpInicioProductoLayout = new javax.swing.GroupLayout(jpInicioProducto);
        jpInicioProducto.setLayout(jpInicioProductoLayout);
        jpInicioProductoLayout.setHorizontalGroup(
            jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInicioProductoLayout.createSequentialGroup()
                .addGroup(jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInicioProductoLayout.createSequentialGroup()
                        .addGroup(jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpInicioProductoLayout.createSequentialGroup()
                                .addGap(366, 366, 366)
                                .addComponent(jlProductoTitulo))
                            .addGroup(jpInicioProductoLayout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addGroup(jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jpInicioProductoLayout.createSequentialGroup()
                                            .addComponent(jbNuevoP)
                                            .addGap(18, 18, 18)
                                            .addComponent(jbModificarP)
                                            .addGap(82, 82, 82)
                                            .addComponent(jbActualizarTProdu)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jbEliminarP))
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpInicioProductoLayout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jlProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jcbListaProductos, 0, 210, Short.MAX_VALUE)
                                            .addComponent(jtfBuscarProducto))
                                        .addGap(18, 18, 18)
                                        .addGroup(jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jpInicioProductoLayout.createSequentialGroup()
                                                .addComponent(jcbListarAlto)
                                                .addGap(18, 18, 18)
                                                .addComponent(jcbMasBajo))
                                            .addComponent(btnBuscarProducto))))))
                        .addGap(139, 139, 139)
                        .addComponent(jpNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpInicioProductoLayout.createSequentialGroup()
                        .addGap(461, 461, 461)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(653, Short.MAX_VALUE))
        );
        jpInicioProductoLayout.setVerticalGroup(
            jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInicioProductoLayout.createSequentialGroup()
                .addGroup(jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInicioProductoLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jlProductoTitulo)
                        .addGap(58, 58, 58)
                        .addGroup(jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlProductos)
                            .addComponent(jcbListarAlto)
                            .addComponent(jcbMasBajo)
                            .addComponent(jcbListaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarProducto))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbModificarP)
                            .addComponent(jbEliminarP)
                            .addComponent(jbActualizarTProdu)
                            .addComponent(jbNuevoP)))
                    .addGroup(jpInicioProductoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jpNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(121, 121, 121))
        );

        jtpEscritorio.addTab("tab3", jpInicioProducto);

        jtTablaDetalle.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jtTablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jtTablaDetalle);

        jtTablaCompra.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jtTablaCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtTablaCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaCompraMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jtTablaCompra);

        jlCompraDetalleCTabla.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jlCompraDetalleCTabla.setText("DetalleCompra");

        jlCompraTabla.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jlCompraTabla.setText("Compra");

        jlNuevaCProvedor.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jlNuevaCProvedor.setText("Proveedor:");

        jcbNuevaCProveedor.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N

        jlNuevaCProducto.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jlNuevaCProducto.setText("Producto:");

        jlNuevaCFecha.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jlNuevaCFecha.setText("Fecha:");

        jlNuevaCPrecio.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jlNuevaCPrecio.setText("Precio:");

        jtNuevaCPrecio.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jlNuevaCCantidad.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jlNuevaCCantidad.setText("Cantidad:");

        jtNuevaCCantidad.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jbNuevaCComprar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jbNuevaCComprar.setText("Comprar");
        jbNuevaCComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaCComprarActionPerformed(evt);
            }
        });

        jlNuevaCompraTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jlNuevaCompraTitulo.setText("Compra nueva");

        jbNuevaCCancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jbNuevaCCancelar.setText("Cancelar");
        jbNuevaCCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaCCancelarActionPerformed(evt);
            }
        });

        jcbNuevaCProducto.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N

        javax.swing.GroupLayout jpnewCompraLayout = new javax.swing.GroupLayout(jpnewCompra);
        jpnewCompra.setLayout(jpnewCompraLayout);
        jpnewCompraLayout.setHorizontalGroup(
            jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnewCompraLayout.createSequentialGroup()
                .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlNuevaCFecha)
                    .addComponent(jlNuevaCProducto)
                    .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnewCompraLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jlNuevaCProvedor))
                        .addGroup(jpnewCompraLayout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlNuevaCCantidad)
                                .addComponent(jlNuevaCPrecio))
                            .addGap(4, 4, 4))))
                .addGap(81, 81, 81)
                .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jdcNuevaCFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbNuevaCProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbNuevaCProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlNuevaCompraTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                    .addGroup(jpnewCompraLayout.createSequentialGroup()
                        .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtNuevaCPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNuevaCCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpnewCompraLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jbNuevaCComprar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(jbNuevaCCancelar)
                .addGap(138, 138, 138))
        );
        jpnewCompraLayout.setVerticalGroup(
            jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnewCompraLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlNuevaCompraTitulo)
                .addGap(47, 47, 47)
                .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlNuevaCProvedor)
                    .addComponent(jcbNuevaCProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNuevaCProducto)
                    .addComponent(jcbNuevaCProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdcNuevaCFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNuevaCFecha))
                .addGap(32, 32, 32)
                .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNuevaCPrecio)
                    .addComponent(jtNuevaCPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNuevaCCantidad)
                    .addComponent(jtNuevaCCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevaCComprar)
                    .addComponent(jbNuevaCCancelar))
                .addGap(106, 106, 106))
        );

        jlCompraSeleccionar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jlCompraSeleccionar.setText("Listar por fechas");

        jlCompraY.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jlCompraY.setText("hasta");

        jbNuevaCompra.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jbNuevaCompra.setText("Nueva compra");
        jbNuevaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaCompraActionPerformed(evt);
            }
        });

        btnBuscarFecha.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        btnBuscarFecha.setText("Buscar");
        btnBuscarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFechaActionPerformed(evt);
            }
        });

        jbtnActualizaTabla.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jbtnActualizaTabla.setText("Actualizar Tablas");
        jbtnActualizaTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizaTablaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel10.setText("Compas por proveedor:");

        btnComprasXProveedor.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        btnComprasXProveedor.setText("Buscar");
        btnComprasXProveedor.setEnabled(false);
        btnComprasXProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasXProveedorActionPerformed(evt);
            }
        });

        jtfComprasXProveedor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jtfComprasXProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfComprasXProveedorMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel13.setText("by -EJARQUE and ROMERO -");

        javax.swing.GroupLayout jpInicioCompraLayout = new javax.swing.GroupLayout(jpInicioCompra);
        jpInicioCompra.setLayout(jpInicioCompraLayout);
        jpInicioCompraLayout.setHorizontalGroup(
            jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInicioCompraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInicioCompraLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jlCompraSeleccionar))
                    .addGroup(jpInicioCompraLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel10)))
                .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpInicioCompraLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jdcCompraFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jlCompraY)
                        .addGap(21, 21, 21)
                        .addComponent(jdcCompraFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpInicioCompraLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jtfComprasXProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnComprasXProveedor)))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarFecha)
                .addGap(70, 70, 70)
                .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCompraDetalleCTabla)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCompraTabla)
                    .addGroup(jpInicioCompraLayout.createSequentialGroup()
                        .addComponent(jbNuevaCompra)
                        .addGap(197, 197, 197)
                        .addComponent(jbtnActualizaTabla)))
                .addGap(605, 605, 605))
            .addGroup(jpInicioCompraLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jpnewCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpInicioCompraLayout.setVerticalGroup(
            jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInicioCompraLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jlCompraTabla)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevaCompra)
                    .addComponent(jbtnActualizaTabla))
                .addGap(31, 31, 31)
                .addComponent(jlCompraDetalleCTabla)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInicioCompraLayout.createSequentialGroup()
                .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInicioCompraLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jlCompraSeleccionar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInicioCompraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcCompraFecha1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcCompraFecha2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCompraY, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscarFecha, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(81, 81, 81)
                .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10)
                        .addComponent(jtfComprasXProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnComprasXProveedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnewCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInicioCompraLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(10, 10, 10)))
                .addGap(143, 143, 143))
        );

        jtpEscritorio.addTab("tab4", jpInicioCompra);

        jlTITULOPRINCIPAL.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jlTITULOPRINCIPAL.setForeground(new java.awt.Color(0, 0, 0));
        jlTITULOPRINCIPAL.setText("Sistema de PROVEMAX");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(539, 539, 539)
                        .addComponent(jlTITULOPRINCIPAL, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jtpEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlTITULOPRINCIPAL)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jtpEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
      // ------- METODOS DE SELECCION (CAMBIO DE COLOR EN EL MENU LATERAL) ------------------
    
    
    private void jpPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPrincipalMouseEntered
        // TODO add your handling code here:
        seleccion(jpPrincipal);
    }//GEN-LAST:event_jpPrincipalMouseEntered

    private void jpPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPrincipalMouseExited
        // TODO add your handling code here:
        sinSeleccionar(jpPrincipal);
    }//GEN-LAST:event_jpPrincipalMouseExited

    private void jpProveedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProveedorMouseEntered
        // TODO add your handling code here:
        seleccion(jpProveedor);
    }//GEN-LAST:event_jpProveedorMouseEntered

    private void jpProveedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProveedorMouseExited
        // TODO add your handling code here:
        sinSeleccionar(jpProveedor);
    }//GEN-LAST:event_jpProveedorMouseExited

    private void jpProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProductoMouseEntered
        // TODO add your handling code here:
        seleccion(jpProducto);
        
    }//GEN-LAST:event_jpProductoMouseEntered

    private void jpProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProductoMouseExited
        // TODO add your handling code here:
        sinSeleccionar(jpProducto);
    }//GEN-LAST:event_jpProductoMouseExited

    private void jpCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCompraMouseEntered
        // TODO add your handling code here:
        seleccion(jpCompra);
       
    }//GEN-LAST:event_jpCompraMouseEntered

    private void jpCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCompraMouseExited
        // TODO add your handling code here:
        sinSeleccionar(jpCompra);
    }//GEN-LAST:event_jpCompraMouseExited

    
      // ------- METODOS DE CLICK PARA ACCEDER A LAS VENTANAS CORRESPONDIENTES --------------
    
    
    private void jpPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPrincipalMouseClicked
        
        jtpEscritorio.setSelectedIndex(0);
        cargaTablaIni();
    }//GEN-LAST:event_jpPrincipalMouseClicked

    private void jpProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProveedorMouseClicked
        
        
        jtpEscritorio.setSelectedIndex(1);
        jPanel1.setVisible(false);       
        
        List<Proveedor> listaTablaProveedor = new ArrayList<>(proveedorData.listarProveedores());
        cargarDatosEnTablaProveedor(listaTablaProveedor);
        
        btnModificar.setEnabled(false);
        btnDeshabilitar.setEnabled(false);
        btnHabilitar.setEnabled(false);
        
    }//GEN-LAST:event_jpProveedorMouseClicked
    
    private void jpProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProductoMouseClicked
              
        jtpEscritorio.setSelectedIndex(2);
        
        if(!cabeceraProdIni){
            cabeceraProducto();
        }
               
        if(!listaProductosCargada){
            List<Producto> listaComboProducto = new ArrayList<>(productoData.listaProductosSinDuplicado());
            listaComboProducto(listaComboProducto);
        }

            List<Producto> listaTablaProducto = new ArrayList<>(productoData.listaProductos());
            listaProducto(listaTablaProducto);
  
        jbModificarP.setEnabled(false);
        jpNuevoProducto.setVisible(false);
        jbEliminarP.setEnabled(false);
        btnBuscarProducto.setEnabled(false);
    }//GEN-LAST:event_jpProductoMouseClicked

    private void jpCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCompraMouseClicked
        // TODO add your handling code here:
        
        jtpEscritorio.setSelectedIndex(3);       
        
        if(!cabeceraCompraIni && !cabeceraDetalleIni){
            cabeceraCompra();
            cabeceraDetalle();
        }
        if(!listaCompra && !listaDetalle){
            List<Compra> listaTablaCompra = new ArrayList<>(compraData.listaCompras());
            listaCompra(listaTablaCompra);
            List<DetalleCompra> listaD= new ArrayList<>(detalleData.listaDetalles());
            listaDetalle(listaD);
        }        
        jpnewCompra.setVisible(false);
    }//GEN-LAST:event_jpCompraMouseClicked

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
         cerrarSesion();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void jbtnRellenarStockActionPerformed(java.awt.event.ActionEvent evt){                                                  
        jtpEscritorio.setSelectedIndex(3);
        jpnewCompra.setVisible(true);
         
        if(!cabeceraCompraIni && !cabeceraDetalleIni){
            cabeceraCompra();
            cabeceraDetalle();
        }
        borrarFilaCompra();
        borrarFilaDetalle();
        desactivarBotonesCompra();
         if(!comboProveedor && !comboProducto){
             listaComboProveedor(); 
             listaProductoCompra();
        }  
         actualizarTablaInicio();
    }                                                           

        
      // ------- METODOS PARA LA VENTANA PROVEEDOR ------------------------------------------
    
      
    private void jbtnGuardarNewProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarNewProveedorActionPerformed
       // Obtencion de los datos del proveedor desde los textfield.
        String razonSocial = jtxRazonSocial.getText();
        String domicilio = jtxDomicilio.getText();
        String numeroTelefono = jtxTelefonoo.getText();
        String codigoDeArea = jtxTelefono.getText();

        int codigoAreaPais = jcbTelefono.getSelectedIndex();

        // // Verificaciones de camposs
        
        //PRimera verificacion: verifica que los campos esten lenos, si estos estan vacios entra al if.
        if (razonSocial.isEmpty() || domicilio.isEmpty() || numeroTelefono.isEmpty() || codigoDeArea.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Es necesario llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //el try, esta por que toma la exception: NumberFormatException.
        try {
            //Segunda: verifica si contiene numeros el campo de razonSocial
            if (contieneLetrasYEspacios(razonSocial)) {
                JOptionPane.showMessageDialog(null, "La razon social no debe contener numeros.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //tercera: verifica el tamaño del string ingresado
            if (numeroTelefono.length() != 7) {
                JOptionPane.showMessageDialog(null, "El numero de telefono debe contener exactamente 7 digitos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //cuarta: verificacion para que el numero ingresado sea mayot que 0
            int numeroTelefonoEntero = Integer.parseInt(numeroTelefono);
            if (numeroTelefonoEntero < 0) {
                JOptionPane.showMessageDialog(null, "El numero de telefono debe ser un numero positivo.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //quintaa: verifica el tamaño del string ingresado
            if (codigoDeArea.length() != 3) {
                JOptionPane.showMessageDialog(null, "El codigo de area debe contener exactamente 3 digitos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //sexta: verificacion para que el numero ingresado sea mayot que 0
            int codigoDeAreaEntero = Integer.parseInt(codigoDeArea);
            if (codigoDeAreaEntero < 0) {
                JOptionPane.showMessageDialog(null, "El codigo de area debe ser un numero positivo.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El codigo de area o el numero de telefono no deben contener caracteres no numericos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //Verificacion del limite de domicilio.
        if (domicilio.length() > 100) {
            JOptionPane.showMessageDialog(null, "Usted a ingresado: " + domicilio.length() + " caracteres y el limite es de 100.", "Error", JOptionPane.ERROR_MESSAGE);
            jtxDomicilio.setText(" ");
            return;
        }
        //confimar carga de proveedor o no.
        int opcion = JOptionPane.showConfirmDialog(
                null,
                "¿Esta seguro de cargar el nuevo Proveedor?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            //busca proveedor
            proveedor = proveedorData.buscarProveedorNombre(razonSocial);
             // Basicamente el if es para verificar si existe o no el proveedor, si existe muestrar un mensaje de error si no, continua con else
            if (proveedor != null && razonSocial.equals(proveedor.getRazonSocial())) {
                JOptionPane.showMessageDialog(null, "Ya existe un proveedor: " + razonSocial, "Error", JOptionPane.ERROR_MESSAGE);
                List<Proveedor> lista = new ArrayList<>(proveedorData.listarProveedores());
                cargarDatosEnTablaProveedor(lista);
                //crea el nuevo proveedor, carga los datos y actualiza la tabla
             } else {
                String telefono = "+54 9-" + codigoDeArea + "-" + numeroTelefono;
                proveedor = new Proveedor(razonSocial, domicilio, telefono, true);
                proveedorData.agregarProveedor(proveedor);
                limpiarCampos();

                JOptionPane.showMessageDialog(null, "El proveedor se ha cargado con Exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
                btnActualizarTabla.setEnabled(true);
                jcbActivos.setEnabled(true);  
                jcbNoActivos.setEnabled(true);
                List<Proveedor> lista = new ArrayList<>(proveedorData.listarProveedores());
                cargarDatosEnTablaProveedor(lista);

            }
        } else {
            JOptionPane.showMessageDialog(null, "Cambios cancelados.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);

        }
        //una vez realizado todo se vuelven a habilitar los bontones.
        btnActualizarTabla.setEnabled(true);
        jcbActivos.setEnabled(true);  
        jcbNoActivos.setEnabled(true);
        jtxBuscarProveedor.setEnabled(true);
        jPanel1.setVisible(false);
        
    }//GEN-LAST:event_jbtnGuardarNewProveedorActionPerformed
       
    //boton para buscar un proveedor
    private void btnBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProveedorActionPerformed
        //tomamos el proveedor a buscar y el modelo de la tabla
        String vproveedor = jtxBuscarProveedor.getText();
        modelo2 = (DefaultTableModel) jtProveedor.getModel();
        //verificamos que cuando se presione el boton este no este vacio, si esta vacio salta al else y muestra un mensaje
        if (!vproveedor.isEmpty()) {
            List<Proveedor> listita = proveedorData.buscarProveedorLetra(vproveedor);
            //verifica que la lista no este vacia, si esta vacia salta al else y muestra un mensaje
            if (!listita.isEmpty()) {
                // Si hay proveedores, cargamos la tabla
                borrarFila2();

                for (Proveedor proveedor : listita) {
                    Object[] rowData = {
                        proveedor.getIdProveedor(),
                        proveedor.getRazonSocial(),
                        proveedor.getDomicilio(),
                        proveedor.getTelefono(),
                        proveedor.getEstado(),
                    };
                    modelo2.addRow(rowData);
                }
            } else {
                
                JOptionPane.showMessageDialog(null, "Proveedor no encontrado.", "Error", JOptionPane.INFORMATION_MESSAGE);
                modelo2.setRowCount(0);
            }
        } else {
            
            JOptionPane.showMessageDialog(null, "Es necesario llenar el buscador.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarProveedorActionPerformed

    //boton para deshabilitar un proveedor.
    private void btnDeshabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeshabilitarActionPerformed
       int filaSeleccionada = jtProveedor.getSelectedRow();
       
       //si no hay fila seleccionada el boton no se habilita, sigue en disabled, en caso contraro se habilita el boton y realiza una serie de verificaciones
       //Como por ejemplo: si el estado es falso no se puede deshabilitar por que ya lo esta.
        if (filaSeleccionada != -1) {  
        Boolean estado = (Boolean) modelo2.getValueAt(filaSeleccionada, 4);
        String razonSocial = (String) modelo2.getValueAt(filaSeleccionada, 1);
        
        if(estado == false){
            JOptionPane.showMessageDialog(null, "El proveedor: "+razonSocial+" ya se encuentra Deshabilitado", razonSocial, JOptionPane.INFORMATION_MESSAGE);
            return;
        }
    
        int opcion = JOptionPane.showConfirmDialog( 
                null,
                "Estas seguro de Deshabilitar el proveedor: " + razonSocial,
                "Confirmar", 
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            
            proveedorData.eliminarProveedor(razonSocial);
            JOptionPane.showMessageDialog(null, "Deshabilitado Correctamente.", "Exito", JOptionPane.INFORMATION_MESSAGE);
            List<Proveedor> prove = new ArrayList<>(proveedorData.listarProveedores());
            cargarDatosEnTablaProveedor(prove);
        } else {
            
            JOptionPane.showMessageDialog(null, "Cancelado.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
            
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione un proveedor para DESHABILITAR.", "Error", JOptionPane.INFORMATION_MESSAGE);
    }
        btnModificar.setEnabled(false);
        btnHabilitar.setEnabled(false);
        btnDeshabilitar.setEnabled(false);
        
    }//GEN-LAST:event_btnDeshabilitarActionPerformed

    //boton para modificar el proveedor.
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       int filaSeleccionada = jtProveedor.getSelectedRow();      
       //selecciona la fila, si no hay fila seleccionada salta al else y meustra un mensaje
       //en caso de que seleccionemos la fila toma todas las columnas de la fila seleccionada 
       //guarda los datos en variables para luego cargarlo al proveedor con los datos actualizados     
        if (filaSeleccionada != -1) {  
        int idProveedor = (Integer) modelo2.getValueAt(filaSeleccionada, 0);
        String razonSocial = (String) modelo2.getValueAt(filaSeleccionada, 1);
        String domicilio = (String) modelo2.getValueAt(filaSeleccionada, 2);
        String telefono = (String) modelo2.getValueAt(filaSeleccionada, 3);        
              
        proveedor = new Proveedor(idProveedor, razonSocial, domicilio, telefono);   
      
        // JOptionPane para confirmar
        int opcion = JOptionPane.showConfirmDialog( 
                null,
                "¿Estas seguro de realizar estos cambios?",
                "Confirmar", 
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            
            proveedorData.modificarProveedor(proveedor);
            JOptionPane.showMessageDialog(null, "Cambios realizados con exito.", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            
            JOptionPane.showMessageDialog(null, "Cambios cancelados.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
            
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione un proveedor para modificar.", "Error", JOptionPane.INFORMATION_MESSAGE);
    }
        btnModificar.setEnabled(false);
        btnHabilitar.setEnabled(false);
        btnDeshabilitar.setEnabled(false);
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jcbActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbActivosActionPerformed
        jtxBuscarProveedor.setText("");
        btnModificar.setEnabled(false);
        btnHabilitar.setEnabled(false);
        btnDeshabilitar.setEnabled(false);
            
      boolean activosSeleccionados = jcbActivos.isSelected();
       if (jcbActivos.isSelected()) {   
        jcbNoActivos.setSelected(false);
     }
      
     if (activosSeleccionados) {
        
        List<Proveedor> listita = new ArrayList<>(proveedorData.listarProveedoresActivos());
        cargarDatosEnTablaProveedor(listita);
      } else {
        
        List<Proveedor> listita = new ArrayList<>(proveedorData.listarProveedores());
        cargarDatosEnTablaProveedor(listita);
      }
        
    }//GEN-LAST:event_jcbActivosActionPerformed

    private void jtProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProveedorMouseClicked
        btnModificar.setEnabled(true);
        btnDeshabilitar.setEnabled(true);
        btnHabilitar.setEnabled(true);
    }//GEN-LAST:event_jtProveedorMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
                
        int opcion = JOptionPane.showConfirmDialog( 
                null,
                "¿Esta seguro de cancelar?",
                "Confirmar", 
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {   
            JOptionPane.showMessageDialog(null, "Calcelado", "Exito!", JOptionPane.INFORMATION_MESSAGE);
            List<Proveedor> listita = new ArrayList<>(proveedorData.listarProveedores());
            cargarDatosEnTablaProveedor(listita);
            jPanel1.setVisible(false);
        } 
        
        btnActualizarTabla.setEnabled(true);
        jcbActivos.setEnabled(true);  
        jcbNoActivos.setEnabled(true);
        jtxBuscarProveedor.setEnabled(true);
        jPanel1.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jcbNoActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNoActivosActionPerformed
            boolean activosSeleccionados = jcbNoActivos.isSelected();
            
            if (jcbNoActivos.isSelected()) {

               jcbActivos.setSelected(false);
              }
             if (activosSeleccionados) {      
               List<Proveedor> listita = new ArrayList<>(proveedorData.listarProveedoresNoActivos());
               cargarDatosEnTablaProveedor(listita);
             } else {

               List<Proveedor> listita = new ArrayList<>(proveedorData.listarProveedores());
               cargarDatosEnTablaProveedor(listita);
           }
    }//GEN-LAST:event_jcbNoActivosActionPerformed

    private void btnActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTablaActionPerformed
        
        List<Proveedor> listita = new ArrayList<>(proveedorData.listarProveedores());
        cargarDatosEnTablaProveedor(listita);
        jtxBuscarProveedor.setText("");
        btnModificar.setEnabled(false);
        btnHabilitar.setEnabled(false);
        btnDeshabilitar.setEnabled(false);
        
    }//GEN-LAST:event_btnActualizarTablaActionPerformed

    private void jtxBuscarProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxBuscarProveedorMouseClicked
        btnBuscarProveedor.setEnabled(true);
        jcbActivos.setSelected(false);
        jcbNoActivos.setSelected(false);
        List<Proveedor> listita = new ArrayList<>(proveedorData.listarProveedores());
        cargarDatosEnTablaProveedor(listita);
        jtxBuscarProveedor.setText("");
        btnModificar.setEnabled(false);
        btnHabilitar.setEnabled(false);
        btnDeshabilitar.setEnabled(false);
    }//GEN-LAST:event_jtxBuscarProveedorMouseClicked
    
    
      // ------- METODOS PARA LA VENTANA PRODUCTO -------------------------------------------
    
    //boton de nuevo producto. 
    private void jbNuevoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoPActionPerformed
        //lo unico que hace es desactivar los botones, y mostrar el panel del para cargar un nuevo producto
        jpNuevoProducto.setVisible(true);
        desactivarBotonesProducto();
        borrarFilaProducto();
        btnBuscarProducto.setEnabled(false);
    }//GEN-LAST:event_jbNuevoPActionPerformed

    //boton para guardar nuevo producto
    private void jbGuardarProNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarProNuevoActionPerformed
       
        String carac = ","+" ."+" -"+" ("+" )"+" :";//solo esta para mostrarlo en el panel
        //se toman todos los datos ingresados en los campos y se realizan una serie de validaciones.
        //Primera: ve si los campos estan vacios.
        //La segunda es una serie de validaciones: verifica que no este vacio, que no supere el ttamaño permitido.
        // y que contenga caracteres validos.
        //esto se repite con los otros campos.
        //si todo se cumple y no  hay problemas se carga el nuevo producto
        try{
            String nombre = jtNuevoPNombre.getText();
            String descripcion = jtNuevoPDescripcion.getText();
            String stock = jtNuevoPStock.getText();
            String precio1 = jtNuevoPPrecio.getText();            
              
            if(nombre.isEmpty() && descripcion.isEmpty() && precio1.isEmpty() && stock.isEmpty()){
                JOptionPane.showMessageDialog(null, "Es necesario llenar todos los campos.", "Error!", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Es necesario agregar un dato en el campo nombre.", "Error!", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else if (nombre.length() > 20) {
                JOptionPane.showMessageDialog(null, "Ingreso: " + nombre.length() + " caracteres. Supera el limite permitido(20).", "Error!", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else if (contieneLetrasYEspacios(nombre) != true) {
                JOptionPane.showMessageDialog(null, "En el campo de nombre solo estan permitidos caracteres validos.", "Error!", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            if (descripcion.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Es necesario agregar un dato en el campo descripcion.", "Error!", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else if (descripcion.length() > 100) {
                JOptionPane.showMessageDialog(null, "Ingreso: " + descripcion.length() + " caracteres. Supera el limite de 100.", "Error!", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else if (contieneLetrasEspaciosNumeros(descripcion) != true) {
                JOptionPane.showMessageDialog(null, "En el campo de descripcion solo estan permitidos caracteres validos.\n"
                        +carac, "Error!", JOptionPane.INFORMATION_MESSAGE);
                return;
            } 
            
            if(stock.isEmpty()){
                JOptionPane.showMessageDialog(null,"Es necesario indicar un Stock.","Error!",JOptionPane.INFORMATION_MESSAGE);
                return;
            }          
            
            
            if(precio1.isEmpty()){
                JOptionPane.showMessageDialog(null,"Es necesario completar el campo de precio.","Error!",JOptionPane.INFORMATION_MESSAGE);
                return;
            }          
            
            int stock1 = Integer.parseInt(stock);
            double precio = Double.parseDouble(precio1);
            
            
            int opcion = JOptionPane.showConfirmDialog( 
                null,
                "¿Desea cargar este producto?"+"\n"+nombre+" "+descripcion,
                "Confirmar", 
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {   
         
                producto = new Producto(nombre, descripcion, stock1, precio,true);
                productoData.registroProducto(producto);
                JOptionPane.showMessageDialog(null,"Producto agregado","Exito!",JOptionPane.INFORMATION_MESSAGE);                
                actualizarTablaInicio();
              
                List<Producto> ccombo = new ArrayList<>(productoData.listaProductosSinDuplicado());
                listaComboProducto(ccombo);
                limpiarProducto();              

                List<Producto> listaAux = new ArrayList<>(productoData.listaProductos());
                listaProducto(listaAux);               
      
            jpNuevoProducto.setVisible(false);
        } 
     
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Debe ingresar un precio valido."," ",JOptionPane.INFORMATION_MESSAGE);
        }   
        
        activaBotonesProducto();
    }//GEN-LAST:event_jbGuardarProNuevoActionPerformed

    //boton cancelar producto nuevo
    private void jbCancelarProNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarProNuevoActionPerformed
       //basicamente lo que se hace es  mostrar un panel de confirmacion, si es si
       //se cancela  y nos regresa, habilitando los botones
       //realiza la carga de las tablas, si, podriamos haber hecho un metodo a
         int opcion = JOptionPane.showConfirmDialog( 
                null,
                "¿Esta seguro de cancelar?",
                "Confirmar", 
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {   
            JOptionPane.showMessageDialog(null, "Calcelado", "Exito!", JOptionPane.INFORMATION_MESSAGE);
            
            List<Producto> listaComboProducto = new ArrayList<>(productoData.listaProductosSinDuplicado());
            listaComboProducto(listaComboProducto);
            List<Producto> listaAux = new ArrayList<>(productoData.listaProductos());
            listaProducto(listaAux);    
            jpNuevoProducto.setVisible(false);
        } 
        desactivarBotonesProducto();
        
       
        activaBotonesProducto();
    }//GEN-LAST:event_jbCancelarProNuevoActionPerformed
  
    private void jcbListaProductosActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        
        borrarFilaProducto();        

        Producto seleccion = (Producto) jcbListaProductos.getSelectedItem();
        if (seleccion != null) {
            productos = new ArrayList<>(productoData.listaProductospoID(seleccion.getNombre()));

            for (Producto lista : productos) {
                modelo.addRow(new Object[]{
                    lista.getIdProducto(),
                    lista.getNombre(),
                    lista.getDescripcion(),
                    lista.getStock(),
                    lista.getPrecio()});
            }
        }  
        }                                                     

    private void jtTablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaProductoMouseClicked
        // TODO add your handling code here:
        jbModificarP.setEnabled(true);
        jbEliminarP.setEnabled(true);
    }//GEN-LAST:event_jtTablaProductoMouseClicked

    private void jbModificarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarPActionPerformed
        // TODO add your handling code here:
         int indice = jtTablaProducto.getSelectedRow();

    if (indice != -1) {
        int id = (Integer) modelo.getValueAt(indice, 0);
        String nombre = (String) modelo.getValueAt(indice, 1);
        String descripcion = (String) modelo.getValueAt(indice, 2);
        int stock = 0;
        double precio = 0.0;

        Object stockObject = modelo.getValueAt(indice, 3);
        Object precioObject = modelo.getValueAt(indice, 4);

        
        producto = new Producto(id, nombre, descripcion, stock, precio, true);

        int opcion = JOptionPane.showConfirmDialog(
                null,
                "¿Está seguro de realizar estos cambios?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
           
            try {
                stock = Integer.parseInt(stockObject.toString());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error modificar stock.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                precio = Double.parseDouble(precioObject.toString());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error al modificar precio."+"\n"+"Ingrese formato correcto (00.00)", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
          
            producto.setStock(stock);
            producto.setPrecio(precio);

            productoData.modificarProducto(producto);
            JOptionPane.showMessageDialog(null, "Producto modificado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            
            actualizarTablaInicio();

            List<Producto> listaTablaProducto = new ArrayList<>(productoData.listaProductos());
            listaProducto(listaTablaProducto);
        } else {
            JOptionPane.showMessageDialog(null, "El producto no se ha modificado.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    jbModificarP.setEnabled(false);
    jbEliminarP.setEnabled(false);
        
    }//GEN-LAST:event_jbModificarPActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
         String name = jtfBuscarProducto.getText();
        
        List<Producto> listita = productoData.buscarProductosPorNombreOLetra(name);

        if (listita.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Producto no encontrado", "OAAAAAAAAAAAAAAAAAAAAAAAAAA", JOptionPane.INFORMATION_MESSAGE);
        } else {
           listaProducto(listita);
           jcbMasBajo.setSelected(false);
           jcbListarAlto.setSelected(false);
          }
        
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void jbEliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarPActionPerformed
       int indice = jtTablaProducto.getSelectedRow();      
       
       if(indice != -1){
          
         String name = (String) modelo.getValueAt(indice, 1);         
         
         int opcion = JOptionPane.showConfirmDialog( 
                null,
                "Estas seguro de eliminar el producto "+name,
                "Confirmar Eliminacion", 
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            
           String nombre = (String) modelo.getValueAt(indice, 0);
           productoData.eliminarProducto(nombre, name);           
           
           JOptionPane.showMessageDialog(null, "El producto a sido eliminado", "Exito!", JOptionPane.INFORMATION_MESSAGE);
           List<Producto> listacombo = new ArrayList<>(productoData.listaProductosSinDuplicado());
           listaComboProducto(listacombo);
         int indice2 = jtTablaProducto.getSelectedRow();

            if (indice2 == -1) {
            List<Producto> listaAux = new ArrayList<>(productoData.listaProductos());
            listaProducto(listaAux);
            }
           
          
        } else {
            
            JOptionPane.showMessageDialog(null, " No se ha eliminado el producto "+name+".", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
        }
       
        jbModificarP.setEnabled(false);
        jbEliminarP.setEnabled(false);
        
    }//GEN-LAST:event_jbEliminarPActionPerformed

    private void jcbMasBajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMasBajoActionPerformed
        List<Producto> listita = productoData.listarProductoMenor();  
        listaProducto(listita);
        jcbListarAlto.setSelected(false);  
        btnBuscarProducto.setEnabled(false);
    }//GEN-LAST:event_jcbMasBajoActionPerformed

    private void jcbListarAltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListarAltoActionPerformed
      
        List<Producto> listita = productoData.listarProductoMayor();  
        listaProducto(listita);
        jcbMasBajo.setSelected(false);  
        btnBuscarProducto.setEnabled(false);
    }//GEN-LAST:event_jcbListarAltoActionPerformed

    private void jbActualizarTProduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarTProduActionPerformed
        // TODO add your handling code here:        
           
            List<Producto> carrito = new ArrayList<>(productoData.listaProductos());
            listaProducto(carrito);
      
            jbModificarP.setEnabled(false);
            jbEliminarP.setEnabled(false);
            //jcbListarAlto-jcbMasComprado-jcbMasBajo
            jcbListarAlto.setSelected(false);
            jcbMasBajo.setSelected(false);
            btnBuscarProducto.setEnabled(false);
           
            

    }//GEN-LAST:event_jbActualizarTProduActionPerformed

    private void jtfBuscarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfBuscarProductoMouseClicked
        btnBuscarProducto.setEnabled(true);
    }//GEN-LAST:event_jtfBuscarProductoMouseClicked

   
        // ------- METODOS PARA LA VENTANA COMPRA ---------------------------------------------
    
    private void jbNuevaCComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaCComprarActionPerformed
    proveedor = (Proveedor) jcbNuevaCProveedor.getSelectedItem();
    producto = (Producto) jcbNuevaCProducto.getSelectedItem();
    LocalDate fc = null;
    int indiceProve = (int) jcbNuevaCProveedor.getSelectedIndex();
    int indiceProdu = (int) jcbNuevaCProducto.getSelectedIndex();
    
    String cant = jtNuevaCCantidad.getText();
    String pre = jtNuevaCPrecio.getText();
        
    Date fecha = (Date) jdcNuevaCFecha.getDate();
    
    
        if (indiceProve == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, es necesario seleccionar un proveedor.", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }else if(indiceProdu == 0){
             JOptionPane.showMessageDialog(null, "Por favor, es necesario seleccionar un producto.", "Error", JOptionPane.ERROR_MESSAGE);
             return;
        }else if( fecha == null){
             JOptionPane.showMessageDialog(null, "Por favor, complete el campo de fecha.", "Error", JOptionPane.ERROR_MESSAGE);
             return;
        }
        if(pre.isEmpty()){ 
            JOptionPane.showMessageDialog(null, "Debe llenar el campo precio.", "Error", JOptionPane.ERROR_MESSAGE);   
            return;
          }

     
        if(cant.isEmpty()){
        JOptionPane.showMessageDialog(null, "Debe llenar el campo cantidad.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        if(fecha != null){

             fc = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar una fecha valida.", "Error", JOptionPane.ERROR_MESSAGE);  
            return;
        }

    try {
        double precio = Double.parseDouble(jtNuevaCPrecio.getText());
        int cantidad = Integer.parseInt(jtNuevaCCantidad.getText());
        
        
        if (precio <= 0) {
        JOptionPane.showMessageDialog(null, "El precio debe ser mayor que cero.", "Error", JOptionPane.ERROR_MESSAGE);
        return; 
        }
     
        if (cantidad <= 0) {
        JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor que cero.", "Error", JOptionPane.ERROR_MESSAGE);
        return; 
        }
        
       
        int opcion = JOptionPane.showConfirmDialog( 
                null,
                "¿Estás seguro de realizar esta compra?: ",
                "Confirmar", 
                JOptionPane.YES_NO_OPTION);
        

        if (opcion == JOptionPane.YES_OPTION) {          
                
            int nuevoStock = producto.getStock() + cantidad;
            producto.setStock(nuevoStock);
            productoData.modificarProducto(producto);           
            
            compra = new Compra(proveedor, fc, true);
            compraData.registrarCompra(compra);
            detalle = new DetalleCompra(compra, producto, precio, cantidad, true);
            detalleData.registrarDetalleCompra(detalle);

            JOptionPane.showMessageDialog(null, "Compra realizada con EXITO.", "Exito", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "Compra cancelada.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);

        }
        
        actualizarTablaInicio();
        limpiarCompra();
        borrarFilaCompra();
        borrarFilaDetalle();

        int indice = jtTablaCompra.getSelectedRow();

        if (indice == -1) {
            List<Compra> listaAux = new ArrayList<>(compraData.listaCompras());
            listaCompra(listaAux);
            List<DetalleCompra> listaAuxDetalle = new ArrayList<>(detalleData.listaDetalles());
            listaDetalle(listaAuxDetalle);
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error en formato de precio o cantidad. Deben ser numeros validos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    listaComboProveedor(); 
    listaProductoCompra();  
    activarBotonesCompra();
    
    }//GEN-LAST:event_jbNuevaCComprarActionPerformed

    private void jbNuevaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaCompraActionPerformed
        
        jpnewCompra.setVisible(true);
        desactivarBotonesCompra();
        borrarFilaCompra();
        borrarFilaDetalle();
        if(!comboProveedor && !comboProducto){
             listaComboProveedor(); 
             listaProductoCompra();
        }       
    }//GEN-LAST:event_jbNuevaCompraActionPerformed

    private void jbNuevaCCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaCCancelarActionPerformed
         int opcion = JOptionPane.showConfirmDialog( 
                null,
                "¿Esta seguro de cancelar?",
                "Confirmar", 
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {   
            JOptionPane.showMessageDialog(null, "Calcelado", "Exito!", JOptionPane.INFORMATION_MESSAGE);
            List<Compra> listaAux = new ArrayList<>(compraData.listaCompras());
            listaCompra(listaAux);
            List<DetalleCompra> listaAuxDetalle = new ArrayList<>(detalleData.listaDetalles());
            listaDetalle(listaAuxDetalle);
            jpnewCompra.setVisible(false);
        }

        listaComboProveedor(); 
        listaProductoCompra();         
        activarBotonesCompra();        
    }//GEN-LAST:event_jbNuevaCCancelarActionPerformed

    private void jtTablaCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaCompraMouseClicked
        int indice = jtTablaCompra.getSelectedRow();
       
        if(indice == -1){
            List<Compra> listaAux = new ArrayList<>(compraData.listaCompras());
            listaCompra(listaAux);
            List<DetalleCompra> listaAuxDetalle = new ArrayList<>(detalleData.listaDetalles());
            listaDetalle(listaAuxDetalle);
        }else {
            proveedor = (Proveedor)modelo3.getValueAt(indice, 0);
            String razonSocial = proveedor.getRazonSocial();
            mostrarDetalleUnaCompra(razonSocial);
        }
    }//GEN-LAST:event_jtTablaCompraMouseClicked

    private void btnHabilitarActionPerformed(java.awt.event.ActionEvent evt) {                                             
         int filaSeleccionada = jtProveedor.getSelectedRow();
       

        if (filaSeleccionada != -1) {  
        Boolean estado = (Boolean) modelo2.getValueAt(filaSeleccionada, 4);
        String razonSocial = (String) modelo2.getValueAt(filaSeleccionada, 1);
        
        if(estado == true){
            JOptionPane.showMessageDialog(null, "El proveedor: "+razonSocial+" ya se encuentra Habilitado", razonSocial, JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        int opcion = JOptionPane.showConfirmDialog( 
                null,
                "Estas seguro de HABILITAR el proveedor: " + razonSocial,
                "Confirmar", 
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            
            proveedorData.darDeAltaProveedor(razonSocial);
            JOptionPane.showMessageDialog(null, "Habilitado correctamente.", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            
            JOptionPane.showMessageDialog(null, "Cancelado.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
            
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione un proveedor para HABILITAR.", "Error", JOptionPane.INFORMATION_MESSAGE);
    }
        btnModificar.setEnabled(false);
        btnHabilitar.setEnabled(false);
        btnDeshabilitar.setEnabled(false);
    }                                               
   
    private void btnBuscarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFechaActionPerformed
        Date date1 = jdcCompraFecha1.getDate();
        Date date2 = jdcCompraFecha2.getDate();

        if(date1 != null && date2 == null){
             LocalDate fecha = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
             List<Compra> compri = compraData.entreUnaFecha(fecha);
             
            if (!compri.isEmpty()) {
                listaCompra = false;
                listaDetalle = false;

                if (!listaCompra && !listaDetalle) {  
                    borrarFilaCompra();
                    listaCompra(compri);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay compras en esta fecha.", "Informacipn", JOptionPane.INFORMATION_MESSAGE);
            }
             
             
        }else if (date1 != null && date2 != null) {
            LocalDate fecha1 = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fecha2 = date2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            List<Compra> comprita = compraData.entreFechas(fecha1, fecha2);

            if (!comprita.isEmpty()) {
                listaCompra = false;
                listaDetalle = false;

                if (!listaCompra && !listaDetalle) {  
                    borrarFilaCompra();
                    listaCompra(comprita);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay compras entre las fechas seleccionadas", "Informacipn", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar fechas validas", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        jdcCompraFecha1.setDate(null);
        jdcCompraFecha2.setDate(null);
        
    }//GEN-LAST:event_btnBuscarFechaActionPerformed

    private void jbtnActualizaTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizaTablaActionPerformed
        listaCompra = false; listaDetalle = false;
        if(!listaCompra && !listaDetalle){
          borrarFilaCompra();  
         List<Compra> comprita = compraData.listaCompras();
         List<DetalleCompra> detallito = detalleData.listaDetalles();
         listaCompra(comprita);
         listaDetalle(detallito);
        }
        
        jdcCompraFecha1.setDate(null);
        jdcCompraFecha2.setDate(null);
        jtfComprasXProveedor.setText("");
        
        btnComprasXProveedor.setEnabled(false);
        
        
        
    }//GEN-LAST:event_jbtnActualizaTablaActionPerformed

    private void jtRepositorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtRepositorioMouseClicked
        jbtnRellenarStock.setEnabled(true);
    }//GEN-LAST:event_jtRepositorioMouseClicked
    
    private void btnComprasXProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasXProveedorActionPerformed
            String proveedorIngresado = jtfComprasXProveedor.getText();

            if(proveedorIngresado.isEmpty()){
                JOptionPane.showMessageDialog(null, "Debe ingresar un proveedor para buscar.", "Error", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else if (proveedorIngresado.length() > 20) {           
                JOptionPane.showMessageDialog(null, "Debe ingresar un proveedor válido", "Error", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else if(contieneLetrasYEspacios(proveedorIngresado)) {
                proveedor = new Proveedor();
                proveedor = proveedorData.buscarProveedorNombre(proveedorIngresado);

                if(proveedor == null){
                    JOptionPane.showMessageDialog(null, "El proveedor ingresado no existe.", "Inexistente", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                try {
                    List<Compra> listita = new ArrayList<>();
                    modelo3.setRowCount(0);
                    listita = compraData.listarComprasPorProveedor(proveedorIngresado);
                    listaCompra(listita);
                } catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(null, "Error al procesar la lista de compras. " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "El proveedor contiene caracteres invalidos.", "Error!", JOptionPane.INFORMATION_MESSAGE);
            }


            
          
    }//GEN-LAST:event_btnComprasXProveedorActionPerformed
   
    private void jtfComprasXProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfComprasXProveedorMouseClicked
        btnComprasXProveedor.setEnabled(true);
    }//GEN-LAST:event_jtfComprasXProveedorMouseClicked

    private void jdcCompraFecha1MouseClicked(java.awt.event.MouseEvent evt) {                                             
        
    }                                          

    private void btnNuevoProveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProveActionPerformed
        // TODO add your handling code here:
        desactivarBotonesProveedor();  
        jPanel1.setVisible(true);
        jcbTelefono.setSelectedIndex(-1);
        borrarFila2();
    }//GEN-LAST:event_btnNuevoProveActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */       

        try {
            
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGeneral().setVisible(true);
            }
        });
    }
    
    
      // --------------------------- METODOS AUXILIARES ------------------------------------- 
    
    
      // ------- Metodos para cargar la cebecera de las tablas ------------------------------
    
    
    private void cabeceraInicial(){
        ArrayList<Object> titulos = new ArrayList<>();
        
            titulos.add("id");
            titulos.add("Nombre");
            titulos.add("descipcion");
            titulos.add("Precio");
            titulos.add("Stock");
            
        for(Object filas : titulos){
            modelo5.addColumn(filas);            
        }
        
        jtRepositorio.setModel(modelo5);
        jtRepositorio.getColumnModel().getColumn(0).setMaxWidth(0);
        jtRepositorio.getColumnModel().getColumn(0).setMinWidth(0);
        jtRepositorio.getColumnModel().getColumn(0).setPreferredWidth(0);
        
         jtRepositorio.getColumnModel().getColumn(4).setCellRenderer(new StockCellRenderer());
        cabeceraRepoIni = true;       
    }
    
    private void cabeceraProducto(){         
        ArrayList<Object> titulos = new ArrayList<>();       
                          
             titulos.add("id");
             titulos.add("Nombre");
             titulos.add("Descripcion");
             titulos.add("Stock");
             titulos.add("Precio");            
        
        for(Object filas : titulos){
            modelo.addColumn(filas);
        }
       
        jtTablaProducto.setModel(modelo);
        jtTablaProducto.getColumnModel().getColumn(0).setMaxWidth(0);
        jtTablaProducto.getColumnModel().getColumn(0).setMinWidth(0);
        jtTablaProducto.getColumnModel().getColumn(0).setPreferredWidth(0);
        cabeceraProdIni = true;                      
    }
        
    private void cabeceraCompra(){         
        ArrayList<Object> titulos = new ArrayList<>();        
 
             titulos.add("Proveedor");
             titulos.add("Fecha");
             titulos.add("Estado");                      
        
        for(Object filas : titulos){
            modelo3.addColumn(filas);
        }       
        jtTablaCompra.setModel(modelo3);
        cabeceraCompraIni = true;                      
    }    
       
    private void cabeceraDetalle(){         
        ArrayList<Object> titulos = new ArrayList<>();      
      
             titulos.add("Producto");
             titulos.add("Precio Costo");
             titulos.add("Cantidad");
             titulos.add("Estado");          
        
        for(Object filas : titulos){
            modelo4.addColumn(filas);
        }
       
        jtTablaDetalle.setModel(modelo4);
        cabeceraDetalleIni = true;                      
    }
    
    
      // ------- Metodos para cargar datos dentro de las tablas -----------------------------
    
    
    private void actualizarTablaInicio() {
        modelo5.setRowCount(0);
        
        List<Producto> listaProductos = new ArrayList<>(productoData.listaProductos());
        listaProductoIni(listaProductos);
    }
        
    private void cargaTablaIni(){
         if(!cabeceraRepoIni){
            cabeceraInicial();
        }
        if(!listaRepoIni){
            List<Producto> ProduIni = new ArrayList<>(productoData.listaProductos());
            listaProductoIni(ProduIni);
            
        }        
    }
        
    private void listaProductoIni(List<Producto> productos){
        
        for(Producto pr : productos){
            Object[] rowData = {
                pr.getIdProducto(),
                pr.getNombre(),
                pr.getDescripcion(),
                pr.getPrecio(),
                pr.getStock()
                    
            };
          
            modelo5.addRow(rowData);
            
        }
        listaRepoIni = true;        
    }
    
    private void cargarDatosEnTablaProveedor(List<Proveedor> proveedores) {        
        
        modelo2 = (DefaultTableModel) jtProveedor.getModel();
        modelo2.setRowCount(0);
        
        for (Proveedor proveedor : proveedores) {
        
        Object[] rowData = {
                proveedor.getIdProveedor(),
                proveedor.getRazonSocial(),
                proveedor.getDomicilio(),
                proveedor.getTelefono(),
                proveedor.getEstado()
        };        
        modelo2.addRow(rowData);
        }
    }   
    
    private void listaProducto(List<Producto> productos){
        
        modelo.setRowCount(0);
        modelo = (DefaultTableModel) jtTablaProducto.getModel();
        
        for (Producto produ : productos) {
        
        Object[] rowData = {
            produ.getIdProducto(),
            produ.getNombre(),
            produ.getDescripcion(),
            produ.getStock(),
            produ.getPrecio()
        };        
        modelo.addRow(rowData);
        }
    }    
    
    private void listaCompra(List<Compra> compras){
        
        for(Compra carrito : compras ){
            Object[] rowData = {
                carrito.getProveedor(),
                carrito.getFecha(),
                carrito.isEstado()
            };
            modelo3.addRow(rowData);
        }
        listaCompra = true;
    }
    
    private void mostrarDetalleUnaCompra(String id){
        modelo4.setRowCount(0);
        detalle = new DetalleCompra();
        detalle = detalleData.obtenerDetalleCompra(id);
        
        if (detalle != null) {
        Object[] rowData = {                
            detalle.getIdProducto(),
            detalle.getPrecioCosto(),
            detalle.getCantidad(),
            detalle.isEstado()
        };
        modelo4.addRow(rowData);
        listaDetalle = true;
        }
    
    }
    
    private void listaDetalle(List<DetalleCompra> detalles){
        modelo4.setRowCount(0);
        
        for(DetalleCompra dc : detalles ){
            Object[] rowData = {                
                dc.getIdProducto(),
                dc.getPrecioCosto(),
                dc.getCantidad(),
                dc.isEstado()
            };
            modelo4.addRow(rowData);
        }
        listaDetalle = true;
    }
    
    
      // ------- Metodos para carga de CombosBoxs -------------------------------------------
    

    private void listaComboProducto(List<Producto> productos){
                
        jcbListaProductos.removeAllItems();
        
        jcbListaProductos.addItem(new Producto("-------------- SELECCIONAR --------------", "",0, 0.0, false));
        
        
        for (Producto lista : productos) {
            jcbListaProductos.addItem(lista);
        }        
        listaProductosCargada = true;    
    }
    
    private void listaComboProveedor(){
        jcbNuevaCProveedor.removeAllItems();
        proveedores = new ArrayList<>();        
        proveedores.add(new Proveedor("---- SELECCIONAR ----","","",false));
        proveedores.addAll(proveedorData.listarProveedores());
        
        for(Proveedor lista : proveedores){
            jcbNuevaCProveedor.addItem(lista);
        }
        comboProveedor = true;
    }
    
    private void listaProductoCompra(){
        jcbNuevaCProducto.removeAllItems();
        productos = new ArrayList<>();
        productos.add(new Producto("---- SELECCIONAR ----","",0,0,false));
        productos.addAll(productoData.listaProductos());
        
        for(Producto lista : productos){
            jcbNuevaCProducto.addItem(lista);
        }
        comboProducto = true;
    }
    
     
      // ------- Metodos para borrar filas de las tablas ---------------------------------
    
    private void borrarFilaProducto(){        
        int indice = modelo.getRowCount()-1;
        
        for(int i = indice;i >= 0;i--){
            modelo.removeRow(i);           
        }       
    }
     
    private void borrarFila2(){        
        int indice = modelo2.getRowCount()-1;
        
        for(int i = indice;i >= 0;i--){
            modelo2.removeRow(i);           
        }       
    }
    
    private void borrarFilaCompra(){        
        int indice = modelo3.getRowCount()-1;
        
        for(int i = indice;i >= 0;i--){
            modelo3.removeRow(i);           
        }       
    }
    
    private void borrarFilaDetalle(){        
        int indice = modelo4.getRowCount()-1;
        
        for(int i = indice;i >= 0;i--){
            modelo4.removeRow(i);           
        }       
    }
    
    
      // ------- Metodos para limpiar Campos ------------------------------------------------
    
    
    private void limpiarCampos(){
        jtxRazonSocial.setText("");
        jtxDomicilio.setText("");
        jtxTelefono.setText("");   
        jtxTelefonoo.setText("");
    }
    
    private void limpiarProducto(){
        jtNuevoPNombre.setText("");
        jtNuevoPDescripcion.setText("");
        jtNuevoPStock.setText("");
        jtNuevoPPrecio.setText("");           
    }
    
    private void limpiarCompra(){
        jdcNuevaCFecha.setDate(null);
        jtNuevaCPrecio.setText("");
        jtNuevaCCantidad.setText("");
    }
    
    
      // ------- Metodos para validar campos ------------------------------------------------
    

    public static boolean contieneLetrasYEspacios(String fraseRecibida) {
    for (char c : fraseRecibida.toCharArray()) {
        if (!esCaracterSinNumero(c)) {
            return false;
          }
       }
        return true;
    }
    
    public static boolean contieneLetrasEspaciosNumeros(String fraseRecibida) {
     for (char c : fraseRecibida.toCharArray()) {
        if (!esCaracterPermitido(c)) {
            return false;
          }
       }
        return true;
    }
    
    
      //metodos auxiliares para el uso de validacion de campos------------------------------
     
    
    public static boolean esCaracterPermitido(char c) {
    return (c >= 'a' && c <= 'z') ||
           (c >= 'A' && c <= 'Z') ||
           (c >= '0' && c <= '9') ||
           c == ' ' || c == ',' || c == '.' || c == '-' || c == '(' || c == ')';
    }
    
    public static boolean esCaracterSinNumero(char c) {
    return (c >= 'a' && c <= 'z') ||
           (c >= 'A' && c <= 'Z') ||
           c == ' ' || c == ',' || c == '.' || c == '-' || c == '(' || c == ')' || c == ':';
    }
    
      // -------- Metodo para settear el usuario en el menuGeneral --------------------------
    
    
    public void labelUsuario(String nombre){
        jlabelUsuario.setText(nombre);
    }
    
      
      // ------- Metodos para Seleccion (cambia de color al pasar el mouse) -----------------
    
    private void seleccion(JPanel panel){
        panel.setBackground(new Color(0,157,113));        
    }
    
    private void sinSeleccionar(JPanel panel){
        panel.setBackground(new Color(2,104,66));
    }
    
    //MEOTOD SUPER AUXILIAR
    
    //------------- auxiliar para activar o desactivar botones PROVEEDOR  -------------------
    
    private void desactivarBotonesProveedor(){
        btnModificar.setEnabled(false);
        btnActualizarTabla.setEnabled(false);
        btnHabilitar.setEnabled(false);
        btnDeshabilitar.setEnabled(false);
        jcbActivos.setEnabled(false);
        jcbNoActivos.setEnabled(false);
        btnBuscarProveedor.setEnabled(false); 
        jtxBuscarProveedor.setEnabled(false);
        
    }
   
    private void desactivarBotonesProducto(){
         jcbListaProductos.setEnabled(false);
         jcbMasBajo.setEnabled(false);
         jcbListarAlto.setEnabled(false);         
         jbActualizarTProdu.setEnabled(false);
         jbModificarP.setEnabled(false);
         jbEliminarP.setEnabled(false);

    }

    private void activaBotonesProducto(){
         jcbListaProductos.setEnabled(true);
         jcbMasBajo.setEnabled(true);
         jcbListarAlto.setEnabled(true);        
         jbActualizarTProdu.setEnabled(true);
    }

    private void desactivarBotonesCompra(){
        jdcCompraFecha1.setEnabled(false);
        jdcCompraFecha2.setEnabled(false);
        btnBuscarFecha.setEnabled(false);
        jtfComprasXProveedor.setEnabled(false);       
        jbtnActualizaTabla.setEnabled(false);
        btnComprasXProveedor.setEnabled(false);

    }

    private void activarBotonesCompra(){
       jdcCompraFecha1.setEnabled(true);
       jdcCompraFecha2.setEnabled(true);
       btnBuscarFecha.setEnabled(true);
       jtfComprasXProveedor.setEnabled(true);       
       jbtnActualizaTabla.setEnabled(true);
   }
        
    
    // --------------------- Metodo de Cerrar Sesion -----------
    
    private void cerrarSesion() {
        int opcion = JOptionPane.showConfirmDialog(
                null,
                "¿Esta seguro de cerrar la sesion?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
           this.setVisible(false);;
            Login login = new Login();
            JOptionPane.showMessageDialog(null, "Sesion cerrada.", "algun titulo", JOptionPane.INFORMATION_MESSAGE);
            login.setVisible(true);
       
        }
    }
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarTabla;
    private javax.swing.JButton btnBuscarFecha;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnBuscarProveedor;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnComprasXProveedor;
    private javax.swing.JButton btnDeshabilitar;
    private javax.swing.JButton btnHabilitar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevoProve;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton jbActualizarTProdu;
    private javax.swing.JButton jbCancelarProNuevo;
    private javax.swing.JButton jbEliminarP;
    private javax.swing.JButton jbGuardarProNuevo;
    private javax.swing.JButton jbModificarP;
    private javax.swing.JButton jbNuevaCCancelar;
    private javax.swing.JButton jbNuevaCComprar;
    private javax.swing.JButton jbNuevaCompra;
    private javax.swing.JButton jbNuevoP;
    private javax.swing.JButton jbtnActualizaTabla;
    private javax.swing.JButton jbtnGuardarNewProveedor;
    private javax.swing.JButton jbtnRellenarStock;
    private javax.swing.JCheckBox jcbActivos;
    private javax.swing.JComboBox<Producto> jcbListaProductos;
    private javax.swing.JCheckBox jcbListarAlto;
    private javax.swing.JCheckBox jcbMasBajo;
    private javax.swing.JCheckBox jcbNoActivos;
    private javax.swing.JComboBox<Producto> jcbNuevaCProducto;
    private javax.swing.JComboBox<Proveedor> jcbNuevaCProveedor;
    private javax.swing.JComboBox<String> jcbTelefono;
    private com.toedter.calendar.JDateChooser jdcCompraFecha1;
    private com.toedter.calendar.JDateChooser jdcCompraFecha2;
    private com.toedter.calendar.JDateChooser jdcNuevaCFecha;
    private javax.swing.JLabel jlAlto;
    private javax.swing.JLabel jlBajo;
    private javax.swing.JLabel jlCompra;
    private javax.swing.JLabel jlCompraDetalleCTabla;
    private javax.swing.JLabel jlCompraSeleccionar;
    private javax.swing.JLabel jlCompraTabla;
    private javax.swing.JLabel jlCompraY;
    private javax.swing.JLabel jlIcono;
    private javax.swing.JLabel jlIconoCompra;
    private javax.swing.JLabel jlIconoPrin;
    private javax.swing.JLabel jlIconoProd;
    private javax.swing.JLabel jlIconoProv;
    private javax.swing.JLabel jlMedio;
    private javax.swing.JLabel jlNuevaCCantidad;
    private javax.swing.JLabel jlNuevaCFecha;
    private javax.swing.JLabel jlNuevaCPrecio;
    private javax.swing.JLabel jlNuevaCProducto;
    private javax.swing.JLabel jlNuevaCProvedor;
    private javax.swing.JLabel jlNuevaCompraTitulo;
    private javax.swing.JLabel jlNuevoPDescripcion;
    private javax.swing.JLabel jlNuevoPNombre;
    private javax.swing.JLabel jlNuevoPPrecio;
    private javax.swing.JLabel jlNuevoPStock;
    private javax.swing.JLabel jlNuevoPTitulo;
    private javax.swing.JLabel jlPrincipal;
    private javax.swing.JLabel jlProducto;
    private javax.swing.JLabel jlProductoTitulo;
    private javax.swing.JLabel jlProductos;
    private javax.swing.JLabel jlProveedores;
    private javax.swing.JLabel jlReferencia;
    private javax.swing.JLabel jlTITULOPRINCIPAL;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jlabelUsuario;
    private javax.swing.JPanel jpCompra;
    private javax.swing.JPanel jpInicio;
    private javax.swing.JPanel jpInicioCompra;
    private javax.swing.JPanel jpInicioProducto;
    private javax.swing.JPanel jpInivioProveedor;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JPanel jpNuevoProducto;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpProducto;
    private javax.swing.JPanel jpProveedor;
    private javax.swing.JPanel jpnewCompra;
    private javax.swing.JTextField jtNuevaCCantidad;
    private javax.swing.JTextField jtNuevaCPrecio;
    private javax.swing.JTextField jtNuevoPDescripcion;
    private javax.swing.JTextField jtNuevoPNombre;
    private javax.swing.JTextField jtNuevoPPrecio;
    private javax.swing.JTextField jtNuevoPStock;
    private javax.swing.JTable jtProveedor;
    private javax.swing.JTable jtRepositorio;
    private javax.swing.JTable jtTablaCompra;
    private javax.swing.JTable jtTablaDetalle;
    private javax.swing.JTable jtTablaProducto;
    private javax.swing.JTextField jtfBuscarProducto;
    private javax.swing.JTextField jtfComprasXProveedor;
    private javax.swing.JTabbedPane jtpEscritorio;
    private javax.swing.JTextField jtxBuscarProveedor;
    private javax.swing.JTextField jtxDomicilio;
    private javax.swing.JTextField jtxRazonSocial;
    private javax.swing.JTextField jtxTelefono;
    private javax.swing.JTextField jtxTelefonoo;
    // End of variables declaration//GEN-END:variables

      //---  Clase y metodo para colocar una imagen de fondo ----------------------
    
     class Fondo extends JPanel{
        private Image img;
        
        public void paint (Graphics g){
            img = new ImageIcon(getClass().getResource("../RecursosVistas/sd.jpg")).getImage();
            g.drawImage(img, 0,0, getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }       
    }  
     
    public class StockCellRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Obtener el valor de la columna "Stock"
        int stock = (int) value;

        // Cambiar el color de fondo de la celda según diferentes umbrales de stock
        if (stock <= 5) {
            c.setBackground(new Color(205, 97, 85));
            c.setForeground(Color.BLACK);
        } else if (stock <= 10) {
            c.setBackground(new Color(249, 231, 159 ));
            c.setForeground(Color.BLACK);
        } else {
            c.setBackground(new Color(130, 224, 170 ));
            c.setForeground(Color.BLACK);
        }

        return c;
    }
}

}
