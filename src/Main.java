import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Skriv in ett tal: ");
            String input = scanner.nextLine(); // Läser in en sträng från användaren

            try {
                int tal = Integer.parseInt(input); // Konverterar strängen till ett heltal

                if (tal > 5) {
                    System.out.println("högre än 5!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ogiltigt tal. Försök igen.");
                i--; // Minska räknaren för att ge användaren en ny chans
            }
        }

        scanner.close();
    }
}

        /*
        Scanner scanner = new Scanner(System.in);

        // Korrekt lösenord
        String correctPassword = "secret";
        String inputPassword = "";

        // While-loop som kör "hello world" tills rätt lösenord skrivs
        while (!inputPassword.equals(correctPassword)) {
            System.out.println("hello world");
            System.out.println("Ange lösenord:");
            inputPassword = scanner.nextLine(); // Läser in användarens inmatning
        }

        System.out.println("Rätt lösenord! Programmet avslutas.");
    }
}



        int utskriv32= 0;
        //while loop som skriver ut "hello world" varje gång som utskriv32 är mindre än 32
        while (utskriv32 < 32){

            System.out.println("hello world");
            utskriv32++;//adderar 1 varje gång lopen spelas
        }

        //if sats som skriver ut "hello world" om 6 är större eller lika med 3
        if (6>=3){
            System.out.println("Hello world");
        }
        //hämtar namn från användaren
        Scanner tb = new Scanner(System.in);
        System.out.println("What is your name?");
         String name = tb.nextLine();
        //frågar om lösenord
        System.out.println("password?");
        String pass = tb.nextLine();
        //kontrollerar att namnet och lösenordet är korrekt och skriver ut "Welcome" annars skriver den att den att lösenordet eller användarnamnet är incorrect
        if ("noname".equals(name)&&"nopass".equals(pass)){
            System.out.println("welcome");
        }
        else {
            System.out.print("The password or name is incorrect");
        }
    */



