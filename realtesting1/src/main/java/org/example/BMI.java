package org.example;

public class BMI {
    public static int max2Int(int a, int b) {
        return Math.max(a, b);
    }
    public static String calculateBMI(double weight, double height) {
        double bmi = (double) Math.round(weight * 10 / (height * height)) / 10;
        String output;
        if (bmi < 18.5) {
            output = "Thiếu cân";
        } else if (bmi <= 22.9) {
            output = "Bình thường";
        } else if (bmi <= 24.9) {
            output = "Thừa cân";
        } else {
            output = "Béo phì";
        }
        return output;
    }
}

