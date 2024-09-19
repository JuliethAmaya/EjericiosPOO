
package app;

public class Proveedor {
    protected String nombre;
    protected String empresa;
    protected String telefono;

    public Proveedor(String nombre, String empresa, String telefono) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.telefono = telefono;
    }

    protected String getNombre() {
        return nombre;
    }

    protected String getEmpresa() {
        return empresa;
    }

    protected String getTelefono() {
        return telefono;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    protected void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Empresa: " + getEmpresa());
        System.out.println("Telefono: " + getTelefono());
    }
   
    
}
