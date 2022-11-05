package org.example;
import java.util.Scanner;

public class SimpleCalculator {
    public int Cal(int a, int b, String cal) {
    if(cal == "cong")
        return a + b;
    else if(cal == "tru")
        return a - b;
    else if(cal == "nhan")
        return a * b;
    else if(cal == "chia") {
        if(b==0)
            return -1;
        else
            return a / b;
    }
    else
        return -1;
}

    public boolean TimHoaQuaTrongHop(String hoaqua) {
        String[] Box = {"Orange", "Banana", "Apple", "Kiwi"};
        for (int i = 0 ; i < Box.length ; i++) {
            if(Box[i] == hoaqua) {
                return true;
            }
        }
        return false;
    }

    public int[] NhapArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so phan tu");
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            System.out.println("nhap phan tu so " + i +":");
            arr[i] = input.nextInt();
        }
        return arr;
    }
}
