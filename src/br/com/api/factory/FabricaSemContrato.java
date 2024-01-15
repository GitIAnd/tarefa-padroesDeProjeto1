package br.com.api.factory;

public class FabricaSemContrato extends Factory{
    Carro retornaCarro(String solicitacao) {
        if ("B".equals(solicitacao)) {
            return new CarroAudi(500, 2020, "Preto");
        } else {
            return new CarroBmw(600, 2018, "Azul");
        }
    }
}
