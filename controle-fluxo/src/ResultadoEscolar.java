// ResultadoEscolar.java
public class ResultadoEscolar {
    public static void main(String[] args) {

        int nota = 3;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";



        // String resultado = nota >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        // if (nota >= 7)
        //     System.out.println("Aprovado");
        // else if(nota > 5 && nota < 7)
        //     System.out.println("Em recuperação.");
        // else
        //     System.out.println("Reprovado");
    }
}