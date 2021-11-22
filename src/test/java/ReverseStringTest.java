import org.testng.annotations.Test;

public class ReverseStringTest {

    static String original = "Satendra is good man";
    String reverse = "";

    @Test(groups = "run_by_program")
    public void main_method() {
        System.out.println("Original Main String is : " + original);
    }

    @Test(groups = "sanity")
    public void reverse_string() {
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
