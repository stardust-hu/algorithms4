package Fundamentals_1.BasicProgModel_1_1;

import edu.princeton.cs.algs4.*;

public class Ex_1_1_09 {

    public static String intToBinaryString(int N){
        String s = "";
        for (int n=N; n>0; n /= 2){
            s = (n % 2) + s;
        }
        return s;
    }
    public static void main(String[] args) {
        int N = 7;
        System.out.printf(intToBinaryString(N));
    }
}
