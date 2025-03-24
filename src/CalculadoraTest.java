import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    @Test
    public void sumarNumeroTest(){

        // Preparación
        Main.Calculadora calc = new Main.Calculadora();
        //Ejecución (Act)
        float result = calc.sumar(10, 20);

     //Verificación (Assert)
     float expResult = 30;
        assertEquals(expResult, result);

    }
    @Test
    public void sumar_numerosGrandes_retornaSumaCorrecta(){
        //Arrange
        Main.Calculadora calc = new Main.Calculadora();
        float num3 = 5;
        float num4 = 5;

        //Act
        float resultado = calc.sumar(num3, num4);

        //Assert
        assertEquals(10, resultado);
    }

}