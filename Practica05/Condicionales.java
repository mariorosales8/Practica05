import java.util.Scanner;
/**
 *Clase que verifica el mayor entre dos números
 *@author Mario Rosales
 *@version 1.0
 */
public class Condicionales{
    /**
     *Metodo principal
     *@param args Argumentos
     */
    public static void main(String[] args){
	//creamos un Scanner
	Scanner sc = new Scanner(System.in);
	//pedimos el primero y segundo número al usuario y los guardamos
	System.out.print("*** Condicionales ***\nDame el numero 1: ");
	int n1 = sc.nextInt();
	System.out.print("Dame el numero 2: ");
	int n2 =sc.nextInt();
	//verificamos cual es mayor
	if(n1>n2){
	    System.out.println("El numero con mayor valor es: " + (n1));
	}else{
	     System.out.println("El numero con mayor valor es: " + (n2));
	}
    }
}
