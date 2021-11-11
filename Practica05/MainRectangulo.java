/**
 *Clase que crea dos rectangulos, de los cuales uno tiene lados el doble de largos que el otro
 *@author Mario Rosales
 *@version 1.0
 */
public class MainRectangulo{
    /**
     *Metodo principal
     *@param args Argumentos
     */
    public static void main(String[] args){
	//creamos dos rectángulos
	Rectangulo a = new Rectangulo();
	Rectangulo b = new Rectangulo(3.4, 2);
	//establecemos la base y la altura de uno como el doble que las del otro
	a.setBase(b.getBase() * 2);
	a.setAltura(b.getAltura() * 2);
	//imprimimos base, altura, area y perimetro de ambos rectangulos
	System.out.println("Rectangulo A: " + a.toString() + ", area: " + a.area() + ", perimetro: " + a.perimetro());
	System.out.println("Rectangulo B: " + b.toString() + ", area: " + b.area() + ", perimetro: " + b.perimetro());
    }
}
