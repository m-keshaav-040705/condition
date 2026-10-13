package condition;

import java.util.Scanner;

public class FoodMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Vegetables");
        System.out.println("2. Fruits");
        System.out.println("3. Non-Veg");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("1. Tomato");
                System.out.println("2. Potato");
                System.out.println("3. Carrot");
                System.out.print("Choose a vegetable: ");
                int veg = sc.nextInt();

                switch (veg) {
                    case 1:
                        System.out.println("Tomato");
                        break;
                    case 2:
                        System.out.println("Potato");
                        break;
                    case 3:
                        System.out.println("Carrot");
                        break;
                    default:
                        System.out.println("Invalid vegetable choice");
                }
                break;

            case 2:
                System.out.println("1. Apple");
                System.out.println("2. Mango");
                System.out.println("3. Banana");
                System.out.print("Choose a fruit: ");
                int fruit = sc.nextInt();

                switch (fruit) {
                    case 1:
                        System.out.println("Apple");
                        break;
                    case 2:
                        System.out.println("Mango");
                        break;
                    case 3:
                        System.out.println("Banana");
                        break;
                    default:
                        System.out.println("Invalid fruit choice");
                }
                break;

            case 3:
                System.out.println("1. Chicken");
                System.out.println("2. Fish");
                System.out.println("3. Mutton");
                System.out.print("Choose non-veg: ");
                int nonveg = sc.nextInt();

                switch (nonveg) {
                    case 1:
                        System.out.println("Chicken");
                        break;
                    case 2:
                        System.out.println("Fish");
                        break;
                    case 3:
                        System.out.println("Mutton");
                        break;
                    default:
                        System.out.println("Invalid non-veg choice");
                }
                break;

            default:
                System.out.println("Invalid main choice");
        }

        sc.close();
    }
}