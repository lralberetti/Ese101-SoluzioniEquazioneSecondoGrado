/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese101.soluzioniequazionisecondogrado;
import java.io.*;
import quadraticequationsolver.*;
import complexnumber.*;
public class Ese101SoluzioniEquazioniSecondoGrado {

   public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        
        String linea;
        
        QuadraticEquationSolver qes = new QuadraticEquationSolver();
        
        boolean valoreValido = false;
        while(!valoreValido) {
            System.out.print("Inserisci il coefficiente a: ");
            linea = tastiera.readLine();
            try {
                qes.setA(Float.valueOf(linea).floatValue());
                valoreValido = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Numero non valido");
            }
            catch (IllegalArgumentException e){
                System.out.println("Il valore di A deve essere maggiore o minore di 0:");
            }
        }
        
        valoreValido = false;
        while(!valoreValido) {
            System.out.print("Inserisci il coefficiente b: ");
            linea = tastiera.readLine();
            try {
                qes.setB(Float.valueOf(linea).floatValue());
                valoreValido = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Numero non valido");
            }
        }
        
        valoreValido = false;
        while(!valoreValido) {
            System.out.print("Inserisci il coefficiente c: ");
            linea = tastiera.readLine();
            try {
                qes.setC(Float.valueOf(linea).floatValue());
                valoreValido = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Numero non valido");
            }
        }
        
        ComplexNumber x1 = qes.computeX1();
        ComplexNumber x2 = qes.computeX2();
        
        
        
        System.out.println("x1: " + x1.formatComplexNumber());
        System.out.println("x2: " + x2.formatComplexNumber());
   }   
}
