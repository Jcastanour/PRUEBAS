
package pitagoras;

//@author Juan Pablo

import java.util.Scanner;

public class Pitagoras {

    public static void main(String[] args) {
       double ladoa,ladob,hipo;
       
       Scanner entrada = new Scanner(System.in);
       System.out.println("ingrese el valor del lado a: ");
       ladoa = entrada.nextDouble();
       System.out.println("ingrese el valor del lado b: ");
       ladob = entrada.nextDouble();
       
       hipo = hipotenusa.calcularhipo(ladoa, ladob);
       System.out.println("la hipotenusa es con rama ladoa: " + hipo);
    }

}
