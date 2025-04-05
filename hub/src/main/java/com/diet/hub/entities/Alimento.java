package com.diet.hub.entities;

import jakarta.persistence.*;

@Entity
public class Alimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Double calorias;
    private Double proteinas;
    private Double carboidratos;
    private Double gorduras;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getCalorias() {
		return calorias;
	}
	public void setCalorias(Double calorias) {
		this.calorias = calorias;
	}
	public Double getProteinas() {
		return proteinas;
	}
	public void setProteinas(Double proteinas) {
		this.proteinas = proteinas;
	}
	public Double getCarboidratos() {
		return carboidratos;
	}
	public void setCarboidratos(Double carboidratos) {
		this.carboidratos = carboidratos;
	}
	public Double getGorduras() {
		return gorduras;
	}
	public void setGorduras(Double gorduras) {
		this.gorduras = gorduras;
	}

    
}

