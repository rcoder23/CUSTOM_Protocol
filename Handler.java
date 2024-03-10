// TCPHandler.java
package org.example.socket;

public class Handler {
    public static String encode(String inputLine) {
        String[] arr = inputLine.split(" ");
        if (arr.length >= 4 && arr[0].equals("GET") && arr[1].equals("CUSTOM")) {
            String operation = arr[2];
            try {
                int operand1 = Integer.parseInt(arr[3]);
                int operand2 = Integer.parseInt(arr[4]);
                switch (operation) {
                    case "/add":
                        return String.valueOf(operand1 + operand2);
                    case "/subtract":
                        return String.valueOf(operand1 - operand2);
                    case "/multiply":
                        return String.valueOf(operand1 * operand2);
                    case "/divide":
                        return String.valueOf(operand1 / operand2);
                    default:
                        return "UNKNOWN_OPERATION";
                }
            } catch (NumberFormatException e) {
                return "INVALID_OPERAND";
            }
        } else {
            return "INVALID_REQUEST";
        }
    }
}
