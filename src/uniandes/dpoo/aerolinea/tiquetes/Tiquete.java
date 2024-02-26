package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
	
	private String codigo;
	
	private int tarifa;
	
	private boolean usado;
	
	private Vuelo vuelo;
	
	private Cliente cliente;
	
	public Tiquetes(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa) {
		
		this.codigo = codigo;
		this.vuelo = vuelo;
		this.cliente = clienteComprador;
		this.tarifa = tarifa;
				
	}

	private String getCodigo() {
		return codigo;
	}

	private int getTarifa() {
		return tarifa;
	}

	private boolean esUsado() {
		return usado;
	}

	private Vuelo getVuelo() {
		return vuelo;
	}

	private Cliente getCliente() {
		return cliente;
	}
	
	private void marcarComoUsado() {
		usado = false;
	}
}
