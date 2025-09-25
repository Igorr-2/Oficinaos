package com.oficinaos.oficinaos.entities;

import jakarta.persistence.Entity;
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
@Table(name = "ordem_peca")
@NoArgsConstructor
@AllArgsConstructor
public class OrdemPeca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "ordem_id")
    private Ordem ordem;
    @ManyToOne
    @JoinColumn(name = "peca_id")
    private Peca peca;
    private int quantidadeUsada;
}

