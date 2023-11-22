package jour01.job09;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        String nom = "Croissants";
        float prix_unitaire = 1;
        int quantite_stock = 20;
        System.out.printf("%s - %.2f euros. Quantité disponible: %d\n", nom, prix_unitaire, quantite_stock);
        Scanner myObj = new Scanner(System.in);
        System.out.println("Combien voulez vous en acheter?");
        String quantite_string = myObj.nextLine();
        int quantite_souhaite = Integer.parseInt(quantite_string);
        if (quantite_souhaite <= quantite_stock)
        {
            quantite_stock -= quantite_souhaite;
            System.out.printf("Merci! Vous devez payer %4.2f euros\n", prix_unitaire * quantite_souhaite);
        }else {
            System.out.println("Nous sommes désolés nous n'avons pas assez de stock pour le moment");
        }
        System.out.printf("%s - %.2f euros. Quantité disponible: %d\n", nom, prix_unitaire, quantite_stock);
    }
}
