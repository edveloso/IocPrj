package visao;

import modelo.Funcionario;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import controle.Impressora;

public class Form2 {

	public static void main(String[] args) {
		
	ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
	Impressora print = ctx.getBean(Impressora.class);
	
	Funcionario func = ctx.getBean(Funcionario.class);
	func.setNome("jose");
	func.setSalario(1000d);
	print.imprimeContraCheque();
	
	
		
	}
	
}
