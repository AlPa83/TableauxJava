public class Job06 {
    public static void main(String[] args) {

        String str = "Les choses que l'on possède finissent par nous posséder.";

        // On convertit en tableau de caractères
        char[] charArray = str.toCharArray();

        // On crée un tableau pour stocker l'inverse
        char[] invArray = new char[charArray.length];

        // La boucle pour inverser le tableau
        for (int i = 0; i < charArray.length; i++) {
            invArray[i] = charArray[charArray.length - 1 - i];
        }

        // On affiche le tableau inversé caractère par caractère
        for (char c : invArray) {
            System.out.print(c);
        }
        System.out.println();
    }
}
