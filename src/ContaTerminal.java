public class ContaTerminal {
	    public static void main(String[] args) {
	        // Primeira execução
	        double saldo1 = 25;
	        double valorSolicitado1 = 18;

	        // Verifica se o saldo é maior que o valor solicitado
	        if (saldo1 >= valorSolicitado1) {
	            // Atualiza o saldo
	            saldo1 = saldo1 - valorSolicitado1;
	            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo1);
	        } else {
	            // Exibe mensagem de saldo insuficiente
	            System.out.println("Saldo insuficiente. Saque não realizado.");
	        }

	        // Segunda execução
	        double saldo2 = 15;
	        double valorSolicitado2 = 22;

	        // Verifica se o saldo é maior que o valor solicitado
	        if (saldo2 >= valorSolicitado2) {
	            // Atualiza o saldo
	            saldo2 = saldo2 - valorSolicitado2;
	            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo2);
	        } else {
	            // Exibe mensagem de saldo insuficiente
	            System.out.println("Saldo insuficiente. Saque não realizado.");
	        }
	    }
}