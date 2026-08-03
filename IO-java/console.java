import java.io.*;
public class console {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("Console is not available.");
            return;
        }

        String username = console.readLine("Enter your username: ");
        char[] password = console.readPassword("Enter your password:'' ");
        String age = console.readLine("Enter your age: ");
        int ageValue = Integer.parseInt(age);
        for (int i = 0; i < password.length; i++){
            System.out.println("*");
        }
        System.out.println("Username: " + username + ", Caracteres da senha: " + password.length + " , Idade: " + ageValue);
    }
}
