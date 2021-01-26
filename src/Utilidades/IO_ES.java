/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author manri
 */
public class IO_ES {
    
    /**
    * Método que pide al usuario que introduzca un número. El número esperado es
    * un número entero.
    *
    * @return d entero.
    */
    public static int leerInteger() {
        int d = 0;
        boolean numeroValido = false;

        do {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Introduzca un numero entero: ");
            String s = entrada.nextLine();

            if (s != null) {
                try {
                    d = Integer.valueOf(s);
                    numeroValido = true;
                } catch (NumberFormatException e) {
                    System.out.println("ERROR:  El numero introducido no es válido");
                }
            } else {
              numeroValido = true; // Cancelado
            }
        } while (!numeroValido);

        return d;
    }

    
    
    
    
    
    /**
     * Método que pide al usuario que introduzca un número. El número esperado es
     * un número entero.
     *
     * @param msg
     * @return entero introducido por el usuario.
     */
    public static int leerInteger(String msg) {
        int x = 0;
        boolean numeroValido = false;

        do {
            Scanner entrada = new Scanner(System.in);

            System.out.println(msg);
            String s = entrada.nextLine();

            if (s != null) {
                try {
                    x = Integer.valueOf(s);
                    numeroValido = true;
                } catch (NumberFormatException e) {
                    System.out.println("ERROR:  El numero introducido no es válido");
                }
            } else {
                numeroValido = true; 
            }
        } while (!numeroValido);        
        return x;
    }

    
    
    
    
    
    /**
     * Pide un numero Integer mayor que un mínimo dado.
     *
     * @param msg
     * @param min
     * @return numero entero introducido por el usuario
     */
    public static int leerInteger( String msg, int min) {
        int x;

        do {
            Scanner entrada = new Scanner(System.in);
            try {
                System.out.println(msg);
                x = entrada.nextInt();
            } catch (InputMismatchException ex) {
                // Si metemos un error, ponemos x  fuera del rango para que nos de el mensaje de error.
                x = min - 1;
                entrada.next();
            }
 
            if (!(x >= min)) {
                System.out.println("Error, por favor introduce un numero integer mayor que" + min );
            }
 
        } while (!(x >= min));
 
        return x;
    }

    
    
    
    
        
    /**
     * Método para leer enteros dentro de un rango
     *
     * @param msg
     * @param min
     * @param max
     * @return numero entero introducido por el usuario
     */
    public static int leerInteger( String msg, int min, int max) {
        int x;
 
        //Ordenamos los rangos por si se han metido de manera incorreta.
        if (min > max) {
            int aux = min;
            min = max;
            max = aux;
        }
 
        do {
            Scanner entrada = new Scanner(System.in);
            try {
                System.out.println(msg);
                x = entrada.nextInt();
            } catch (InputMismatchException ex) {
                // Si metemos un error, ponemos x  fuera del rango para que nos de el mensaje de error.
                x = max + 1;
                entrada.next();
            }
 
            if (!(x >= min && x <= max)) {
                System.out.println("Error, por favor introduce un numero integer entre " + min + " y " + max);
            }
 
        } while (!(x >= min && x <= max));
 
        return x;
    }
    
    
    
    
    
