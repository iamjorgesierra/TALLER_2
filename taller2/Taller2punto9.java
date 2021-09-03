
package taller2punto9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Taller2punto9 {

    
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("*********Programa para convertir unidades de masa*********");
        float kg,g,lb,tn;
        System.out.println("por favor digite el peso en Kilogramos:  ");
        kg=Float.parseFloat(leer.readLine());
        g=kg*1000;
        lb=(float) (kg*(2.20462));
        tn=kg/1000;
        System.out.println("su coversion a gramos es: "+g);
        System.out.println("su coversion a libras es: "+lb);
        System.out.println("su coversion a toneladas es: "+tn);
        System.out.println("By Jorge Sierra");
        
    }
    
}
