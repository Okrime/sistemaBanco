package classes;

public class Endereco extends Pessoa {
	private String logradouro;
	private String numero;
	private String complemento;
	private String CEP;
	private String cidade;
	private String estado;

	public Endereco()
	{
		super();
	}
		
	public Endereco(String nomeLogradouro, String numero, 
			int idCidade, String complemento, String CEP,
			String cidade, String estado)
	{
		this.logradouro = nomeLogradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.CEP = CEP;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getLogradouro()
	{
		return logradouro;
	}

	public void setLogradouro(String nomeLogradouro)
	{
		this.logradouro = nomeLogradouro;
	}

	public String getNumero()
	{
		return numero;
	}

	public void setNumero(String numero)
	{
		this.numero = numero;
	}


	public String getComplemento()
	{
		return complemento;
	}

	public void setComplemento(String complemento)
	{
		this.complemento = complemento;
	}

	public String getCEP()
	{
		return CEP;
	}

	public void setCEP(String CEP)
	{
		this.CEP = CEP;
	}
	
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
