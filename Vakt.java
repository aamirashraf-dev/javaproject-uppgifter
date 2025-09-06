public class Vakt {
       public static void main(String[] args) {
        boolean id = true;
        String dayOfTheWeek = "lördag";
        int age = 18;
        boolean isFull = false;

        boolean allowed = false;

        if (id && !isFull) {
            if (dayOfTheWeek.equalsIgnoreCase("lördag") || dayOfTheWeek.equalsIgnoreCase("söndag")) {
                if (age >= 18) {
                    allowed = true;
                }
            } else { // vardag
                if (age >= 21) {
                    allowed = true;
                }
            }
        }

        if (allowed) {
            System.out.println("Välkommen in!");
        } else {
            System.out.println("Tyvärr, du får inte komma in.");
        }
    }

        
       
    }

    

