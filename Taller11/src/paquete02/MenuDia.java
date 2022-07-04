/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALA I
 */
public class MenuDia extends Menu{
    double valorPostre;
    double valorBebida;
    
    public MenuDia(String nP, double vIM, double vP,
            double vB) {
        super(nP, vIM);
        valorPostre= vP;
        valorBebida = vB;
    }
    
    public void establecerValorPostre(double vP){
        valorPostre= vP;
    }
    
    public void establecerValorBebida(double vB){
        valorBebida = vB;
    }
    
    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu + valorPostre + valorBebida;
    }
    
    public double obtenerValorPostre(){
        return valorPostre;
    }
    
    public double obtenerValorBebida(){
        return valorBebida;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Menu del dia\n%s", super.toString());
        cadena = String.format("%s"
                + "\tValor del postre: %.2f\n"
                + "\tValor de la bebida: %.2f\n"
                + "\tValor total: %.2f\n",
                cadena,
                valorPostre,
                valorBebida,
                obtenerValorMenu());
        return cadena;
    }
}
