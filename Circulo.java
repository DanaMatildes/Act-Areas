package package1;

public class Circulo {
	public long radio;
	
	public Circulo (long radio) {
		this.radio = radio;
	}
	
	public double calculaArea(long radio) {
		return Math.PI*(radio*radio);
	}
	
	public double calculaCircunferencia(long radio) {
		return Math.PI*radio*2;
	}


}
