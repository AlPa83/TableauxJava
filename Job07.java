public class Job07 {
        public static void main(String[] args) {

            String str = "Certaines choses changent, et d'autres ne changeront jamais.";

            // On convertit en tableau
            char[] charArray = str.toCharArray();

            // On crée un nouveau tableau
            char[] newArray = new char[charArray.length];

            // On copie le reste de la chaîne
            for (int i = 1; i < charArray.length; i++) {
                newArray[i - 1] = charArray[i];
            }

            // On ajoute la première lettre à la fin + dernière lettre en minuscule
            newArray[charArray.length - 1] = Character.toLowerCase(charArray[0]);

            // On met la première lettre en majuscule
            newArray[0] = Character.toUpperCase(newArray[0]);

            // On convertit le tableau final en chaîne
            String newString = new String(newArray);

            System.out.println(newString);
        }
    }
