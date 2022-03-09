package org.nicor;

public class Fibonacci {
    /*
    La clase fibonacci realiza el cálculo del n-ésimo número de la sucesión de fibonacci.
    Siendo n un número entero.
     */
    public int compute(int n){
        if(n<0){
            throw new RuntimeException("El valor es negativo: " + n);
        }
        if(n <= 1) {
            return n;
        }

        int fib = 1;
        int prevFib = 1;

        for(int i=2; i<n; i++) {
            int temp = fib;
            fib+= prevFib;
            prevFib = temp;
        }
        return fib;
    }
}
