package package1;

public class Circulo3 {

	public long radio, radioNuevo;
	
	public Circulo3 (long radio){
		this.radio = radio;
	}
	
	public Circulo3() {
		this(177800);
	}
	
	public double calculaArea(long radio) {
		return Math.PI*radio*radio;
	}
	
	public double calculaCircunferencia(long radio) {
		return Math.PI*radio*2;
	}
}
