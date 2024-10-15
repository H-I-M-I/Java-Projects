
package assignment3;

class NumberFunctions {

    int[] getPrimes(int[] array) {

        int[] a1 = new int[array.length];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 1;

            for (int j = 2; j < array[i] - 1; j++) {
                if (array[i] % j == 0) {
                    count = 0;
                    break;
                }
            }
            if(array[i]==0) continue;
            
            if (array[i] == 1 || array[i] == 2) {
                count = 1;
            }

            if (count == 1) {
                a1[k++] = array[i];
            }
        }


        int[] prime = new int[k];
        for (int i = 0; i < k; i++) {
            prime[i] = a1[i];
        }

        return prime;
    }



    int[] getEvens(int[] array) {

        int[] a1 = new int[array.length];
        int k = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                a1[k++] = array[i];
            }

        }
        int[] even = new int[k];
        for (int i = 0; i < k; i++) {
            even[i] = a1[i];
        }

        return even;
    }



    int[] getOdds(int[] array) {

        int[] a1 = new int[array.length];
        int k = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {
                a1[k++] = array[i];
            }

        }
        int[] odd = new int[k];
        for (int i = 0; i < k; i++) {
            odd[i] = a1[i];
        }

        return odd;
    }
}


public class Lab3 {

    public static void main(String[] args) {
        
        NumberFunctions ob = new NumberFunctions();
        int[] iarray = {10, 13, 44, 28, 16, 5, 7, 27};

        functional_Int F1 = ob::getPrimes;

        System.out.println("Prime numbers are:");
        for (int x : F1.take_Array(iarray)) 
            System.out.println(x);
        
        System.out.println("\n");


        functional_Int F2 = ob::getEvens;

        System.out.println("Even numbers are:");
        for (int x : F2.take_Array(iarray)) 
            System.out.println(x);
        
        System.out.println("\n");


        functional_Int F3 = ob::getOdds;

        System.out.println("Odd numbers are:");
        for (int x : F3.take_Array(iarray)) 
            System.out.println(x);
        
    }
}

