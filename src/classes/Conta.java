package classes;

public class Conta {
	private int agencia;
	private int conta;
	private float saldo;
	
	public Conta(int agencia, int conta, float saldo)
	{
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
}
