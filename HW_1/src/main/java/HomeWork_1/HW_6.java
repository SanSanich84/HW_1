package HomeWork_1;

import java.util.Scanner;

public class HW_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год для вычисления его високосности :): ");
        int a = in.nextInt();
        meth_6(a);


    }
    static boolean meth_6(int a) {
        float ves = a%4;
        float age = a%100;
        float age4 = a%400;
        if (ves == 0 && age != 0) {
            boolean bul = true;
            System.out.println("Год "+a+" - високосный");
            return bul;
        }
        else if (ves == 0 && age4 == 0){
            boolean bul = true;
            System.out.println("Год "+a+" - високосный");
            return bul;
        }
        else if (age == 0 || ves != 0){
            boolean bul = false;
            System.out.println("Год "+a+" - НЕ високосный");
            return bul;
        }
        return false;
    }
}
