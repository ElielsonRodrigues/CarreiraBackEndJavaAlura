package br.com.alura.screenmatch.model;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import br.com.alura.screenmatch.record.Episodios;

public class Episodio {
	
	
	private Integer temporada;
	private String titulo;
    private Integer numeroEp;
    private Double avaliacao;
    private LocalDate lancamento;
    
	public Episodio(Integer temporada, Episodios ep) {
		this.temporada = temporada;
		this.titulo =  ep.titulo();
		this.numeroEp = ep.numero();
		try {
			this.avaliacao =  Double.valueOf(ep.avaliacao());	
		} catch (NumberFormatException e) {
			this.avaliacao = 0.0;
		}
		try {
			this.lancamento = LocalDate.parse(ep.lancamento());
		} catch (DateTimeParseException e) {
			this.lancamento = null;
		}
	}
	
	public Integer getTemporada() {
		return temporada;
	}
	public void setTemporada(Integer temporada) {
		this.temporada = temporada;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getNumeroEp() {
		return numeroEp;
	}
	public void setNumeroEp(Integer numeroEp) {
		this.numeroEp = numeroEp;
	}
	public Double getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(Double avaliacao) {
		this.avaliacao = avaliacao;
	}
	public LocalDate getLancamento() {
		return lancamento;
	}
	public void setLancamento(LocalDate lancamento) {
		this.lancamento = lancamento;
	}

	@Override
	public String toString() {
		return "temporada=" + temporada + ", titulo=" + titulo + ", numeroEp=" + numeroEp + ", avaliacao="
				+ avaliacao + ", lancamento=" + lancamento;
	}

}
