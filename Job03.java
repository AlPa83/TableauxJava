public class Job03 {
    public static void main(String[] args) {
        String str = "I'm sorry Dave I'm afraid I can't do that";
        String voyelles = "";

        // Tableau de voyelles
        char[] TableVoyelles = {'a','e','i','o','u','y','A','E','I','O','U','Y'};

        for (char ch : str.toCharArray()) {
            // On vérifie si ch est dans le tableau de voyelles
            for (char v : TableVoyelles) {
                if (ch == v) {
                    voyelles += ch;
                    break;
                }
            }
        }

        System.out.println(voyelles);
    }
}
