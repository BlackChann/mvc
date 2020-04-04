package br.usjt.previsaoTempo.model;

import java.io.Serializable; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
@Entity 

public class Tempo implements Serializable{
	
	private static final long serialVersionUID = 1L;   
	@Id  
	@GeneratedValue 
	
	private String cidade;
	private String dia;
	private Double tempMin;
	private Double tempMax;
	private Double umidade;  
	private String descricao;   
	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public Double getTempMin() {
		return tempMin;
	}
	public void setTempMin(Double tempMin) {
		this.tempMin = tempMin;
	}
	public Double getTempMax() {
		return tempMax;
	}
	public void setTempMax(Double tempMax) {
		this.tempMax = tempMax;
	}
	public Double getUmidade() {
		return umidade;
	}
	public void setHumidade(Double umidade) {
		this.umidade = umidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescrição(String descrição) {
		this.descricao = descricao;
	}
	

}
