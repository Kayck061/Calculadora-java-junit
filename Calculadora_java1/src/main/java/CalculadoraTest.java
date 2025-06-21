import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testSoma() {
        Double resultado = CalculatorApp.realizarCalculo(8.0, 2.0, "+");
        assertEquals(10.0, resultado);
    }

    @Test
    public void testSubtracao() {
        Double resultado = CalculatorApp.realizarCalculo(8.0, 2.0, "-");
        assertEquals(6.0, resultado);
    }

    @Test
    public void testMultiplicacao() {
        Double resultado = CalculatorApp.realizarCalculo(8.0, 2.0, "*");
        assertEquals(16.0, resultado);
    }

    @Test
    public void testDivisao() {
        Double resultado = CalculatorApp.realizarCalculo(8.0, 2.0, "/");
        assertEquals(4.0, resultado);
    }

    @Test
    public void testDivisaoPorZero() {
        Double resultado = CalculatorApp.realizarCalculo(8.0, 0.0, "/");
        assertTrue(resultado.isInfinite() || resultado.isNaN()); // resultado provavelmente Infinity
    }

    @Test
    public void testOperacaoInvalida() {
        Double resultado = CalculatorApp.realizarCalculo(8.0, 2.0, "%");
        assertEquals(0.0, resultado); // método retorna 0.0 se operação for inválida
    }
}
