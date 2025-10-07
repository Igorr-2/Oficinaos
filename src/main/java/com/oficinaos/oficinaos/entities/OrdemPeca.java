package com.oficinaos.oficinaos.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "ordem_peca")
@NoArgsConstructor
@AllArgsConstructor
public class OrdemPeca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ordem_id")
    private Ordem ordem;

    @ManyToOne
    @JoinColumn(name = "peca_id")
    private Peca peca;

    private Integer quantidadeUsada;
}
