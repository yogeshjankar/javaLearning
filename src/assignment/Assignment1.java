package assignment;

public class Assignment1 {
    public static void main(String[] args) {
        int a = 12;
        int b = 9;
        int c = 26;

        int d = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("Max number is:"+d);
    }
}
