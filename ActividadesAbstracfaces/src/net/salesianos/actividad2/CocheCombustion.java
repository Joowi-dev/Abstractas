package net.salesianos.actividad2;

public class CocheCombustion extends Vehiculo {
    protected boolean motorEncendido;
    protected double litrosCombustible;

    public CocheCombustion(String color, int numeroPuertas, int numeroRuedas,
            String modelo, String matricula, double litrosCombustible) {
        super(color, numeroPuertas, numeroRuedas, modelo, matricula);
        this.motorEncendido = false;
        this.litrosCombustible = litrosCombustible;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public double getLitrosCombustible() {
        return litrosCombustible;
    }

    public void setLitrosCombustible(double litrosCombustible) {
        this.litrosCombustible = litrosCombustible;
    }

    @Override
    public void arrancar() {
        if (litrosCombustible <= 0) {
            System.out.println("No se puede arrancar: no hay combustible.");
        } else {
            litrosCombustible--;
            motorEncendido = true;
            System.out.printf("Motor arrancado. Combustible restante: %.1f litros.%n", litrosCombustible);
        }
    }

    @Override
    public void pararMotor() {
        motorEncendido = false;
        System.out.println("Motor parado.");
    }

    @Override
    public void mover() {
        if (!motorEncendido) {
            System.out.println("No se puede mover: el motor no está arrancado.");
            pararMotor();
        } else if (litrosCombustible <= 0) {
            System.out.println("No se puede mover: sin combustible. Parando motor.");
            pararMotor();
        } else {
            litrosCombustible--;
            System.out.printf("El coche avanza. Combustible restante: %.1f litros.%n", litrosCombustible);
        }
    }
}
