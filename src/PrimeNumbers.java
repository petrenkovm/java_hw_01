public class PrimeNumbers {

    static void primeNumbers(int n) {

        for (int i = 2; i <= n; i++) {

            boolean prim = true;
            int q = (int) Math.sqrt(n);

            for (int j = 2; j <= q; j++) {
                if(i % j == 0) {
                    prim = false;
                    continue;
                }
            }
            if (prim) System.out.println(i);
        }
    }
}