    /**
     * Método que lee por teclado un entero largo y devuelve lo leido
     * @return long.
     */
    public static long leerEnteroLargo(){

        long x = 0;
        boolean correcto = false;
        
        do {
            System.out.println("Introduce un numero entero largo");
            Scanner entrada=new Scanner(System.in);
            String s = entrada.nextLine();
            
            if (s != null) {
                try {
                    x = Long.parseLong(s);
                    correcto = true;
                } catch (NumberFormatException ex) {
                    // En caso de error, se marca como incorrecto
                    System.out.println("Error, introduce un numero entero largo");
                }
            }else {
                correcto = true; // Cancelado
            }
        } while (!correcto);
        
        System.out.println("");
            
        return x;
    }

    
    
    
    
    
    /**
     * Método que lee por teclado un entero largo y devuelve lo leido
     * @param msg
     * @return x, tipo long.
     */
    public static long leerEnteroLargo( String msg){

        long x = 0;
        boolean correcto = false;
        
        do {
            System.out.println(msg);
            Scanner entrada=new Scanner(System.in);
            String s = entrada.nextLine();
            
            if (s != null) {
                try {
                    x = Long.parseLong(s);
                    correcto = true;
                } catch (NumberFormatException ex) {
                    // En caso de error, se marca como incorrecto
                    System.out.println("Error, introduce un numero entero largo");
                }
            }else {
                correcto = true; // Cancelado
            }
        } while (!correcto);
        
        System.out.println("");
            
        return x;
    }   
        
    
    
    
    
    
    /**
    * Método que lee por teclado un numero real y nos devuelve lo leido.
    * @return real, de tipo float
    */
    public static float leerReal(){

        float x = 0;
        boolean correcto = false;

        do {
            System.out.println("Introduce un numero real float");
            Scanner entrada=new Scanner(System.in);
            String s = entrada.nextLine();

            if (s != null) {
                try {
                    x = Float.parseFloat(s);
                    correcto = true;
                } catch (NumberFormatException ex) {
                    // En caso de error, se marca como incorrecto
                    System.out.println("Error, introduce un numero real float");
                }
            } else {
            correcto = true; // Cancelado
            }
        } while (!correcto);
        System.out.println("");
        
        return x;
    }
    
    
    
    
    
    
    /**
    * Método que lee por teclado un numero real y nos devuelve lo leido.
    * @param msg
    * @return real, de tipo float
    */
    public static float leerReal( String msg){

        float x = 0;
        boolean correcto = false;

        do {
            System.out.println(msg);
            Scanner entrada=new Scanner(System.in);
            String s = entrada.nextLine();

            if (s != null) {
                try {
                    x = Float.parseFloat(s);
                    correcto = true;
                } catch (NumberFormatException ex) {
                    // En caso de error, se marca como incorrecto
                    System.out.println("Error, introduce un numero real float");
                }
            } else {
            correcto = true; // Cancelado
            }
        } while (!correcto);
        System.out.println("");
        
        return x;
    }
    
    
    
    
    
    /**
     * Método que lee por teclado un numero real y nos pide que sea mayor que un mínimo dado po el usuario. 
     * @param msg
     * @param min
     * @return real leido
     */
    public static float leerReal (String msg, int min) {
 
        float x = 0;
        float minimo = (float) min;
 
        do {
            System.out.println(msg);
            Scanner entrada=new Scanner(System.in);
            String s = entrada.nextLine();

            if (s != null) {
                try {
                    x = Float.parseFloat(s);
                    
                } catch (NumberFormatException ex) {
                    // En caso de error, se marca como incorrecto
                    x = minimo - 1;
                    entrada.next();
                }
            }
 
            if (!(x >= minimo)) {
                System.out.println("Error, por favor introduce un numero real mayor que " + min );
            }
 
        } while (!(x >= minimo));
 
        return x;
    }
     
    
    
    


    /**
     * Método que lee por teclado un número real largo y nos devuelve lo leido
     * @return reallargo, tipo double
     */
    public static double leerRealLargo(){

        double x = 0;
        boolean correcto = false;
        
        do {
            System.out.println("Introduce un numero real double");
            Scanner entrada=new Scanner(System.in);
            String s = entrada.nextLine();
            
            if (s != null) {
                try {
                    x = Double.parseDouble(s);
                    correcto = true;
                } catch (NumberFormatException ex) {
                    // En caso de error, se marca como incorrecto
                    System.out.println("Error, introduce un numero real double");
                }
            } else {
                correcto = true; // Cancelado
            }
        } while (!correcto);
        
        System.out.println("");
        
        return x;
    }
    
    
    


    /**
     * Método que lee por teclado un número real largo y nos devuelve lo leido
     * @param msg
     * @return real largo, tipo double
     */
    public static double leerRealLargo(String msg){

        double x = 0;
        boolean correcto = false;
        
        do {
            System.out.println(msg);
            Scanner entrada=new Scanner(System.in);
            String s = entrada.nextLine();
            
            if (s != null) {
                try {
                    x = Double.parseDouble(s);
                    correcto = true;
                } catch (NumberFormatException ex) {
                    // En caso de error, se marca como incorrecto
                    System.out.println("Error, introduce un numero real double");
                }
            } else {
                correcto = true; // Cancelado
            }
        } while (!correcto);
        
        System.out.println("");
        
        return x;
    }



    
    /**
     * Método para leer cadenas
     *
     * @return cadena introducida por el usuario
     */
    public static String leerCadena() {
 
        System.out.println("Introduce una cadena");
        Scanner entrada=new Scanner(System.in);
        String cadena = entrada.nextLine();
 
        return cadena;
    }
 
    
    
    
    
