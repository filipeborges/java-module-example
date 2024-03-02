import br.com.filipebores.poc.modularization.add.api.Add;
import br.com.filipebores.poc.modularization.add.impl.AddImplementation;

module basic.calculator.add {
    exports br.com.filipebores.poc.modularization.add.api;

    provides Add with AddImplementation;
}