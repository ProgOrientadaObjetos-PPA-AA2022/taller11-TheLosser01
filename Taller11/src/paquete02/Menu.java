/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALA I
 */
public class Menu {
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicialMenu;
    
    
    public Menu (String nP, double vM, double vIM){
        nombrePlato = nP;
        valorMenu = vM;
        valorInicialMenu = vIM;
    }
    
    public void establecerNombrePlato(String nP){
        nombrePlato = nP;
    }
    
    public void establecerValorMenu(double vM){
        valorMenu = vM;
    }
    
    public void establecerValorInicialMenu(double vIM){
        valorInicialMenu = vIM;
    }
    
    public String obtenerNombrePlato(){
        return nombrePlato;
    }
    
    public double obtenerValorMenu(){
        return valorMenu;
    }
    
    public double obtenerValorInicialMenu(){
        return valorInicialMenu;
    }
}
