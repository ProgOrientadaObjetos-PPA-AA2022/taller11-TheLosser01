/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALA I
 */
public class MenuCarta extends Menu {

    double valorPorcionGuarnicion;
    double valorBebida;
    double valorAdicional;

    public MenuCarta(String nP, double vIM, double vPG,
            double vB, double vA) {
        super(nP, vIM);
        valorPorcionGuarnicion = vPG;
        valorBebida = vB;
        valorAdicional = vA;
    }

    public void establecerValorPorcionGuarnicion(double vPG) {
        valorPorcionGuarnicion = vPG;
    }

    public void establecerValorBebida(double vB) {
        valorBebida = vB;
    }

    public void calcularValorAdicional() {
        valorAdicional = valorInicialMenu * 0.2;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu + valorPorcionGuarnicion + valorBebida;
    }

    public double obtenerValorPorcionGuarnicion() {
        return valorPorcionGuarnicion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerValorAdicional() {
        return valorAdicional;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu de carta\n%s", super.toString());
        cadena = String.format("%s"
                + "\tValor guarnicion: %.1f\n"
                + "\tValor bebida: %.1f\n"
                + "\tPorcentaje adicional: %.2f\n"
                + "\tValor total: %.2f\n",
                cadena,
                valorPorcionGuarnicion,
                valorBebida,
                valorAdicional,
                obtenerValorMenu());
        return cadena;
    }
}