    /**
     * Método para leer cadenas
     *
     * @param msg
     * @return cadena introducida por el usuario
     */
    public static String leerCadena (String msg) {
 
        System.out.println(msg);
        Scanner entrada=new Scanner(System.in);
        String cadena = entrada.nextLine();
 
        return cadena; 
    }    
    
    
    
    
    /**
     * Pide una cadena con una longitud exacta
     *
     * @param longitud
     * @param msg
     * @return cadena introducida por el usuario
     */
    public static String leerCadena(String msg, int longitud) {
 
        String cadena = "";
        do {
            System.out.println(msg);
            Scanner entrada=new Scanner(System.in);
            cadena = entrada.nextLine();
             
            if(!(cadena.length() == longitud)){
                System.out.println("Error, la longitud maxima es "+longitud+" letras o caracteres");
            }
             
        } while (!(cadena.length() == longitud));
 
        return cadena; 
    }
    
    
    
    
    /**
     * Pide un char, si tiene mas de un caracter, coge el primero
     *
     * @return
     */
    public static char leerCaracter() {
 
        System.out.println("Introduce un caracter");  //en caso de tener mas de un caracter, se cogera el primero
        Scanner entrada=new Scanner(System.in);
        char caracter = entrada.next().charAt(0);
 
        return caracter; 
    }
 
    
    
    
    
    /**
     * Pide un char, si tiene mas de un caracter, coge el primero
     *
     * @param msg
     * @return
     */
    public static char leerCaracter(String msg) {
 
        System.out.println(msg);
        Scanner entrada=new Scanner(System.in);
        char caracter = entrada.next().charAt(0);
 
        return caracter; 
    }
     
    
    
    
    
    /**
     * Pide un booleano, valida que sea un booleano
     *
     * @return booleano introducido por el usuario
     */
    public static boolean leerBooleano() {
 
        boolean x=false;
        String cadena;
        boolean flag=false;


            System.out.println("Introduce un valor booleano (si, no, s, n, y, n, true, false");

            do{
                Scanner entrada=new Scanner(System.in);
                cadena=entrada.nextLine();

                    if(cadena.toLowerCase().matches("si|s|y|true")){
                        x=true;
                        flag=true;
                    }
                    else if(cadena.toLowerCase().matches("no|n|false")){
                        x=false;
                        flag=true;
                    }
                    else{
                        System.out.println("Escriba si, no, s, n, y, true o false");
                    }

            }while(!flag);

        return x;

    }

 
    
    
    
    
    /**
     * Pide un booleano, valida que sea un booleano
     *
     * @param msg
     * @return booleano introducido por el usuario
     */
    public static boolean leerBooleano(String msg) {
 
        boolean x=false;
        String cadena;
        boolean flag=false;


            System.out.println(msg);

            do{
                Scanner entrada=new Scanner(System.in);
                cadena=entrada.nextLine();

                    if(cadena.toLowerCase().matches("si|s|y|true")){
                        x=true;
                        flag=true;
                    }
                    else if(cadena.toLowerCase().matches("no|n|false")){
                        x=false;
                        flag=true;
                    }
                    else{
                        System.out.println("Escriba si, no, s, n, y, true o false");
                    }

            }while(!flag);

        return x;

    }
    
       
    
    
    /**
    * Método que muestra un String por pantalla
    *
    * @param msg mensaje que muestra en pantalla
    */
    public static void escribir(String msg) {
        System.out.print(msg);
        
 
       
    }
   
    
    
       
    /**
     * Método que recibe por parámetro un String e imprime por pantalla lo recibido con salto de linea
     * @param msg mensaje que muestra en pantalla
     */
    public static void escribirLN(String msg) {
        System.out.println(msg);
    }  
    
}