/**
 *
 * 
 */
package pa.calc.pack02;

import pa.calc.ItfOper;

/**
 * Classe de calculo volume de um cilindro
 *  
 * @author brunorego
 *
 */
public class CalculaVolume implements ItfOper {

	/**
	 * Calcula o volume de um cilindro.
	 * 
	 * @param raio
	 * @param altura
	 * 
	 * @return Resultado da operação de calculo
	 */
	@Override
	public double oper(double raio, double altura) {
		Multiplica multiplica= new Multiplica();
		Potencia potencia= new Potencia();
		double potenciaRaio= potencia.oper(raio, 2);
		return multiplica.oper(multiplica.oper(Math.PI,potenciaRaio), altura);
	}
	

}
