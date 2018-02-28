package pa.calc.pack02;

import pa.calc.ItfOper;

public class Multiplica implements ItfOper{
	/**
	 * Calcula multiplicação de dois valores.
	 * Chama classe soma para efectuar o calculo
	 * 
	 * @param valor
	 * @param multiplicador
	 * 
	 * @return Resultado da operação de calculo
	 */
	@Override
	public double oper(double valor, double multiplicador) {
			if (multiplicador>1)
				valor += oper(valor, multiplicador-1);
		return valor;
	}
}
