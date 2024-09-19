
package app;


public class Usuario {
    private String nombre;
    private String identificacion;
    private String tipoUsuario;
    private String correoElectronico;
    private String clave;

    public Usuario(String nombre, String identificacion, String tipoUsuario, String correoElectronico,String clave) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.tipoUsuario = tipoUsuario;
        this.correoElectronico = correoElectronico;
        this.clave = clave;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }



    @Override
    public String toString() {
        return  nombre + "," + identificacion + "," + tipoUsuario + "," + correoElectronico + "," + clave;
    }
        
}
