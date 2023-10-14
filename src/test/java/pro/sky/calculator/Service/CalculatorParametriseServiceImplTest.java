package pro.sky.calculator.Service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculator.UtilsTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorParametriseServiceImplTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
    public static Stream<Arguments> plusParam(){
        return Stream.of(
                Arguments.of("1","4", UtilsTest.formatResult(1,4,"+",String.valueOf(1+4))),
                Arguments.of("6","8", UtilsTest.formatResult(6,8,"+",String.valueOf(6+8))),
                Arguments.of("9","85", UtilsTest.formatResult(9,85,"+",String.valueOf(9+85))),
                Arguments.of("154","93", UtilsTest.formatResult(154,93,"+",String.valueOf(154+93)))
        );
    }
    public static Stream<Arguments> minusParam(){
        return Stream.of(
                Arguments.of("1","4", UtilsTest.formatResult(1,4,"-",String.valueOf(1-4))),
                Arguments.of("6","8", UtilsTest.formatResult(6,8,"-",String.valueOf(6-8))),
                Arguments.of("9","85", UtilsTest.formatResult(9,85,"-",String.valueOf(9-85))),
                Arguments.of("154","93", UtilsTest.formatResult(154,93,"-",String.valueOf(154-93)))
        );
    }
    public static Stream<Arguments> multiplyParam(){
        return Stream.of(
                Arguments.of("1","4", UtilsTest.formatResult(1,4,"*",String.valueOf(1*4))),
                Arguments.of("6","8", UtilsTest.formatResult(6,8,"*",String.valueOf(6*8))),
                Arguments.of("9","85", UtilsTest.formatResult(9,85,"*",String.valueOf(9*85))),
                Arguments.of("154","93", UtilsTest.formatResult(154,93,"*",String.valueOf(154*93)))
        );
    }    public static Stream<Arguments> divideParam(){
        return Stream.of(
                Arguments.of("1","4", UtilsTest.formatResult(1,4,"/",String.valueOf((double) 1/4))),
                Arguments.of("6","8", UtilsTest.formatResult(6,8,"/",String.valueOf((double) 6/8))),
                Arguments.of("9","85", UtilsTest.formatResult(9,85,"/",String.valueOf((double) 9/85))),
                Arguments.of("154","93", UtilsTest.formatResult(154,93,"/",String.valueOf((double) 154 /93)))
        );
    }
    @ParameterizedTest
    @MethodSource("plusParam")
    void calculatorPlus(int num1, int num2, String result) {
        assertEquals(result,calculatorService.calculatorPlus(num1, num2));

    }

    @ParameterizedTest
    @MethodSource("minusParam")
    void calculatorMinus(int num1, int num2, String result) {
        assertEquals(result,calculatorService.calculatorMinus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("multiplyParam")
    void calculatorMultiply(int num1, int num2, String result) {
        assertEquals(result,calculatorService.calculatorMultiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("divideParam")
    void calculatorDivide(int num1, int num2, String result) {
        assertEquals(result,calculatorService.calculatorDivide(num1, num2));
    }
}