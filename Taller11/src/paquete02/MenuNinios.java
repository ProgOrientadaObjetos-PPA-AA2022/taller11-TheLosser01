/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author VIVOBOOK
 */
public class MenuNinios extends Menu {
    double porcionHelado;
    double porcionPastel;
    
    public MenuNinios(String nP, double vIM, double pH, double hP) {
        super(nP, vIM);
        porcionHelado= pH;
        porcionPastel = hP;
    }
    
    public void establecerPorcionHelado(double x){
        porcionHelado= x;
    }
    
    public void establecerPorcionPastel(double x){
        porcionPastel = x;
    }
    
    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu + porcionHelado + porcionPastel;
    }
    
    public double obtenerPorcionHelado(){
        return porcionHelado;
    }
    
    public double obtenerPorcionPastel(){
        return porcionPastel;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Menu del dia\n%s", super.toString());
        cadena = String.format("%s"
                + "\tValor helado: %.2f\n"
                + "\tValor pastel: %.2f\n"
                + "\tValor del menú: %.2f\n",
                cadena,
                porcionHelado,
                porcionPastel,
                obtenerValorMenu());
        return cadena;
    }
}
