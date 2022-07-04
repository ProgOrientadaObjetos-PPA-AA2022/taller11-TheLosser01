/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author VIVOBOOK
 */
public class MenuEconomico extends Menu{
    double porcentajeDescuento;
    
    public MenuEconomico(String nP, double vIM, double pD) {
        super(nP, vIM);
        porcentajeDescuento= pD;
    }
    
    public void establecerPorcentajeDescuento(double pD){
        porcentajeDescuento= pD;
    }
    
    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu - (valorInicialMenu * porcentajeDescuento 
                /100);
    }
    
    public double obtenerPorcentajeDescuento(){
        return porcentajeDescuento;
    }
    
    
    @Override
    public String toString() {
        String cadena = String.format("Menu del Dia\n%s", super.toString());
        cadena = String.format("%s"
                + "\tPorcentaje Descuento: %.2f\n"
                + "\tValor total: %.2f\n",
                cadena,
                porcentajeDescuento,
                obtenerValorMenu());
        return cadena;
    }
}
