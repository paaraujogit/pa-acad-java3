package pa.calc;

import pa.calc.david.OpMultDavid;
import pa.calc.david.OperationPowerNoPackage;
import pa.calc.pack02.CalculaVolume;

public class Calculadora {

	public static void main(String[] args) {
		// OperEx Example
		OperEx opex = new OperEx();
		double resEx = opex.oper(1, 2);
		System.out.println(resEx); 

		// ToDo - All Students Must Implement one Operation

		// - Oper20 - Hugo Zacarias  - modulo
		OperEx20 ope20=new OperEx20();
		double res20 = ope20.oper(6, 1);
		System.out.println(res20); 

		// - Oper02 - Bruno Rego - modulo
		Oper02 ope02 = new Oper02();
		double res02 = ope02.oper(4, 3);
		System.out.println(res02);

		// ToDo - All Students Must Implement one Operation
		// - Oper09 - Andr� Monteiro - Multiplica��o
		Oper09 ope09 = new Oper09();
		double res09 = ope09.oper(5, 3);
		System.out.println(res09);
					
		//Pow do David
		OperationPowerNoPackage op = new OperationPowerNoPackage();
		System.out.println("C�lculo da Pot�ncia: "+op.oper(5, 2));
		
		//Multiplica��o do David com a Opera��o de Soma do Nasser
		OpMultDavid opMultDoDavid_e_Nasser = new OpMultDavid();
		
		System.out.println("C�lculo da Multiplica��o do David com a Soma do Nasser: "+opMultDoDavid_e_Nasser.oper(5, 2));
 
		CalculaVolume operMulti02 = new CalculaVolume();
		System.out.println("Cacula volume: " + operMulti02.oper(2, 3));

	}

}
