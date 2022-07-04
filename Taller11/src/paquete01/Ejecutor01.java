/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import paquete02.Cuenta;
import paquete02.Menu;
import paquete02.MenuCarta;
import paquete02.MenuDia;
import paquete02.MenuEconomico;
import paquete02.MenuNinios;

/**
 *
 * @author reroes
 */
public class Ejecutor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        ArrayList<Menu> listaMenu = new ArrayList<>();

        MenuNinios mN1 = new MenuNinios("Niños 01", 2.00, 1.00, 1.50);
        mN1.establecerValorMenu();

        MenuNinios mN2 = new MenuNinios("Niños 02", 3.00, 1.00, 1.50);
        mN2.establecerValorMenu();

        MenuEconomico mE1 = new MenuEconomico("Econo 001", 4.00, 25);
        mE1.establecerValorMenu();

        MenuDia mD1 = new MenuDia("Dia 001", 5.00, 1.00, 1.00);
        mD1.establecerValorMenu();

        MenuCarta mC1 = new MenuCarta("Carta 001", 6.0, 1.5, 2.0, 10);
        mC1.establecerValorMenu();
        
        listaMenu.add(mN1);
        listaMenu.add(mN2);
        listaMenu.add(mE1);
        listaMenu.add(mD1);
        listaMenu.add(mC1);
        
        Cuenta c1 = new Cuenta("Victor Mendoza", listaMenu,10);
        c1.establecerSubtotal();
        c1.establecerValorTotal();
        System.out.printf("%s\n", c1);
        
                
    }

}
// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu del Día:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu del Día:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

*/
