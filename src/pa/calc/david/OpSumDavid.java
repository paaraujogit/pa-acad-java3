package pa.calc.david;

import pa.calc.*;

public class OpSumDavid implements ItfOper {

	/**
	 * Calcula a potência do primeiro argumento, dada pelo segundo argumento
	 */
	@Override
	public double oper(double op1, double op2) {
		
		return op1+op2;
		
	}
}