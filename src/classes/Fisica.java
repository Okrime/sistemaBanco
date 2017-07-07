package classes;

import java.util.Date;

public class Fisica extends Pessoa {

		private String CPF;
		private String RG;
		private Date dataNascimento;
		private String EstadoCivil;
		private String sexo;

		public Fisica(){
			super();
		}

		public Fisica(String cPF, String rG, Date dataNascimento,
				String EstadoCivil, String sexo) {
			super();
			CPF = cPF;
			RG = rG;
			this.dataNascimento = dataNascimento;
			this.EstadoCivil = EstadoCivil;
			this.sexo = sexo;
		}

		public String getCPF() {
			return CPF;
		}

		public void setCPF(String cPF) {
			CPF = cPF;
		}

		public String getRG() {
			return RG;
		}

		public void setRG(String rG) {
			RG = rG;
		}

		public Date getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(Date dataNascimento) {
			this.dataNascimento = dataNascimento;
		}

		public String getEstadoCivil() {
			return EstadoCivil;
		}

		public void setEstadoCivil(String EstadoCivil) {
			this.EstadoCivil = EstadoCivil;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}


}
