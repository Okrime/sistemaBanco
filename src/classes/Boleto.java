package classes;

import java.util.Date;

public class Boleto {
	private int codigo;
	private Date dataEmissao;
	private Date dataVencimento;
	
	public Boleto(int codigo, Date dataEmissao, Date dataVencimento)
	{
		this.codigo = codigo;
		this.dataEmissao = dataEmissao;
		this.dataVencimento = dataVencimento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	
}
