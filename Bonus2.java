import java.util.Scanner;
public class Bonus2 {

    // On vérifie si "number" est un multiple
    public static boolean isMultiple(int number, int[] divisors) {
        for (int i = 0; i < divisors.length; i++) {
            if (divisors[i] == 0) // vérification par sécurité
                break;
            if (number % divisors[i] == 0)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier n : ");
        int n = scanner.nextInt();

        // Tableau des nombres
        int[] divisors = {4, 5, 7, 9, 11};

        int somme = 0;  // Variable pour garder la somme

        // On vérifie tous les nombres plus petits que n
        for (int i = 1; i < n; i++) {
            if (isMultiple(i, divisors)) {
                somme += i;
            }
        }

        System.out.println("Somme des multiples est : " + somme);

        scanner.close();
    }
}
