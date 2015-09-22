
public class Ponto {

	private int pontoX, pontoY;
	
	public Ponto(){ pontoX = 0; pontoY = 0;}
	public Ponto(int x, int y){ pontoX = x; pontoY = y;}
	public Ponto(Ponto point){ pontoX = point.get_pontoX(); pontoY = point.get_pontoY();}
	public void set_pontoX(int x){ pontoX = x;}
	public void set_pontoY(int y){ pontoY = y;}
	public int get_pontoX(){ return(pontoX);}
	public int get_pontoY() {return(pontoY);}
	public int distanciaPonto(int a1,int a2,int b1,int b2){sqrt(pow(a2-a1,2)+pow(b2-b1,2))}
	}
