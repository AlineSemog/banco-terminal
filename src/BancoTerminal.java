public class BancoTerminal {
    public static void main(String[] args) {
        // Primeiro caso
        double saldo = 25;
        double valorSolicitado = 18;

        // Verificar se o saldo é suficiente para o saque
        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }

        // Imprimir o saldo atual
        System.out.println("Saldo atual: " + saldo);

        // Segundo caso
        saldo = 15;
        valorSolicitado = 22;

        // Verificar se o saldo é suficiente para o saque
        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }

        // Imprimir o saldo atual
        System.out.println("Saldo atual: " + saldo);
    }
}
