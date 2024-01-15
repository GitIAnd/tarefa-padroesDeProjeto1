package br.com.api.factory;

public abstract class Factory {

    public Carro create(String solicitacao) {
        Carro carro = retornaCarro(solicitacao);
        return carro;
    }
    private Carro preparaCarro(Carro carro) {
        carro.ligarCarro();
        carro.limparCarro();
        carro.abastecerTanque();
        return carro;
    }

    abstract Carro retornaCarro(String solicitacao);
}
