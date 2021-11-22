import org.testng.annotations.Test;

public class ReverseStringTest {

    static String original = "Satendra is good man";
    String reverse = "";

    @Test(groups = "run_by_program")
    public static void main(String[] args) {
        ReverseStringTest rs = new ReverseStringTest();
        rs.reverse_string(original);
        rs.reverse_string_inbuild_methods(original);
    }

    @Test(groups = "sanity")
    public void reverse_string(String text_for_reverse) {
        for (int i = text_for_reverse.length() - 1; i >= 0; i--) {
            reverse = reverse + text_for_reverse.charAt(i);
        }
        System.out.println("Original String is : " + text_for_reverse);
        System.out.println("Reversal String is : " + reverse);
    }

    @Test(groups = "sanity")
    public void reverse_string_inbuild_methods(String text_for_reverse) {
        StringBuffer sb = new StringBuffer().append(text_for_reverse);
        String b = sb.reverse().toString();

        System.out.println("Original String is : " + text_for_reverse);
        System.out.println("Reversal String is : " + b);
    }

}
