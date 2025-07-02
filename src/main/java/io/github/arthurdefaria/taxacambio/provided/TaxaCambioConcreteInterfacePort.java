package io.github.arthurdefaria.taxacambio.provided;

import io.github.arthurdefaria.taxacambio.internal.TaxaCambio;

public class TaxaCambioConcreteInterfacePort implements TaxaCambioConcreteInterface {

    private final TaxaCambio taxaCambioService;

    public TaxaCambioConcreteInterfacePort() {
        this.taxaCambioService = new TaxaCambio();
    }

    @Override
    public double obterTaxaCambio(String moedaOrigem, String moedaDestino) {
        return taxaCambioService.obterTaxaCambio(moedaOrigem, moedaDestino);
    }
}