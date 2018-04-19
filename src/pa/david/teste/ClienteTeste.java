package pa.david.teste;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

import pa.david.Cliente;
import pa.david.TipoCliente;


public class ClienteTeste {

	@Test
	void testUnicidadeCliente() {
		
		//Cliente 1 exemplo.
		String nome = "Cliente_David";
		String[] telefones = new String[]{"123456789"};
		String morada = "Nuremberga";
		String[] emails = new String[] {"d.casimiro@gmail.com"};
		String profissao = "Programador Java";
		int numAgencia = 1;
		TipoCliente tipoCliente = TipoCliente.NORMAL;
		int cartaoCidadao = 11009900;

		//Clientes exemplo.
		Cliente cliente1 = new Cliente(nome, morada, telefones, emails, profissao, numAgencia, tipoCliente, cartaoCidadao);		
		Cliente cliente2 = new Cliente(nome, morada, telefones, emails, profissao, numAgencia, tipoCliente, cartaoCidadao);		
		
		assertFalse(cliente1.equals(cliente2));
		
	}
	
}
