package tdd;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import com.bddtdd.Calculadora;

public class CalculadoraTest {
    
    private Calculadora calculadora;
    
    @Before
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSuma(){
        int resultado = calculadora.suma(2, 3);
        assertEquals(5, resultado);
    }
    
    @Test
    public void testSumaConNumerosNegativos(){
        int resultado = calculadora.suma(-2, -3);
        assertEquals(-5, resultado);
    }
    
    @Test
    public void testSumaConNumeroPositivoYNegativo(){
        int resultado = calculadora.suma(5, -3);
        assertEquals(2, resultado);
    }

}
