
package app;

public class Pedido {
    private String CodigoP;

    public String getCodigoP() {
        return CodigoP;
    }

    public void setCodigoP(String CodigoP) {
        this.CodigoP = CodigoP;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(int PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }
    private String Producto;
    private String Cantidad;
    private int PrecioTotal;
    
    public void mostrarPed(String _CodigoP,String _Producto,String _Cantidad,int _PrecioTotal){
        CodigoP = _CodigoP;
        Producto = _Producto;
        Cantidad = _Cantidad;
        PrecioTotal = _PrecioTotal;
    }
    
}
