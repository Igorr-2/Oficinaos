package com.oficinaos.oficinaos.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Data
@Table(name = "ordem")
@NoArgsConstructor
@AllArgsConstructor
public class Ordem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
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
