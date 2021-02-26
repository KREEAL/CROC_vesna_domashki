import java.math.BigInteger;
import java.util.Scanner;

public class SampleClass {

    public static void main(String[] args)
    {
        System.out.println("Введите количество байт");
        Scanner in = new Scanner(System.in);
        float input = in.nextInt();
        printBytes(input);
    }

    public static void printBytes(float x)
    {
        int izm=0;
        while(x>=1024) {
            x /= 1024;
            izm++;
        }
        System.out.print(String.format("%.1f",x));

        switch (izm){
            case 0:
                System.out.println(" B");
                break;
            case 1:
                System.out.println(" KB");
                break;
            case 2:
                System.out.println(" MB");
                break;
            case 3:
                System.out.println(" GB");
                break;
            case 4:
                System.out.println(" TB");
                break;

        }
    }
}
