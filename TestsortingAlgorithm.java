import java.util.Scanner;

public class TestsortingAlgorithm {
    public static void main(String[] args) {
        sortingAlgorithm b = new sortingAlgorithm();

        System.out.println("Enter the number of elements in the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("1 - Bubble\n2 - Exchange \n3 - Insertion \n4 - Selection \n5 - Quick\nEnter the choice: ");
        int choice = sc.nextInt();
        int agree = 0;
        if (choice == 1) {
            System.out.println("1 - Ascending \n2 - Descending");
            agree = sc.nextInt();
            System.out.println(b.bubbleSort(arr, agree));
        }
        if (choice == 2) {
            System.out.println("1 - Ascending \n2 - Descending");
            agree = sc.nextInt();
            System.out.println(b.exchangeSort(arr, agree));
        }
        if (choice == 3) {
            System.out.println("1 - Ascending \n2 - Descending");
            agree = sc.nextInt();
            System.out.println(b.insertionSort(arr, agree));
        }
        if (choice == 4) {
            System.out.println("1 - Ascending \n2 - Descending");
            agree = sc.nextInt();
            System.out.println(b.selectionSort(arr, agree));
        }
        if (choice == 5) {
            System.out.println("1 - Ascending \n2 - Descending");
            agree = sc.nextInt();
            //b.quickSort(arr, agree);
        }
    }
}
