
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número entero positivo: ");
        long numero = sc.nextLong();

        System.out.print("Introduzca la posición donde quiere insertar: ");
        int posicion = sc.nextInt();

        System.out.print("Introduzca el dígito que quiere insertar: ");
        int digito = sc.nextInt();

        String texto = String.valueOf(numero);

        String resultado = texto.substring(0, posicion - 1)
                + digito
                + texto.substring(posicion - 1);

        System.out.println("El número resultante es " + resultado);

        sc.close();
    }
}
