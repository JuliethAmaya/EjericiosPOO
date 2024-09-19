
package app;

public class Evento{
    private String Nombre;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public int getAsistentes() {
        return Asistentes;
    }

    public void setAsistentes(int Asistentes) {
        this.Asistentes = Asistentes;
    }
    private String Fecha;
    private String Lugar;
    private int Asistentes;
    
    public void mostrarEve(String _Nombre,String _Fecha,String _Lugar,int _Asistentes){
        Nombre = _Nombre;
        Fecha = _Fecha;
        Lugar = _Lugar;
        Asistentes = _Asistentes;
        
    }

}
