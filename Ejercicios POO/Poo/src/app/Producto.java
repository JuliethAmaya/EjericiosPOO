
package app;



public class Producto {
    private int Código;
    private String Nombre;
    private int Precio;

    public int getCódigo() {
        return Código;
    }

    public void setCódigo(int Código) {
        this.Código = Código;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    private int Stock;
    
    public void mostrarP(int _Código,String _Nombre,int _Precio,int _Stock){
        Código = _Código;
        Nombre = _Nombre;
        Precio = _Precio;
        Stock = _Stock;
    }
 


    
}
