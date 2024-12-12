import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //if sats som skriver ut "hello world" om 6 är större eller lika med 3
        if (6>=3){
            System.out.println("Hello world");
        }
        //hämtar namn från användaren
        Scanner tb = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = tb.nextLine();
        //kontrollerar att namnet är korrekt och skriver ut "Welcome" annars skriver den att den inte är noname
        if ("noname".equals(name)){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("Your name is not noname");
        }
    }
}