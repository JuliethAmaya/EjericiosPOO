
package app;


public class Cliente {
    private String Nombre;
    private String Direccion;
    private String Telefono;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    private String Email;
    
    public void mostrarCli(String _Nombre,String _Direccion,String _Telefono,String _Email){
        Nombre = _Nombre;
        Direccion = _Direccion;
        Telefono = _Telefono;
        Email = _Email;
        
    }
    
 

    
}
