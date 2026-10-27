public class Usuario {
    private String nombreUsuario;
    private String email;
    private String password;

    public Usuario(String nombreUsuario, String email, String password) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
    }

    public boolean cambiarPassword(String passwordActual, String nuevaPassword) {
        if (password.equals(passwordActual)) {
            password = nuevaPassword;
            return true;
        } else {
            return false;
        }
    }

    public boolean validarCredenciales(String passwordIngresada) {
        return password.equals(passwordIngresada);
    }
}
