package bdd.stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.bddtdd.Calculadora;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculadoraSteps {
    
    private Calculadora calculadora;
    private int resultado;
    
    @Given("tengo una calculadora")
    public void tengo_una_calculadora() {
        calculadora = new Calculadora();
    }
    
    @When("sumo {int} y {int}")
    public void sumo_dos_numeros(int numero1, int numero2) {
        resultado = calculadora.suma(numero1, numero2);
    }
    
    @Then("el resultado debería ser {int}")
    public void el_resultado_deberia_ser(int resultadoEsperado) {
        assertEquals(resultadoEsperado, resultado);
    }
}
