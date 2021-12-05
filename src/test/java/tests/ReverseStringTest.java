package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import static utils.extentreports.ExtentTestManager.startTest;

public class ReverseStringTest extends BaseTest {

    static String original = "Satendra is good man";
    String reverse = "";

    @Test(groups = "run_by_program")
    public void main_method(Method method) {
        System.out.println("Original Main String is : " + original);
    }

    @Test(groups = "sanity")
    public void reverse_string(Method method) {
        startTest(method.getName(), "Invalid Login Scenario with invalid username and password.");

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("Original String is : " + original);
        System.out.println("Reversal String is : " + reverse);
    }

    @Test(groups = "sanity")
    public void reverse_string_inbuild_methods() {
        StringBuffer sb = new StringBuffer().append(original);
        String reverse = sb.reverse().toString();

        System.out.println("Original String is : " + original);
        System.out.println("Reversal String is : " + reverse);
    }
}