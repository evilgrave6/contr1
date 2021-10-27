package txt3;
import java.util.Scanner;
import java.util.Arrays;


public class ContrM {
    public static boolean Num(int a, int b) {
        int sum = a + b;
        if ((sum >= 10) && (sum <= 20)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] myArray = new int[8]; // создали массив чисел на 8 эл-ов
        for (int i = 0; i < myArray.length; i++) {
            if (i > 0)
                myArray[i] = myArray[i - 1] + 3;

        }
        System.out.println(Arrays.toString(myArray));

        // следующий массив

        int[] MyArray2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < MyArray2.length; i++)
            if (MyArray2[i] < 6)
                MyArray2[i] *= 2;
        System.out.println(Arrays.toString(MyArray2));
    }
}
