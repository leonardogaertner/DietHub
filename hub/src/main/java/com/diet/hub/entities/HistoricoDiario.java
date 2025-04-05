package com.diet.hub.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class HistoricoDiario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate data;
    private Double totalCalorias;
    private Double totalProteinas;
    private Double totalCarboidratos;
    private Double totalGorduras;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getTotalCalorias() {
		return totalCalorias;
	}

	public void setTotalCalorias(Double totalCalorias) {
		this.totalCalorias = totalCalorias;
	}

	public Double getTotalProteinas() {
		return totalProteinas;
	}

	public void setTotalProteinas(Double totalProteinas) {
		this.totalProteinas = totalProteinas;
	}

	public Double getTotalCarboidratos() {
		return totalCarboidratos;
	}

	public void setTotalCarboidratos(Double totalCarboidratos) {
		this.totalCarboidratos = totalCarboidratos;
	}

	public Double getTotalGorduras() {
		return totalGorduras;
	}

	public void setTotalGorduras(Double totalGorduras) {
		this.totalGorduras = totalGorduras;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
