import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.fail;

public class CalculatorTest{
    Calculator calculator = new Calculator();

    @BeforeClass
    public void beforeClass(){
        
    }

    @AfterClass
    public void afterClass(){
        calculator = null;
    }

    @Test(description = "Addition", priority = 4)
    public void testAddition(){

        double actualRes = calculator.add(2, 3);
        double expectedRes = 2+3;
        if (actualRes == expectedRes){
            System.out.println("testAddition passed. \nResult = " + actualRes);
        }else {
            fail("testAddition failed. \nExpected result: " + expectedRes + "\nActual result = " + actualRes);
        }
    }

    @Test(description = "Subtraction", priority = 3)
    public void testSubtraction(){
        double actualRes = calculator.subtract(2, 3);
        double expectedRes = 2-3;
        if (actualRes == expectedRes){
            System.out.println("testSubtraction passed. \nResult = " + actualRes);
        }else {
            fail("testSubtraction failed. \nExpected result: " + expectedRes + "\nActual result = " + actualRes);
        }
    }

    @Test(description = "Multiplication", priority = 2)
    public void testMultiplication(){
        double actualRes = calculator.multiply(2, 3);
        double expectedRes = 2*3;
        if (actualRes == expectedRes){
            System.out.println("testMultiplication passed. \nResult = " + actualRes);
        }else {
            fail("testMultiplication failed. \nExpected result: " + expectedRes + "\nActual result = " + actualRes);
        }
    }

    @Test(description = "Division", priority = 1, expectedExceptions = {ArithmeticException.class})
    public void testDivisionByZero(){
        double actualRes = calculator.divide(6, 0);
        double expectedRes =  (double) 6 /0;
        if (actualRes == expectedRes){
            System.out.println("testDivision passed. \nResult = " + actualRes);
        }else {
            fail("testDivision failed. \nExpected result: " + expectedRes + "\nActual result = " + actualRes);
        }
    }

    @Test(description = "Division", priority = 0)
    public void testDivision(){
        double actualRes = calculator.divide(6, 2);
        double expectedRes =  (double) 6 /2;
        if (actualRes == expectedRes){
            System.out.println("testDivision passed. \nResult = " + actualRes);
        }else {
            fail("testDivision failed. \nExpected result: " + expectedRes + "\nActual result = " + actualRes);
        }
    }



}
