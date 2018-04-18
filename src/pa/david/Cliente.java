package pa.david;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	enum TipoCliente{NORMAL, VIP};
	
	int numAgencia;
	long numCliente;
	TipoCliente tipoCliente;
	String nome;
	int cartaoCidadao;
	String morada;
	String[] telefone;
	String[] emails;
	String profissao;
	List<Conta> contas;
	List<Cartao> cartoes;	
	String gestorConta;

	
	
	public Cliente(int numAgencia, long numCliente, TipoCliente tipoCliente, String nome, int cartaoCidadao,
			String morada, String[] telefone, String[] emails, String profissao) {
		super();
		this.numAgencia = numAgencia;
		this.numCliente = numCliente;
		this.tipoCliente = tipoCliente;
		this.nome = nome;
		this.cartaoCidadao = cartaoCidadao;
		this.morada = morada;
		this.telefone = telefone;
		this.emails = emails;
		this.profissao = profissao;
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCartaoCidadao() {
		return cartaoCidadao;
	}
	public void setCartaoCidadao(int cartaoCidadao) {
		this.cartaoCidadao = cartaoCidadao;
	}
	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
	}
	public String[] getTelefone() {
		return telefone;
	}
	public void setTelefone(String[] telefone) {
		this.telefone = telefone;
	}
	public String[] getEmails() {
		return emails;
	}
	public void setEmails(String[] emails) {
		this.emails = emails;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
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
