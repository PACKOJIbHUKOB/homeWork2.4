package pro.sky.calculator;

public interface CalculatorService {
    String calculator();
    String calculatorPlus(Integer num1, Integer num2);
    String calculatorMinus(Integer num1, Integer num2);
    String calculatorMultiply(Integer num1, Integer num2);

    String calculatorDivide(Double num1, Double num2);
}
