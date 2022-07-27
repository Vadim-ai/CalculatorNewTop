package pro.sky.CalculatorNewTop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.engine.Constants;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.yaml.snakeyaml.scanner.Constant;
import pro.sky.CalculatorNewTop.constants.ServiceImplTestConstants;

import java.util.stream.Stream;

import static pro.sky.CalculatorNewTop.constants.ServiceImplTestConstants.*;

public class ServiceImplParamTests {
    private final Service service = new ServiceImpl();
    public static Stream<Arguments> provideParamsForTests() {
       return Stream.of(
               Arguments.of(NUM1,NUM2),
               Arguments.of(NUM3,NUM4),
               Arguments.of(NUM3,NUM0)
               );
    }
        @ParameterizedTest
            @MethodSource("provideParamsForTests")
    public void checkMtdPlus(int a, int b) {
        int result = service.plus(a, b);
            Assertions.assertEquals(a + b, result);
    }
    @ParameterizedTest
        @MethodSource("provideParamsForTests")
    public void checkMtdMinus(int a, int b) {
        int result = service.minus (a, b);
            Assertions.assertEquals(a - b, result);
    }
    @ParameterizedTest
        @MethodSource("provideParamsForTests")
    public void checkMtdMultiply(int a, int b) {
        int result = service.multiply(a, b);
            Assertions.assertEquals(a * b, result);
    }
    @ParameterizedTest
        @MethodSource("provideParamsForTests")
    public void checkMtdDivide(int a, int b) {
        int result = service.divide(a, b);
            Assertions.assertEquals(a / b, result);
    }

}
