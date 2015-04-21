package modelo;




public class FuncionarioHorista extends Funcionario {

	private Integer horasTrabalhadas;

	public Integer getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	@Override
	public Double getSalario() {
		return super.getSalario() * horasTrabalhadas;
	}

	
	
}
