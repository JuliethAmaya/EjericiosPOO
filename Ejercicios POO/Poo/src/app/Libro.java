
package app;


public class Libro {
    private String ISBN;
    private String Titulo;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getDisponible() {
        return Disponible;
    }

    public void setDisponible(String Disponible) {
        this.Disponible = Disponible;
    }
    private String Autor;
    private String Disponible;
    
    public void MostrarL(String _ISBN,String _Titulo,String _Autor,String _Disponible){
        ISBN = _ISBN;
        Titulo = _Titulo;
        Autor = _Autor;
        Disponible = _Disponible;
    }

    
}
