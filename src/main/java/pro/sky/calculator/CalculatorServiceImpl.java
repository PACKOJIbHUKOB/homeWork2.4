package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String calculator() {
        return "<em><b>Добро пожаловать в калькулятор</b></em>" +
                "<p>Введите свои данные в адресной строке после перехода по ссылки нужного действия </p> " +
                "<p><a href=http://localhost:8080/calculator/plus?num1=1&num2=1 </a> Сложение </p>" +
                " <p><a href=http://localhost:8080/calculator/minus?num1=1&num2=1 </a>вычитание </p>" +
                " <p><a href=http://localhost:8080/calculator/multiply?num1=1&num2=1 </a> умножение </p>" +
                " <p><a href=http://localhost:8080/calculator/divide?num1=1&num2=1 </a> деление </p>";

    }

    public String calculatorPlus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "ОШИБКА!! Введены не все данные";
        } else {
            return num1 + "+" + num2 + "=" + (num1 + num2)
                    + "<p><a href=http://localhost:8080/calculator </a> Назад в калькулятор<p>";
        }
    }

    public String calculatorMinus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "ОШИБКА!! Введены не все данные";
        } else {
            return num1 + "-" + num2 + "=" + (num1 - num2)
                    + "<p><a href=http://localhost:8080/calculator </a> Назад в калькулятор<p>";
        }
    }

    public String calculatorMultiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "ОШИБКА!! Введены не все данные";
        } else {
            return num1 + "*" + num2 + "=" + (num1 * num2)
                    + "<p><a href=http://localhost:8080/calculator </a> Назад в калькулятор<p>";
        }
    }

    public String calculatorDivide(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            return "ОШИБКА!! Введены не все данные";
        } else if (num2 == 0) {
            return "ОШИБКА!! На ноль делить нельзя";
        } else {
            double res = (double) num1 / num2;
            return num1 + "/" + num2 + "=" + res
                    + "<p><a href=http://localhost:8080/calculator </a> Назад в калькулятор<p>";


        }
    }
}
