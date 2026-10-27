//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {
    Scanner teclado = new Scanner(System.in);

    Usuario usuario = new Usuario("Tomi", "tomi@gmail.com", "1234");

    System.out.println("Prueba de cambio de contraseña");

    if (usuario.cambiarPassword("1234", "5678")) {
        System.out.println("Contraseña cambiada correctamente");
    } else {
        System.out.println("La contraseña actual es incorrecta");
    }

    if (usuario.cambiarPassword("1111", "9999")) {
        System.out.println("Contraseña cambiada correctamente");
    } else {
        System.out.println("Error: contraseña actual incorrecta");
    }

    System.out.println("\nInicio de sesión");
    System.out.print("Ingrese su contraseña: ");
    String passwordIngresada = teclado.nextLine();

    if (usuario.validarCredenciales(passwordIngresada)) {
        System.out.println("Inicio de sesión exitoso");
    } else {
        System.out.println("Contraseña incorrecta");
    }

    teclado.close();
}
