
package app;

public class Universidad {
    private String nombre;
    private String direccion;
    private int numeroDeEstudiantes;
    private int ranking;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroDeEstudiantes() {
        return numeroDeEstudiantes;
    }

    public void setNumeroDeEstudiantes(int numeroDeEstudiantes) {
        this.numeroDeEstudiantes = numeroDeEstudiantes;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    
    public Universidad(String nombre, String direccion, int numeroDeEstudiantes, int ranking) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroDeEstudiantes = numeroDeEstudiantes;
        this.ranking = ranking;
    }
    
    @Override
    public String toString() {
        return """
               Universidad 
               Nombre: """ + nombre + "\n" +
               "Direccion: " + direccion + "\n" +
               "Numero de Estudiante: " + numeroDeEstudiantes + "\n" +
               "Ranking: " + ranking + "\n";
    }
    
}
