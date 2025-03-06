import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    Biblioteca biblioteca;

    /**
     * Inicializa antes de cada metodo.
     */
    @BeforeEach
    void setUp() {
        Biblioteca biblioteca = new Biblioteca();
    }

    /**
     * Prueba si el metodo agrega correctamente un libro
     */
    @Test
    void agregarLibro() {
        Libro libro = new Libro("Harry Potter","J.K. Rowling", 1997);
        String esperado = "Harry Potter";
        Assertions.assertEquals(esperado, libro.getTitulo());
    }

    /**
     * Prueba si el metodo elimina correctamente un libro
     */
    @Test
    void eliminarLibro() {
        Libro libro1 = new Libro("El señor de los anillos","J.R.R. Tolkien", 1954);
        Libro libro2 = new Libro("El señor de los anillos2","J.R.R. Tolkien", 1955);
        boolean resultado = biblioteca.eliminarLibro(libro1);
        Assertions.assertTrue(resultado);
    }

    /**
     *
     */
    @Test
    void getLibros() {
    }

    /**
     * Prueba si el metodo encuentra el libro por titulo.
     */
    @Test
    void encuentraLibroPorTitulo() {
        Libro libro = new Libro("Harry Potter","J.K. Rowling", 1997);
        String esperado = "Harry Potter";
        Assertions.assertEquals(esperado, libro.getTitulo());
    }

    /**
     * Prueba si el metodo encuentra el libro por autor.
     */
    @Test
    void encuentraLibrosPorAutor() {
        Libro libro = new Libro("Harry Potter","J.K. Rowling", 1997);
        String esperado = "J.K. Rowling";
        Assertions.assertEquals(esperado, libro.getAutor());
    }
}