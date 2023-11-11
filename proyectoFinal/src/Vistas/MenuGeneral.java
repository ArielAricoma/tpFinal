/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template|
 */
package Vistas;

import AccesoADatos.CompraData;
import AccesoADatos.DetalleCompraData;
import AccesoADatos.ProductoData;
import AccesoADatos.ProveedorData;
import Dominio.Compra;
import Dominio.DetalleCompra;
import Dominio.Producto;
import Dominio.Proveedor;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;



public class MenuGeneral extends javax.swing.JFrame {
    private DefaultTableModel modelo;    
    private DefaultTableModel modelo2;
    private ProveedorData proveedorData = new ProveedorData();
    private Proveedor proveedor = null;
    List<Producto> productos = null;
    private ProductoData productoData = new ProductoData();
    private Producto producto = null;
    boolean cabeceraProdIni = false;
    private Compra compra = null;
    private CompraData compraData = new CompraData();
    private DetalleCompraData detalleData = new DetalleCompraData(); 
 
    public MenuGeneral() {
        initComponents();       
        modelo = new DefaultTableModel();
        modelo2 = new DefaultTableModel();        
    }   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMenu = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jlIcono = new javax.swing.JLabel();
        jpPrincipal = new javax.swing.JPanel();
        jlIconoPrin = new javax.swing.JLabel();
        jlPrincipal = new javax.swing.JLabel();
        jpProveedor = new javax.swing.JPanel();
        jlIconoProv = new javax.swing.JLabel();
        jlProveedores = new javax.swing.JLabel();
        jpProducto = new javax.swing.JPanel();
        jlIconoProd = new javax.swing.JLabel();
        jlProducto = new javax.swing.JLabel();
        jpCompra = new javax.swing.JPanel();
        jlIconoCompra = new javax.swing.JLabel();
        jlCompra = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jtpEscritorio = new javax.swing.JTabbedPane();
        jpInicio = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jpInivioProveedor = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProveedor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxBuscarProveedor = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jtxRazonSocial = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jtxDomicilio = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jtxTelefono = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jcbActivo = new javax.swing.JCheckBox();
        jbtnGuardarNewProveedor = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
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
        jlNuevoPDescuento = new javax.swing.JLabel();
        jlNuevoPEstado = new javax.swing.JLabel();
        jtNuevoPNombre = new javax.swing.JTextField();
        jtNuevoPDescripcion = new javax.swing.JTextField();
        jtNuevoPPrecio = new javax.swing.JTextField();
        jtNuevoPDescuento = new javax.swing.JTextField();
        jcbNuevoPEstado = new javax.swing.JCheckBox();
        jbGuardarProNuevo = new javax.swing.JButton();
        jbCancelarProNuevo = new javax.swing.JButton();
        jcbListaProductos = new javax.swing.JComboBox<>();
        jpInicioCompra = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton8 = new javax.swing.JButton();
        jpnewCompra = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jcbProveedor = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jtProducto = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jLabel24 = new javax.swing.JLabel();
        jtPrecio = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jtCantidad = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpMenu.setBackground(new java.awt.Color(2, 104, 66));

        jlTitulo.setText("Administracion");

        jlIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosVistas/logo icon(1).png"))); // NOI18N

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

