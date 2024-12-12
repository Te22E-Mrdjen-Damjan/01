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
        //frågar om lösenord
        String name = tb.nextLine();
        System.out.println("password?");
        String pass = tb.nextLine();
        //kontrollerar att namnet och lösenordet är korrekt och skriver ut "Welcome" annars skriver den att den att lösenordet eller användarnamnet är incorrect
        if ("noname".equals(name)&&"nopass".equals(pass)){
            System.out.println("welcome");
        }
        else {
            System.out.print("The password or name is incorrect");
        }

    }
}