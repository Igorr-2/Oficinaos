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
@Data
@Table(name = "componente")
@NoArgsConstructor
@AllArgsConstructor
public class Componente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

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
