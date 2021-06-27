import java.util.Scanner;


public class Commons {


    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    long gcd = 1,lcm = 1;
    long n1, n2;
    System.out.print("Bir sayı giriniz: ");
    n1 = s.nextInt();
    System.out.print("Bir sayı daha giriniz: ");
    n2 = s.nextInt();

    if (n2 > n1)
    {
        long switcher = n1;
        n1 = n2;
        n2 = switcher;
    }
        for (long i = n2; i > 0;i--)
        {
            if (n2 % i == 0 && n1 % i == 0)
            {
                gcd = i;
                break;
            }
        }
        for (long i = n1; ;i += n1)
        {
            if (i % n2 == 0)
            {
                lcm = i;
                break;
            }
        }

        System.out.printf("EKOK: %d, EBOB: %d", lcm, gcd);



    }



}
