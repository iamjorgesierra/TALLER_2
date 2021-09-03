
package taller2punto1;

import java.util.Scanner;


public class Taller2punto1 {

    
    
    public static void main(String[] args) {
        System.out.println("*****PRIMER PROGRAMA*****");
        Scanner entrada=new Scanner (System.in);
        System.out.print("Por favor dijite un numero: ");
        int n1 = entrada.nextInt();
        System.out.print("Por favor dijite un numero: ");
        int n2 = entrada.nextInt();
      
        System.out.printf("x=%d\n", n1);
        System.out.printf("El valor de %d + %d es %d\n", n1, n1, ( n1 + n1 ) );
        System.out.printf("x=%.2f\n", x(n1,n2));
        System.out.printf("%d - %d\n", ( n1 + n2 ), ( n2 + n1 ) );     
    }
        public static double x(int a, int b){
        return (double) a / 1 ;
    }
    
}
