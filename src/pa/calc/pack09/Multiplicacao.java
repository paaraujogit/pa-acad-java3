package pa.calc.pack09;

public class Multiplicacao {

	public int mult(int x, int y) {

		Soma sum = new Soma();

		int result = 0;

		for (int i = 0; i < y; i++) {
			result = sum.soma(x, result);
		}

		return result;
	}

}
