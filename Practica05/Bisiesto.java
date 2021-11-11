import java.util.Scanner;
/**
*Clase para saber si un año es bisiesto
*@author Mario Rosales
*@version 1.0 
*/
public class Bisiesto{
    /**
     *Método principal
     *@param args Argumentos
     */
    public static void main(String[] args){
	//creamos un Scanner
	Scanner sc = new Scanner(System.in);
	System.out.print("***Bisiesto***\nIngresa el año del que deseas saber si es bisiesto o no: ");
	//recibimos el año que se desea saber si es bisiesto
	int año = sc.nextInt();
	//verificamos si es bisiesto e imprimimos el resultado
	if(año%4 == 0 && (año%100 != 0 || año%400 == 0)){
	    System.out.println("El año " + año + " es bisiesto");
	}else{
	    System.out.println("El año " + año + " no es bisiesto");
	}
    }
}
