package br.com.api.factory;

public class Cliente {

    private String solicitacao;
    private boolean temContrato;

    public Cliente(String solicitacao, boolean temContrato){
        this.solicitacao = solicitacao;
        this.temContrato = temContrato;
    }

    public String getSolicitacao() {
        return solicitacao;
    }
    public boolean isTemContrato() {
        return temContrato;
    }
}
