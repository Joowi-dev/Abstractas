package net.salesianos;

import net.salesianos.actividad1.Circulo;
import net.salesianos.actividad1.Rectangulo;
import net.salesianos.actividad2.CocheCombustion;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        actividad1();
        actividad2();
    }

    private static void actividad1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ACTIVIDAD 1: FIGURAS GEOMÉTRICAS ===");

        System.out.println("\n-- RECTÁNGULO --");
        System.out.print("Introduce la base: ");
        double base = scanner.nextDouble();
        System.out.print("Introduce la altura: ");
        double altura = scanner.nextDouble();

        Rectangulo rectangulo = new Rectangulo(base, altura);
        System.out.printf("%nRectángulo [base=%.2f, altura=%.2f]%n", rectangulo.getBase(), rectangulo.getAltura());
        System.out.printf("  Área:      %.2f%n", rectangulo.calcularArea());
        System.out.printf("  Perímetro: %.2f%n", rectangulo.calcularPerimetro());

        System.out.println("\n-- CÍRCULO --");
        System.out.print("Introduce el radio: ");
        double radio = scanner.nextDouble();

        Circulo circulo = new Circulo(radio);
        System.out.printf("%nCírculo [radio=%.2f]%n", circulo.getRadio());
        System.out.printf("  Área:           %.2f%n", circulo.calcularArea());
        System.out.printf("  Circunferencia: %.2f%n", circulo.calcularPerimetro());

        scanner.close();
    }

    private static void actividad2() {
        System.out.println("\n=== ACTIVIDAD 2: COCHE DE COMBUSTIÓN ===");

        CocheCombustion coche = new CocheCombustion("Rojo", 4, 4, "Toyota Corolla", "1234ABC", 20.0);
        System.out.printf("Modelo: %s | Matrícula: %s | Color: %s | Puertas: %d | Ruedas: %d%n",
                coche.getModelo(), coche.getMatricula(), coche.getColor(),
                coche.getNumeroPuertas(), coche.getNumeroRuedas());

        System.out.println("\n-- Intentando mover antes de arrancar --");
        coche.mover();

        System.out.println("\n-- Arrancando el motor --");
        coche.arrancar();

        System.out.println("\n-- Moviendo el coche varias veces --");
        coche.mover();
        coche.mover();
        coche.mover();
        coche.mover();
        coche.mover();

        System.out.printf("%n-- Nivel de combustible actual: %.1f litros --%n", coche.getLitrosCombustible());

        System.out.println("\n-- Estableciendo combustible a 2 litros --");
        coche.setLitrosCombustible(2.0);
        System.out.println("Moviendo el coche 3 veces más:");
        coche.mover();
        coche.mover();
        coche.mover();
    }
}
