public class Job05 {
    public static void main(String[] args) {
        String str = "On n’est pas le meilleur quand on le croit mais quand on le sait";

        // Tableau des voyelles
        char[] voyelles = {'a', 'e', 'i', 'o', 'u', 'y', 'à', 'â', 'ä', 'é', 'è', 'ê', 'ë', 'î', 'ï', 'ô', 'ö', 'ù', 'û', 'ü', 'ÿ'};

        // Tableau des consonnes
        char[] consonnes = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};

        // Initialisation des compteurs
        int totalVoyelles = 0;
        int totalConsonnes = 0;

        // On parcourt chaque caractère de la chaîne
        for (char lettre : str.toCharArray()) {
            // Ignore les espaces
            if (lettre == ' ') continue;

            // On convertit en minuscule
            lettre = Character.toLowerCase(lettre);

            // On vérifie si c'est une voyelle
            boolean isVoyelle = false;
            for (char v : voyelles) {
                if (lettre == v) {
                    totalVoyelles++;
                    isVoyelle = true;
                    break;
                }
            }

            // Si ce n'est pas une voyelle, c'est une consonne
            if (!isVoyelle) {
                for (char c : consonnes) {
                    if (lettre == c) {
                        totalConsonnes++;
                        break;
                    }
                }
            }
        }

        System.out.println("Total de voyelles : " + totalVoyelles);
        System.out.println("Total de consonnes : " + totalConsonnes);
    }
}
