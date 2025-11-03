public class Job04 {
    public static void main(String[] args) {
        String str = "Dans l'espace, personne ne vous entend crier";

        char[] chars = str.toCharArray();
        int totalChars = 0;

        for (char c : chars) {
            if (c != ' ') { // on ignore les espaces
                totalChars++;
            }
        }

        System.out.println("Total de caractères est : " + totalChars);
    }
}
