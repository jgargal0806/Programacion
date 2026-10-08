import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un día: ");
        String dia = teclado.nextLine();

        if (dia.equals("lunes")) {
            System.out.println("Programación");
        } else if (dia.equals("martes")) {
            System.out.println("Lenguajes de Marcas");
        } else if (dia.equals("miércoles")) {
            System.out.println("Sistemas Informáticos");
        } else if (dia.equals("jueves")) {
            System.out.println("Bases de Datos");
        } else if (dia.equals("viernes")) {
            System.out.println("Entornos de Desarrollo");
        } else {
            System.out.println("Día incorrecto");
        }

        teclado.close();
    }
}