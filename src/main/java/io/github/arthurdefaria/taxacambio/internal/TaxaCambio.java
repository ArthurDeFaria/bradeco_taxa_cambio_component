package io.github.arthurdefaria.taxacambio.internal;

import java.util.HashMap;
import java.util.Map;

import io.github.arthurdefaria.taxacambio.provided.interfaces.TaxaCambioProvidedInterface;

public class TaxaCambio implements TaxaCambioProvidedInterface {

    private final Map<String, Double> taxasDeCambio;

    public TaxaCambio() {
        this.taxasDeCambio = new HashMap<>();
        taxasDeCambio.put("USD_EUR", 0.85);
        taxasDeCambio.put("EUR_USD", 1.18);
        taxasDeCambio.put("USD_BRL", 5.47);
        taxasDeCambio.put("BRL_USD", 0.18);
    }

    @Override
    public double obterTaxaCambio(String moedaOrigem, String moedaDestino) {
        String chave = moedaOrigem + "_" + moedaDestino;
        if (taxasDeCambio.containsKey(chave)) {
            return taxasDeCambio.get(chave);
        } else {
            throw new IllegalArgumentException("Taxa de câmbio não encontrada para " + moedaOrigem + " -> " + moedaDestino);
        }
    }
}