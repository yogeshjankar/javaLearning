package assignment;

public class Assignment3 {
    public static void main(String[] args) {

        int x = 10;
        double y = 12.4;
        double z = 56.78;

        double sq = y * y;
        double sqZ = z * z;

        double d = Math.cbrt(sq + sqZ - Math.abs(z));
        System.out.println(d);

    }

}
