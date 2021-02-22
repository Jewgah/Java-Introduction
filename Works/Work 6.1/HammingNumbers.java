public class M_2 {

    public static void main(String[] args) {

        int[] temp = hammingNumbers(60);

        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
        System.out.println(isHammingNumber(3));

        int bin[] = {1, 1, 1, 1};
        System.out.println(binary2int(bin));

    }


    public static int[] primeFactors(int n) {
        int decomposition[] = new int[primesDecompositionGodel(n)];

        int i = 0;

        while (n % 2 == 0) {
            decomposition[i] = 2;
            i++;
            n /= 2;
        }
        for (int j = 3; j <= Math.sqrt(n); j += 2) {
            // While j divides n, add to decomposition[] and divide n
            while (n % j == 0) {
                n /= j;
                decomposition[i] = j;
                i++;
            }
        }
        if (n > 2) decomposition[i] = n;

        return decomposition;
    }


    public static int primesDecompositionGodel(int n) {
        int count = 0;

        // Print the number of 2s that divide n
        while (n % 2 == 0) {
            count++;
            n /= 2;
        }
        // now n must be odd at this point.  So we can check only odd numbers (so i+=2)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // While i divides n, count++ and divide n
            while (n % i == 0) {
                n /= i;
                count++;
            }

        }
        // This condition is to handle the case when
        // n is a prime number greater than 2
        if (n > 2) count++;

        return count;
    }

    //returns true if k is a Hamming Number
    public static boolean isHammingNumber(int k) {
        boolean bool = true;

        int[] primes = primeFactors(k);

        for (int i = 0; i < primes.length; i++) {
            if (primes[i] != 1 && primes[i] != 2 && primes[i] != 3 && primes[i] != 5) {
                bool = false;
                break;
            }
        }

        return bool;
    }


    public static int[] hammingNumbers(int n) {

        int count = 0;
        int[] hammings = new int[n];

        for (int i = 1; count < n; i++) {

            if (isHammingNumber(i)) {
                hammings[count] = i;
                count++;
            }
        }
        return hammings;
    }


    public static int binary2int(int[] b) {
        int num = 0;
        for (int i = b.length - 1; i >= 0; i--) {
            num += (int) Math.pow(2, i);
        }
        return num;
    }

    public static []

    int int2Binary(int n) {
        int bin[] = new int[sizeofbinary(n)];
        for (int i = 0; i < bin.length; i++) {
            bin[i] = n % 2;
            n /= 2;
        }
        reverse(bin);
        return bin;
    }

    public static void reverse(int[] bin) {

    }

    public static int sizeofbinary(int n) {
        int count = 0;
        while (n != 0) {
            n /= 2;
            count++;
        }
    }
}

