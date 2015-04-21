package controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import modelo.Funcionario;

@Component
public class Impressora {

	//depêndencia
	@Autowired
	private Funcionario func;
	
	public Impressora() {
		// TODO Auto-generated constructor stub
	}
	
	public void imprimeContraCheque(){
		System.out.println("+===========================+");
		System.out.println("| Nome: " + func.getNome() + "             |");
		System.out.println("+===========================+");
System.out.println("| Salário   " + func.getSalario() + "          |" );
		System.out.println("+===========================+");
	}


	public Funcionario getFunc() {
		return func;
	}



	public void setFunc(Funcionario func) {
		this.func = func;
	}
	
}
