
package app;

public class Curso {
    private String Nombre;
    private int Codigo;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getCreditos() {
        return Creditos;
    }

    public void setCreditos(String Creditos) {
        this.Creditos = Creditos;
    }

    public String getProfesor() {
        return Profesor;
    }

    public void setProfesor(String Profesor) {
        this.Profesor = Profesor;
    }
    private String Creditos;
    private String Profesor;
    
    public void mostrarCur(String _Nombre,int _Codigo,String _Creditos,String _Profesor){
        Nombre = _Nombre;
        Codigo = _Codigo;
        Creditos = _Creditos;
        Profesor = _Profesor;
        
    }


    
}
