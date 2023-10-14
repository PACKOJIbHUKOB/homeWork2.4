package pro.sky.calculator.Service;

import org.junit.jupiter.api.Test;
import pro.sky.calculator.UtilsTest;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    private final CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();
    @Test
    void calculator() {
        //Подготовка ожидаемого результата
        String expectedMessage = "Добро пожаловать в калькулятор!";
        //Начало теста
        String actualMessage = calculatorServiceImpl.calculator();
        assertEquals(expectedMessage,actualMessage);
    }
    @Test
    void calculator2() {
        //Подготовка ожидаемого результата
        String expectedMessage = "добро пожаловать в калькулятор!";
        //Начало теста
        String actualMessage = calculatorServiceImpl.calculator();
        assertEquals(expectedMessage,actualMessage);
    }

    @Test
    void calculatorPlus() {
        //подготовка входных данных
        int num1 = 4;
        int num2 = 6;
        //Подготовка ожидаемого результата
        String expectedResult = UtilsTest.formatResult(num1,num2,"+",String.valueOf(num1+num2));
        //Начало теста
        String actualResult = calculatorServiceImpl.calculatorPlus(num1,num2);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void calculatorPlus2() {
        //подготовка входных данных
        int num1 = 78;
        int num2 = 199;
        //Подготовка ожидаемого результата
        String expectedResult = UtilsTest.formatResult(num1,num2,"+",String.valueOf(num1+num2));
        //Начало теста
        String actualResult = calculatorServiceImpl.calculatorPlus(num1,num2);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void calculatorMinus() {
        //подготовка входных данных
        int num1 = 5;
        int num2 = 7;
        //Подготовка ожидаемого результата
        String expectedResult = UtilsTest.formatResult(num1,num2,"-",String.valueOf(num1-num2));
        //Начало теста
        String actualResult = calculatorServiceImpl.calculatorMinus(num1,num2);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void calculatorMinus2() {
        //подготовка входных данных
        int num1 = 3;
        int num2 = 99;
        //Подготовка ожидаемого результата
        String expectedResult = UtilsTest.formatResult(num1,num2,"-",String.valueOf(num1-num2));
        //Начало теста
        String actualResult = calculatorServiceImpl.calculatorMinus(num1,num2);
        assertEquals(expectedResult,actualResult);
    }


    @Test
    void calculatorMultiply() {
        //подготовка входных данных
        int num1 = 33;
        int num2 = 15;
        //Подготовка ожидаемого результата
        String expectedResult = UtilsTest.formatResult(num1, num2, "*", String.valueOf(num1 * num2));
        //Начало теста
        String actualResult = calculatorServiceImpl.calculatorMultiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void calculatorMultiply2() {
        //подготовка входных данных
        int num1 = 899;
        int num2 = 46;
        //Подготовка ожидаемого результата
        String expectedResult = UtilsTest.formatResult(num1, num2, "*", String.valueOf(num1 * num2));
        //Начало теста
        String actualResult = calculatorServiceImpl.calculatorMultiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void calculatorDivide() {
        //подготовка входных данных
        int num1 = 3;
        int num2 = 1;
        //Подготовка ожидаемого результата
        String expectedResult = UtilsTest.formatResult(num1, num2, "/", String.valueOf((double) num1 / num2));
        //Начало теста
        String actualResult = calculatorServiceImpl.calculatorDivide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void calculatorDivide2() {
        //подготовка входных данных
        int num1 = 3;
        int num2 = 0;
        //Подготовка ожидаемого результата
        String expectedResult = UtilsTest.formatResult(num1, num2, "/", String.valueOf((double) num1 / num2));
        //Начало теста
        String actualResult = calculatorServiceImpl.calculatorDivide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void divide_WhiteException(){
        //подготовка входных данных
        int num1 = 3;
        int num2 = 0;
        //Подготовка ожидаемого результата
        String expectedMessage = "На ноль делить нельзя";
        //Начало теста
        Exception exception = assertThrows(
                IllegalArgumentException.class,
        ()->calculatorServiceImpl.calculatorDivide(num1,num2)
        );
        assertEquals(expectedMessage,exception.getMessage());




    }

}