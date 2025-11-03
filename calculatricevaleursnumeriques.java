import java.util.Scanner;

public class calculatricevaleursnumeriques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] valeurs = new int[26];
        for (int i = 0; i < 26; i++) {
            valeurs[i] = i + 1;
        }

        while (true) {
            System.out.println("Entrez un nom, lieu (ou \"Exit\" pour quitter) :");
            String texte = scanner.nextLine();

            if (texte.equals("Exit")) {
                System.out.println("Programme terminé.");
                break;
            }

            int somme = 0;

            for (int i = 0; i < texte.length(); i++) {
                char c = texte.charAt(i);

                if (c >= 'A' && c <= 'Z') {
                    somme += valeurs[c - 'A'];
                } else if (c >= 'a' && c <= 'z') {
                    somme += valeurs[c - 'a'];
                }

            }

            System.out.println("La valeur numérique est : " + somme);
        }

        scanner.close();
    }
}
