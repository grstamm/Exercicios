
public class Ponto {

	private int pontoX, pontoY;
	
	public Ponto(){ pontoX = 0; pontoY = 0;}
	public Ponto(int x, int y){ pontoX = x; pontoY = y;}
	public Ponto(Ponto point){ pontoX = point.get_pontoX(); pontoY = point.get_pontoY();}
	public void set_pontoX(int x){ pontoX = x;}
	public void set_pontoY(int y){ pontoY = y;}
	public int get_pontoX(){ return(pontoX);}
	public int get_pontoY() {return(pontoY);}
	public double distanciaPonto(int a1,int a2,int b1,int b2){return(Math.sqrt(Math.pow(a2-a1,2)+Math.pow(b2-b1,2)));}
	public double distanciaPonto(Ponto point, int x, int y){return(Math.sqrt(Math.pow(x-point.get_pontoX(),2)+Math.pow(y-point.get_pontoY(),2)));}
	public double distanciaPonto(Ponto point) {return(Math.sqrt(Math.pow(1-point.get_pontoX(),2)+Math.pow(1-point.get_pontoY(),2)));}

	public static void main (String[] args){
		Ponto point, pointer;
		point = new Ponto(4,8);
		pointer = new Ponto(point);
		System.out.println("Resultado: "+point.distanciaPonto(1,2,3,4));
		System.out.println(pointer.get_pontoX() + " "+ " " + pointer.get_pontoY());
		
	}
}
