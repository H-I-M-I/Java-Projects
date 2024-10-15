
package assignment3;

public class Lab2 {


    int[] findPrime(int[] array, functional_Int F) {

        return F.take_Array(array);
    }

    int[] findEven(int[] array, functional_Int F) {

        return F.take_Array(array);
    }

    int[] findOdd(int[] array, functional_Int F) {

        return F.take_Array(array);
    }



public static void main(String[] args) {

    int[] iarray = {10, 13, 44, 28, 16, 5, 7, 27};

    Lab2 L2 = new Lab2();


    System.out.println("Prime numbers are:");

    for (int x1 : L2.findPrime(iarray, array -> {

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
    })) {
        System.out.println(x1);
    }

    System.out.println("\n");



    System.out.println("Even numbers are:");

    for (int x2 : L2.findPrime(iarray, array ->{

        int[] a1 = new int[array.length];
        int k = 0;

        for (int i = 0; i < array.length; i++) {

            if(array[i] % 2 == 0)
                a1[k++] = array[i];

        }
        int[] even = new int[k];
        for (int i = 0; i < k; i++) {
            even[i] = a1[i];
        }

        return even;
    }))
        System.out.println(x2);

    System.out.println("\n");



    System.out.println("Odd numbers are:");

    for (int x3 : L2.findPrime(iarray, array ->{

        int[] a1 = new int[array.length];
        int k = 0;

        for (int i = 0; i < array.length; i++) {

            if(array[i] % 2 != 0)
                a1[k++] = array[i];

        }
        int[] odd = new int[k];
        for (int i = 0; i < k; i++) {
            odd[i] = a1[i];
        }

        return odd;
    }))
        System.out.println(x3);
    }
    }
