package kiemtrangoac;

public class checkTest {
    public static void main(String[] args) {
        String s1 ="s * (s – a) * (s – b) * (s – c)   ";
        String s2 ="(– b + (b2 – 4*a*c)^0.5) / 2*a    ";
        String s3 ="s * (s – a) * (s – b * (s – c)     ";
        String s4 ="s * (s – a) * s – b) * (s – c)  ";
        String s5 ="(– b + (b^2 – 4*a*c)^(0.5/ 2*a))   ";
        System.out.println(Check.checkBrackets(s1));
        System.out.println(Check.checkBrackets(s2));
        System.out.println(Check.checkBrackets(s3));
        System.out.println(Check.checkBrackets(s4));
        System.out.println(Check.checkBrackets(s5));
    }
}
