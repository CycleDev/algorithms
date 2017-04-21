package nao.algorithms.common;

public class Utils {

    public static void fillArray(int n, int[] values) {
        for (int i = 0; i < n; i++) {
            values[i] = i;
        }
    }

    public static void consoleNewLine() {
        System.out.println("");
        System.out.println("**********************************************************");
        System.out.println("");
    }

}
