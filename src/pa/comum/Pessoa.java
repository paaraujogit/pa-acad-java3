package pa.comum;

public class Pessoa {

	protected Integer cartaoCidadao;
	protected String nome;
	protected String morada;
	protected String[] telefone;
	protected String[] emails;
	protected String profissao;
		
	public Pessoa(Integer cartaoCidadao, String nome, String morada, String[] telefone, String[] emails, String profissao) {

		this.cartaoCidadao = cartaoCidadao;		
		this.nome = nome;
		this.morada = morada;
		this.telefone = telefone;
		this.emails = emails;
		this.profissao = profissao;
	}

	public Integer getCartaoCidadao() {
		return cartaoCidadao;
	}
	public void setCartaoCidadao(int cartaoCidadao) {
		this.cartaoCidadao = cartaoCidadao;
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
	
	public boolean equals(Pessoa p) {
		return this.cartaoCidadao.equals(p.getCartaoCidadao());
	}
}
