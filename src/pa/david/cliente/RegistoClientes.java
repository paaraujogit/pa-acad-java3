package pa.david.cliente;

import java.util.ArrayList;
import java.util.List;

import pa.comum.Pessoa;
import pa.david.Cartao;
import pa.david.TipoCliente;
import pa.hugo.Conta;

public class RegistoClientes{
	
	private List<Cliente> clientes = new ArrayList<>();
	private List<Conta> contas = new ArrayList<>();
	private List<Cartao> cartoes = new ArrayList<>();
	private static int numConta = 0;
	
	
	/**
	 * <a>Simula o Registo de Cliente, bem como a criação de uma Conta à Ordem e do primeiro Cartão de Débito associado a essa Conta. <a>
	 * */
	private void registarCliente(Cliente cliente) {
		
		contas.add(new Conta(++numConta, cliente, "Ordem", 50, new ArrayList<Double>()));
		cartoes.add(new Cartao());
		clientes.add(cliente);
	}	
	

	public void registarCliente(Pessoa pessoa, int numAgencia, TipoCliente tipoCliente) {
		
		Cliente cliente = new Cliente(pessoa, numAgencia, tipoCliente);		
		registarCliente(cliente);
	}
	

	public void registarCliente(int cartaoCidadao, String nome, String morada, String[] telefone, String[] emails, String profissao, 
			   int numAgencia, TipoCliente tipoCliente) {
		
		Pessoa pessoa = new Pessoa(cartaoCidadao, nome, morada, telefone, emails, profissao);
		Cliente cliente = new Cliente(pessoa, numAgencia, tipoCliente);		
		registarCliente(cliente);		
	}	
	
	public List<Cliente> getClientes() {
		return clientes;
	}

	public void removerCliente(Cliente cliente) {
		clientes.remove(cliente);
	}

}


