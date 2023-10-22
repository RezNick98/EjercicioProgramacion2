package Ejercicio5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ProductoFresco pfr = new ProductoFresco(LocalDate.of(2024, 05, 14), 100, LocalDate.of(2023, 8, 1),
                "Granja B");
        Producto pr = new Producto(LocalDate.of(2023, 12, 1), 50, LocalDate.of(2023, 6, 1), "Granja A");

        System.out.println(pr.etiqueta());
        System.out.println(pfr.etiqueta());

    }
}
