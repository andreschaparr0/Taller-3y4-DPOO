package uniandes.dpoo.aerolinea.modelo;

import java.util.HashMap;
import java.util.Map;

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
	
	public int venderTiquete(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
		return -1;
	}
	
	public boolean equals(Object obj) {
		return false;
	}
	
}
