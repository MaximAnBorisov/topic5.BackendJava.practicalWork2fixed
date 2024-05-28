import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a,b,result;
        System.out.println("Введите первое значение");
          a = in.nextDouble();
        System.out.println("Введите второе значение");
          b = in.nextDouble();
        result =a+b;
        System.out.printf("%f+%f=%f\n",a,b, result);
        System.out.printf("%f-%f=%f\n",a,b, a-b);
        System.out.printf("%f*%f=%f\n",a,b, a*b);
        System.out.printf("%f/%f=%f\n",a,b, a/b);
        }
    }
