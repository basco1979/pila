package ar.edu.unlam.pb2;

public class PilaRecargable {
	
	private Double velocidadDeCarga;
	private Double consumo;
	private Double nivelDeCarga;
	private Integer nivelMaximoDeCarga = 100;
	private Integer cargasCompletas=0;
	private Integer consumoTotal=0;

	public PilaRecargable(Double velocidadDeCarga, Double consumo, Double nivelDeCarga) {
		this.velocidadDeCarga = velocidadDeCarga;
		this.consumo = consumo;
		this.nivelDeCarga = nivelDeCarga;
	}

	public Double medirCarga(){
		if(nivelDeCarga<nivelMaximoDeCarga) {
			return this.nivelDeCarga;
		}
		else if(nivelDeCarga>=nivelMaximoDeCarga) {
		cargasCompletas++;
		return nivelDeCarga=100.0;
		}
		else {
		return nivelDeCarga=0.0;}
		
	}

	public void consumir (Integer minuto){
	this.nivelDeCarga-=consumo*minuto;	
	this.consumoTotal+=minuto;
	}
	
	public void cargar (Integer minuto){
	this.nivelDeCarga+=velocidadDeCarga*minuto;
	}

	public Integer medirConsumoTotal(){
	return this.consumoTotal;
	}

	public Integer contarCargasTotales(){
	return cargasCompletas;
	}
}