package pro.sky.calculator.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.Service.CalculatorService;
import pro.sky.calculator.Service.CalculatorServiceImpl;

@RestController()
@RequestMapping ("/calculator")
public class CalculatorController {

    private final CalculatorService calculator;
    public CalculatorController(CalculatorServiceImpl calculator){
        this.calculator=calculator;
    }
    @GetMapping ()
    public String calculator() {
        return calculator.calculator();
    }
    @GetMapping (path = "/plus")
    public String calculatorPlus(@RequestParam (required = false) int num1, int num2) {
            return calculator.calculatorPlus(num1,num2);
        }
    @GetMapping(path = "/minus")
    public String calculatorMinus(@RequestParam (required = false) int num1, int num2) {
            return calculator.calculatorMinus (num1,num2);
        }
    @GetMapping(path = "/multiply")
    public String calculatorMultiply(@RequestParam (required = false) int num1, int num2) {
            return calculator.calculatorMultiply(num1,num2);
        }
    @GetMapping(path = "/divide")
    public String calculatorDivide(@RequestParam (required = false) int num1, int num2) {
        return calculator.calculatorDivide(num1,num2);
        }
    }

