/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class Cuenta {

    String nombre;
    ArrayList<Menu> listaMenu = new ArrayList<>();
    double valorTotal;
    double subtotal;
    double IVA;

    public Cuenta(String nom, ArrayList<Menu> m, double iva) {
        nombre = nom;
        listaMenu = m;
        IVA = iva;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerListaMenu(ArrayList<Menu> m) {
        listaMenu = m;
    }

    public void establecerSubtotal() {
        double sum = 0;
        for (int i = 0; i < listaMenu.size(); i++) {
            sum = sum + listaMenu.get(i).obtenerValorMenu();

        }
    }

    public void establecerIva(double v) {
        IVA = v;
    }
    
    public void establecerValorTotal(){
        valorTotal = subtotal + (subtotal * IVA)/100;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public ArrayList<Menu> obtenerLista(){
        return listaMenu;
    }
    
    public double obtenerSubtotal(){
        return subtotal;
    }
    
    public double obtenerIva(){
        return IVA;
    }
    
    public double obtenerValorTotal(){
        return valorTotal;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Factura\n"
                + "Cliente: %s\n"
                , nombre);
        for (int i = 0; i < obtenerLista().size(); i++){
            cadena = String.format("%s"
                    + "%s\n", cadena, 
                    obtenerLista().get(i));
            
        }
        
        cadena = String.format("\n%s"
                + "Subtotal: %.2f\n"
                + "Iva: %.2f\n"
                + "Total a pagar: %.2f\n"
                , cadena,
                subtotal,
                IVA,
                valorTotal);
        return cadena;
        
    }

}
