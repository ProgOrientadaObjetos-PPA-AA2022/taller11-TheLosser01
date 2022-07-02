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

    public MenuCarta(String nP, double vM, double vIM, double vPG,
            double vB) {
        super(nP, vM, vIM);
        valorPorcionGuarnicion = vPG;
        valorBebida = vB;
    }

    public void establecerValorPorcionGuarnicion(double vPG) {
        valorPorcionGuarnicion = vPG;
    }

    public void establecerValorBebida(double vB) {
        valorBebida = vB;
    }
    
    public void calcularValorAdicional(){
        valorAdicional = valorInicialMenu * 0.2;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu + valorPorcionGuarnicion + valorBebida;
    }
    
    public double obtenerValorPorcionGuarnicion(){
        return valorPorcionGuarnicion;
    }
    
    public double obtenerValorBebida(){
        return valorBebida;
    }
    
    public double obtenerValorAdicional(){
        return valorAdicional;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\nNombre Plato: %s\n"
                + "Valor Menu: %.2f\n"
                + "Valor Inicial Menu: %.2f\n"
                + "Valor de Porción de Guarnición: %.2f\n"
                + "Valor Bebida: %.2f\n"
                + "Valor Adicional: %.2f\n", 
                nombrePlato,
                valorMenu,
                valorInicialMenu,
                valorPorcionGuarnicion,
                valorBebida,
                obtenerValorAdicional());
        return cadena;
    }
}
