package HomeWork_1;
import java.util.Scanner;
public class HW_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение: ");
        int a = in.nextInt();
        if (meth_4(a) == true) {
            System.out.println("Введенное значение - отрицательное");
        } else {
            System.out.println("Введенное значение - положительное");
        }
    }
    static boolean meth_4(int a) {

        if (a >= 0) {
            boolean bul = false;
            return bul;
        } else {
            boolean bul = true;
            return bul;
        }
    }

}
