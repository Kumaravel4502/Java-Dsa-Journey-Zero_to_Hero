package PatientManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class PatientManagementSystem {
    private static ArrayList<Patient> patients = new ArrayList<>();
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n=== Patient Management System ===");
            System.out.println("1. Add Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Update Patient");
            System.out.println("5. Delete Patient");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();
            s.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addPatient();
                case 2 -> viewPatients();
                case 3 -> searchPatient();
                case 4 -> updatePatient();
                case 5 -> deletePatient();
                case 6 -> System.out.println("Exiting... Goodbye!");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 6);
    }

    private static void addPatient() {
        System.out.print("Enter Patient ID: ");
        int id = s.nextInt();
        s.nextLine();
        System.out.print("Enter Name: ");
        String name = s.nextLine();
        System.out.print("Enter Age: ");
        int age = s.nextInt();
        s.nextLine();
        System.out.print("Enter Disease: ");
        String disease = s.nextLine();

        patients.add(new Patient(id, name, age, disease));
        System.out.println("✅ Patient added successfully!");
    }

    private static void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
        } else {
            System.out.println("\n-- Patient List --");
            for (Patient p : patients) {
                System.out.println(p);
            }
        }
    }

    private static void searchPatient() {
        System.out.print("Enter Patient ID to search: ");
        int id = s.nextInt();
        boolean found = false;

        for (Patient p : patients) {
            if (p.getId() == id) {
                System.out.println("Patient Found: " + p);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("⚠ No patient found with ID " + id);
        }
    }

    private static void updatePatient() {
        System.out.print("Enter Patient ID to update: ");
        int id = s.nextInt();
        s.nextLine();
        for (Patient p : patients) {
            if (p.getId() == id) {
                System.out.print("Enter new Name: ");
                p.setName(s.nextLine());
                System.out.print("Enter new Age: ");
                p.setAge(s.nextInt());
                s.nextLine();
                System.out.print("Enter new Disease: ");
                p.setDisease(s.nextLine());
                System.out.println("✅ Patient details updated successfully!");
                return;
            }
        }
        System.out.println("⚠ No patient found with ID " + id);
    }

    private static void deletePatient() {
        System.out.print("Enter Patient ID to delete: ");
        int id = s.nextInt();
        s.nextLine();

        for (Patient p : patients) {
            if (p.getId() == id) {
                patients.remove(p);
                System.out.println("🗑️ Patient deleted successfully!");
                return;
            }
        }

        System.out.println("⚠ No patient found with ID " + id);
    }
}
