package org.example.Calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    public void Initialisation(){
        calculator = new Calculator();
    }
    @Test
    public void AddTest(){
        assertEquals(3, calculator.add(1,2));
    }
    @Test
    public void DevideTest(){
        assertEquals(2, calculator.divide(4,2));
    }
    @Test
    public void MultiplyTest(){
        assertEquals(8, calculator.multiply(4,2));
    }
    @Test
    public void SubTest(){
        assertEquals(2, calculator.subtract(4,2));
    }
    @Test
    public void DevideZeroTest(){
        assertThrows(ArithmeticException.class,()-> calculator.divide(4,0));
    }


    //les teste parametre
}
