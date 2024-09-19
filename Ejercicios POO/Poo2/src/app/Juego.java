
package app;

public class Juego {
    private String titulo;
    private String plataforma;
    private int anioDeLanzamiento;
    private String genero;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getAnioDeLanzamiento() {
        return anioDeLanzamiento;
    }

    public void setAnioDeLanzamiento(int anioDeLanzamiento) {
        this.anioDeLanzamiento = anioDeLanzamiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public Juego(String titulo, String plataforma, int anioDeLanzamiento, String genero) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.anioDeLanzamiento = anioDeLanzamiento;
        this.genero = genero;
    }
    
    @Override
    public String toString() {
        return """
               Juego 
               Titulo: """ + titulo + "\n" +
               "Plataforma: " + plataforma + "\n" +
               "Anio de Lanzamiento: " + anioDeLanzamiento + "\n" +
               "Genero: " + genero + "\n";
    }
    
}
