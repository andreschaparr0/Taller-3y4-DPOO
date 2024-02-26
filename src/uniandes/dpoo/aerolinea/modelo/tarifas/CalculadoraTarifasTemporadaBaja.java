package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas {

	protected int COSTO_POR_KM_CORPORATIVO = 600;
	
	protected int COSTO_POR_KM_NATURAL = 900;
	
	protected double DESCUENTO_GRANDES = 0.02;
	
	protected double DESCUENTO_MEDIANAS = 0.1;
	
	protected double DESCUENTO_PEQ = 0.2;
	@Override
	protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected double calcularPorcentajeDescuento(Cliente cliente) {
		// TODO Auto-generated method stub
		return 0;
	}

}
