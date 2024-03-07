package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas {
	
	public static final double IMPUESTO = 0.28;
	
	public int calcularTarifa (Vuelo vuelo, Cliente cliente){
		int costoBase = calcularCostoBase(vuelo, cliente);
		
		double descuentoPorcentaje = calcularPorcentajeDescuento(cliente);
		
		int descuento = (int)(costoBase * descuentoPorcentaje );
		
		int costoBaseTotal = costoBase - descuento;
		
		int impuestos = calcularValorImpuestos(costoBaseTotal);
		
		int tarifaTotal = costoBaseTotal + impuestos;
		
		return tarifaTotal;
	}

	protected abstract int calcularCostoBase (Vuelo vuelo, Cliente cliente);
	
	protected abstract double calcularPorcentajeDescuento(Cliente cliente);
	
	public int calcularDistanciaVuelo(Ruta ruta) {
		
		Aeropuerto destino = ruta.getDestino();
		Aeropuerto origen = ruta.getOrigen();
		
		int distancia = Aeropuerto.calcularDistancia(origen, destino);
		
		return distancia;
	}
	
	public int calcularValorImpuestos(int costoBase) {
		return (int)(IMPUESTO * costoBase);
	}
	
}
