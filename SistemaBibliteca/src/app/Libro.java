
package app;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private String genero;
    private int numeroCopias;
    private boolean disponible;

    public Libro(String titulo, String autor, String isbn, String genero, int numeroCopias) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.genero = genero;
        this.numeroCopias = numeroCopias;
        this.disponible= numeroCopias > 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroCopias() {
        return numeroCopias;
    }

    public void setNumeroCopias(int numeroCopias) {
        this.numeroCopias = numeroCopias;
        this.disponible = numeroCopias > 0;
    }

//    public boolean getDisponibilidad() {
//        return disponible;
//    }

    public void setDisponibilidad(boolean disponible) {
        this.disponible = disponible;
    }
    
    public boolean isDisponible(){
        return disponible;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", genero=" + genero + ", numeroCopias=" + numeroCopias + ", disponible=" + disponible + '}';
    }
    
    
    
    
}
