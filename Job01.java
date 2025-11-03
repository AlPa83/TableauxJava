public class Job01 {
    public static void main(String[] args) {
        // Tableau des nombres
        int[] nombres = {200, 204, 173, 98, 171, 404, 459};

        // Tableau pairimpair
        String[] pairimpair = new String[nombres.length];

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i] % 2 == 0) {
                pairimpair[i] = "pair";
            } else {
                pairimpair[i] = "impair";
            }
        }

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " est " + pairimpair[i]);
        }
    }
}
