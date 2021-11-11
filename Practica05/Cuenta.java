/**
 *Clase que simula una cuenta de banco
 *@author Mario Rosales
 *@version 1.0
 */
public class Cuenta{
    private String titular;
    private double dineroDisponible;
    /**
     *Constructor sin parametros
     */
    public Cuenta(){
	this.titular = "";
	this.dineroDisponible = 120;
    }
    /**
     *Constructor con un parametro
     *@param titular El nombre del titular de la cuenta
     */
    public Cuenta(String titular){
	this.titular = titular;
	this.dineroDisponible = 0;
    }
    /**
     *Establece el nombre del titular
     *@param titular el nombre del titular que se quiere asignar a la cuenta
     */
    public void setTitular(String titular){
	this.titular = titular;
    }
    /**
     *Muestra el nombre del titular
     *@return El nombre del titular de la cuenta
     */
    public String getTitular(){
	return this.titular;
    }
    /**
     *Establece el dinero disponible
     *@param dinero El dinero que se quiere asignar a la cuenta
     */
    public void setDinero(double dinero){
	this.dineroDisponible = dinero;
    }
    /**
     *Muestra el dinero disponible
     *@return El dinero disponible en la cuenta
     */
    public double getDinero(){
	return this.dineroDisponible;
    }
    /**
     *Muestra el estado de la cuenta
     *@return Un mensaje que contiene el nombre del titular y el dinero disponible
     */
    public String toString(){
	return  titular + ", $" + dineroDisponible;
    }
}
