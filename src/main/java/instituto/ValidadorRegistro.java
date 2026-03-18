package instituto;

public class ValidadorRegistro {

    public boolean validarNombre(String nombre) {
        return nombre != null && !nombre.trim().isEmpty();
    }

    public boolean validarPassword(String password) {
        return password != null && password.length() >= 8;
    }

    public boolean validarEmail(String email) {
        return email != null && email.contains("@");
    }

    public boolean validarEdad(int edad) {
        return edad >= 16;
    }
}
