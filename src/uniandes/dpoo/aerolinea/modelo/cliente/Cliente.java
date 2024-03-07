package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	
	private List<Tiquete> tiquetesSinUsar;
	
	private List<Tiquete> tiquetesUsados;
	
	public Cliente() {
		tiquetesSinUsar = new ArrayList<Tiquete>();
		tiquetesUsados = new ArrayList<Tiquete>();
	}
	
	public abstract String getTipoCliente();
	
	public abstract String getItentificador();
	
	public void agregarTiquete(Tiquete tiquete) {
		tiquetesSinUsar.add(tiquete);
	}
	
	public int calcularValorTotalTiquetes() {
		
		int tarifa = 0;
		
		for(Tiquete tiquet : tiquetesSinUsar ) {
			tarifa = tarifa + tiquet.getTarifa();
		}
		return tarifa;
				
	}
	
	public void usarTiquetes(Vuelo vuelo) {
		
		Map<String, Tiquete> tiquetes = vuelo.getTiquete();
		List<Tiquete> listaTiquetes = new ArrayList<>(tiquetes.values());
		int i = 0;
		for(Tiquete tiquete : tiquetesSinUsar) {
			if(listaTiquetes.contains(tiquete)) {
				tiquetesSinUsar.remove(i);
				tiquetesUsados.add(tiquete);
			}
			i++;
		}
	}
}
