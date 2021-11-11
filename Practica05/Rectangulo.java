/**
 *Clase que simula un rectángulo con base y altura
 *@author Mario Rosales
 *@version 1.0
 */
    public class Rectangulo{
    private double base;
    private double altura;
	/**
	 *Constructor sin parametros
	 */
    public Rectangulo(){
	base = 1;
	altura = 1;
    }
	/**
	 *Constructor con base y altura como parametros
	 *@param base La base del rectangulo
	 *@param altura La altura del rectangulo
	 */
    public Rectangulo(double base, double altura){
	this.base = base;
	this.altura = altura;
    }
	/**
	 *Muestra la base del rectangulo
	 *@return La medida de la base del rectangulo
	 */
    public double getBase(){
	return base;
    }
	/**
	 *Establece la base del rectangulo
	 *@param base La medida que va a tener la base del rectangulo
	 */
    public void setBase(double base){
	this.base = base;
    }
	/**
	 *Muestra la altura del rectangulo
	 *@return La medida de la altura del rectangulo
	 */
    public double getAltura(){
	return altura;
    }
	/**
	 *Establece la altura del rectangulo
	 *@param altura La medida que va a tener la altura del rectangulo
	 */
    public void setAltura(double altura){
	this.altura = altura;
    }
	/**
	 *Muestra la base y la altura del rectangulo
	 *@return Un mensaje que contiene la base y la altura del rectangulo
	 */
    public String toString(){
	return "Base: " + base + ", altura: " + altura;
    }
	/**
	 *Calcula el area del rectangulo
	 *@return La medida del area del rectangulo
	 */
    public double area(){
	return base * altura;
    }
	/**
	 *Calcula el perimetro del rectangulo
	 *@return La medida del perimetro del rectangulo
	 */
    public double perimetro(){
	return 2 * (base+altura);
    }
}
