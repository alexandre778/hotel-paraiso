package com.hotelparaiso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReservaController {

    // Nova rota para listar reservas (não conflita com PageController)
    @GetMapping("/minhas-reservas")
    public String listarReservas(Model model, @RequestParam(required = false) String nomeHospede) {
        model.addAttribute("nomeHospede", nomeHospede != null ? nomeHospede : "Visitante");
        // Aqui você pode adicionar a lista de reservas do hóspede se quiser
        return "reservas"; // templates/reservas.html
    }
}
