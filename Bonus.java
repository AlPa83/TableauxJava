public class Bonus {
    public static void main(String[] args) {
        int[] arr = {84, 12, 1, 43, 5, 0};

        // i pour répéter le tri
        for (int i = 0; i < arr.length - 1; i++) {

            // j pour les éléments restants non triés
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; // Sauvegarde temporaire arr[j]
                    arr[j] = arr[j + 1]; // On met le plus petit à la position j
                    arr[j + 1] = temp; // On met l'ancien arr[j] à la position j+1
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        /*
    // k parcourt le tableau du début à la fin pour l'afficher
        for (int k = 0; k < arr.length; k++) {
            System.out.print((float)arr[k] + " ");
         */
    }
}
