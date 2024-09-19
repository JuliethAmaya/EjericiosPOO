
package app;

public class Coche {
    private String Marca;
    private String Modelo;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getAño() {
        return Año;
    }

    public void setAño(String Año) {
        this.Año = Año;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }
    private String Año;
    private int Precio;
    
    public void mostrarC(String _Marca,String _Modelo,String _Año,int _Precio){
        Marca = _Marca;
        Modelo = _Modelo;
        Año = _Año;
        Precio = _Precio;
    }
    
 
    
}
