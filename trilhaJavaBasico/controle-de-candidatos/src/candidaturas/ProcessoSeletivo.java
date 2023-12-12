package candidaturas;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		for (String candidato : candidatos) {
			entrandoEmContato(candidato);			
		}
	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else 
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			
		} while(continuarTentando && tentativasRealizadas < 3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
		else 
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO DE TENTATIVA " + tentativasRealizadas + " REALIZADA");
	}
	
	// metodo auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	static void imprimirSelecionados() {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
	
		for (int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de nº " + (indice + 1) + " é " + candidatos[indice]);
		}
		
		for(String candidato : candidatos) {
			System.out.println("O candidato selecionado foi: " + candidato);
		}
	}
	
	static void selecaoCandidatos() {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO","MONICA","FABRICIO", "MIRELA", "DANIELA", "JORGE"};
		int candidatoSelecionado = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while (candidatoSelecionado < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatoSelecionado++;
			}
			candidatoAtual++;
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 22000);
	}
	
	static void analisarCandidado(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA CANDIDADO");
		} else if(salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA CANDIDADO COM CONTRA PROPOSTA");
		}else {
			System.out.println("AGUARDANDO DEMAIS CANDIDADO");
		}
	}
}
