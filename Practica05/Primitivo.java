/**
 *Clase que imrpime el tamaño de los tipos primitivos
 *@author Mario Rosales
 *@version 1.0
 */
public class Primitivo{
    /**
     *Método principal
     *@param args Argumentos
     */
    public static void main(String[] args){
	System.out.println("***Tipos primitivos***");
	//imprimimos los el tamaño en bytes de cada tipo primitivo
	System.out.println("byte: " + Byte.BYTES + " bytes");
	System.out.println("short: " + Short.BYTES + " bytes");
	System.out.println("int: " + Integer.BYTES + " bytes");
	System.out.println("long: " + Long.BYTES + " bytes");
	System.out.println("float: " + Float.BYTES + " bytes");
	System.out.println("double: " + Double.BYTES + " bytes");
	System.out.println("boolean: 1 bytes");
	System.out.println("char: " + Character.BYTES + " bytes");
	
	
    }
}
