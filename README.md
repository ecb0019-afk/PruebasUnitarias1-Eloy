package Instituto;

import instituto.ValidadorRegistro;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorRegistroTest {

    ValidadorRegistro validador = new ValidadorRegistro();

    @Test
    @DisplayName("Ejemplo: Un nombre válido debe ser aceptado")
    public void testNombreValido() {
        boolean resultado = validador.validarNombre("Carlos");
        assertTrue(resultado, "Error: El sistema rechazó un nombre válido");
    }

    @Test
    @DisplayName("Reto 1: Un nombre vacío debe ser rechazado")
    public void testNombreVacio() {
        boolean resultado = validador.validarNombre("");
        assertFalse(resultado, "Error: El sistema aceptó un nombre vacío");
    }

    @Test
    @DisplayName("Reto 2: Una contraseña de 8 caracteres debe ser aceptada")
    public void testPasswordJusta() {
        boolean resultado = validador.validarPassword("12345678");
        assertTrue(resultado, "Error: El sistema rechazó una contraseña válida de 8 caracteres");
    }

    @Test
    @DisplayName("Reto 3: Una contraseña de 5 caracteres debe ser rechazada")
    public void testPasswordCorta() {
        boolean resultado = validador.validarPassword("Admin");
        assertFalse(resultado, "Error: El sistema aceptó una contraseña demasiado corta");
    }

    @Test
    @DisplayName("Reto 4: Un email sin arroba debe ser rechazado")
    public void testEmailSinArroba() {
        boolean resultado = validador.validarEmail("usuario.gmail.com");
        assertFalse(resultado, "Error: El sistema aceptó un email sin arroba");
    }

    @Test
    @DisplayName("Reto 5: La edad mínima legal (16 años) debe ser aceptada")
    public void testEdadMinima() {
        boolean resultado = validador.validarEdad(16);
        assertTrue(resultado, "Error: El sistema rechazó la edad mínima legal");
    }
}
