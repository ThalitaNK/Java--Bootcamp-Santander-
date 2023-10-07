import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {

        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.00);

    }

    static void selecaoCandidatos() {

        // Array com a lista de candidatos

        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
                "DANIELA", "JORGE" };
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase=2000.0;
        while(candidatosSelecionados < 5) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;

        }

    }

    // Método que simula o valor pretendido

    static double valorPretendido() {
     return ThreadLocalRandom.current().nextDouble(1800, 2200);
}

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS.");

        }

    }
}
