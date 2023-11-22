package jour01.pourAllerPlusLoin;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String chaine = "Test";
        Boolean isPresent = false;
        for (int i = 0; i < chaine.length(); i++)
        {
            if (chaine.charAt(i) == 'e' || chaine.charAt(i) == 'E')
            {
                isPresent = true;
            }
        }
        if (isPresent){
        System.out.println("Il y a le caractère 'e' dans la chaîne rentrée");

        } else {
            System.out.println("Il n'y a pas de caractère 'e'");
        }
    }
}
