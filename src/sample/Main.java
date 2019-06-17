package ba.unsa.etf.rs.tut7;

public class Main {

    public static void main(String[] args) {

        double a = 5, b = 4, c = 5;

        double x1, x2;

        double D = b * b - 4 * a * c;

        // condition for real and different roots
        if(D > 0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);

            System.out.format("x1 = %.2f and x2 = %.2f", x1 , x2);
        }
        // Condition for real and equal roots
        else if(D == 0) {
            x1 = x2 = -b / (2 * a);

            System.out.format("x1 = x2 = %.2f;", x1);
        }
        // If roots are not real
        else {
            double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-D) / (2 * a);

            System.out.format("x1 = %.2f+%.2fi and x2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
        }

    }
}