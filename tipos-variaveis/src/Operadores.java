public class Operadores {

    public static void main(String[] args) {
    
        String nomeCompleto = "Thalita" + "Meira";

        System.out.println (nomeCompleto);

        int numero = 5;

        numero= - numero;

        System.out.println(numero);

        numero = numero * -1;
        
        System.out.println(numero);

        //x repetição

        int numero2 = 5;

        numero2++;

        //numero2 = numero + 1;

        System.out.println(numero2);

        //operador ternário
        int a,b;

        a = 5;
        b = 6;
    
        //String resultado = "";
        // if(a==b)
        //     resultado =  "verdadeiro";
        // else
        //     resultado = "falso";

        String resultado = a==b ?"verdadeiro" : "falso";

        System.out.println(resultado);



    }
}
