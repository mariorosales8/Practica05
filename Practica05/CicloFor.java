/**
 *Clase que imprime los primos del 1 al 1000
 *@author Mario Rosales
 *@version 1.0
 */
public class CicloFor{
    /**
     *Metodo principal
     *@param args Argumentos
     */
    public static void main(String[] args){
	boolean primo;
	//abrimos un bucle que recorre una variable i del 2 al 1000
	for(int i=2; i<1001; i++){
	    //declaramos una variable primo como verdadero
	    primo = true;
	    //abrimos otro bucle que recorre una variable j desde 2 hasta i/2 o hasta que primo sea falso
	    for(int j=2; primo && j <= i/2; j++){
		//comprobamos si i es divisible entre j para determinar si no es primo
		if(i%j == 0){
		    primo = false;
		}
		//si primo es verdaderp, imprimimos i
	    }if(primo){
		    System.out.print(i + " ");
		}
	    }
	}
    }
