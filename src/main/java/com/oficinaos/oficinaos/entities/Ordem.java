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
import java.util.Date;

@Entity
@Data
@Table(name = "Ordem")
@NoArgsConstructor
@AllArgsConstructor
public class Ordem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(name = "equipamento_id")
	private Equipamento equipamento;
	@Enumerated(EnumType.STRING)
	private TipoServico tiposervico;
	private String problema_relatado;
	private Date dataEntrada;
	private Date previsaoEntrega;
	@Enumerated(EnumType.STRING)
	private StatusOrdem status;
	private double valor_mao_obra;
	private double valor_total;
	private String solucao_aplicada;
	
	public enum TipoServico {
		CONSERTO,
		LIMPEZA,
		MONTAGEM,
		INSTALACAO_SOFTWARE,
		OUTRO
	}
	
	public enum StatusOrdem {
		PENDENTE,
		EM_ANDAMENTO,
		CONCLUIDA,
		ENTREGUE
	}
}
