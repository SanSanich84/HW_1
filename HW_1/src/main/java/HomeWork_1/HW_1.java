package HomeWork_1;
import java.util.Scanner;
public class HW_1 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение переменной A: ");
        float a = in.nextFloat();
        System.out.print("Введите значение переменной B: ");
        float b = in.nextFloat();
        System.out.print("Введите значение переменной C: ");
        float c = in.nextFloat();
        System.out.print("Введите значение переменной D: ");
        float d = in.nextFloat();
        System.out.println("Результат вычисления по формуле a * (b + (c / d)): " + meth_1(a,b,c,d));


}
    static float meth_1(float a, float b, float c, float d)
    {
        float result = a * (b + (c / d));
            return result;
    }

}

