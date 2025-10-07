package com.oficinaos.oficinaos.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "equipamento")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Equipamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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
