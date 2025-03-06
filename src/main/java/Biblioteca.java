import java.util.ArrayList;
import java.util.List;

/**
 * Clase que realiza diferentes acciones con libros.
 * @author Cristina Sanz Alonso
 * @version Version 1.0
 * @see Libro
 */

public class Biblioteca {

    /**
     * Se crea una lista de objetos de tipo Libro.
     */
    // TODO: Documentar estos atributos
        private final List<Libro> libros;

    /**
     * Constructor que carga objetos en un ArrayList llamado libros.
     */
        // TODO: Documentar este método
        public Biblioteca() {
            libros = new ArrayList<>();
        }

    /**
     * Constructor que inicializa la biblioteca con una lista de libros.
     * @param libros Nombre de la lista de libros.
     */
        // TODO: Documentar este método.
        //  Test: NO HAY QUE TESTEAR ESTE METODO
        public Biblioteca(List<Libro> libros) {
            this.libros = libros;
        }

    /**
     * Metodo que agrega libros.
     * @param libro Recibe un objeto de la clase Libro para añadir a la lista.
     * @return {@code true} si se añade el libro a la lista {@code false} si no se añade.
     */
        // TODO: Testear este metodo.
        //  Test: Comprobar si se ha agregado
        public boolean agregarLibro(Libro libro) {
            return libros.add(libro);
        }

    /**
     * Metodo que elimina libros.
     * @param libro Recibe un objeto de la clase Libro para eliminar de la lista.
     * @return {@code true} si se elimina el libro a la lista {@code false} si no se elimina.
     */
    // TODO: Testear este metodo.
        //  Test: comprobar si se ha eliminado
        public boolean eliminarLibro(Libro libro) {
            return libros.remove(libro);
        }

    /**
     * Metodo que devuelve la lista de libros.
     * @return La lista de libros .
     */
    // TODO: Documentar este método
        public List<Libro> getLibros() {
            return libros;
        }

    /**
     * Metodo que encuentra un titulo al introducirlo
     * @param titulo Cadena de caracteres que debe coincidir con un titulo de la lista de libros.
     * @return El libro que coindice con el titulo, {@code null} sino devuelve null.
     */
    // TODO: Documentar este método.
        //  Test 01: buscar libro existente y comprobar que lo localiza.
        //  Test 02: buscar libro NO existente y comprobar que no lo localiza.
        public Libro encuentraLibroPorTitulo(String titulo) {
            for (Libro libro : libros) {
                if (libro.getTitulo().equals(titulo)) {
                    return libro;
                }
            }
            return null;
        }

    /**
     * Metodo que encuentra un libro al introducir su autor
     * @param autor Cadena de caracteres que debe coincidir con un autor de la lista de libros.
     * @return El libro que coindice con el autor, {@code null} sino devuelve null.
     */
    // TODO: Documentar este metodo.
        //  No testearlo
        // Este metodo está obsoleto. Hay que documentarlo como tal.
        //  Recuerda: las anotaciones @deprecated y @link a la nueva
        //  versión mejorada encuentraLibrosPorAutor(...)
        //  En esta ocasión, NO TESTEAREMOS este metodo
        public Libro encuentaLibroPorAutor(String autor) {
            for (Libro libro : libros) {
                if (libro.getAutor().equals(autor)) {
                    return libro;
                }
            }
            return null;
        }
    /**
     * Metodo que encuentra un libro al introducir su autor
     * @param autor Cadena de caracteres que debe coincidir con un autor de la lista de libros.
     * @return El libro que coindice con el autor, {@code null} sino devuelve null.
     */
        // TODO: Documentar este metodo
        // Este metodo sustituye al metodo anterior. Está disponible desde la
        //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
        // TODO: Testear este metodo.
        //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
        //  Test: Comprobar la lista de libros que devuelve para un autor No existente
        public List<Libro> encuentraLibrosPorAutor(String autor) {
            List<Libro> listaLibros = null;
            for (Libro libro : libros) {
                if (libro.getAutor().equals(autor)) {
                    if (listaLibros == null) {
                        listaLibros = new ArrayList<>();
                    }
                    listaLibros.add(libro);
                }
            }
            return listaLibros;
        }
}
