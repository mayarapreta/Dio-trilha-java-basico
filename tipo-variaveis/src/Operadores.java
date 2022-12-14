public class Operadores {
  /**
   *@param args
   */
  public static void main(String[] args) {


/*operadores logicos tabelas verdades */

 boolean condicao1= true;
 boolean condicao2= true;

 if(condicao1 && condicao2){
  System.out.println("As duas condiçoes sao verdadeira");

 }

 if (condicao1 || condicao2){
  System.out.println("Umas das condiçoes é verdadeiras");
 }
System.out.println("fim");



/* tambem podemos comparar os objetos */

/** String nomeUm  ="MAYA";
String nomeDois = new String("mayara");

System.out.println(nomeUm.equals(nomeDois));

    
    /* operadores relacionais */

/**int numero1 = 1;
  int numero2 = 2;

  boolean simNao = numero1 ==  numero2;

System.out.println ("numeroUm é igual a numeroDois?" + simNao);


   simNao = numero1 >=  numero2;

  System.out.println ("numeroUm é maior que o numeroDois?" + simNao);

     /** ternario if else/ ?/: */
  /**int a , b ;
  a = 6;
  b=6;
  // esta empresao sao booleana ex: if else 
   String resultado = a==b ?"verdadeira" : "false";
  
System.out.print(resultado);

/**repedicao 
var variavel = true;

variavel = !variavel;

System.out.println( variavel);*/



  /*int numero = 5;

  numero = - numero;

  System.out.println( - numero);

   numero = numero * -1;

   System.out.println(numero);
  

     String concatenacao ="?";

      concatenacao = 1+1+1+"1";

      System.out.println(concatenacao);
      concatenacao = 1+"1"+1;

      System.out.println(concatenacao);
      concatenacao = 1+"1"+1+"1";

      System.out.println(concatenacao);
 
      concatenacao = "1"+1+1+1;

      System.out.println(concatenacao);

      concatenacao = "1"+(1+1+1);**/

     
  }
}
