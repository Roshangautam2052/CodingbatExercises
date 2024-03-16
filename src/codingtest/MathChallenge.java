package codingtest;

import java.util.Scanner;

public class MathChallenge {
    public static String MathChallenge(int num) {
        // Convert the number to a string
        String numStr = Integer.toString(num);

        // Convert the string to a character array
        char[] numArray = numStr.toCharArray();

        // Find the rightmost digit that is smaller than the digit to its right
        int i = numArray.length - 2;
        while (i >= 0 && numArray[i] >= numArray[i + 1]) {
            i--;
        }

        // If no such digit is found, return -1
        if (i == -1) {
            return "-1";
        }

        // Find the smallest digit to the right of numArray[i] and greater than numArray[i]
        int j = numArray.length - 1;
        while (numArray[j] <= numArray[i]) {
            j--;
        }

        // Swap the digits at positions i and j
        char temp = numArray[i];
        numArray[i] = numArray[j];
        numArray[j] = temp;

        // Reverse the subarray to the right of i
        reverse(numArray, i + 1, numArray.length - 1);

        // Convert the character array back to a string
        String result = new String(numArray);

        // Remove characters from ChallengeToken
        String challengeToken = "uicrfv9x24";
        result = result.replaceAll("[" + challengeToken + "]", "");

        // If the new final string is empty, return "EMPTY"
        return result.isEmpty() ? "EMPTY" : result;
    }

    private static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(MathChallenge(Integer.valueOf(s.nextLine())));
    }
}
