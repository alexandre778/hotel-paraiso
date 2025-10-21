
package com.hotelparaiso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastro";
    }

    @GetMapping("/pagamento")
    public String pagamento() {
        return "pagamento";
    }

    @GetMapping("/sucesso")
    public String sucesso() {
        return "sucesso";
    }

    @GetMapping("/erro")
    public String erro() {
        return "erro";
    }

    // ✅ Adicione isso
    @GetMapping("/ver-reserva")
    public String verReserva() {
        return "ver-reserva"; // precisa existir templates/ver-reserva.html
    }
}
