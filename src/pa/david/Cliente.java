package pa.david;

import java.util.ArrayList;
import java.util.List;

import pa.comum.Pessoa;

public class Cliente extends Pessoa{


	
	int numAgencia;
	Long numCliente;
	TipoCliente tipoCliente;
	int cartaoCidadao;
	List<Conta> contas;
	List<Cartao> cartoes;	
	String gestorConta;
	private static long contador = 0;
	
	public Cliente(String nome, String morada, String[] telefone, String[] emails, String profissao, 
					  int numAgencia, TipoCliente tipoCliente, int cartaoCidadao) {

		super(nome, morada, telefone, emails, profissao);
		
		this.numAgencia = numAgencia;
		this.numCliente = ++contador;	//Atribuição única do Num de Cliente.
		this.tipoCliente = tipoCliente;
		this.cartaoCidadao = cartaoCidadao;
		this.contas = new ArrayList<Conta>();		
		this.cartoes = new ArrayList<Cartao>();
		
		this.contas.add(new Conta());	//Criacao Automatica da Conta a Ordem.
		this.cartoes.add(new Cartao()); //Cartao Automatica do 1º Cartao Debito.
		
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

	public int getCartaoCidadao() {
		return cartaoCidadao;
	}
	public void setCartaoCidadao(int cartaoCidadao) {
		this.cartaoCidadao = cartaoCidadao;
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
