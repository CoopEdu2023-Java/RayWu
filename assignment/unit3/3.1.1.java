class PolynomialSum {
    public static double calculatePolynomialSum(double[] coefficients, int n, double x) {
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += coefficients[i] * Math.pow(x, i);
        }
        return sum;
    }

    public static void main(String[] args) {
        double[] coefficients = {1, 2, 3, 4, 5}; // a0, a1, a2, a3, a4
        int n = 4; // degree of the polynomial
        double x = 2.0; // value of x
        double sum = calculatePolynomialSum(coefficients, n, x);
        System.out.println("Polynomial sum: " + sum);
    }
}
//way2
class PolynomialSum2 {
    public static double calculatePolynomialSum(double[] coefficients, int n, double x) {
        if (n == 0) {
            return coefficients[0];
        } else {
            return coefficients[n] * Math.pow(x, n) + calculatePolynomialSum(coefficients, n - 1, x);
        }
    }

    public static void main(String[] args) {
        double[] coefficients = {1, 2, 3, 4, 5}; // a0, a1, a2, a3, a4
        int n = 4; // degree of the polynomial
        double x = 2.0; // value of x
        double sum = calculatePolynomialSum(coefficients, n, x);
        System.out.println("Polynomial sum: " + sum);
    }
}