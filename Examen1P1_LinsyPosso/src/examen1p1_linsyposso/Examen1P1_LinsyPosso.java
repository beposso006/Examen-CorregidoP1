/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_linsyposso;
import java.util.Scanner;
/**
 *
 * @author 29164
 */
public class Examen1P1_LinsyPosso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner (System.in);
        boolean running = true;
        
        while (running) {
            System.out.println("--Menu--");
            System.out.println("1. Ejercicios String");
            System.out.println("2. Respuestas a preguntas");
            System.out.println("3. Historial de menu");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            int opcion = Leer.nextInt();
            String opcionesSeleccionadas = "";
            opcionesSeleccionadas += opcion + " ";
            switch (opcion){
                case 1: 
                    System.out.print("Ingrese una cadena: ");
                    String cadena = Leer.nextLine();
                    String cadena1 = Leer.nextLine();
                    if (cadena.length() != 8) { //correccion de la cadena
                        System.out.println("La cadena debe tener al menos 8 caracteres");
                        break;
                    }
                    if (cadena1.length()%2==0) {
                        String primeramitad = cadena1.substring(0, cadena1.length()/2);
                        String segundamitad = cadena1.substring(cadena1.length()/2);
                        String resultado = "";
                        System.out.println("La primera mitad es: "+primeramitad);
                        System.out.println("La segudnda mitad es: "+segundamitad);
                        for (int i = 0; i<primeramitad.length(); i++) {
                            resultado += primeramitad.charAt(i)+ "-" + segundamitad.charAt(i);
                        }
                        System.out.println("Cadena resultante: " + resultado);
                    }else{
                        String primeramitad = cadena1.substring(0, cadena1.length()/2);
                        String segundamitad = cadena1.substring(cadena1.length()/2);
                        String result = segundamitad + primeramitad;
                        System.out.println("Cadena resultante: " + result);
                    }
                    break;
                    
                case 2: 
                    System.out.println("a. Describa el funcionamiento de los ciclor for, while y do while");
                    System.out.println("R//El for es una estructura ciclica que controlada por un contador, "
                            + "el ciclo se repetira hasta el punto que se indique en la variable de control."
                            + "el while repite el ciclo tantas veces como se le indique, si no hay un limite se crea un ciclo infinito."
                            + "El do while repite lo que esta dentro 1 vez antes de leer la validacion de cuantas veces se indico repetir");
                    System.out.println("b.Describa el funcionamiento de .charAt(), indexOf() y .legth()");
                    System.out.println("R//Con el charAt obtenemos el caracter que esta en cierta posicion en una cadena(Caracter por indice). "
                            + "El indexOf nos muestra el lugar que ocupa una letra en una palabra (Indice por caracter)"
                            + "El length muestra el tamaño de una cadena");
                    System.out.println("c. Mencione 2 tipos de datos primitivos de java y cual es su uso.");
                    System.out.println("R// 1.Int:sirve para ingresar numeros enteros. 2. Char: Es un tipo de dato unicode que "
                            + "nos permite ingreser un solo caracter");
                    break;
                    
                case 3:
                    System.out.println("Opciones seleccionadas: " + opcionesSeleccionadas);
                    break;
                    
                case 4: 
                    default:
                    running = false;
                    System.out.println("Byee, tenga piedad de mi alma, graciassss :)");
                    }
            }
                    
            
        }
    }
   