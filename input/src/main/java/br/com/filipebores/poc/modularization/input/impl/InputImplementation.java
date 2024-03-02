package br.com.filipebores.poc.modularization.input.impl;

import br.com.filipebores.poc.modularization.input.api.Input;

import java.util.Scanner;

public class InputImplementation implements Input {
    private static final String INPUT_MESSAGE = "----==== Inform the two values ====----";

    private final Scanner sc;

    public InputImplementation() {
        this.sc = new Scanner(System.in);
    }

    @Override
    public double[] printInfoAndReadNumbers() {
        System.out.println(INPUT_MESSAGE);
        final var numbers = new double[2];
        numbers[0] = sc.nextDouble();
        numbers[1] = sc.nextDouble();
        return numbers;
    }
}
