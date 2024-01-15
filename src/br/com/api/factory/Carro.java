package br.com.api.factory;

public abstract class Carro {

    private int cavalos;
    private int anoFabricacao;
    private String cor;

    public Carro(int cavalos, int anoFabricacao, String cor) {
        this.cavalos = cavalos;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
    }

    public void ligarCarro() {
        System.out.println("O carro está ligando");
        System.out.println(getClass().getSimpleName());
    }

    public void abastecerTanque() {
        System.out.println("O tanque do carro foi abastecido");
    }

    public void limparCarro() {
        System.out.println("O carro está limpo");
    }
}
