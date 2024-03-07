package uniandes.dpoo.aerolinea.modelo;

import java.util.HashMap;
import java.util.Map;

import uniandes.dpoo.aerolinea.exceptions.VueloSobrevendidoException;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
	
	private String fecha;
	
	private Avion avion;
	
	private Ruta ruta;
	
	public Map<String, Tiquete> tiquete;
	
	public Vuelo(Ruta ruta, String fecha, Avion avion) {
		this.avion = avion;
		this.fecha = fecha;
		this.ruta = ruta;
		tiquete = new HashMap<String, Tiquete>();
			
	}

	public String getFecha() {
		return fecha;
	}

	public Avion getAvion() {
		return avion;
	}

	public Ruta getRuta() {
		return ruta;
	}

	public Map<String, Tiquete> getTiquete() {
		return tiquete;
	}
	
	public int venderTiquete(Cliente cliente, CalculadoraTarifas calculadora, int cantidad)throws VueloSobrevendidoException {
		
		int precioTiquete = 0; 
		
        if (avion.getCapacidad() < tiquete.size()+cantidad) {
            throw new VueloSobrevendidoException(this);
        }
        else {
        	precioTiquete = calculadora.calcularTarifa(this, cliente);
        }
        int precioTotal = precioTiquete*cantidad;
		return precioTotal;
	}
	

	public boolean equals(Object obj) {
	    // Verificar si el objeto es una instancia de Vuelo
	    if (obj instanceof Vuelo) {
	        Vuelo otroVuelo = (Vuelo) obj; // Realizar un casting del objeto a Vuelo

	        // Comparar los atributos relevantes para determinar si los vuelos son iguales
	        return this.fecha.equals(otroVuelo.getFecha()) && this.avion.equals(otroVuelo.getAvion()) && this.ruta.equals(otroVuelo.getRuta());
	    }
	    return false; // Si el objeto no es una instancia de Vuelo, no son iguales
	}

	
}
