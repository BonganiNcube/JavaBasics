import java.util.Scanner;

public class ReversedName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prompt user to enter name
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        //Reverse the string
        String reversed = "";
        for (int i = name.length() -1; i  >=0; i--) {
            reversed += name.charAt(i);
        }

        //Display the reversed string
        System.out.println("Reversed Name: " +reversed);

        scanner.close();
    }
}
