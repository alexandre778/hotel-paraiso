package com.hotelparaiso.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "hospede_id", nullable = false)
    private Hospede hospede;

    @ManyToOne
    @JoinColumn(name = "suite_id", nullable = false)
    private Suite suite;

    @Column(name = "data_entrada", nullable = false)
    private LocalDate dataEntrada;

    @Column(name = "data_saida", nullable = false)
    private LocalDate dataSaida;

    @Column(nullable = false)
    private Integer adultos;

    @Column(nullable = false)
    private Integer criancas = 0;

    @Column(columnDefinition = "TEXT")
    private String observacoes;

    @Column(name = "criado_em", nullable = false, updatable = false)
    private LocalDateTime criadoEm = LocalDateTime.now();

    // Getters e setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Hospede getHospede() { return hospede; }
    public void setHospede(Hospede hospede) { this.hospede = hospede; }

    public Suite getSuite() { return suite; }
    public void setSuite(Suite suite) { this.suite = suite; }

    public LocalDate getDataEntrada() { return dataEntrada; }
    public void setDataEntrada(LocalDate dataEntrada) { this.dataEntrada = dataEntrada; }

    public LocalDate getDataSaida() { return dataSaida; }
    public void setDataSaida(LocalDate dataSaida) { this.dataSaida = dataSaida; }

    public Integer getAdultos() { return adultos; }
    public void setAdultos(Integer adultos) { this.adultos = adultos; }

    public Integer getCriancas() { return criancas; }
    public void setCriancas(Integer criancas) { this.criancas = criancas; }

    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }

    public LocalDateTime getCriadoEm() { return criadoEm; }
}
