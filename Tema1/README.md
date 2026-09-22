# Ejercicio 1

Copia el siguiente código, compila y pruébalo.

```java
public class SalidaFormateada02 {
    public static void main(String[] args) {
        System.out.println("  Artículo       Precio/caja    Nº cajas");
        System.out.println("------------------------------------------");

        System.out.printf("%-10s     %8.2f     %6d%n", "manzanas", 4.5, 10);
        System.out.printf("%-10s     %8.2f     %6d%n", "peras", 2.75, 120);
        System.out.printf("%-10s     %8.2f     %6d%n", "aguacates", 10.0, 6);
    }
}
```

# Ejercicio 2

Escribe un programa que muestre tu nombre por pantalla.

```java
public class Nombre {
    public static void main(String[] args) {
        System.out.println("Jaime");
    }
}
```

# Ejercicio 3

Modifica el programa anterior para que además se muestre tu dirección y tu número de teléfono. Asegúrate de que los datos se muestran en líneas separadas.

```java
public class DatosPersonales {
    public static void main(String[] args) {
        System.out.println("Jaime");
        System.out.println("Calle Castilla, 17");
        System.out.println("634274382");
    }
}
```
