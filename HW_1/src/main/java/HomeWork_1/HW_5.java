package HomeWork_1;

import java.util.Scanner;

public class HW_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите рандомное имя: ");
        String a = in.nextLine();
        meth_5(a);

    }
    static String meth_5(String a) {
    String result = ("Привет, " + a + "!!!");
    System.out.println(result);
    return result;
    }

}
