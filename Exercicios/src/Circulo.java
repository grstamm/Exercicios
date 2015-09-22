
public class Circulo
{
public static final double PI = 3.14;
private int centrox;
private int centroy;
private int raio;

public Circulo(int x, int y){ centrox = x; centroy = y;    raio = 1;}        
public Circulo(int r){ centrox = 0; centroy = 0; raio = r;}
public Circulo(Circulo circ){ centrox = circ.get_centrox(); centroy = circ.get_centroy(); raio = circ.get_raio();}
public Circulo(Ponto point, int r){centrox = point.get_pontoX(); centroy = point.get_pontoY(); raio = r; }
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
public void representacaoCirculo(){ System.out.println("Raio do Circulo = " + raio); System.out.println("Ponto Central = (" + centrox + ", " + centroy + ")"); }
}