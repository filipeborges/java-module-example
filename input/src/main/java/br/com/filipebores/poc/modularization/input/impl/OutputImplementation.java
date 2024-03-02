package br.com.filipebores.poc.modularization.input.impl;

import br.com.filipebores.poc.modularization.input.api.Output;

public class OutputImplementation implements Output {
    private static final String RESULT_MESSAGE_FORMAT = "----==== Result of %s operation: %f ====----";

    @Override
    public void printResult(String operation, double result) {
        System.out.printf(RESULT_MESSAGE_FORMAT, operation, result);
    }
}
