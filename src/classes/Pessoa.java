package classes;

public abstract class Pessoa {

	private String nome;
	private String email;
	private int telefone;

	public Pessoa(){
		nome = "Sem nome";
	}

	public Pessoa(String nome, String email, int telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
}
