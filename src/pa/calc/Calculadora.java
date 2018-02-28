package pa.calc;

public class Calculadora {

	public static void main(String[] args) {
		// OperEx Example
		OperEx opex=new OperEx();
		double resEx = opex.oper(1, 2);
		System.out.println(resEx);

		// ToDo - All Students Must Implement one Operation
		// - Oper20 - Hugo Zacarias  - modulo
		OperEx20 ope20=new OperEx20();
		double res20 = ope20.oper(6, 1);
		System.out.println(res20);

	}

}
