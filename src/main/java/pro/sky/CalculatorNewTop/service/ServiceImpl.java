package pro.sky.CalculatorNewTop.service;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }
    public int plus (int num1, int num2){
        return num1 + num2;
    }
    public int minus (int num1, int num2){
        return num1 - num2;
    }
    public int multiply (int num1, int num2){
        return num1 * num2;
    }
    public int divide (int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Делить на 0 нельзя");
        } else {
            return num1 / num2;
        }
    }
}
