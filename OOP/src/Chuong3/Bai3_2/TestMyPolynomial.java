package Chuong3.Bai3_2;

public class TestMyPolynomial {
    public static void main(String[] args) {
        double[] coeffs = {1,2,3,4,5};
        MyPolynomial p1 = new MyPolynomial(coeffs);
        System.out.println(p1);
        System.out.println(p1.evaluate(5));
    }
}
