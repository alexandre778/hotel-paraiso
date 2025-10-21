package com.hotelparaiso.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "servicos")
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String nome;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    @Column(name = "criado_em", nullable = false, updatable = false)
    private LocalDateTime criadoEm = LocalDateTime.now();

    // Getters e setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public LocalDateTime getCriadoEm() { return criadoEm; }
}
