/**
 *Clase que calcula el area y volumen de un cilindro
 *@author Mario Rosales
 *@version 1.0
 */
public class Cilindro{
    /**
     *Método principal
     @param args Argumentos*/
    public static void main(String[] args){
        //declaramos un radio y una altura
	int radio = 10;
	int altura = 20;
	//calculamos el area
	double area = 2 * 3.1416 * radio * altura + 2 *3.1416 * radio * radio;
	//calculamos el volumen
	double volumen = 3.1416 * radio * radio * altura;
	//imprimimos los resultados
	System.out.println("El área del cilindro es: " + area + " cm^2");
	System.out.println("El volumen del cilindro es: " + volumen + " cm^3");
    }
}
