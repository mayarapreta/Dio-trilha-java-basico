public class SmartTV {
static boolean ligada = false;
static int canal = 1;
static int  volume = 25;

public voi mudarCanal (int novoCanal){
	canal = novoCanal;
}

public void aumentarCanal(){
	canal++;
}

public void diminuirCanal(){
	canal--;
}
public void aumentarCanal(){

	aumentar++;

	System.out.println("Aumentando o volume para: "+ volume);
}
//volume = volume+1;


public void diminuirVolume(){
	System.out.println("Diminuirndo o volume para: "+volume);
}
public void ligar() {
ligada= true;
	
}


public void desligar(){
	boolean desligar = false;
}
}