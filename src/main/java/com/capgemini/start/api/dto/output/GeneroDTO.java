package com.capgemini.start.api.dto.output;

import java.time.LocalDateTime;

public class GeneroDTO {

	private Long id_genero;
	private String ds_genero;
	private LocalDateTime dt_criacao;
	private LocalDateTime dt_alteracao;
	
	public LocalDateTime getDt_criacao() {
		return dt_criacao;
	}
	
	public void setDt_criacao(LocalDateTime dt_criacao) {
		this.dt_criacao = dt_criacao;
	}
	public Long getId_genero() {
		return id_genero;
	}
	public void setId_genero(Long id_genero) {
		this.id_genero = id_genero;
	}
	public String getDs_genero() {
		return ds_genero;
	}
	public void setDs_genero(String ds_genero) {
		this.ds_genero = ds_genero;
	}
	public LocalDateTime getDt_alteracao() {
		return dt_alteracao;
	}
	public void setDt_alteracao(LocalDateTime dt_alteracao) {
		this.dt_alteracao = dt_alteracao;
	}
}
