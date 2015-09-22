
public class Circulo extends Ponto
{
	public static final double PI = 3.14;
	private int centrox;
	private int centroy;
	private int raio;

	public Circulo(int x, int y){ centrox = x; centroy = y;    raio = 1;}        
	public Circulo(int r){ centrox = 0; centroy = 0; raio = r;}
	public Circulo(int x, int y, int r){ centrox = x; centroy = y; raio = r;}
	public Circulo(Circulo circ){ centrox = circ.get_centrox(); centroy = circ.get_centroy(); raio = circ.get_raio();}
	public Circulo(Ponto point, int r){centrox = point.get_pontoX(); centroy = point.get_pontoY(); raio = r; }
	public Circulo(int d, Ponto point){centrox = point.get_pontoX(); centroy = point.get_pontoY(); raio = d/2; }
	public void set_centrox(int x){centrox = x;}
	public void set_centroy(int y){centroy = y;}
	public void set_raio(int r){ raio = r;}
	public int get_centrox(){ return centrox;}
	public int get_centroy(){ return centroy;}
	public int get_raio(){ return raio;}
	public double area(){ return(PI*raio*raio);}
	public double circunferencia(){ return(2*(PI*raio));}
	public int diametro(){return(2*raio);}
	public void moveCirculo(int x, int y){ centrox = x; centroy = y;}
	public void aumentaCirculo(){ centrox++; centroy++;}
	public void diminuiCirculo(){ centrox--; centroy--;}
	public void representacaoCirculo(){ System.out.println("Raio do Circulo = " + raio + " e Ponto Central = (" + centrox + ", " + centroy + ")");}

	public static void main (String[] args){
		Circulo bola, bolinha;
		bola = new Circulo(4, 6, 10);
		bolinha = new Circulo(bola);
		System.out.println("Circulo 1: Ponto X = " + bolinha.get_centrox() + " Ponto Y = " + bolinha.get_centroy());
		System.out.println("Circulo 1: Diametro = " + bolinha.diametro());
		System.out.println("Circulo 1: Area = " + bolinha.area());
		System.out.println("Circulo 1: Circunferencia = " + bolinha.circunferencia());
		bolinha.representacaoCirculo();
		Ponto test;
		test = new Ponto(5,4);
		Circulo redondo, batatinha;
		redondo = new Circulo(test, 7);
		batatinha = new Circulo(16, test);
		System.out.println("Circulo 2: Ponto X = " + redondo.get_centrox() + " Ponto Y = " + redondo.get_centroy() + " Raio =  " + redondo.get_raio() );
		System.out.println("Circulo 1: Ponto X = " + batatinha.get_centrox() + " Ponto Y = " + batatinha.get_centroy() + " Raio = " + batatinha.get_raio());
	}

}