/**
 *Clase para imprimir los primos con do while
 *@author Mario Rosales
 *@version 1.0
 */
public class CicloDoWhile{
    /**
     *Metodo principal
     *@param args Argumentos
     */
    public static void main(String[] args){
	//declaramos la variable primo como verdadero
	boolean primo = true;
	//declaramos la variable i como 2 y la imprimimos
	int i = 2;
	System.out.print(2 + " ");
	do{
	    //declaramos j como 2 y primo como verdadero
	    int j = 2;
	    primo = true;
	    do{
		//comprobamos si i es divisible entre j
		if(i%j == 0){
		    primo = false;
		    break;
		}j += 1;
	    }while(j <= i/2);
	    //si primo es verdaadero imprimimos i
	    if(primo){
		    System.out.print(i + " ");
	    }i += 1;
	}while(i <= 1000);
    }
}
