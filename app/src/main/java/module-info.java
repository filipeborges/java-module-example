module basic.calculator.main {
    requires basic.calculator.input;
    requires basic.calculator.add;

    uses br.com.filipebores.poc.modularization.input.api.Input;
    uses br.com.filipebores.poc.modularization.input.api.Output;
    uses br.com.filipebores.poc.modularization.add.api.Add;
}