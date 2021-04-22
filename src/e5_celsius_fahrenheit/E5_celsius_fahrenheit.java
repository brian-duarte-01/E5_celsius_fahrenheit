
package e5_celsius_fahrenheit;

import java.util.Scanner;

public class E5_celsius_fahrenheit {

   
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       // declaracion de variables
       int c;
       double f;
       //entrada de datos
        System.out.println("ingrese los grados Celsius");
        c=in.nextInt();
        //procedimiento
      f=(1.8*c)+32;
       //salida de datos
        System.out.println("la conversion a Grados Fahrenheit es: "+f);
    }
    
}
