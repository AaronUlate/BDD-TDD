import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.bddtdd.Calculadora;

public class CalculadoraTest {

    @Test
    public void testSuma(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.suma(2, 3);
        assertEquals(5, resultado);

    }

}
