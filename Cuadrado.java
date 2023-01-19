package package1;

public class Cuadrado {
	
	public long longitud;
	
	public Cuadrado(long longitud) {
		this.longitud = longitud;
	}
	public long calculaArea(long longitud) {
		return longitud*longitud;
	}
	public long calculaPerim(long longitud) {
		return longitud*4;
	}
	public double calculaDiag(long longitud) {
		return Math.sqrt(2*longitud*longitud);
	}

}
