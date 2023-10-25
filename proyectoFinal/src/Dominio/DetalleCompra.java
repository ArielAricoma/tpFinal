
package Dominio;


public class DetalleCompra {

    private int idDetalle;
    private Compra idCompra;
    private Producto idProducto;
    private double precioCosto;
    private int cantidad;

    public DetalleCompra() {
    }

    public DetalleCompra(int idDetalle, Compra idCompra, Producto idProducto, double precioCosto, int cantidad) {
        this.idDetalle = idDetalle;
        this.idCompra = idCompra;
        this.idProducto = idProducto;
        this.precioCosto = precioCosto;
        this.cantidad = cantidad;
    }

    public DetalleCompra(Compra idCompra, Producto idProducto, double precioCosto, int cantidad) {
        this.idCompra = idCompra;
        this.idProducto = idProducto;
        this.precioCosto = precioCosto;
        this.cantidad = cantidad;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Compra getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Compra idCompra) {
        this.idCompra = idCompra;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
    
}
