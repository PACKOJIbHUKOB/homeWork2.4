package pro.sky.calculator.Service;

public interface CalculatorService {
    String calculator();
    String calculatorPlus(int num1, int num2);
    String calculatorMinus(int num1, int num2);
    String calculatorMultiply(int num1, int num2);

    String calculatorDivide(int num1, int num2);
}
