package pro.sky.calculator;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculator;
    public CalculatorController(CalculatorServiceImpl calculator){
        this.calculator=calculator;
    }
    @RequestMapping(path = "/calculator")
    public String calculator() {
        return calculator.calculator();
    }
    @RequestMapping(path = "/calculator/plus")
    public String calculatorPlus(@RequestParam (required = false) Integer num1, Integer num2) {
            return calculator.calculatorPlus(num1,num2);
        }
    @RequestMapping(path = "/calculator/minus")
    public String calculatorMinus(@RequestParam (required = false) Integer num1, Integer num2) {
            return calculator.calculatorMinus (num1,num2);
        }
        @RequestMapping(path = "/calculator/multiply")
    public String calculatorMultiply(@RequestParam (required = false) Integer num1, Integer num2) {
            return calculator.calculatorMultiply(num1,num2);
        }
    @RequestMapping(path = "/calculator/divide")
    public String calculatorDivide(@RequestParam (required = false) Double num1, Double num2) {
        return calculator.calculatorDivide(num1,num2);
        }

    }

