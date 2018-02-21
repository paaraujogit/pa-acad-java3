package pa.calc;

public class Calculadora {

	public static void main(String[] args) {
		// OperEx Example
		OperEx opex=new OperEx();
		double resEx = opex.oper(1, 2);
		System.out.println(resEx);

		// ToDo - All Students Must Implement one Operation
		// - Oper02 - Bruno Rego  - modulo
		Oper02 ope02=new Oper02();
		double res02 = ope02.oper(4, 3);
		System.out.println(res02);

	}

}
