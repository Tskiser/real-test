package org.example;

public class gcd {
    public static int findgcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findgcd(b, a % b);
    }
}
