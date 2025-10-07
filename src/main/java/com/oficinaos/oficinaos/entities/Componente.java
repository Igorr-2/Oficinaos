package com.oficinaos.oficinaos.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "componente")
@NoArgsConstructor
@AllArgsConstructor
public class Componente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "equipamento_id")
    private Equipamento equipamento;

    @Enumerated(EnumType.STRING)
    private Tipo tipo;

    private String marca;
    private String modelo;
    private String descricao;

    public enum Tipo {
        CPU,
        GPU,
        RAM,
        HD,
        SSD,
        FONTE,
        PLACA_MAE,
        OUTRO
    }
}
