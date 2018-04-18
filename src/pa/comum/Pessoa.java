package pa.comum;

public class Pessoa {

	protected String nome;
	protected String morada;
	protected String[] telefone;
	protected String[] emails;
	protected String profissao;
		
	public Pessoa(String nome, String morada, String[] telefone, String[] emails, String profissao) {
		super();
		this.nome = nome;
		this.morada = morada;
		this.telefone = telefone;
		this.emails = emails;
		this.profissao = profissao;
	}
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
}
