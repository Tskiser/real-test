package org.example;

public class camel {
    public static String toCamelCase(String snakeCase) {
        StringBuilder result = new StringBuilder();
        String[] str = snakeCase.toLowerCase().split("_");
        for (int i = 0; i < str.length; i++) {
            if (i == 0) {
                result.append(str[0]);
                continue;
            }
            String ss = str[i];
            if (ss.charAt(0) >= 'a' && ss.charAt(0) <= 'z') {
                result.append((char) (ss.charAt(0) - 32)).append(ss.substring(1));
            } else {
                result.append(ss.charAt(0)).append(ss.substring(1));
            }
        }
        return result.toString();
    }
}
