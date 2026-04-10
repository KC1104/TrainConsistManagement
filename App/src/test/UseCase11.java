package test;

import java.util.Scanner;

public class UseCase11 {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("  UC11 - Validate Train ID and Cargo Code ");
        System.out.println("====================================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        boolean isTrainValid = trainId.matches("TRN-\\d{4}");
        boolean isCargoValid = cargoCode.matches("PET-[A-Z]{2}");

        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + isTrainValid);
        System.out.println("Cargo Code Valid: " + isCargoValid);

        System.out.println("\nUC11 validation completed...");
    }
}