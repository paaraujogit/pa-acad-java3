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
		
		// ToDo - All Students Must Implement one Operation
				// - Oper09 - Andr� Monteiro  - Multiplica��o
				Oper09 ope09 = new Oper09();
				double res09 = ope09.oper(5, 3);
				System.out.println(res09); 
				
				
		//Pow do David
		OperationPowerDavid op = new OperationPowerDavid();
		System.out.println("C�lculo da Pot�ncia: "+op.oper(5, 2));
		

	}

}
