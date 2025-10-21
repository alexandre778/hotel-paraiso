   
package com.hotelparaiso.service;

import com.hotelparaiso.model.Reserva;
import com.hotelparaiso.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository repository;

    // Listar todas as reservas
    public List<Reserva> listar() {
        return repository.findAll();
    }

    // Salvar uma nova reserva
    public Reserva salvar(Reserva reserva) {
        return repository.save(reserva);
    }

    // Buscar uma reserva pelo ID
    public Optional<Reserva> buscarPorId(Long id) {
        return repository.findById(id);
    }

    // Deletar uma reserva pelo ID
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

