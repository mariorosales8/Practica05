/**
 *Clase que crea dos cuentas
 *@author Mario Rosales
 *@version 1.0
 */
public class MainCuenta{
    /**
     *Metodo principal
     *@param args Argumentos
     */
    public static void main(String[] args){
	//creamos dos cuentas a y b
	Cuenta a = new Cuenta();
	Cuenta b = new Cuenta("Mario Andres Rosales Peña");
	//establecemos el titular de la cuenta a
	a.setTitular("Jose Perez Ramirez");
	//establecemos el dinero disponible de la cuenta b
	b.setDinero(3726.50);
	//imprimimos los estados de ambas cuentas
	System.out.println(a.getTitular() + " tiene $" + a.getDinero() + " en su cuenta");
	System.out.println(b.toString());
    }
}
