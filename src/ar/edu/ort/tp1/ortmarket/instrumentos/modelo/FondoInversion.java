package ar.edu.ort.tp1.ortmarket.instrumentos.modelo;

import ar.edu.ort.tp1.ortmarket.modelo.ListaInstrumentosPorCodigo;

public class FondoInversion extends InstrumentoFinanciero implements Apreciable {

	private int nroCuotaPartes;
	private ListaInstrumentosPorCodigo instrumentos;

	public FondoInversion(String codigo, String nombre, String emisor, int nroCuotaPartes) {
		super(codigo, nombre, emisor);
		this.nroCuotaPartes = nroCuotaPartes;
		this.instrumentos = new ListaInstrumentosPorCodigo();
	}

	// TODO: A COMPLETAR

	public void agregarInstrumento(InstrumentoFinanciero instrumentoFinanciero) {
		instrumentos.add(instrumentoFinanciero);
	}

	@Override
	public double obtenerPrecio() {
		// TODO: A COMPLETAR
		double total = 0;
		for (InstrumentoFinanciero instrumentoFinanciero : instrumentos) {
			total = total + instrumentoFinanciero.obtenerPrecio();
		}
		return total / nroCuotaPartes;
	}

}
