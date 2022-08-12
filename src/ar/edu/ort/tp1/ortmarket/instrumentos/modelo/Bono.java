package ar.edu.ort.tp1.ortmarket.instrumentos.modelo;

public class Bono extends InstrumentoFinanciero implements Apreciable{
	private double interes;
	private double valorNominal;

	public Bono(String codigo, String nombre, String emisor,  double interes, double valorNominal) {
		super(codigo, nombre, emisor);
		this.interes = interes;
		this.valorNominal = valorNominal;
	}

	@Override
	public double obtenerPrecio() {
		// TODO Auto-generated method stub
		return valorNominal * (interes / 100);
	}

	// TODO: A COMPLETAR

}
