package br.com.api.factory;

public class FabricaComContrato extends Factory {

    Carro retornaCarro(String solicitacao) {
        if ("A".equals(solicitacao)) {
            return new CarroAudi(500, 2020, "Preto");
        } else {
            return new CarroBmw(600, 2018, "Azul");
        }
    }
}
