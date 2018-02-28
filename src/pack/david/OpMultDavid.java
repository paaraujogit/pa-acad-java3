package pack.david;

import pa.calc.ItfOper;

public class OpMultDavid implements ItfOper {

	/**
	 * Calcula a potência do primeiro argumento, dada pelo segundo argumento
	 * 
	 * 3x2=6
	 */
	@Override
	public double oper(double op1, double op2) {
		
		double result = 0;
		OpSumDavid opSum = new OpSumDavid(); 
			
		for(double i=0; i< op2; i++) {
			result = opSum.oper(op1, result);			
		}
		
		return result;
	}
}