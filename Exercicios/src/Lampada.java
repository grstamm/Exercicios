import java.util.Random;


public class Lampada {
	private int estado;
	private int potencia, voltagem;
	
	public Lampada(){estado = 0; potencia = 40; voltagem = 220;}
	public Lampada(int x, int y){estado = 2; potencia = x; voltagem = y;}
	public void ligar(){ Random random = new Random(); int x = random.nextInt(3); if(x == 0){ estado = 2; } else {estado = 1;};}
	public void desligar() {estado = 0;}
	public void queimar() {estado = 2;}
	public int get_voltagem() {return voltagem;}
	public int get_potencia() {return potencia;}
	public void set_voltagem(int x) {voltagem = x;}
	public void set_potencia(int y) {potencia = y;}
	public void atual() {
		if(estado == 1) {
			System.out.println("Lampada está ligada");}
		else if(estado == 0) {
			System.out.println("Lampada está desligada");}
		else  {
			System.out.println("Lampada está queimada");}
		}
	public static void main (String[] args){
		Lampada lamp;
		lamp = new Lampada();
		lamp.atual();
		lamp.ligar();
		lamp.atual();
		lamp.queimar();
		lamp.atual();
		System.out.println("Voltagem = " + lamp.get_voltagem() + "V");
		System.out.println("Potencia = " + lamp.get_potencia() + "W");
		
	}
		
	
}
