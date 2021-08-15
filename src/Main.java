import java.util.*;
import java.math.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String task = in.next();
        char[][] array = new char[task.length()][task.length()];

        for (char[] a : array) {
            for (int i = 0; i < a.length; i++) {
                a[i] = '0';
            }
        }

        for (int i = 0; i < array.length; i++) {
            array[0][i] = task.charAt(i);
            array[array.length - 1][i] = task.charAt(array.length - 1 - i);
            array[i][0] = task.charAt(i);
            array[i][array.length - 1] = task.charAt(array.length - 1 - i);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}