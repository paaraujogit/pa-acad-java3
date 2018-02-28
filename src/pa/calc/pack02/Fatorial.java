package pa.calc.pack02;

import pa.calc.ItfOper;

public class Fatorial implements ItfOper{

	
    /**
     * Este é um método estático que faz o calculo do fatorial de um número que é
     * passado como parâmetro e retorna para a função principal o resultado.
    */
    public static int fatorial(int num) {


        /**
         * Este é o caso base, se o número passado por parametro for 0 ou 1,
         * ele retorna o resultado 1 e finaliza o método.
         */
        if (num <= 1) {

            return 1;

        } else {

            /**
             * chama o método fatorial novamente, mas dessa vez enviando como
             * parametro (n - 1).
             */
            
            return fatorial(num - 1) * num;

        }

    }

	@Override
	public double oper(double op1, double op2) {
		int valor = (int) op1;
		return fatorial(valor);
	}
}