        jlPrincipal.setText("Principal");

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jlIconoPrin)
                .addGap(18, 18, 18)
                .addComponent(jlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
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

        jlProveedores.setText("Proveedores");

        javax.swing.GroupLayout jpProveedorLayout = new javax.swing.GroupLayout(jpProveedor);
        jpProveedor.setLayout(jpProveedorLayout);
        jpProveedorLayout.setHorizontalGroup(
            jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProveedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlIconoProv)
                .addGap(18, 18, 18)
                .addComponent(jlProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
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

        jlProducto.setText("Producto");

        javax.swing.GroupLayout jpProductoLayout = new javax.swing.GroupLayout(jpProducto);
        jpProducto.setLayout(jpProductoLayout);
        jpProductoLayout.setHorizontalGroup(
            jpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProductoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlIconoProd)
                .addGap(18, 18, 18)
                .addComponent(jlProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
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

        jlCompra.setText("Compra");

        javax.swing.GroupLayout jpCompraLayout = new javax.swing.GroupLayout(jpCompra);
        jpCompra.setLayout(jpCompraLayout);
        jpCompraLayout.setHorizontalGroup(
            jpCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCompraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlIconoCompra)
                .addGap(20, 20, 20)
                .addComponent(jlCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
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
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jlIcono)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(2, 104, 66));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1808, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Repositorio de Cantidad");

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jpInicioLayout = new javax.swing.GroupLayout(jpInicio);
        jpInicio.setLayout(jpInicioLayout);
        jpInicioLayout.setHorizontalGroup(
            jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInicioLayout.createSequentialGroup()
                .addGroup(jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInicioLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpInicioLayout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(jLabel2)))
                .addContainerGap(2316, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInicioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(57, 57, 57))
        );
        jpInicioLayout.setVerticalGroup(
            jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addGap(67, 67, 67))
        );

        jtpEscritorio.addTab("tab1", jpInicio);

        jtProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Razon Social", "Domicilio", "Telefono", "Estado"
            }
        ));
        jScrollPane2.setViewportView(jtProveedor);

        jLabel1.setText("Proveedores Activos");

        jLabel3.setText("Buscar");

        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel17.setText("Razon Social");

        jtxRazonSocial.setText("jTextField3");

        jLabel18.setText("Domicilio");

        jtxDomicilio.setText("jTextField3");

        jLabel19.setText("Telefono:");

        jtxTelefono.setText("jTextField3");

        jLabel20.setText("Activo:");

        jcbActivo.setText("jCheckBox1");

        jbtnGuardarNewProveedor.setText("jButton9");
        jbtnGuardarNewProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarNewProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbActivo)
                            .addComponent(jtxRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnGuardarNewProveedor))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jtxRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jtxDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jtxTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jcbActivo))
                .addGap(34, 34, 34)
                .addComponent(jbtnGuardarNewProveedor)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        jButton9.setText("Buscar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpInivioProveedorLayout = new javax.swing.GroupLayout(jpInivioProveedor);
        jpInivioProveedor.setLayout(jpInivioProveedorLayout);
        jpInivioProveedorLayout.setHorizontalGroup(
            jpInivioProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                .addGroup(jpInivioProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(jLabel1))
                    .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                        .addGroup(jpInivioProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(jLabel3)
                                .addGap(68, 68, 68)
                                .addComponent(jtxBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jButton9))
                            .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(jpInivioProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnModificar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(205, 205, 205)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1740, Short.MAX_VALUE))
        );
        jpInivioProveedorLayout.setVerticalGroup(
            jpInivioProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGroup(jpInivioProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jpInivioProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jButton9))
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpInivioProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(btnModificar)))
                    .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpEscritorio.addTab("tab2", jpInivioProveedor);

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

        jlProductoTitulo.setText("Producto");

        jbNuevoP.setText("Nuevo");
        jbNuevoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoPActionPerformed(evt);
            }
        });

        jbModificarP.setText("Modificar");
        jbModificarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarPActionPerformed(evt);
            }
        });

        jbEliminarP.setText("Eliminar");

        jlProductos.setText("Productos:");

        jlNuevoPTitulo.setText("Cargar un Producto");

        jlNuevoPNombre.setText("Nombre:");

        jlNuevoPDescripcion.setText("Descripcion:");

        jlNuevoPPrecio.setText("Precio:");

        jlNuevoPDescuento.setText("Descuento:");

        jlNuevoPEstado.setText("Estado:");

        jbGuardarProNuevo.setText("Guardar");
        jbGuardarProNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarProNuevoActionPerformed(evt);
            }
        });

        jbCancelarProNuevo.setText("Cancelar");
        jbCancelarProNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarProNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpNuevoProductoLayout = new javax.swing.GroupLayout(jpNuevoProducto);
        jpNuevoProducto.setLayout(jpNuevoProductoLayout);
        jpNuevoProductoLayout.setHorizontalGroup(
            jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNuevoProductoLayout.createSequentialGroup()
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpNuevoProductoLayout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jlNuevoPTitulo))
                    .addGroup(jpNuevoProductoLayout.createSequentialGroup()
                        .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpNuevoProductoLayout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(jlNuevoPNombre))
                            .addGroup(jpNuevoProductoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlNuevoPDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlNuevoPPrecio)
                                    .addComponent(jlNuevoPDescuento)
                                    .addComponent(jlNuevoPEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(52, 52, 52)
                        .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNuevoPNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNuevoPDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jtNuevoPPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbNuevoPEstado)
                                    .addComponent(jtNuevoPDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jpNuevoProductoLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jbGuardarProNuevo)
                        .addGap(270, 270, 270)
                        .addComponent(jbCancelarProNuevo)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jpNuevoProductoLayout.setVerticalGroup(
            jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNuevoProductoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jlNuevoPTitulo)
                .addGap(66, 66, 66)
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNuevoPNombre)
                    .addComponent(jtNuevoPNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNuevoPDescripcion)
                    .addComponent(jtNuevoPDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNuevoPPrecio)
                    .addComponent(jtNuevoPPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNuevoPDescuento)
                    .addComponent(jtNuevoPDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbNuevoPEstado)
                    .addComponent(jlNuevoPEstado))
                .addGap(96, 96, 96)
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardarProNuevo)
                    .addComponent(jbCancelarProNuevo))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        jcbListaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpInicioProductoLayout = new javax.swing.GroupLayout(jpInicioProducto);
        jpInicioProducto.setLayout(jpInicioProductoLayout);
        jpInicioProductoLayout.setHorizontalGroup(
            jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInicioProductoLayout.createSequentialGroup()
                .addGroup(jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInicioProductoLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jbNuevoP)
                        .addGap(43, 43, 43)
                        .addComponent(jbModificarP)
                        .addGap(338, 338, 338)
                        .addComponent(jbEliminarP))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInicioProductoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpInicioProductoLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jlProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpInicioProductoLayout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jlProductoTitulo))
                            .addGroup(jpInicioProductoLayout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jcbListaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(65, 65, 65)
                .addComponent(jpNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1707, Short.MAX_VALUE))
        );
        jpInicioProductoLayout.setVerticalGroup(
            jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInicioProductoLayout.createSequentialGroup()
                .addGroup(jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInicioProductoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jlProductoTitulo)
                        .addGap(55, 55, 55)
                        .addGroup(jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlProductos)
                            .addComponent(jcbListaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addGroup(jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbNuevoP)
                            .addComponent(jbModificarP)
                            .addComponent(jbEliminarP)))
                    .addGroup(jpInicioProductoLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jpNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpEscritorio.addTab("tab3", jpInicioProducto);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jTable5);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(jTable6);

        jLabel6.setText("DetalleCompra");

        jLabel7.setText("Compra");

        jButton8.setText("jButton8");

        jLabel21.setText("Proveedor");

        jcbProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel22.setText("Producto");

        jtProducto.setText("jTextField6");

        jLabel23.setText("jLabel13");

        jLabel24.setText("Precio");

        jtPrecio.setText("jTextField6");

        jLabel25.setText("Cantidad");

        jtCantidad.setText("jTextField6");

        jButton12.setText("Comprar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnewCompraLayout = new javax.swing.GroupLayout(jpnewCompra);
        jpnewCompra.setLayout(jpnewCompraLayout);
        jpnewCompraLayout.setHorizontalGroup(
            jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnewCompraLayout.createSequentialGroup()
                .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnewCompraLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnewCompraLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpnewCompraLayout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jcbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jpnewCompraLayout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel23)
                            .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel22)
                                .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25)))))
                    .addGroup(jpnewCompraLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jButton12)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jpnewCompraLayout.setVerticalGroup(
            jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnewCompraLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(jcbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(44, 44, 44)
                .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jButton12)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpInicioCompraLayout = new javax.swing.GroupLayout(jpInicioCompra);
        jpInicioCompra.setLayout(jpInicioCompraLayout);
        jpInicioCompraLayout.setHorizontalGroup(
            jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInicioCompraLayout.createSequentialGroup()
                .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInicioCompraLayout.createSequentialGroup()
                        .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpInicioCompraLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel7))
                            .addGroup(jpInicioCompraLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel6)))
                        .addGap(55, 55, 55)
                        .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpInicioCompraLayout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90)
                .addComponent(jpnewCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1923, Short.MAX_VALUE)
                .addComponent(jButton8))
        );
        jpInicioCompraLayout.setVerticalGroup(
            jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInicioCompraLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInicioCompraLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(jpInicioCompraLayout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButton8)
                .addGap(332, 332, 332))
            .addGroup(jpInicioCompraLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jpnewCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpEscritorio.addTab("tab4", jpInicioCompra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jtpEscritorio)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtpEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

      // --------- METODOS DE SELECCION (CAMBIO DE COLOR EN EL MENU LATERAL) -------------
    
    
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

    
      // ------- METODOS DE CLICK PARA ACCEDER A LAS VENTANAS CORRESPONDIENTES -------------
    
    
    private void jpPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPrincipalMouseClicked
        // TODO add your handling code here:
        jtpEscritorio.setSelectedIndex(0);
    }//GEN-LAST:event_jpPrincipalMouseClicked

    private void jpProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProveedorMouseClicked
        // TODO add your handling code here:
        borrarFila2();
        jtpEscritorio.setSelectedIndex(1);
        jPanel1.setVisible(false);
        
        List<Proveedor> listaTablaProveedor = new ArrayList<>(proveedorData.listarProveedores());
        cargarDatosEnTablaProveedor(listaTablaProveedor);
        
    }//GEN-LAST:event_jpProveedorMouseClicked
    
    private void jpProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProductoMouseClicked
        // TODO add your handling code here:
        
        jtpEscritorio.setSelectedIndex(2);
        
        if(!cabeceraProdIni){
            cabeceraProducto();
        }            
        listaProducto();
        jbModificarP.setEnabled(false);
        jpNuevoProducto.setVisible(false);
    }//GEN-LAST:event_jpProductoMouseClicked

    private void jpCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCompraMouseClicked
        // TODO add your handling code here:
        jtpEscritorio.setSelectedIndex(3);
    }//GEN-LAST:event_jpCompraMouseClicked

        
      // ------- METODOS PARA LA VENTANA PROVEEDOR ----------------------------------------
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jPanel1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbtnGuardarNewProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarNewProveedorActionPerformed
       
       String razonSocial = jtxRazonSocial.getText();
       String domicilio = jtxDomicilio.getText();
       String telefono = jtxTelefono.getText();
       
       
       if(!razonSocial.isEmpty() && !domicilio.isEmpty() && !telefono.isEmpty()){
            int opcion = JOptionPane.showConfirmDialog( 
                null,
                "Estas seguro de realizar estos cambios?",
                "Confirmar cambios", 
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            
             proveedor = new Proveedor(razonSocial, domicilio, telefono, true);
           proveedorData.agregarProveedor(proveedor);
           limpiarCampos();
            JOptionPane.showMessageDialog(null, "El proveedor se ha cargado con Exito", "Exito!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            
            JOptionPane.showMessageDialog(null, "Cambios cancelados.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
            
        }
           
          
           limpiarCampos();
           jPanel1.setVisible(false);
       }else{
           JOptionPane.showMessageDialog(null, "Es necesario llenar los campos", "Error!", JOptionPane.INFORMATION_MESSAGE);
       }
        
    }//GEN-LAST:event_jbtnGuardarNewProveedorActionPerformed
   
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        String vproveedor = jtxBuscarProveedor.getText();
        modelo2 = (DefaultTableModel) jtProveedor.getModel();
        if(!vproveedor.isEmpty()){      
           proveedor = proveedorData.buscarProveedorNombre(vproveedor);
           
           
           if (proveedor != null) {
             Object[] rowData = {
                    proveedor.getIdProveedor(),
                    proveedor.getRazonSocial(),
                    proveedor.getDomicilio(),
                    proveedor.getTelefono(),
                    proveedor.getEstado()
            };
            modelo2.addRow(rowData);
          } else {
            JOptionPane.showMessageDialog(null, "Proveedor no encontrado.", "Error!", JOptionPane.INFORMATION_MESSAGE);
            List<Proveedor> listaTablaProveedor = new ArrayList<>(proveedorData.listarProveedores());
            cargarDatosEnTablaProveedor(listaTablaProveedor);   
            
          }
        }else{
            JOptionPane.showMessageDialog(null, "Es necesario llenar el buscador.", "Error!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       int filaSeleccionada = jtProveedor.getSelectedRow();
       

        if (filaSeleccionada != -1) {  
        String razonSocial = (String) modelo2.getValueAt(filaSeleccionada, 1);
        
     // JOptionPane para confirmar
        int opcion = JOptionPane.showConfirmDialog( 
                null,
                "Estas seguro de ELIMINAR el proveedor: " + razonSocial,
                "Confirmar", 
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            
            proveedorData.eliminarProveedor(razonSocial);
            JOptionPane.showMessageDialog(null, "Eliminado Correctamente.", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            
            JOptionPane.showMessageDialog(null, "Cancelado.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
            
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione un proveedor para ELIMINAR.", "Error", JOptionPane.INFORMATION_MESSAGE);
    }
       
        
    }//GEN-LAST:event_jButton3ActionPerformed

    
    
      // ------- METODOS PARA LA VENTANA PRODUCTO -----------------------------------------
    
    
    private void jbNuevoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoPActionPerformed
        // TODO add your handling code here:
        jpNuevoProducto.setVisible(true);
    }//GEN-LAST:event_jbNuevoPActionPerformed

    private void jbGuardarProNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarProNuevoActionPerformed
        // TODO add your handling code here:        
        try{
            String nombre=jtNuevoPNombre.getText();
            String descripcion=jtNuevoPDescripcion.getText();
            double precio=Double.parseDouble(jtNuevoPPrecio.getText());
            double descuento=Double.parseDouble(jtNuevoPDescuento.getText());
            boolean estado=jcbNuevoPEstado.isSelected();
            
            if(nombre.isEmpty()||descripcion.isEmpty()||jtNuevoPPrecio.getText().isEmpty()||jtNuevoPDescuento.getText().isEmpty()||jcbNuevoPEstado.isSelected()==false){
                JOptionPane.showMessageDialog(null,"Complete los campos"," ",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            
            if(producto==null){
                producto = new Producto(nombre,descripcion,precio,descuento,estado);
                productoData.registroProducto(producto);
            }
            limpiarProducto();
            jpNuevoProducto.setVisible(false);
            
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Debe ingresar numeros"," ",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jbGuardarProNuevoActionPerformed

    private void jbCancelarProNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarProNuevoActionPerformed
        // TODO add your handling code here:
        jpNuevoProducto.setVisible(false);
    }//GEN-LAST:event_jbCancelarProNuevoActionPerformed

    private void jcbListaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaProductosActionPerformed
        // TODO add your handling code here:
        borrarFila();        
        Producto seleccion = (Producto)jcbListaProductos.getSelectedItem();
        productos = productoData.listaProductospoID(seleccion.getNombre());
        
         for(Producto lista: productos){
            modelo.addRow(new Object[]{
                lista.getNombre(),
                lista.getDescripcion(),
                lista.getPrecio(),
                lista.getDescuento()});            
        }      
    }//GEN-LAST:event_jcbListaProductosActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
      int filaSeleccionada = jtProveedor.getSelectedRow();      
      
    if (filaSeleccionada != -1) {  
        int idProveedor = (Integer) modelo2.getValueAt(filaSeleccionada, 0);
        String razonSocial = (String) modelo2.getValueAt(filaSeleccionada, 1);
        String domicilio = (String) modelo2.getValueAt(filaSeleccionada, 2);
        String telefono = (String) modelo2.getValueAt(filaSeleccionada, 3);
        Boolean estado = (Boolean) modelo2.getValueAt(filaSeleccionada, 4);  
       
         proveedor = new Proveedor(idProveedor, razonSocial, domicilio, telefono, estado);   
      
        // JOptionPane para confirmar
        int opcion = JOptionPane.showConfirmDialog( 
                null,
                "Estas seguro de realizar estos cambios?",
                "Confirmar cambios", 
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
       
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jtTablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaProductoMouseClicked
        // TODO add your handling code here:
        jbModificarP.setEnabled(true);
    }//GEN-LAST:event_jtTablaProductoMouseClicked

    private void jbModificarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarPActionPerformed
        // TODO add your handling code here:
        int indice = jtTablaProducto.getSelectedRow();       
        
        if(indice!=-1){
            String nombre = (String)modelo.getValueAt(indice,0);
            String descripcion = (String)modelo.getValueAt(indice, 1);
            double precio = (Double)modelo.getValueAt(indice,2);
            double descuento = (Double)modelo.getValueAt(indice,3);
            
           
            producto = new Producto(nombre,descripcion,precio,descuento,true);
                    
            productoData.modificarProducto(producto);
        }
    }//GEN-LAST:event_jbModificarPActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
         
    Proveedor proveedor = (Proveedor) jcbProveedor.getSelectedItem(); /// ME FALTA CARGAR EL COMBO BOX CON PROVEEDORES
    Date fecha = jdcFecha.getDate();
    String producto = jtProducto.getText();
    String precioTexto = jtPrecio.getText();
    String cantidadTexto = jtCantidad.getText();

    
    if (proveedor == null || fecha == null || producto.isEmpty() || precioTexto.isEmpty() || cantidadTexto.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Todos los campos deben ser completados.", "Error", JOptionPane.ERROR_MESSAGE);
         
    }



        
    }//GEN-LAST:event_jButton12ActionPerformed

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
                if ("Windos".equals(info.getName())) {
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
    
     public void limpiarCampos(){
       jtxRazonSocial.setText("");
        jtxDomicilio.setText("");
       jtxTelefono.setText("");
        
    }
    
     //metodo para cargar datos a la tabla proveedor
    private void cargarDatosEnTablaProveedor(List<Proveedor> proveedores) {
        borrarFila2();
        modelo2 = (DefaultTableModel) jtProveedor.getModel();
    

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
    
    public void seleccion(JPanel panel){
        panel.setBackground(new Color(0,157,113));        
    }
    
    public void sinSeleccionar(JPanel panel){
        panel.setBackground(new Color(2,104,66));
    }
    
    private void cabeceraProducto(){         
        ArrayList<Object> titulos=new ArrayList<>(); 
        
//             titulos.add("ID");       
             titulos.add("Nombre");
             titulos.add("Descripcion");
             titulos.add("Precio");
             titulos.add("Descuento");          
        
        for(Object filas : titulos){
            modelo.addColumn(filas);
        }
       
        jtTablaProducto.setModel(modelo);
        cabeceraProdIni = true;
                      
    }
    
    private void listaProducto(){
        productos =new ArrayList<>();
        productos = productoData.listaProductos();
        
        for(Producto lista: productos){
            jcbListaProductos.addItem(lista);
        }
    }
    
    private void borrarFila(){
        int indice= modelo.getRowCount()-1;
        for(int i = indice;i>=0;i--){
            modelo.removeRow(i);
           
        }
       
    }
     
    private void borrarFila2(){
        int indice= modelo2.getRowCount()-1;
        for(int i = indice;i>=0;i--){
            modelo2.removeRow(i);
           
        }
       
    }
    
    private void limpiarProducto(){
        jtNuevoPNombre.setText("");
        jtNuevoPDescripcion.setText("");
        jtNuevoPPrecio.setText("");
        jtNuevoPDescuento.setText("");
        jcbNuevoPEstado.setSelected(false);        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JButton jbCancelarProNuevo;
    private javax.swing.JButton jbEliminarP;
    private javax.swing.JButton jbGuardarProNuevo;
    private javax.swing.JButton jbModificarP;
    private javax.swing.JButton jbNuevoP;
    private javax.swing.JButton jbtnGuardarNewProveedor;
    private javax.swing.JCheckBox jcbActivo;
    private javax.swing.JComboBox<Producto> jcbListaProductos;
    private javax.swing.JCheckBox jcbNuevoPEstado;
    private javax.swing.JComboBox<String> jcbProveedor;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JLabel jlCompra;
    private javax.swing.JLabel jlIcono;
    private javax.swing.JLabel jlIconoCompra;
    private javax.swing.JLabel jlIconoPrin;
    private javax.swing.JLabel jlIconoProd;
    private javax.swing.JLabel jlIconoProv;
    private javax.swing.JLabel jlNuevoPDescripcion;
    private javax.swing.JLabel jlNuevoPDescuento;
    private javax.swing.JLabel jlNuevoPEstado;
    private javax.swing.JLabel jlNuevoPNombre;
    private javax.swing.JLabel jlNuevoPPrecio;
    private javax.swing.JLabel jlNuevoPTitulo;
    private javax.swing.JLabel jlPrincipal;
    private javax.swing.JLabel jlProducto;
    private javax.swing.JLabel jlProductoTitulo;
    private javax.swing.JLabel jlProductos;
    private javax.swing.JLabel jlProveedores;
    private javax.swing.JLabel jlTitulo;
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
    private javax.swing.JTextField jtCantidad;
    private javax.swing.JTextField jtNuevoPDescripcion;
    private javax.swing.JTextField jtNuevoPDescuento;
    private javax.swing.JTextField jtNuevoPNombre;
    private javax.swing.JTextField jtNuevoPPrecio;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtProducto;
    private javax.swing.JTable jtProveedor;
    private javax.swing.JTable jtTablaProducto;
    private javax.swing.JTabbedPane jtpEscritorio;
    private javax.swing.JTextField jtxBuscarProveedor;
    private javax.swing.JTextField jtxDomicilio;
    private javax.swing.JTextField jtxRazonSocial;
    private javax.swing.JTextField jtxTelefono;
    // End of variables declaration//GEN-END:variables
}
