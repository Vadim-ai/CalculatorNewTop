package pro.sky.CalculatorNewTop.Service;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }
    public String plus (int num1, int num2){
        return num1 + "+" + num2 + " = " + (num1 + num2);
    }
    public String minus (int num1, int num2){
        return num1 + "-" + num2 + " = " + (num1 - num2);
    }
    public String multiply (int num1, int num2){
        return num1 + "*" + num2 + " = " + (num1 * num2);
    }
    public String divide (int num1, int num2){
        return num1 + "/" + num2 + " = " + (num1 / num2);
    }

}
