import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prompt user to enter name
        System.out.print("Enter you name: ");
        String name = scanner.nextLine().toLowerCase();

        int VowelCount = 0;

        //Loop through each character and check for vowels 
        for (int i = 0; i <name.length(); i++){
            char ch = name.charAt(i);
            if (ch == 'a' ||  ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') {
                VowelCount++;
            }
        }

        System.out.println("Number of Vowels: " + VowelCount);
        scanner.close();
    }
}
