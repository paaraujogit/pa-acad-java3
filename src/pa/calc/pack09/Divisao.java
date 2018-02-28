package pa.calc.pack09;

public class Divisao {

	public int div(int x, int y) {
		
		Subtracao sub = new Subtracao();
		
		int i = 0;
		
		LOOP: while (x > 0) {
			if (x >= y) {
				x = sub.sub(x, y);
				i++;
			} else {
				System.out.println("Divisão não é exata");
				System.out.println("Resto: " + x%y);
				break LOOP;
			}	
		}
		
		return i;
	}

}
