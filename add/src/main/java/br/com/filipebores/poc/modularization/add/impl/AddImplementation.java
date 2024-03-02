package br.com.filipebores.poc.modularization.add.impl;

import br.com.filipebores.poc.modularization.add.api.Add;

public class AddImplementation implements Add {
    @Override
    public double sum(double num1, double num2) {
        return num1 + num2;
    }
}
