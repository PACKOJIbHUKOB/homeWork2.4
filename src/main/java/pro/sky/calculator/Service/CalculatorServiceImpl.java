package pro.sky.calculator.Service;

import org.springframework.stereotype.Service;
import pro.sky.calculator.Service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String calculator() {
        return "Добро пожаловать в калькулятор!";
    }

    public String calculatorPlus(int num1, int num2) {
        return formatResult(num1, num2, "+", Integer.toString(num1 + num2));
        }

    public String calculatorMinus(int num1, int num2) {
        return formatResult(num1, num2, "-", Integer.toString(num1 - num2));
        }

    public String calculatorMultiply(int num1, int num2) {
        return formatResult(num1, num2, "*", Integer.toString(num1 * num2));
    }

    public String calculatorDivide(int num1, int num2) {
        if (num2 == 0) {
           throw new IllegalArgumentException("На ноль делить нельзя");
        }
        return formatResult(num1, num2, "/", Double.toString((double) num1 / num2));
    }
    private String formatResult(int num1, int num2, String operation, String result) {
        return String.format("%s %s %s = %s", num1, operation, num2, result);
    }
}
