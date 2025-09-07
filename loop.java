public class loop {
    // main metod
    public static void main(String[] args) {
        // Lista på gamla världsrekord
        double[] records = {10.8, 10.6, 10.5, 10.3, 10.1, 10.0, 9.8, 9.7, 9.6};

        // Din tid (ändra denna för att testa olika resultat)
        double myTime = 10.2;

        int betterCount = 0;

        // Loopar igenom alla gamla rekord
        for (int i = 0; i < records.length; i++) {
            if (myTime < records[i]) {
                betterCount++;
            }
        }

        System.out.println("Din tid: " + myTime + " sekunder.");
        System.out.println("Du är snabbare än " + betterCount + " tidigare världsrekordhållare.");
    }
        
    }


