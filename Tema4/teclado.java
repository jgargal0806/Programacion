
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca un numero entero positivo: ");
        String numero = teclado.nextLine();

        System.out.print("Introduzca la posicion a partir de la cual quiere partir el numero: ");
        int posicion = teclado.nextInt();

        String parte1 = numero.substring(0, posicion - 1);
        String parte2 = numero.substring(posicion - 1);

        System.out.println("Los numeros partidos son el " + parte1 + " y el " + parte2);

        teclado.close();
    }
}   