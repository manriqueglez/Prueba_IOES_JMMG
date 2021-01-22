/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import static Utilidades.IO_ES.*;

/**
 *
 * @author manri
 */
public class Prueba_IOES_JMMG {
    
    public static void main (String[] args){
        
        System.out.println("LECTURA DE INTEGER:");
        
        System.out.println(leerInteger());
        
        System.out.println(leerInteger("Hola, dime un numero entero."));
        
        System.out.println(leerInteger("Dime un entero mayor que 7", 7));
        
        System.out.println(leerInteger("Dime un entero entre 10 y 100", 10 , 100));
        
        System.out.println("LECTURA DE NUMEROS REALES:");
        
        System.out.println(leerEnteroLargo());
        
        System.out.println(leerEnteroLargo("Porfi, un entero largo tipo long"));
        
        System.out.println(leerReal ());
        
        System.out.println(leerReal ("Un numero real por favor (tipo float)"));
        
        System.out.println(leerReal ("Un numero real por favor (tipo float) mayor que 10", 10));
        
        System.out.println(leerRealLargo ());
        
        System.out.println(leerRealLargo ("Dame un numero real largo por favor (doble)"));
        
        System.out.println("LECTURA DE CADENAS:");
        
        System.out.println(leerCadena ());
        
        System.out.println(leerCadena ("Escribe algo"));
        
        System.out.println(leerCadena ("Escribas lo que escribas solo va a leer los primeros 10 caracteres", 10));
        
        System.out.println(leerCaracter ());
        
        System.out.println(leerCaracter ("escribe cualquier caracter"));
        
        System.out.println("LECTURA DE BOOLEANOS:");
        
        System.out.println(leerBooleano ());
        
        System.out.println(leerBooleano ("Escribe si o no por favor?"));
        
        System.out.println("ESCRIBIR:");
        
        escribir ("Un perro rojo");
        
        escribirLN("Escribe algo aquí y se imprimirá con salto de linea");
        
    
    }
    
}
