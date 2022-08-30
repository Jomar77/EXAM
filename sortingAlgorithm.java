public class sortingAlgorithm {
    // challenge: ascending or descending
    private long units;
    long start, end;
    String sorted = "";
    public void sort{}

    public String bubbleSort(int arr[]) {     
            start = System.nanoTime();
            for (int x = 0; x < arr.length; x++) {
                for (int y = 0; y < arr.length - 1; y++) {
                    if (arr[x] < arr[y]) {
                        int temp = arr[x];
                        arr[x] = arr[y];
                        arr[y] = temp;
                    }
                }
                System.out.println(printArray(arr));
            }
            return sorted + "Time Units " + units;
        }


    public String exchangeSort(int num[], int choice) {
        if (choice == 1) {
            start = System.nanoTime();
            for (int x = 0; x < num.length - 1; x++) {
                for (int y = (x + 1); y < num.length; y++) {
                    if (num[x] > num[y]) {
                        int temp = num[x];
                        num[x] = num[y];
                        num[y] = temp;
                    }
                }
            }
            end = System.nanoTime();
        }
        if (choice == 2) {
            start = System.nanoTime();
            for (int x = 0; x < num.length - 1; x++) {
                for (int y = (x + 1); y < num.length; y++) {
                    if (num[x] < num[y]) {
                        int temp = num[x];
                        num[x] = num[y];
                        num[y] = temp;
                    }
                }
            }
            end = System.nanoTime();
        }
        units = (end - start);
        sorted = printArray(num);
        return sorted + "Time Units " + units;
    }

    public double exponentiation(double base, double exponent) {
        double result = 1;
        while (exponent > 0) {
            result *= base;
            exponent--;
            
        }
        return result;
    }

    public void Reverse() {
            String reverse ="", str = "Innovation beyond Excellence";
            int len = str.length()-1;
            for (int i = 0; i <= len; i++){
                reverse = reverse + str.charAt(i);
            }
            System.out.println(reverse);
        }

    public String insertionSort(int num[], int choice) {
        int n = num.length;
        if (choice == 1) {
            start = System.nanoTime();
            for (int i = 1; i < n; ++i) {
                int key = num[i];
                int j = i - 1;

                while (j >= 0 && num[j] > key) {
                    num[j + 1] = num[j];
                    j = j - 1;
                }
                num[j + 1] = key;
                System.out.println(i);
            }
            end = System.nanoTime();
        }
        if (choice == 2) {
            start = System.nanoTime();
            for (int i = 1; i < n; ++i) {
                int key = num[i];
                int j = i - 1;

                while (j >= 0 && num[j] < key) {
                    num[j + 1] = num[j];
                    j = j - 1;
                }
                num[j + 1] = key;
                System.out.println(i);
            }
            end = System.nanoTime();
        }
        units = (end - start);
        sorted = printArray(num);
        return sorted + "Time Units " + units;
    }

    public String selectionSort(int num[]) {
            for (int i = 0; i < num.length - 1; i++) {
                int min_idx = i;
                for (int j = i + 1; j < num.length; j++) {
                    if (num[j] < num[min_idx]) {
                        min_idx = j;
                    }
                }
                int temp = num[min_idx];
                num[min_idx] = num[i];
                num[i] = temp;
                System.out.println( printArray(num));
            }
        sorted = printArray(num);
        return sorted + "Time Units " + units;

    }

    public String quickSort(int num[], int begin, int end) {
        if (begin < end) {
            int pi = partition(num, begin, end);

            quickSort(num, begin, pi - 1);
            quickSort(num, pi + 1, end);
        }
        units = (end - start);
        sorted = printArray(num);
        return sorted + "Time Units " + units;
    }

    static String printArray(int num[]) {
        int n = num.length;
        String a = "";
        for (int i = 0; i < n; i++) {
            a += num[i] + " ";
        }
        return a;
    }

    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }
}