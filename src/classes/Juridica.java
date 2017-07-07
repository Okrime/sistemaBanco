package classes;

public class Juridica extends Pessoa {

	private String CNPJ;

	public Juridica(){
		super();
	}

	public Juridica(String nomeFantasia, String cNPJ, String razaoSocial) {
		super();
		CNPJ = cNPJ;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

}
