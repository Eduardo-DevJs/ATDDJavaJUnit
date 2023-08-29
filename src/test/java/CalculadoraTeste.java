import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculadoraTeste {
    @Test
    public void sumNumbers() {
        Calculadora calculadora = new Calculadora();

        int soma = calculadora.soma(8, 3);
        System.out.println("A soma é: " + soma);

        Assertions.assertEquals(11, soma);
    }

    @Test
    public void subNumbers() {
        Calculadora calculadora = new Calculadora();

        int sub = calculadora.sutracao(8, 3);
        System.out.println("A subtração é: " + sub);

        Assertions.assertEquals(5, sub);
    }

    @Test
    public void divNumbers() {
        Calculadora calculadora = new Calculadora();

        double div = calculadora.divisao(8, 2);
        System.out.println("A divisao é: " + div);

        Assertions.assertEquals(4, div);
    }

    @Test
    public void mulNumbers() {
        Calculadora calculadora = new Calculadora();

        double mul = calculadora.multiplicacao(8, 3);
        System.out.println("A multiplicacao é: " + mul);

        Assertions.assertEquals(24, mul);
    }

    @Test
    public void verificaPar() {
        Calculadora calculadora = new Calculadora();
        boolean verifica = calculadora.verificarPar(8);

        Assertions.assertTrue(verifica);
    }

}
