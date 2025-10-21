$(document).ready(function() {
    // Alternar entre métodos de pagamento
    $("#formaPagamento").change(function() {
        const tipo = $(this).val();
        $(".pagamento-opcao").hide();

        if (tipo === "credito" || tipo === "debito") {
            $("#dadosCartao").slideDown();
        } else if (tipo === "pix") {
            $("#dadosPix").slideDown();
        }
    });

    // Simulação de pagamento
    $("#formPagamento").submit(function(e) {
        e.preventDefault();
        const tipo = $("#formaPagamento").val();

        if (!tipo) {
            alert("Por favor, selecione uma forma de pagamento.");
            return;
        }

        // Simula gravação de cookie do método
        document.cookie = `formaPagamento=${tipo}; path=/; max-age=3600`;

        $("#mensagemSucesso").fadeIn();
        $("html, body").animate({ scrollTop: $("#mensagemSucesso").offset().top }, "slow");
    });
});
