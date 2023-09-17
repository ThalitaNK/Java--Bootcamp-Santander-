public class TiposVariaveis {
    public static void main(String[] args) {
        
        String meuNome = "Thalita Meira";



        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        final double VALOR_DE_PI = 3.14;

        var imprimindoVariaveis = meuNome + numero + VALOR_DE_PI + numeroCurto2;
        
        System.out.println(imprimindoVariaveis);
       

    }
}
