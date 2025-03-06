
/**
 * Clase que representa un libro con su titulo, autor y anio de publicacion.
 * @author Cristina Sanz Alonso
 * @version Version 1.0
 */

public class Libro {
    /**
     * Atributos privados de tipo de cadena de caracteres de título, autor y año de publicacon.
     */
    // TODO: Documentar estos atributos
    private String titulo;
    private String autor;
    private int anioPublicacion;

    /**
     * Contructor que inicializa un libro
     * @param titulo Titulo del libro.
     * @param autor Autor del libro.
     * @param anioPublicacion Año de publicacion del libro.
     */
    // TODO: Documentar este método
    // TODO: Testear este método
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    /**
     * Se obtiene el título.
     * @return El título.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Se establece un título al libro.
     * @param titulo El título.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Se obtiene el autor
     * @return El autor
     */
    // TODO: Documentar este método
    public String getAutor() {
        return autor;
    }

    /**
     * Se establece un autor al libro
     * @param autor El autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Se obtiene el año de publicación.
     * @return El año de publicación.
     */
    // TODO: Documentar este método
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    /**
     * Se establece el año de publicación.
     * @param anioPublicacion El año de publicación.
     */
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
