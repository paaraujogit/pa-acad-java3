/**
 * 
 */
package pa.calc.pack02;

import pa.calc.ItfOper;

/**
 * @author brunorego
 *
 */
public class Potencia implements ItfOper {
	/**
	 * Calcula potencia de um valor.
	 * Chama classe multiplica para efectuar o calculo
	 * 
	 * @param valor
	 * @param potencia
	 * 
	 * @return Resultado da operação de calculo
	 */
	@Override
	public double oper(double valor, double potencia) {
			if (potencia>1)
				valor += oper(valor, potencia-1);
		return valor;
	}
}
