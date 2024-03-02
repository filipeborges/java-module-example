import br.com.filipebores.poc.modularization.input.api.Input;
import br.com.filipebores.poc.modularization.input.api.Output;
import br.com.filipebores.poc.modularization.input.impl.InputImplementation;
import br.com.filipebores.poc.modularization.input.impl.OutputImplementation;

module basic.calculator.input {
    exports br.com.filipebores.poc.modularization.input.api;

    provides Input with InputImplementation;
    provides Output with OutputImplementation;
}