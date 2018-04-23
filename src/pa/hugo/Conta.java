package pa.hugo;

import java.util.*;
import pa.david.Cliente;

public class Conta {
	
	int numeroConta;
	Cliente proprietario;
	String tipoConta; // Ordem - Prazo -
	double saldo = 0.0;
	ArrayList<Double> movimentos;
	
	Conta(int num, Cliente cl, String tc,double saldo, ArrayList<Double> movimentos) {
		this.numeroConta = num;
		this.proprietario = cl;
		this.tipoConta = tc;
		this.saldo = saldo;
		this.movimentos = movimentos ;
	}
	
	Conta(){
		
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public Cliente getProprietario() {
		return proprietario;
	}
	
	public void setProprietario(Cliente proprietario) {
		this.proprietario = proprietario;
	}
	
	public String getTipoConta() {
		return tipoConta;
	}
	
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public ArrayList<Double> getMovimentos() {
		return movimentos;
	}

	public void setMovimentos(ArrayList<Double> movimentos) {
		this.movimentos = movimentos;
	}



	public boolean verificar(Cliente cl) {
		return this.getProprietario() == cl;
		
	}
	public ArrayList<Double> criarMovimentos() {
		 return this.movimentos = new ArrayList<>();
	}
	public void adicionarMovimento(double d) {
		this.movimentos.add(d);
	}
	
	@Override
	public String toString() {
		String res="";
		
		res+="Conta: "+numeroConta+"\n";
		res+="Proprietario: "+proprietario+"\n";
		
		return res;
	}
}
