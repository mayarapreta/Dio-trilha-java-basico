package edu.segundasemana;
public class MinhaClasse {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO document why this method is empty
String primeiroNome = "Maya";
String segundoNome= " santos";

String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
System.out.println(nomeCompleto);
  }

  public static String nomeCompleto (String primeiroNome, String segundoNome){
    return  "Resultado do metodo  " + primeiroNome.concat("").concat(segundoNome);
  }


}
