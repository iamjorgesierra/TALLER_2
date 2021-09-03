
package taller2punto6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Taller2punto6 {

    
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("*********Programa para calcular la masa corporal BMI*********");
        float kg,al,mc;
        System.out.println("por favor digite su peso en Kilogramos:  ");
        kg=Float.parseFloat(leer.readLine());
        System.out.println("por favor digite su altura en Metros:  ");
        al=Float.parseFloat(leer.readLine());
        
        mc=kg/(al*al);
        System.out.println("La Masa Corporal es: "+String.format("%.2f",mc));
        System.out.println("By Jorge Sierra");
    }
    
}
