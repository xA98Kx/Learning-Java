import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RUN_ME {

    static List<String> classList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Scan bin directory
        File binDir = new File("bin");
        if (!binDir.exists()) {
            System.out.println("bin directory not found.");
            return;
        }

        scanClasses(binDir, "");

        if (classList.size() == 0) {
            System.out.println("No compiled classes found.");
            return;
        }

        // Step 2: Display menu
        while (true) {
            System.out.println("\n===== PROGRAM LAUNCHER =====");
            for (int i = 0; i < classList.size(); i++) {
                System.out.println((i + 1) + ". " + classList.get(i));
            }
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }

            if (choice < 1 || choice > classList.size()) {
                System.out.println("Invalid choice.");
                continue;
            }

            String className = classList.get(choice - 1);

            // Step 3: Run selected class
            try {
                System.out.println("\n--- Running: " + className + " ---\n");

                Class<?> cls = Class.forName(className);
                cls.getMethod("main", String[].class)
                   .invoke(null, (Object) new String[]{});

            } catch (Exception e) {
                System.out.println("Error running class: " + className);
                e.printStackTrace();
            }
        }

        sc.close();
    }

    // Recursive scanner
    static void scanClasses(File dir, String packageName) {
        for (File file : dir.listFiles()) {
            if (file.isDirectory()) {
                scanClasses(file, packageName + file.getName() + ".");
            } else if (file.getName().endsWith(".class")) {
                String className = packageName +
                        file.getName().replace(".class", "");
                classList.add(className);
            }
        }
    }
}