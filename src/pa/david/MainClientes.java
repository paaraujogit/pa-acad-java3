package pa.david;

import pa.comum.Pessoa;
import pa.david.cliente.RegistoClientes;

public class MainClientes {	
	
	public static void main(String[] args) {

		//Recomenda-se que um Banco nao aceda directamente ao Objecto Cliente, mas através do seu RegistoClientes, 
		//visto que o Cliente esta obrigatoriamente associado a contas e a cartoes.
		RegistoClientes registoClientes = new RegistoClientes();		 
		
		//Cliente 1 exemplo.
		String nome = "David";
		String[] telefones = new String[]{"123456789"};
		String morada = "Nuremberga";
		String[] emails = new String[] {"d.casimiro@gmail.com"};
		String profissao = "Programador Java";
		int numAgencia = 1;
		TipoCliente tipoCliente = TipoCliente.NORMAL;
		int cartaoCidadao = 11009900;
		
		//Cliente 2 exemplo.
		String nome2 = "Hugo";
		String[] telefones2 = new String[]{"123456788"};
		String morada2 = "Nuremberga";
		String[] emails2 = new String[] {"hugo@gmail.com"};
		String profissao2 = "Programador Java";
		int numAgencia2 = 1;
		TipoCliente tipoCliente2 = TipoCliente.NORMAL;
		int cartaoCidadao2 = 11009901;
		
		//Cliente 3 exemplo.
		String nome3 = "Rui";
		String[] telefones3 = new String[]{"123456787"};
		String morada3 = "Nuremberga";
		String[] emails3 = new String[] {"rui@gmail.com"};
		String profissao3 = "Programador Java";
		int numAgencia3 = 1;
		TipoCliente tipoCliente3 = TipoCliente.NORMAL;
		int cartaoCidadao3 = 11009902;		

		//Cliente 4 exemplo.
		String nome4 = "David";
		String[] telefones4 = new String[]{"123456789"};
		String morada4 = "Nuremberga";
		String[] emails4 = new String[] {"d.casimiro@gmail.com"};
		String profissao4 = "Programador Java";
		int numAgencia4 = 1;
		TipoCliente tipoCliente4 = TipoCliente.NORMAL;
		int cartaoCidadao4 = 11009900;

		Pessoa rui = new Pessoa(cartaoCidadao3, nome3, morada3, telefones3, emails3, profissao3);
		
		//Clientes exemplo.
		registoClientes.registarCliente(cartaoCidadao, nome, morada, telefones, emails, profissao, numAgencia, tipoCliente);		
		registoClientes.registarCliente(cartaoCidadao2, nome2, morada2, telefones2, emails2, profissao2, numAgencia2, tipoCliente2);
		registoClientes.registarCliente(rui, numAgencia3, tipoCliente3);
		registoClientes.registarCliente(cartaoCidadao4, nome4, morada4, telefones4, emails4, profissao4, numAgencia4, tipoCliente4);
		
		
		
		System.out.println("Nome Cliente: "+registoClientes.getClientes().get(1).getNome());

	}

}
