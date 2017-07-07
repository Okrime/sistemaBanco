package classes;

import java.util.Date;

public class Funcionario extends Fisica {

	private int funcionarioId;
	private Date dataContratacao;
	private double salario;
	
	public int getfuncionarioId(){
		return funcionarioId;
	}

	public Funcionario() {
		super();
	}

	public Funcionario(Date dataContratacao,
			double salario) {
		super();
		this.dataContratacao = dataContratacao;
		this.salario = salario;
	}

	public Date getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(Date dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
