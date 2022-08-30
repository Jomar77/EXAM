import java.util.Scanner;

public class TestsortingAlgorithm {
    public static void main(String[] args) {
        sortingAlgorithm b = new sortingAlgorithm();

        int arr[] = {16,30,-24,7,62,45,5,-55};

        System.out.println(b.selectionSort(arr));
        System.out.println(b.exponentiation(4, 6));
        
        System.out.println(b.bubbleSort(arr));
    }

}
