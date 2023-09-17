public class Comentarios {

    // comentário única linha

    /*comentário 
     * multi
     * linha
     */

     /**Duas estrelinhas para documentar
      * metodos
      *com facilidade
      */

    public void metodo(){

    }

    //O QUE NÃO FAZER: ADOTAR O USO DE COMENTÁRIOS NÃO EXCLUI A NECESSIDADE DO USO DAS BOAS PRÁTICAS NA HORA DE CODAR!!!
    /*
 * Este método foi elaborado as pressas
 * por isso eu abreviei o nome das variáveis
 * mas olha, ele tem a finalidade de somar ou  multiplicar
 * dois números
 */
    public int somaMultiplica (int n, int x, String m){
    int r = 0; // r é igual ao resultado
    if (m == "M"){ // M= multiplicação
        r= n * x;
    }else{
        // se não soma mesmo
        r = n + x;
    }
    return r;
}

    
}
