package pack.david;

import pa.calc.*;

public class OperationPowerNoPackage implements ItfOper {

	/**
	 * Calcula a pot�ncia do primeiro argumento, dada pelo segundo argumento
	 */
	@Override
	public double oper(double op1, double op2) {
		
		return Math.pow(op1, op2);
		
	}
}