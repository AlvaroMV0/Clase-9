package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculadoraTest {

    private final Calculadora calc = new Calculadora();
    @Test
    void Testeo(){
        assertEquals(240, calc.multiplicar(80,3));
        assertEquals(110, calc.dvidir(calc.sumar(180,150),3));
        assertNotEquals(605, calc.multiplicar(calc.restar(90,50),15));
        assertNotEquals(2700, calc.multiplicar(calc.sumar(70,40),25));

    }


}
