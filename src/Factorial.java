public class Factorial {
    static int factorial(int n){

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return  fact;

//        if (n <= 1) return 1;
//
//        else return (n * factorial(n--));
    }
}
