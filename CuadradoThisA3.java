package package1;

public class Cuadrado3 {

	public long lado, ladoNuevo;

	public Cuadrado3(long lado) {   
		this.lado = lado;
	}
	
	public Cuadrado3() {
		this(177800);
	}
	
	
	public long calculaArea(long lado) {
		return lado*lado;
	}
	
	public long calculaPerim(long lado) {
		return lado*4;
	}
	
	public double calculaDiag(long lado) {
		return Math.sqrt(2*lado*lado);
	}
}
