package HomeWork_1;
import java.util.Scanner;
public class HW_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение переменной A: ");
        int a = in.nextInt();
        System.out.print("Введите значение переменной B: ");
        int b = in.nextInt();
            if (meth_2(a,b) == true){
            System.out.println("Сумма значений A и B в пределах от 10 до 20");}
            else {
            System.out.println("Сумма значений A и B вне пределов от 10 до 20");}

    }
    static boolean meth_2(int a, int b) {
        int result = a + b;
        if (result >= 10 && result <= 20) {
            boolean bul = true;
            return bul;
        } else {
            boolean bul = false;
            return bul;
        }
    }
}
