public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTV smartTV = new SmartTV();

        System.out.println("Tv ligada ?" +SmartTV.ligada);
        System.out.println("Canal atual :" +SmartTV.canal);
        System.out.println("volume Atual :"+SmartTV.volume);
 
        smartTV.ligar();
 System.out.println("Novo Status -> TV ligada ?" + SmartTV.ligada);
  
 SmartTV.desligar();
 System.out.println("Novo Status -> TV Ligada ?" + SmartTV.ligada);
    }
}
