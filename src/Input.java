import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt(); 

        System.out.print("Weight: ");
        float weight = scanner.nextFloat();

        System.out.print("Has Smoked?: ");
        boolean smoked = scanner.nextBoolean();
        scanner.close();
        
        System.out.printf("\nPatient Info\nName: %s\nAge: %d\nWeight: %.2f\nHas Smoked?: %b\n", name, age, weight, smoked);
    }
}
