package pa.hugo;

import pa.david.cliente.Cliente;
import pa.david.TipoCliente;

public class Main {

	public static void main(String[] args) {
		
		String nome = "Cliente_David";
		String[] telefones = new String[]{"123456789"};
		String morada = "Nuremberga";
		String[] emails = new String[] {"d.casimiro@gmail.com"};
		String profissao = "Programador Java";
		int numAgencia = 1;
		TipoCliente tipoCliente = TipoCliente.NORMAL;
		int cartaoCidadao = 11009900;
		//Clientes exemplo.
		Cliente cliente1 = new Cliente(cartaoCidadao, nome, morada, telefones, emails, profissao, numAgencia, tipoCliente);		

		
		Conta ct = new Conta();
		ct.setProprietario(cliente1);
		ct.setTipoConta("ordem");
		ct.criarMovimentos();
		ct.adicionarMovimento(200.0);
		System.out.println("Olá:\n");
		System.out.println(ct.getMovimentos());
		
	}

}
