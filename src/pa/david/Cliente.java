package pa.david;

import java.util.ArrayList;
import java.util.List;

import pa.comum.Pessoa;

public class Cliente extends Pessoa{

	enum TipoCliente{NORMAL, VIP};
	
	int numAgencia;
	long numCliente;
	TipoCliente tipoCliente;
	int cartaoCidadao;
	List<Conta> contas;
	List<Cartao> cartoes;	
	String gestorConta;
	
	public Cliente(String nome, String morada, String[] telefone, String[] emails, String profissao, 
					  int numAgencia, long numCliente, TipoCliente tipoCliente, int cartaoCidadao) {

		super(nome, morada, telefone, emails, profissao);
		
		this.numAgencia = numAgencia;
		this.numCliente = numCliente;
		this.tipoCliente = tipoCliente;
		this.cartaoCidadao = cartaoCidadao;
		this.contas = new ArrayList<Conta>();		
		this.cartoes = new ArrayList<Cartao>();
		
		this.contas.add(new Conta());	//Conta à Ordem
		this.cartoes.add(new Cartao()); //Cartao de débito
		
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
	public long getNumCliente() {
		return numCliente;
	}
	public void setNumCliente(long numCliente) {
		this.numCliente = numCliente;
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
	public String getGestorConta() {
		return gestorConta;
	}
	public void setGestorConta(String gestorConta) {
		this.gestorConta = gestorConta;
	}
	
	
	
}
