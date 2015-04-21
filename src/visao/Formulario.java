package visao;

import modelo.Funcionario;
import modelo.FuncionarioHorista;
import modelo.FuncionarioMensalista;
import controle.Impressora;

public class Formulario {

	
	//IOC - inversion of control
	//DI - dependency injection
	
	
	public static void main(String[] args) {
		Impressora print = new Impressora();
		
		Funcionario func = new FuncionarioMensalista();
		func.setNome("Antonio");
		func.setSalario(1000d);
		print.setFunc(func);
		
		//injeção de dependência
		print.imprimeContraCheque();
		
		//acoplamento
		func = new FuncionarioHorista();
		func.setNome("Jose");
		func.setSalario(20d);
		((FuncionarioHorista)func).setHorasTrabalhadas(160);
		
		print.setFunc(func);
		print.imprimeContraCheque();
		
		
	}
	
}
