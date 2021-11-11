/**
 *Clase para imprimir los primos con while
 *@author Mario Rosales
 *@version 1.0
 */  
public class CicloWhile{
    /**
     *Metodo principal
     *@param args Argumentos     
     */
    public static void main(String[] args){
	//declaramos  primo como verdadero e i como 2
	boolean primo = true;
	int i = 2;
	while(i <= 1000){
	    //declaramos j como 2 y primo como verdadero
	    int j = 2;
	    primo = true;
	    while(j <= i/2){
		//comprobamos si i es divisible entre j
		if(i%j == 0){
		    primo = false;
		    break;
		}j += 1;
	    //si primo es verdadero imprimimos i
	    }if(primo){
		    System.out.print(i + " ");
	    }i += 1;
	}
    }
}
