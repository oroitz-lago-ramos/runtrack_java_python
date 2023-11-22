package jour02.job06;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        for (int i =2; i<=1000;i++)
        {
            boolean isPrime = true;
            for (int j=2; j<= Math.pow(i, 0.5); j++ )
            {
                if (i%j == 0)
                {
                    isPrime = false;
                }
            }
            if (isPrime)
            {
                System.out.println(i);
            }
        }
    }
}
