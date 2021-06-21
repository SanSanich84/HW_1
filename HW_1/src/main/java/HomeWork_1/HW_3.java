package HomeWork_1;

import java.util.Scanner;

public class HW_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение: ");
        int a = in.nextInt();
        meth_3(a);
    }
    static boolean meth_3(int a) {

        if (a >= 0) {
            boolean bul = true;
            System.out.println("Введенное значение - положительное");
            return bul;
        } else {
            boolean bul = false;
            System.out.println("Введенное значение - отрицательное");
            return bul;
        }
    }
}
