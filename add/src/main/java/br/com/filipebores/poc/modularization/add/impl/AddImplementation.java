package br.com.filipebores.poc.modularization.add.impl;

import br.com.filipebores.poc.modularization.add.api.Add;
import org.apache.commons.math.stat.descriptive.summary.Sum;

public class AddImplementation implements Add {
    @Override
    public double sum(double num1, double num2) {
        return new Sum().evaluate(
                new double[]{num1, num2},
                0,
                2
        );
    }
}
