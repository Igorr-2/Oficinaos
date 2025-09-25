package com.oficinaos.oficinaos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "equipamento")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Equipamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	@Enumerated(EnumType.STRING)
	private Tipo tipo;
	private String marca;
	private String modelo;
	private String descricao_extra;
	
	public enum Tipo {
		NOTEBOOK,
		PC,
		TELEVISAO,
		IMPRESSORA,
		CELULAR,
		TABLET,
		OUTRO
	}
	
	
	
}
