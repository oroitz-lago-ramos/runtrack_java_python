package jour02.job04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Choisissez un entier :");
        String ns = myObj.nextLine();
        int n = Integer.parseInt(ns);
        for (int i=0; i<= n; i++)
        {
            System.out.printf("Table de %d\n",i);
            for (int j=1; j<= 10; j++)
            {
                System.out.printf("%d x %d = %d\n", i, j, i*j);
            }
            System.out.println();
        }
    }
}
