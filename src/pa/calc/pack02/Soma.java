/**
 * 
 */
package pa.calc.pack02;

import pa.calc.ItfOper;

/**
 * @author brunorego
 *
 */

public class Soma implements ItfOper {
	/**
	 * Calcula soma de dois valores.
	 * 
	 * @param valor1
	 * @param valor2
	 * 
	 * @return Resultado da operação de calculo
	 */
	@Override
	public double oper(double valor1, double valor2) {
		return valor1 + valor2;
	}
}
