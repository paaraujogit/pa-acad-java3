package pa.david;

import java.util.ArrayList;
import java.util.List;

import pa.comum.Pessoa;

public class Cliente extends Pessoa{


	
	int numAgencia;
	Long numCliente;
	TipoCliente tipoCliente;
	List<Conta> contas;
	List<Cartao> cartoes;	
	String gestorConta;
	private static long contador = 0;
	
	public Cliente(int cartaoCidadao, String nome, String morada, String[] telefone, String[] emails, String profissao, 
				   int numAgencia, TipoCliente tipoCliente) {

		super(cartaoCidadao, nome, morada, telefone, emails, profissao);
		inicializacao(numAgencia, tipoCliente);				
	}
	
	public Cliente(Pessoa p, int numAgencia, TipoCliente tipoCliente) {
		super(p.getCartaoCidadao(), p.getNome(), p.getMorada(), p.getTelefone(), p.getEmails(), p.getProfissao());
		inicializacao(numAgencia, tipoCliente);
	}
	
	private void inicializacao(int numAgencia, TipoCliente tipoCliente) {
		
		this.numAgencia = numAgencia;
		this.numCliente = ++contador;	//Atribuição única do Num de Cliente.
		this.tipoCliente = tipoCliente;
		this.contas = new ArrayList<Conta>();		
		this.cartoes = new ArrayList<Cartao>();
		
		this.contas.add(new Conta(/*Conta.CONTA_ORDEM*/));	//Criacao Automatica da Conta a Ordem.
		this.cartoes.add(new Cartao(/*Cartao.CARTAO_DEBITO*/)); //Cartao Automatica do 1º Cartao Debito.
		
		if( tipoCliente.equals(TipoCliente.VIP)) {
			//this.gestorConta = new GestorConta();
		}
	}
	
	public int getNumAgencia() {
		return numAgencia;
	}
	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}
	public Long getNumCliente() {
		return numCliente;
	}
	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	public List<Conta> getContas() {
		return contas;
	}
	public void setCartoes(List<Cartao> cartoes) {
		this.cartoes = cartoes;
	}
	public List<Cartao> getCartoes() {
		return cartoes;
	}
	
	public void cancelarCartao(Cartao c) {
		cartoes.remove(c);
	}

	public void adicionarCartao(Cartao c) {
		cartoes.add(c);
	}	
	
	public String getGestorConta() {
		return gestorConta;
	}
	
	public boolean equals(Cliente c) {
		return this.numCliente.equals(c.numCliente);
	}
	
	
}
