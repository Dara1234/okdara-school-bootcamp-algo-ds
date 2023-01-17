    import java.util.*;

    public class TimeComplexity {
        public static void main(String[] args) {
            int arrayA[]
                    = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            int arrayB[]
                    = { 1, 2, 3, 4, 5 , 6, 4 };
            int a = arrayA.length;
            int b = arrayB.length;
            // Example 1 = O(ab)
            for (int i = 0; i < arrayA.length; i++) {
                for (int j = 0; j < arrayB.length; j++) {
                    if (arrayA[i] < arrayB[j]) {
                        System.out.println(arrayA[i] + "," + arrayB[j]);
                    }
                }
            }

            // Example 2 = O(ab)
            for (int i= 0; i < arrayA.length; i++) {
                for (int j = 0; j < arrayB.length; j++) {
                    for (int k= 0; k < 100000; k++) {
                        System.out.println(arrayA[i] + "," + arrayB[j]);
                    }
                }
            }

            // Example 3 - reverse an array  = O(a)
            for (int i= 0; i <arrayA.length/ 2; i++) {
                int other = arrayA.length - i - 1;
                int temp = arrayA[i];
                arrayA[i] = arrayA[other];
                arrayA[other] = temp;
            }
        }

        // Example 4 - Which of the following is equivalent to O(n) and why?
        // O(N + P),where P < X = O(n)
        // 0(2N) = O(n)
        // O(N + logN) = O(n)
        // O(N + M) != O(n)

    }

