package br.com.api.factory;

public class Demo {

    public static void main(String args[]) {
        Cliente cliente = new Cliente("A", true);
        Factory fabrica = getFactory(cliente);
        Carro carro = fabrica.create(cliente.getSolicitacao());
        carro.limparCarro();
        carro.abastecerTanque();
        carro.ligarCarro();
    }

    private static Factory getFactory(Cliente cliente) {
        if (cliente.isTemContrato()) {
            return new FabricaComContrato();
        } else {
            return new FabricaSemContrato();
        }
    }
}
